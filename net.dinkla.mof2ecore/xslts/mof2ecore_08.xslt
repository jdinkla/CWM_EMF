<?xml version="1.0" encoding="UTF-8"?>
<!-- 
(c) 2007 Joern Dinkla <joern@dinkla.net>
12.01.2007 05 added containment and opposites
13.01.2007 06 uncommented associations and association ends
16.01.2007 07 fixed references and attributes (EAttribute only to datatypes, EReferences only to classes)
17.01.2007 08 redirection to different files
18.01.2007 	  lookup of cross model references (supertype, attributes, references)


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
              
	<!-- xsl:template match="Model:Association">
		<eClassifiers xsi:type="ecore:EClass" name="{@name}">
			<eAnnotations
				source="http://www.dinkla.net/Model:Association">
				<details key="xmi.id" value="{@xmi.id}" />
				<details key="name" value="{@name}" />
				<details key="annotation" value="{@annotation}" />
				<details key="isRoot" value="{@isRoot}" />
				<details key="isLeaf" value="{@isLeaf}" />
				<details key="isAbstract" value="{@isAbstract}" />
				<details key="visibility" value="{@visibility}" />
				<details key="isDerived" value="{@isDerived}" />
			</eAnnotations>
			<xsl:for-each select="./Model:Namespace.contents/Model:AssociationEnd">
				<xsl:variable name="type" select="@type"/>
				<eStructuralFeatures xsi:type="ecore:EReference"
					name="{@name}"
					lowerBound="{./Model:AssociationEnd.multiplicity/Model:MultiplicityType/@lower}"
					upperBound="{./Model:AssociationEnd.multiplicity/Model:MultiplicityType/@upper}">
					<xsl:for-each select="//*[@xmi.id=$type]">
						<xsl:attribute name="eType">#//<xsl:value-of select="@name"/></xsl:attribute>
					</xsl:for-each>
				</eStructuralFeatures>			
			</xsl:for-each>
			</eClassifiers>
		<xsl:apply-templates />
	</xsl:template>  -->

	<!-- xsl:template match="Model:AssociationEnd">
		<eClassifiers xsi:type="ecore:EClass" name="{@name}">
			<eAnnotations
				source="http://www.dinkla.net/Model:AssociationEnd">
				<details key="xmi.id" value="{@xmi.id}" />
				<details key="name" value="{@name}" />
				<details key="annotation" value="{@annotation}" />
				<details key="isNavigable" value="{@isNavigable}" />
				<details key="aggregation" value="{@aggregation}" />
				<details key="isChangeable" value="{@isChangeable}" />
				<details key="type" value="{@type}" />
				<xsl:apply-templates />
			</eAnnotations>
		</eClassifiers>
	</xsl:template> -->

	<xsl:template match="Model:Attribute">

		<!-- variables -->
		<xsl:variable name="xmi.id" select="@xmi.id"/>
		<xsl:variable name="type" select="@type"/>
		<xsl:variable name="package" select="../../../@name"/>
	
		<!-- DEBUG -->
		<eAnnotations source="debug">
			<details key="package">
				<xsl:attribute name="value"><xsl:value-of select="$package"/></xsl:attribute>
			</details>
			<details key="type">
				<xsl:attribute name="value"><xsl:value-of select="$type"/></xsl:attribute>
			</details>
		</eAnnotations>

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
						<xsl:call-template name="get-fq-name-class">
							<xsl:with-param name="package" select="$package" />
							<xsl:with-param name="xmi.id" select="$type" />
						</xsl:call-template>
					</xsl:attribute>
				</xsl:when>
				<xsl:when test="//Model:DataType[@xmi.id=$type]">
					<xsl:attribute name="xsi:type">ecore:EAttribute</xsl:attribute>
					<xsl:attribute name="eType">ecore:EDataType<xsl:text>&#32;</xsl:text>
						<xsl:call-template name="get-fq-name-class">
							<xsl:with-param name="package" select="$package" />
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
			
			<!-- annotations -->
			<eAnnotations
				source="http://www.dinkla.net/Model:Attribute">
				<details key="xmi.id" value="{@xmi.id}" />
				<details key="name" value="{@name}" />
				<details key="annotation" value="{@annotation}" />
				<details key="scope" value="{@scope}" />
				<details key="visibility" value="{@visibility}" />
				<details key="isChangeable" value="{@isChangeable}" />
				<details key="isDerived" value="{@isDerived}" />
				<details key="type" value="{@type}" />
				<details key="lower"
					value="{./Model:StructuralFeature.multiplicity/Model:MultiplicityType/@lower}" />
				<details key="upper"
					value="{./Model:StructuralFeature.multiplicity/Model:MultiplicityType/@upper}" />
				<details key="is_ordered"
					value="{./Model:StructuralFeature.multiplicity/Model:MultiplicityType/@is_ordered}" />
				<details key="is_unique"
					value="{./Model:StructuralFeature.multiplicity/Model:MultiplicityType/@is_unique}" />
			</eAnnotations>
			<!-- xsl:apply-templates/ -->
		</eStructuralFeatures>
	</xsl:template>

	<xsl:template match="Model:Class">

		<!-- the name of the current package -->
		<xsl:variable name="package" select="../../@name"/>
		<xsl:variable name="supertypes" select="@supertypes"/>

		<!-- DEBUG -->
		<eAnnotations source="debug">
			<details key="package">
				<xsl:attribute name="value"><xsl:value-of select="$package"/></xsl:attribute>
			</details>
			<details key="supertypes">
				<xsl:attribute name="value"><xsl:value-of select="$supertypes"/></xsl:attribute>
			</details>
		</eAnnotations>

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

			<!-- annotations -->
			<eAnnotations source="http://www.dinkla.net/Model:Class">
				<details key="xmi.id" value="{@xmi.id}" />
				<details key="name" value="{@name}" />
				<details key="isRoot" value="{@isRoot}" />
				<details key="isLeaf" value="{@isLeaf}" />
				<details key="isAbstract" value="{@isAbstract}" />
				<details key="visibility" value="{@visibility}" />
				<details key="isSingleton" value="{@isSingleton}" />
				<details key="supertypes" value="{@supertypes}" />
			</eAnnotations>
			
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
      					
					<!-- annotations -->
					<eAnnotations
						source="http://www.dinkla.net/Model:DataType">
						<details key="xmi.id" value="{@xmi.id}" />
						<details key="name" value="{@name}" />
						<details key="annotation" value="{@annotation}"/>
						<details key="isRoot" value="{@isRoot}" />
						<details key="isLeaf" value="{@isLeaf}" />
						<details key="isAbstract" value="{@isAbstract}" />
						<details key="visibility" value="{@visibility}" />
					</eAnnotations>
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

					<!-- annotations -->
					<eAnnotations
						source="http://www.dinkla.net/Model:DataType">
						<details key="xmi.id" value="{@xmi.id}" />
						<details key="name" value="{@name}" />
						<details key="annotation">
							<xsl:attribute name="value"><xsl:value-of select="./Model:ModelElement.annotation"/></xsl:attribute>
						</details>
						<details key="isRoot" value="{@isRoot}" />
						<details key="isLeaf" value="{@isLeaf}" />
						<details key="isAbstract" value="{@isAbstract}" />
						<details key="visibility" value="{@visibility}" />
					</eAnnotations>
					
				</eClassifiers>
			</xsl:otherwise>
		</xsl:choose>          
	</xsl:template>

	<xsl:template match="Model:ModelElement.annotation"></xsl:template>

	<!-- xsl:template match="Model:MultiplicityType">
		<details key="lower" value="{@lower}" />
		<details key="upper" value="{@upper}" />
		<details key="is_ordered" value="{@is_ordered}" />
		<details key="is_unique" value="{@is_unique}" />
	</xsl:template>  -->

	<!-- xsl:template match="Model:Namespace.contents">
		<xsl:apply-templates/>
		</xsl:template> -->

	<xsl:template match="Model:Package">
		<xsl:variable name="filename" select="concat('../generated/mofmodels/cwm_', @name,'.ecore')" />
		<redirect:write select="$filename">
			<ecore:EPackage xmi:version="2.0"
				xmlns:xmi="http://www.omg.org/XMI"
				xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
				xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore"
				nsURI="http://www.dinkla.net/{@name}" name="{@name}"
				nsPrefix="{@name}">
				<eAnnotations
					source="http://www.dinkla.net/Model:Package">
					<details key="xmi.id" value="{@xmi.id}" />
					<details key="name" value="{@name}" />
					<details key="isRoot" value="{@isRoot}" />
					<details key="isLeaf" value="{@isLeaf}" />
					<details key="isAbstract" value="{@isAbstract}" />
					<details key="visibility" value="{@visibility}" />
				</eAnnotations>
				<xsl:apply-templates />
			</ecore:EPackage>
		</redirect:write>
	</xsl:template>

	<xsl:template match="Model:Reference">

		<!-- variables -->
		<xsl:variable name="type" select="@type"/>
		<xsl:variable name="ref" select="@referencedEnd"/>
		<xsl:variable name="package" select="../../../@name"/>
		<xsl:variable name="xmi.id" select="@xmi.id"/>

		<!-- DEBUG -->
		<eAnnotations source="debug">
			<details key="package">
				<xsl:attribute name="value"><xsl:value-of select="$package"/></xsl:attribute>
			</details>
			<details key="type">
				<xsl:attribute name="value"><xsl:value-of select="$type"/></xsl:attribute>
			</details>
			<details key="xmi.id">
				<xsl:attribute name="value"><xsl:value-of select="$xmi.id"/></xsl:attribute>
			</details>
		</eAnnotations>

		<eStructuralFeatures xsi:type="ecore:EReference"
			name="{@name}"
			lowerBound="{./Model:StructuralFeature.multiplicity/Model:MultiplicityType/@lower}"
			upperBound="{./Model:StructuralFeature.multiplicity/Model:MultiplicityType/@upper}"
			>

			<!-- type -->
			<xsl:for-each select="//*[@xmi.id=$type]">
				<xsl:attribute name="eType">ecore:EClass<xsl:text>&#32;</xsl:text>
					<xsl:call-template name="get-fq-name-class">
						<xsl:with-param name="package" select="$package" />
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
			
			<!-- bidirectional links, opposite="#//Book/category"-->
			<xsl:variable name="class" select="../../@xmi.id"/>  <!-- this class -->
						
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
								<xsl:attribute name="eOpposite">#//<xsl:value-of select="//Model:Class[@xmi.id=$classB]/@name"/>/<xsl:value-of select="//Model:Reference[@referencedEnd=$refB]/@name"/></xsl:attribute>
							</xsl:if>
						</xsl:for-each>
					</xsl:if>
				</xsl:for-each>
			</xsl:for-each>

			<eAnnotations
				source="http://www.dinkla.net/Model:Reference">
				<details key="xmi.id" value="{@xmi.id}" />
				<details key="name" value="{@name}" />
				<details key="annotation" value="{@annotation}" />
				<details key="scope" value="{@scope}" />
				<details key="visibility" value="{@visibility}" />
				<details key="isChangeable" value="{@isChangeable}" />
				<details key="type" value="{@type}" />
				<details key="referencedEnd" value="{@referencedEnd}" />
				<details key="lower"
					value="{./Model:StructuralFeature.multiplicity/Model:MultiplicityType/@lower}" />
				<details key="upper"
					value="{./Model:StructuralFeature.multiplicity/Model:MultiplicityType/@upper}" />
				<details key="is_ordered"
					value="{./Model:StructuralFeature.multiplicity/Model:MultiplicityType/@is_ordered}" />
				<details key="is_unique"
					value="{./Model:StructuralFeature.multiplicity/Model:MultiplicityType/@is_unique}" />
			</eAnnotations>
		</eStructuralFeatures>
	</xsl:template>

	<xsl:template match="Model:Tag">
		<eAnnotations source="http://www.dinkla.net/Model:Tag">
			<details key="xmi.id" value="{@xmi.id}" />
			<details key="name" value="{@name}" />
			<details key="annotation" value="{@annotation}" />
			<details key="tagId" value="{@tagId}" />
			<details key="elements" value="{@elements}" />
			<xsl:apply-templates />
		</eAnnotations>
	</xsl:template>

	<xsl:template match="XMI.any">
		<!-- <details key="xmi.type" value="{@xmi.type}" />
		<details key="xmi.name" value="{@xmi.name}" />
		<details key="value">
			<xsl:attribute name="value">
				<xsl:apply-templates />
			</xsl:attribute>
		</details>  -->
	</xsl:template>

	<!-- reusable replace-string function -->
	<xsl:template name="replace-string">
		<xsl:param name="text" />
		<xsl:param name="from" />
		<xsl:param name="to" />

		<xsl:choose>
			<xsl:when test="contains($text, $from)">
				<xsl:variable name="before"
					select="substring-before($text, $from)" />
				<xsl:variable name="after"
					select="substring-after($text, $from)" />
				<xsl:variable name="prefix"
					select="concat($before, $to)" />
				<xsl:value-of select="$before" />
				<xsl:value-of select="$to" />
				<xsl:call-template name="replace-string">
					<xsl:with-param name="text" select="$after" />
					<xsl:with-param name="from" select="$from" />
					<xsl:with-param name="to" select="$to" />
				</xsl:call-template>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="$text" />
			</xsl:otherwise>
		</xsl:choose>
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
						<xsl:call-template name="get-fq-name-class">
							<xsl:with-param name="package" select="$package" />
							<xsl:with-param name="xmi.id" select="@xmi.id" />
						</xsl:call-template>						
					</xsl:for-each>
				</xsl:when>
				<xsl:otherwise>
					<xsl:for-each select="//*[@xmi.id=$before]">
						<xsl:call-template name="get-fq-name-class">
							<xsl:with-param name="package" select="$package" />
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

	<!-- function get-fq-name-prim -->
	<xsl:template name="get-fq-name2">
		<xsl:param name="package" />
		<xsl:param name="xmi.id" />
		
		<xsl:for-each select="//*[@xmi.id=$xmi.id]">#//<xsl:value-of select="@name"/> </xsl:for-each>
	</xsl:template>

	<!-- function get-fq-name-class -->
	<xsl:template name="get-fq-name-class">
		<xsl:param name="package" />
		<xsl:param name="xmi.id" />

		<xsl:for-each select="//*[@xmi.id=$xmi.id]">
			<xsl:variable name="mypackage" select="../../@name"/>
			<xsl:choose>
				<xsl:when test="$package = $mypackage">#//<xsl:value-of select="@name"/></xsl:when>
				<xsl:otherwise>cwm_<xsl:value-of select="$mypackage"/>.ecore#//<xsl:value-of select="@name"/></xsl:otherwise>
			</xsl:choose>
		</xsl:for-each>
	</xsl:template>


</xsl:transform>
