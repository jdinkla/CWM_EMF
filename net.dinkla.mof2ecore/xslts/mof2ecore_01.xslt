<?xml version="1.0" encoding="UTF-8"?> 
<xsl:transform
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
	xmlns:xmi="http://www.omg.org/XMI"
	xmlns:Model="http://www.omg.org/mof.Model/1.3"
	version="1.0"
>

<xsl:template match="Model:Attribute">
Model:Attribute(<xsl:value-of select="@name"/>::<xsl:value-of select="@type"/>, <xsl:value-of select="@xmi.id"/>) [
<xsl:apply-templates/>
] end of Model:Attribute(<xsl:value-of select="@name"/>::<xsl:value-of select="@type"/>, <xsl:value-of select="@xmi.id"/>) [
</xsl:template>

<xsl:template match="Model:Class">
Model:Class(<xsl:value-of select="@name"/>::<xsl:value-of select="@supertypes"/>, <xsl:value-of select="@xmi.id"/>) [
<xsl:apply-templates/>
] end of Model:Class(<xsl:value-of select="@name"/>::<xsl:value-of select="@supertypes"/>, <xsl:value-of select="@xmi.id"/>) [
</xsl:template>

<xsl:template match="Model:ModelElement.annotation">
Model:ModelElement.annotation
</xsl:template>

<xsl:template match="Model:MultiplicityType">
Model:MultiplicityType(<xsl:value-of select="@lower"/>,<xsl:value-of select="@upper"/>,<xsl:value-of select="@is_ordered"/>,<xsl:value-of select="@is_unique"/>)
</xsl:template>

<xsl:template match="Model:Namespace.contents">
Model:Namespace.contents[
<xsl:apply-templates/>
] end of Model:Namespace.contents
</xsl:template>

<xsl:template match="Model:Package">
Model:Package(<xsl:value-of select="@name"/>, <xsl:value-of select="@xmi.id"/>)[
<xsl:apply-templates/>
] end of Model:Package (<xsl:value-of select="@name"/>, <xsl:value-of select="@xmi.id"/>)
</xsl:template>

<xsl:template match="Model:Reference">
Model:Reference(<xsl:value-of select="@name"/>::<xsl:value-of select="@type"/> end=<xsl:value-of select="@referencedEnd"/>, <xsl:value-of select="@xmi.id"/>) [
<xsl:apply-templates/>
] end of Model:Reference(<xsl:value-of select="@name"/>::<xsl:value-of select="@type"/> end=<xsl:value-of select="@referencedEnd"/>, <xsl:value-of select="@xmi.id"/>) [
</xsl:template>

<xsl:template match="Model:StructuralFeature.multiplicity">
Model:StructuralFeature.multiplicity [
<xsl:apply-templates/>
] end of Model:StructuralFeature.multiplicity
</xsl:template>

<xsl:template match="Model:Tag">
Model:Tag(<xsl:value-of select="@name"/>, <xsl:value-of select="@xmi.id"/>) [
<xsl:apply-templates/>
] end of Model:Tag(<xsl:value-of select="@name"/>, <xsl:value-of select="@xmi.id"/>) [
</xsl:template>

<xsl:template match="Model:Tag.values">
Model:Tag.values(<xsl:apply-templates/>)
</xsl:template>

<xsl:template match="XMI.documentation">
XMI.documentation
</xsl:template>

<xsl:template match="XMI.any">
XMI.any(<xsl:value-of select="@xmi.name"/>,<xsl:value-of select="@xmi.type"/>)='<xsl:apply-templates/>'
</xsl:template>

<xsl:template match="XMI.exporter">
XMI.exporter
</xsl:template>

<xsl:template match="XMI.exporterVersion">
XMI.exporterVersion
</xsl:template>


</xsl:transform>

