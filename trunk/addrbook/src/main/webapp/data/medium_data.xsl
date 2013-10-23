<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<!-- xsl:strip-space elements="doc chapter section"/ -->
<!-- xsl:output method="xml" indent="yes"/ -->

<xsl:template match="rowset">
	<font face="arial, helvetica" size="2">
	<table border="1" cellpadding="0" cellspacing="0">
	<xsl:apply-templates/>
	</table>
	</font>
</xsl:template>

<xsl:template match="row">
		<tr>
		<xsl:apply-templates/>
		</tr>
</xsl:template>

<xsl:template match="person">
			<td>
			<xsl:value-of select="./first"/> <xsl:value-of select="./middle"/> <xsl:value-of select="./last"/>
			</td>
</xsl:template>

<xsl:template match="address">
			<td>
			<b><xsl:value-of select="./label"/></b><br/>
			<xsl:value-of select="./street1"/> <xsl:value-of select="./street2"/><br/>
			<xsl:value-of select="./city"/>, <xsl:value-of select="./state"/> <xsl:value-of select="./zip"/>
			</td>
</xsl:template>

<xsl:template match="phone">
			<td>
			<xsl:value-of select="./label"/><br/>
			<xsl:value-of select="./number"/>
			</td>
</xsl:template>

<xsl:template match="email">
			<td>
			<xsl:value-of select="./label"/><br/>
			<xsl:value-of select="./address"/><br/>
			<xsl:value-of select="./nic"/>
			</td>
</xsl:template>

<xsl:template match="notes">
			<td>
			<xsl:value-of select="."/>
			</td>
</xsl:template>

</xsl:stylesheet>
