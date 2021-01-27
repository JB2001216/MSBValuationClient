<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:import href="lib.xsl"/>
  <xsl:output method="html"/>
  <xsl:template match="/nis/concerto/xadmin">
    <html>
      <head>
      	  <meta http-equiv="expires" content="Wed, 31 Jan 2001 09:00:00 GMT"/>
		    <meta http-equiv="Cache-Control" Content="no-cache"/>
		    <meta http-equiv="Pragma" Content="no-cache"/>
		    <title>Concerto Universal Administration</title>
        <link rel="stylesheet" href="../stylesheets/concerto.css" type="text/css"/>
        <xsl:call-template name="generateValidation"/>
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
    <xsl:variable name="errors" select="$xadmin//error"/>
    <script>var clicks=0;</script>
    <table border="0" cellpadding="0" cellspacing="0">
			<tr>
				<td class="heading1"><xsl:value-of select="$header/title"/></td>
			</tr>
		</table>
		<br/>
		<table style="position:relative;top=20;left=80" border="0" cellpadding="2" cellspacing="2" name="tab1">
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
<!--       <tr>       	
        	<td align="right">
          <xsl:call-template name="insertButton">
            <xsl:with-param name="link" select="./link"/>
            <xsl:with-param name="onclick">clicks++;if(clicks > 1)return;document.form1.action.value='<xsl:value-of select="./link/url"/>';if (validateform1())document.form1.submit();else clicks=0;</xsl:with-param>
          </xsl:call-template>
        </td>
      </tr>-->
    </table>
  </xsl:template>
  
  <xsl:template name="processField">
  		<xsl:param name="field"/>
		<tr>
			<td>
				<xsl:if test="@type!='hidden'">
					<b>
						<xsl:call-template name="insertPrompt">
						  <xsl:with-param name="field" select="."/>
						</xsl:call-template>
					</b>
				</xsl:if>
			</td>
			<td>
				<xsl:call-template name="insertField">
				<xsl:with-param name="includePrompt">false</xsl:with-param>
				<xsl:with-param name="field" select="."/>
				<xsl:with-param name="size" select="$field/@size"/>
				<xsl:with-param name="cp" select="/nis/concerto/xadmin/resource"/>
				</xsl:call-template>
			</td>
			<td>	</td>
		</tr>
  </xsl:template>
  
  <xsl:template name="processList">
  		<xsl:param name="list"/>
			<td>
				<b>
					<xsl:call-template name="insertPrompt">
					  <xsl:with-param name="field" select="."/>
					</xsl:call-template>
				</b>
			</td>
			<td>
				<table>
					<xsl:for-each select ="$list/listitem">
						<xsl:call-template name="processListItem">
							<xsl:with-param name="listitem" select="."/>
							<xsl:with-param name="isLast" select="last()-position()"/>
						</xsl:call-template>						
					</xsl:for-each>
				</table>
			</td>
  </xsl:template>
  
  <xsl:template name="processListItem">
  		<xsl:param name="listitem"/>
  		<xsl:param name="isLast"/>
  			
  			
  			<tr>
	  			<xsl:for-each select="$listitem/field">
	  				<td>
						<xsl:call-template name="insertField">
						<xsl:with-param name="includePrompt">false</xsl:with-param>
						<xsl:with-param name="field" select="."/>
						<xsl:with-param name="size" select="./@size"/>
						</xsl:call-template>
					</td>
	  			</xsl:for-each>
	  				<td>
	  				<xsl:if test="link[1]">
	  				<xsl:call-template name="insertButton">
						<xsl:with-param name="link" select="$listitem/link[1]"/>
						<xsl:with-param name="onclick">clicks++;if(clicks > 1)return;document.form1.action.value='<xsl:value-of select="link[1]/url"/>';document.form1.submit();</xsl:with-param>
					</xsl:call-template>
					</xsl:if>
					</td>
	
					<td>
					<xsl:if test="link[2]">
					  	<xsl:call-template name="insertButton">
						<xsl:with-param name="link" select="$listitem/link[2]"/>
						<xsl:with-param name="onclick">clicks++;if(clicks > 1)return;document.form1.action.value='<xsl:value-of select="link[2]/url"/>';document.form1.submit();</xsl:with-param>
					</xsl:call-template>
					</xsl:if>
					</td>
					
					<td>
					<xsl:if test="anchor">
						<a>
							<xsl:attribute name="name">
								<xsl:value-of select="anchor/@name"/>
							</xsl:attribute>
							<xsl:text disable-output-escaping="yes">&amp;nbsp;</xsl:text>
						</a>
					</xsl:if>
					</td>
					
	  			<xsl:for-each select="$listitem/list">
	  					<xsl:call-template name="processList">
							<xsl:with-param name="list" select="."/>
						</xsl:call-template>
	  			</xsl:for-each>
  			</tr>
  			
  			<xsl:if test="$isLast > 0">
	  			<xsl:if test="list">
		  			<tr>
		  				<xsl:variable name="noOfFields" select="count($listitem/field)"></xsl:variable>
		  				<xsl:variable name="noOfLists" select="2 * count($listitem/list)"></xsl:variable>
		  				<td colspan="{$noOfFields + $noOfLists + 3}" name="separator">
		  				  				<hr/>
		  				</td>
					</tr>
	  			</xsl:if>
  			</xsl:if>
  </xsl:template>
  
  <xsl:template name="processForm">
    <xsl:param name="header"/>
    <xsl:param name="form"/>
    <form action="{$form/@target}" name="{$form/@name}" onSubmit="return validate{$form/@name}()" method="post">
      <table border="0">
				<xsl:for-each select ="$form/field">
					<xsl:call-template name="processField">
						<xsl:with-param name="field" select="."/>
					</xsl:call-template>
				</xsl:for-each>
         <xsl:for-each select ="$form/list">
         	<xsl:if test="position() != 1">
         	<tr>
         		<td colspan="3"><hr/></td>
         	</tr>
         	</xsl:if>
		       <xsl:if test="./@premessage">
		       <tr>
		       <td colspan="3">
			  			<b><xsl:value-of select ="./@premessage"/><p/></b>
			  		</td>
			  		</tr>
			  		</xsl:if>
         	<tr>
					<xsl:call-template name="processList">
						<xsl:with-param name="list" select="."/>
					</xsl:call-template>
					</tr>
        </xsl:for-each>
      </table>
      <br/>
      <xsl:if test="$form/link[name='formSubmit']">
        <input type="submit" name="formSubmit" value="{$form/link[name='formSubmit']/prompt}" onclick="document.form1.action.value='finish';"/>
      </xsl:if>
    </form>
  </xsl:template>
  
</xsl:stylesheet>