<?xml version="1.0" encoding="UTF-8"?>
<!-- 
(c) 2007 Joern Dinkla <joern@dinkla.net>
12.01.2007 05 added containment and opposites
13.01.2007 06 uncommented associations and association ends
16.01.2007 07 fixed references and attributes (EAttribute only to datatypes, EReferences only to classes)
17.01.2007 08 redirection to different files
18.01.2007 	  lookup of cross model references (supertype, attributes, references)
18.01.2007 09 removed annotations, added cross references for eOpposite
19.01.2007 10 TEST one package, rest subpackages, TODO refs
20.01.2007 10 changed references to the same package, but different subpackages (ecore meaning of package)
21.01.2007 11 removed redirection
21.01.2007 12 removed unnecessary templates/functions
22.01.2007 12 fixed bug with eOpposite
15.04.2007 13 removed comments and debug code

 -->
<xsl:transform xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:xmi="http://www.omg.org/XMI"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:Model="http://www.omg.org/mof.Model/1.3"
	xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore"
	xmlns:fn="http://www.w3.org/2005/02/xpath-functions" version="1.0"
    xmlns:xalan="http://xml.apache.org/xalan"
    xmlns:redirect="http://xml.apache.org/xalan/redirect"
    extension-element-prefixes="redirect">

	<xsl:output method="xml" encoding="UTF-8" indent="yes" xalan:indent-amount="2"/>
	<xsl:param name="ecore_toplevel_package">DEFAULT</xsl:param>
	<xsl:param name="ecore_container_suffix">_container</xsl:param>
              
	<xsl:template match="Model:Attribute">

		<!-- variables -->
		<xsl:variable name="xmi.id" select="@xmi.id"/>
		<xsl:variable name="type" select="@type"/>
		<xsl:variable name="package" select="../../../@name"/>
	
		<eStructuralFeatures
			name="{@name}"
			lowerBound="{./Model:StructuralFeature.multiplicity/Model:MultiplicityType/@lower}"
			upperBound="{./Model:StructuralFeature.multiplicity/Model:MultiplicityType/@upper}">

			<!-- xsi:type and eType TODO attribut hat einen anderen Pfad als Class -->
			<xsl:choose>
				<xsl:when test="//Model:Class[@xmi.id=$type]">
					<xsl:attribute name="xsi:type">ecore:EReference</xsl:attribute>
					<xsl:attribute name="containment">true</xsl:attribute>
					<xsl:attribute name="eType">ecore:EClass<xsl:text>&#32;</xsl:text>
						<xsl:call-template name="get-q-name">
							<xsl:with-param name="xmi.id" select="$type" />
						</xsl:call-template>
					</xsl:attribute>
				</xsl:when>
				<xsl:when test="//Model:DataType[@xmi.id=$type]">
					<xsl:attribute name="xsi:type">ecore:EAttribute</xsl:attribute>
					<xsl:attribute name="eType">ecore:EDataType<xsl:text>&#32;</xsl:text>
						<xsl:call-template name="get-q-name">
							<xsl:with-param name="xmi.id" select="$type" />
						</xsl:call-template>
					</xsl:attribute>
				</xsl:when>
				<xsl:otherwise>
					<xsl:message terminate="yes">WARNING: Unknown type of element xmi.id=<xsl:value-of select="@xmi.id"/>, name=<xsl:value-of select="@name"/></xsl:message>
				</xsl:otherwise>
			</xsl:choose>

			<!-- changeable -->
			<xsl:if test="@isChangeable = 'true'">
				<xsl:attribute name="changeable">true</xsl:attribute>
			</xsl:if>

			<!-- derived -->
			<xsl:if test="@isDerived = 'true'">
				<xsl:attribute name="derived">true</xsl:attribute>
			</xsl:if>

			<!-- ordered -->
			<xsl:if test="./Model:StructuralFeature.multiplicity/Model:MultiplicityType/@is_ordered = 'false'">
				<xsl:attribute name="ordered">false</xsl:attribute>
			</xsl:if>

			<!-- unique -->
			<xsl:if test="./Model:StructuralFeature.multiplicity/Model:MultiplicityType/@is_unique = 'false'">
				<xsl:attribute name="unique">false</xsl:attribute>
			</xsl:if>
			
			<!-- TODO defaultValueLiteral -->
		
		</eStructuralFeatures>
	</xsl:template>

	<xsl:template match="Model:Class">

		<!-- the name of the current package -->
		<xsl:variable name="package" select="../../@name"/>
		<xsl:variable name="supertypes" select="@supertypes"/>

		<!-- EClass -->
		<eClassifiers xsi:type="ecore:EClass" name="{@name}">

			<!-- super types -->
			<xsl:if test="string-length($supertypes) &gt; 0">
				<xsl:attribute name="eSuperTypes">
					<xsl:call-template name="lookup-supertypes">
						<xsl:with-param name="package" select="$package" />
						<xsl:with-param name="supertypes" select="$supertypes"/>
					</xsl:call-template>
				</xsl:attribute>
			</xsl:if>

			<!-- abstract -->
			<xsl:if test="@isAbstract = 'true'">
				<xsl:attribute name="abstract">true</xsl:attribute>
			</xsl:if>

			<xsl:apply-templates />
		</eClassifiers>
	</xsl:template>


	<xsl:template match="Model:DataType">
	
		<xsl:choose>
			<!-- enums -->
			<xsl:when test="./Model:DataType.typeCode/XMI.CorbaTypeCode/XMI.CorbaTcEnum">
				<eClassifiers xsi:type="ecore:EEnum" name="{@name}">
					<xsl:for-each select="./Model:DataType.typeCode/XMI.CorbaTypeCode/XMI.CorbaTcEnum/XMI.CorbaTcEnumLabel">
						<eLiterals name="{@xmi.tcName}">
						<xsl:attribute name="value"><xsl:number format="1"/></xsl:attribute>
						</eLiterals>
					</xsl:for-each>
				</eClassifiers>
			</xsl:when>
			
			<!-- simple types -->
			<xsl:otherwise>
				<eClassifiers xsi:type="ecore:EDataType" name="{@name}">
		
					<!-- instanceClassName -->
					<xsl:attribute name="instanceClassName">
						<xsl:choose>
							<xsl:when test=".//*/XMI.CorbaTcString">java.lang.String</xsl:when>
							<xsl:when test=".//*/XMI.CorbaTcLong">java.lang.Integer</xsl:when>
							<xsl:when test="./Model:DataType.typeCode/XMI.CorbaTypeCode/XMI.CorbaTcAny">java.lang.Object</xsl:when>
							<xsl:when test="./Model:DataType.typeCode/XMI.CorbaTypeCode/XMI.CorbaTcBoolean">java.lang.Boolean</xsl:when>
							<xsl:when test="./Model:DataType.typeCode/XMI.CorbaTypeCode/XMI.CorbaTcFloat">java.lang.Float</xsl:when>
							<xsl:when test="./Model:DataType.typeCode/XMI.CorbaTypeCode/XMI.CorbaTcDouble">java.lang.Double</xsl:when>
							<xsl:otherwise><xsl:message terminate="no">WARNING: Unknown type of <xsl:value-of select="@name"/>.</xsl:message>java.lang.Unknown</xsl:otherwise>
						</xsl:choose>
					</xsl:attribute>
				</eClassifiers>
			</xsl:otherwise>
		</xsl:choose>          
	</xsl:template>

	<xsl:template match="Model:ModelElement.annotation">
	</xsl:template>

	<xsl:template match="Model:Package">
		<eSubpackages nsURI="{@name}" nsPrefix="{@name}">
		
			<xsl:variable name="name">
				<xsl:call-template name="reformat-name">
					<xsl:with-param name="name" select="@name"/>
				</xsl:call-template>
			</xsl:variable>
			
			<xsl:attribute name="name"><xsl:value-of select="$name"/></xsl:attribute>
				
			<xsl:apply-templates />

			<eClassifiers xsi:type="ecore:EClass">
				<xsl:attribute name="name">
					<xsl:call-template name="container-name">
						<xsl:with-param name="name" select="@name"/>
					</xsl:call-template>
				</xsl:attribute>
				<xsl:for-each select="./*/Model:Class">
					<eStructuralFeatures xsi:type="ecore:EReference" name="{@name}" lowerBound="0" upperBound="-1" containment="true">

					<!-- type -->
					<xsl:attribute name="eType">ecore:EClass<xsl:text>&#32;</xsl:text>
						<xsl:call-template name="get-q-name">
							<xsl:with-param name="xmi.id" select="@xmi.id" />
						</xsl:call-template>
					</xsl:attribute>

					</eStructuralFeatures>
					
				</xsl:for-each>
			</eClassifiers>
			
		</eSubpackages>
	</xsl:template>

	<xsl:template match="Model:Reference">

		<!-- variables -->
		<xsl:variable name="type" select="@type"/>
		<xsl:variable name="ref" select="@referencedEnd"/>
		<xsl:variable name="package" select="../../../@name"/>
		<xsl:variable name="xmi.id" select="@xmi.id"/>

		<eStructuralFeatures xsi:type="ecore:EReference"
			name="{@name}"
			lowerBound="{./Model:StructuralFeature.multiplicity/Model:MultiplicityType/@lower}"
			upperBound="{./Model:StructuralFeature.multiplicity/Model:MultiplicityType/@upper}">

			<!-- type -->
			<xsl:for-each select="//*[@xmi.id=$type]">
				<xsl:attribute name="eType">ecore:EClass<xsl:text>&#32;</xsl:text>
					<xsl:call-template name="get-q-name">
						<xsl:with-param name="xmi.id" select="$type" />
					</xsl:call-template>
				</xsl:attribute>
			</xsl:for-each>

			<!-- changeable -->
			<xsl:if test="@isChangeable = 'true'">
				<xsl:attribute name="changeable">true</xsl:attribute>
			</xsl:if>

			<!-- derived -->
			<xsl:if test="@isDerived = 'true'">
				<xsl:attribute name="derived">true</xsl:attribute>
			</xsl:if>

			<!-- ordered -->
			<xsl:if test="./Model:StructuralFeature.multiplicity/Model:MultiplicityType/@is_ordered = 'false'">
				<xsl:attribute name="ordered">false</xsl:attribute>
			</xsl:if>

			<!-- unique -->
			<xsl:if test="./Model:StructuralFeature.multiplicity/Model:MultiplicityType/@is_unique = 'false'">
				<xsl:attribute name="unique">false</xsl:attribute>
			</xsl:if>
			
			<!-- containment -->				
			<xsl:for-each select="//Model:AssociationEnd[@xmi.id=$ref]">
				<!-- find the other end of the association -->
				<xsl:for-each select="../Model:AssociationEnd[@xmi.id != $ref]">
					<xsl:if test="@aggregation = 'composite'">
						<xsl:attribute name="containment">true</xsl:attribute>
					</xsl:if>
				</xsl:for-each>
			</xsl:for-each>
			
			<!-- bidirectional links, eOpposite="#//Book/category"-->
			<xsl:variable name="class" select="ancestor::Model:Class/@xmi.id"/> <!-- ../../@xmi.id"/>  --> <!-- this class -->
						
			<xsl:for-each select="//Model:AssociationEnd[@xmi.id=$ref]">
				<xsl:variable name="classB" select="@type"/>  <!-- the other class -->
				<!-- find the other end of the association -->
				<xsl:for-each select="../Model:AssociationEnd[@xmi.id != $ref]">
					<xsl:variable name="refB" select="@xmi.id"/> <!-- the other referenced end -->
					<!-- does the other end come back to our class ? -->
					<xsl:if test="@type = $class">
						<!-- find the class that is at the end -->
						<xsl:for-each select="//Model:Class[@xmi.id=$classB]">
							<!-- is there a reference to refB -->
							<xsl:if test=".//Model:Reference[@referencedEnd=$refB]">
								<xsl:variable name="x" select="//Model:Class[@xmi.id=$classB]/@name"/>
								<xsl:variable name="y" select="//Model:Reference[@referencedEnd=$refB]/@name"/>
								<xsl:attribute name="eOpposite">
									<xsl:call-template name="get-q-name">
										<xsl:with-param name="xmi.id" select="$classB" />
									</xsl:call-template>
									<xsl:text>/</xsl:text><xsl:value-of select="$y"/>
								</xsl:attribute>
							</xsl:if>
						</xsl:for-each>
					</xsl:if>
				</xsl:for-each>
			</xsl:for-each>
		</eStructuralFeatures>
	</xsl:template>

	<xsl:template match="Model:Tag">
	</xsl:template>

	<xsl:template match="XMI.any">
	</xsl:template>

	<!--  TODO nsURI, nsPrefix -->
	<xsl:template match="XMI.content">
		<ecore:EPackage xmi:version="2.0"
			xmlns:xmi="http://www.omg.org/XMI"
			xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore">
			<xsl:attribute name="name"><xsl:value-of select="$ecore_toplevel_package"/></xsl:attribute>
			<xsl:attribute name="nsURI"><xsl:value-of select="$ecore_toplevel_package"/></xsl:attribute>
			<xsl:attribute name="nsPrefix"><xsl:value-of select="$ecore_toplevel_package"/></xsl:attribute>
			
			<!--  recurse -->
			<xsl:apply-templates />
			<!-- container object -->
			<eClassifiers xsi:type="ecore:EClass">
				<xsl:attribute name="name">
					<xsl:call-template name="container-name">
						<xsl:with-param name="name" select="$ecore_toplevel_package"/>
					</xsl:call-template>
				</xsl:attribute>
				<xsl:for-each select="//Model:Package">
					<eStructuralFeatures xsi:type="ecore:EReference" name="{@name}" lowerBound="0" upperBound="1" containment="true">												
						<!-- type -->
						<xsl:attribute name="eType">ecore:EClass<xsl:text>&#32;</xsl:text>
							<xsl:call-template name="get-q-name">
								<xsl:with-param name="xmi.id" select="@xmi.id" />
							</xsl:call-template>
							<xsl:text>/</xsl:text>
							<xsl:call-template name="container-name">
								<xsl:with-param name="name" select="@name"/>
							</xsl:call-template>
						</xsl:attribute>
					</eStructuralFeatures>
				</xsl:for-each>
			</eClassifiers>
		</ecore:EPackage>
	</xsl:template>

	<xsl:template match="XMI.header">
	</xsl:template>
	
	<!-- function lookup-supertypes -->
	<xsl:template name="lookup-supertypes">
		<xsl:param name="package" />
		<xsl:param name="supertypes" />

		<xsl:if test="string-length($supertypes) &gt; 0">
			<!-- variables -->
			<xsl:variable name="before" select="substring-before($supertypes, ' ')" />
			<xsl:variable name="after" select="substring-after($supertypes, ' ')" />

			<!-- Lookup by xmi.id -->
			<xsl:choose>
				<xsl:when test="string-length($before) = 0">
					<xsl:for-each select="//*[@xmi.id=$supertypes]">
						<xsl:call-template name="get-q-name">
							<xsl:with-param name="xmi.id" select="@xmi.id" />
						</xsl:call-template>						
					</xsl:for-each>
				</xsl:when>
				<xsl:otherwise>
					<xsl:for-each select="//*[@xmi.id=$before]">
						<xsl:call-template name="get-q-name">
							<xsl:with-param name="xmi.id" select="@xmi.id" />
						</xsl:call-template>						
						<xsl:text>&#32;</xsl:text>
					</xsl:for-each>
					<!-- recurse -->
					<xsl:call-template name="lookup-supertypes">
						<xsl:with-param name="package" select="$package" />
						<xsl:with-param name="supertypes" select="$after" />
					</xsl:call-template>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:if>
	</xsl:template>

	<!-- function get-q-name (#//subpackage/subpackage/.../name-->
	<xsl:template name="get-q-name">
		<xsl:param name="xmi.id" />

		<xsl:for-each select="//*[@xmi.id=$xmi.id]">
			<xsl:text>#//</xsl:text>
			<xsl:for-each select="ancestor::Model:Package">
				<xsl:call-template name="reformat-name">
					<xsl:with-param name="name" select="@name"/>
				</xsl:call-template>
				<xsl:text>/</xsl:text>
			</xsl:for-each>
			<xsl:for-each select="ancestor::Model:Class">
				<xsl:value-of select="@name"/>
				<xsl:text>/</xsl:text>
			</xsl:for-each>
			<xsl:choose>
				<xsl:when test="self::Model:Package">
					<xsl:call-template name="reformat-name">
						<xsl:with-param name="name" select="@name"/>
					</xsl:call-template>
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="@name"/>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:for-each>
	</xsl:template>

	<!-- function reformat-name -->
	<xsl:template name="reformat-name">
		<xsl:param name="name" />
		<xsl:choose>
			<xsl:when test="$name = 'Instance'">Instance_</xsl:when>
			<xsl:when test="$name = 'Transformation'">Transformation_</xsl:when>
			<!-- xsl:when test="@name = 'WarehouseProcess'">WarehouseProcess_</xsl:when> -->
			<xsl:otherwise><xsl:value-of select="$name"/></xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<!-- function container-name -->
	<xsl:template name="container-name">
		<xsl:param name="name" />
		<xsl:text>_</xsl:text>
		<xsl:value-of select="$name"/>
		<xsl:value-of select="$ecore_container_suffix"/>
	</xsl:template>
	
</xsl:transform>
