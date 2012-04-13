<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output method="html"/>
  <xsl:template match="/access_log">
    <html>
      <head>
      	  <meta http-equiv="expires" content="Wed, 31 Jan 2001 09:00:00 GMT"/>
		    <meta http-equiv="Cache-Control" Content="no-cache"/>
		    <meta http-equiv="Pragma" Content="no-cache"/>
		    <title>Access Log</title>
        <link rel="stylesheet" href="../stylesheets/concerto.css" type="text/css"/>
        <h1 class="heading1">Concerto Universal Administration - Access Log</h1>
      </head>
      <body background='../../images/bg1.gif'>
        <xsl:call-template name="logContents">
          <xsl:with-param name="accesslog" select="."/>
        </xsl:call-template>
      </body>
    </html>
  </xsl:template>
  
  <xsl:template name="logContents">
    <xsl:param name="accesslog"/>
			<form name="form1">
				<xsl:element name="input">
					<xsl:attribute name="type">hidden</xsl:attribute>
					<xsl:attribute name="name">action</xsl:attribute>
					<xsl:attribute name="value"/>
				</xsl:element>
				<xsl:call-template name="tableHeader">
					<xsl:with-param name="accesslog" select="."/>
      		</xsl:call-template>
      		<xsl:call-template name="processTable">
					<xsl:with-param name="accesslog" select="."/>
      		</xsl:call-template>
      </form>
  </xsl:template> 
        		
  <xsl:template name="processTable">
	  <xsl:param name="accesslog"/>
	  		<table>
			<tr>
				<td align="center">
					<table border="1" cellpadding="1" cellspacing="1">
						<tr>
							<td><b>Index</b></td>
							<td><b>Page Accessed</b></td>
							<td><b>Access Date/Time</b></td>
							<td><b>Queue Time</b></td>
							<td><b>Execute Time</b></td>
						</tr>
						<xsl:for-each select ="log_entry">
							<xsl:call-template name="processLogEntry">
								<xsl:with-param name="log_entry" select="."/>
							</xsl:call-template>						
						</xsl:for-each>
					</table>
				</td>
			</tr>
			</table>
	</xsl:template>
	
	  <xsl:template name="processLogEntry">
	  		<xsl:param name="logEntry"/>
				<tr>
					<td><xsl:value-of select="index"/></td>
					<td><xsl:value-of select="page_name"/></td>
					<td><xsl:value-of select="access_time"/></td>
					<td><xsl:value-of select="queue_time"/></td>
					<td><xsl:value-of select="exec_time"/></td>
				</tr>
		</xsl:template>

	<xsl:template name="tableHeader">
		<xsl:param name="accesslog"/>
			<table>
			<tr>
				<td align="center">
					<table cellspacing="5" cellpadding="5">
						<tr>
							<td>
								<span class="heading3"><b>Page:<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text></b></span>
								<xsl:element name="input">
									<xsl:attribute name="type">text</xsl:attribute>
									<xsl:attribute name="size">8</xsl:attribute>
									<xsl:attribute name="name">page</xsl:attribute>
									<xsl:attribute name="value"><xsl:value-of select="page_number"/></xsl:attribute>
								</xsl:element>
							</td>
							<td>
								<span class="heading3"><b>Search:<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text></b></span>
								<xsl:element name="input">
									<xsl:attribute name="type">text</xsl:attribute>
									<xsl:attribute name="size">20</xsl:attribute>
									<xsl:attribute name="name">search</xsl:attribute>
									<xsl:attribute name="value"><xsl:value-of select="search_pattern"/></xsl:attribute>
								</xsl:element>
								<xsl:element name="input">
									<xsl:attribute name="type">hidden</xsl:attribute>
									<xsl:attribute name="name">searchLast</xsl:attribute>
									<xsl:attribute name="value"><xsl:value-of select="search_pattern"/></xsl:attribute>
								</xsl:element>
							</td>
							<td>
								<span class="heading3"><b>Lines/page:<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text></b></span>
								<xsl:element name="input">
									<xsl:attribute name="type">text</xsl:attribute>
									<xsl:attribute name="size">8</xsl:attribute>
									<xsl:attribute name="name">lines</xsl:attribute>
									<xsl:attribute name="value"><xsl:value-of select="lines"/></xsl:attribute>
								</xsl:element>
							</td>
							<td>
								<xsl:element name="input">
									<xsl:attribute name="type">image</xsl:attribute>
									<xsl:attribute name="src">../images/submit.gif</xsl:attribute>
									<xsl:attribute name="onclick">document.form1.submit();</xsl:attribute>
								</xsl:element>
							</td>
						</tr>
						<tr>
							<td colspan="4" align="center">
								<xsl:choose>
									<xsl:when test="./page_number = 1">
										<span class="prompt"><b>first</b></span>
									</xsl:when>
									<xsl:otherwise>
										<xsl:element name="a">
										<xsl:attribute name="href">javascript:document.form1.action.value="first";document.form1.submit();</xsl:attribute>
										<xsl:attribute name="name">first</xsl:attribute>
										<span class="prompt">first</span>
										</xsl:element>
									</xsl:otherwise>
								</xsl:choose>

								<span class="prompt"><b><xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>-<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text></b></span>
								
								<xsl:choose>
									<xsl:when test="./page_number = 1">
										<span class="prompt"><b>previous</b></span>
									</xsl:when>
									<xsl:otherwise>
										<xsl:element name="a">
										<xsl:attribute name="href">javascript:document.form1.action.value="prev";document.form1.submit();</xsl:attribute>
										<xsl:attribute name="name">prev</xsl:attribute>
										<span class="prompt">previous</span>
										</xsl:element>
									</xsl:otherwise>
								</xsl:choose>

								<span class="prompt"><b><xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>-<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text></b></span>
								
								<xsl:choose>
									<xsl:when test="./last_page = 'true'">
										<span class="prompt"><b>next</b></span>
									</xsl:when>
									<xsl:otherwise>
										<xsl:element name="a">
										<xsl:attribute name="href">javascript:document.form1.action.value="next";document.form1.submit();</xsl:attribute>
										<xsl:attribute name="name">next</xsl:attribute>
										<span class="prompt">next</span>
										</xsl:element>
									</xsl:otherwise>
								</xsl:choose>

								<span class="prompt"><b><xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>-<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text></b></span>

								<xsl:choose>
									<xsl:when test="./last_page = 'true'">
										<span class="prompt"><b>last</b></span>
									</xsl:when>
									<xsl:otherwise>
										<xsl:element name="a">
										<xsl:attribute name="href">javascript:document.form1.action.value="last";document.form1.submit();</xsl:attribute>
										<xsl:attribute name="name">last</xsl:attribute>
										<span class="prompt">last</span>
										</xsl:element>
									</xsl:otherwise>
								</xsl:choose>

							</td>
						</tr>
					</table>
				</td>
			</tr>
			</table>
  </xsl:template>
	
</xsl:stylesheet>