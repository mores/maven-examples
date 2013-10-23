<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<!-- xsl:strip-space elements="doc chapter section"/ -->
<!-- xsl:output method="xml" indent="yes"/ -->

<xsl:template match="rowset">
	<font face="arial, helvetica" size="2">
	<table border="0" cellpadding="0" cellspacing="0">
	<xsl:apply-templates/>
	</table>
	</font>
</xsl:template>

<xsl:template match="row">
		<tr>
		<xsl:apply-templates/>
		</tr>
</xsl:template>

<xsl:template match="col">
			<td>
			<xsl:apply-templates/>
			</td>
</xsl:template>

</xsl:stylesheet>
