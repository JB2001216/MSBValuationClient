<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output method="html"/>
  <xsl:template match="/nis/concerto/xadmin">
    <html>
      <head>
      	  <meta http-equiv="expires" content="Wed, 31 Jan 2001 09:00:00 GMT"/>
		    <meta http-equiv="Cache-Control" Content="no-cache"/>
		    <meta http-equiv="Pragma" Content="no-cache"/>
		    <title>Concerto Universal Administration</title>
        <link rel="stylesheet" href="../stylesheets/concerto.css" type="text/css"/>
      </head>
      <body background='../../images/bg1.gif'>
        <xsl:call-template name="pageContents">
          <xsl:with-param name="xadmin" select="."/>
        </xsl:call-template>
      </body>
    </html>
  </xsl:template>
  
  <xsl:template name="pageContents">
    <xsl:param name="xadmin"/>
    <xsl:variable name="header" select="$xadmin/header"/>
    <xsl:variable name="toplevelresources" select="$xadmin/resource"/>
    <xsl:variable name="errors" select="$xadmin/error"/>
    <table border="0" cellpadding="0" cellspacing="0">
			<tr>
				<td class="heading1"><xsl:value-of select="$header/title"/></td>
			</tr>
			<tr>
				<td>
					<br/>
				  <p class="text2">Listed below are those configuration items that have changed from their initialization or default value. Use the checkbox to indicate which of these should be saved to the servlet section of the web.xml file and press submit. N.B. Some servlet containers, detect changes to the web.xml file and dependant on the containers configuration, may cause the servlet to reload</p>
			  </td>
			</tr>
		</table>
		<br/>
		<table style="position:relative;top=20;left=80" border="0" cellpadding="2" cellspacing="2" name="tab1" width="100%">
			<tr>
      		<td>
         	<xsl:if test="$errors">
           	<font color="red">
             	<b>
               	<xsl:call-template name="insertErrors">
                 		<xsl:with-param name="errors" select="$errors"/>
                	</xsl:call-template>
               </b>
             </font>
             <p/>
           </xsl:if>
           <xsl:call-template name="processForm">
           	<xsl:with-param name="form" select="form"/>
           </xsl:call-template>
         </td>
       </tr>
    </table>
  </xsl:template>
  
  <xsl:template name="processList">
  		<xsl:param name="list"/>
			<xsl:for-each select ="listitem">
				<xsl:call-template name="processListItem">
					<xsl:with-param name="listitem" select="."/>
				</xsl:call-template>						
			</xsl:for-each>
	 </xsl:template>
  
  
   <xsl:template name="processListItem">
  		<xsl:param name="listitem"/>
  			<tr>
	  			<xsl:for-each select ="$listitem/field">
						<xsl:call-template name="processField">
							<xsl:with-param name="field" select="field"/>
						</xsl:call-template>
	  			</xsl:for-each>
 			</tr>
  </xsl:template>

   <xsl:template name="processField">
  		<xsl:param name="field"/>
		<xsl:if test="@type='text'">
			<td>
			<xsl:value-of select="contents"/>
			</td>
		</xsl:if>
		<xsl:if test="@type='boolean'">
			<td align="center">
			<input type="checkbox" name="{@name}"/>
			</td>
		</xsl:if>
		<xsl:if test="@type='hidden'">
		<td>
			<xsl:element name="input">
			<xsl:attribute name="type">text</xsl:attribute>
			<xsl:attribute name="readonly"/>
			<xsl:attribute name="size">30</xsl:attribute>
			<xsl:attribute name="name"><xsl:value-of select="@name"/></xsl:attribute>
			<xsl:attribute name="value"><xsl:value-of select="contents"/></xsl:attribute>
			</xsl:element>
		</td>
		</xsl:if>
  </xsl:template>
 
 
  <xsl:template name="processForm">
    <xsl:param name="header"/>
    <xsl:param name="form"/>
    <form action="{$form/@target}" name="{$form/@name}" onSubmit="" method="post">
      		<xsl:for-each select ="$form/list">
      		<table border="0" cellspacing="10" width="90%">
      			<tr>
      				<td class="heading1">Configuration Items Changed</td>
      				<td class ="heading1" align="center">Current Value</td>
      				<td class="heading1"><a href="javascript:void(0)" onclick="invertChecks()" title="Click to invert selection">Items To Save</a></td>
      			</tr>
      			<tr><td colspan ="3"><hr/></td></tr>
	       	<tr>
						<xsl:call-template name="processList">
							<xsl:with-param name="list" select="list"/>
						</xsl:call-template>
					</tr>
					<tr><td colspan ="3"><hr/></td></tr>
      		</table>
				</xsl:for-each>
      <br/>
      <xsl:if test="$form/link[name='formSubmit']">
        <input type="button" name="formSubmit" value="{$form/link[name='formSubmit']/prompt}" onclick="document.form1.action.value='finish';document.form1.submit();"/>
      </xsl:if>
    </form>
    <script>
	    function invertChecks() {
    <xsl:for-each select="$form/list/listitem/field">
    		<xsl:if test="@type='boolean'">
				document.form1.<xsl:value-of select="@name"/>.checked = !document.form1.<xsl:value-of select="@name"/>.checked;
			</xsl:if>
		</xsl:for-each>
		}
		</script>
  </xsl:template>
  
  	<xsl:template name="insertErrors">
		<xsl:param name="errors"/>
		<xsl:for-each select="$errors">
			<xsl:value-of select="display"/>
			<xsl:if test="position() &lt; last()">
				<br/>
			</xsl:if>
		</xsl:for-each>
	</xsl:template>
  
	
</xsl:stylesheet>