<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<xsl:apply-templates/>
	</xsl:template>
	
	<xsl:template match="*">
		<xsl:copy>
			<xsl:apply-templates/>
		</xsl:copy>
	</xsl:template>
	
	<xsl:template match="form">
		<form name="{@name}" target="{@target}">
			<xsl:apply-templates/>
		</form>
	</xsl:template>
	
	<xsl:template match="field">
		<field type="{@type}" name="{@name}" size="{@size}" prompt="{@prompt}">
			<urlValueTest>true</urlValueTest>
			<xsl:apply-templates/>
		</field>
	</xsl:template>
	
</xsl:stylesheet>