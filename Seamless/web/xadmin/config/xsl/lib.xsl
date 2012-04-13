<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output 
		method="html"
		version="4.0"
		encoding="iso-8859-1"
		indent="yes"
		doctype-public="-//W3C//DTD HTML 4.01 Transitional//EN"
		doctype-system="http://www.w3.org/TR/html4/loose.dtd"
	/>
	<xsl:template name="insertField">
		<xsl:param name="field"/>
		<xsl:param name="includePrompt"/>
		<xsl:param name="size"/>
		<xsl:param name="cp"/>
		<xsl:param name="includeAdditionalText"/>
		<xsl:param name="isTextArea"/>
		<xsl:param name="rows"/>
		<xsl:param name="cols"/>
		<xsl:param name="nomandatoryindicator"/>
		<xsl:variable name="fieldType" select="$field/@type"/>
		<xsl:if test="$includePrompt != '' and $includePrompt = 'true'">
			<xsl:if test="$fieldType != 'hidden' and  $field/@prompt != ''">
				<xsl:call-template name="insertPrompt">
					<xsl:with-param name="field" select="$field"/>
				</xsl:call-template>
				<xsl:text disable-output-escaping="yes">:&#38;nbsp;</xsl:text>
			</xsl:if>
		</xsl:if>
		<xsl:choose>
			<xsl:when test="$fieldType='text'">
				<xsl:choose>
					<xsl:when test="$isTextArea='true'">
						<xsl:element name="textarea">
							<xsl:attribute name="name"><xsl:value-of select="$field/@name"/></xsl:attribute>
							<xsl:if test="$rows!=''">
								<xsl:attribute name="rows"><xsl:value-of select="$rows"/></xsl:attribute>
							</xsl:if>
							<xsl:if test="$cols!=''">
								<xsl:attribute name="cols"><xsl:value-of select="$cols"/></xsl:attribute>
							</xsl:if>
							<xsl:value-of select="$field/contents"/>
						</xsl:element>
					</xsl:when>
					<xsl:otherwise>
						<xsl:variable name="maxlength" select="$field/@maxlength"/>
						<xsl:element name="input">
							<xsl:attribute name="type">text</xsl:attribute>
							<xsl:attribute name="name"><xsl:value-of select="$field/@name"/></xsl:attribute>
							<xsl:attribute name="value"><xsl:value-of select="$field/contents"/></xsl:attribute>
							<xsl:if test="$maxlength != ''">
								<xsl:attribute name="maxlength"><xsl:value-of select="$maxlength"/></xsl:attribute>
								<xsl:if test="$maxlength &lt; 20">
									<xsl:attribute name="size"><xsl:value-of select="$maxlength"/></xsl:attribute>
								</xsl:if>
							</xsl:if>
							<xsl:if test="$size!= ''">
								<xsl:attribute name="size"><xsl:value-of select="$size"/></xsl:attribute>
							</xsl:if>
							<xsl:if test="$field/@disabled = 'true'">
								<xsl:attribute name="disabled">true</xsl:attribute>
							</xsl:if>
							<xsl:if test="$field/@readonly = 'true'">
								<xsl:attribute name="readonly">true</xsl:attribute>
							</xsl:if>
						</xsl:element>
					</xsl:otherwise>
				</xsl:choose>
				<xsl:if test="$field/urlValueTest">
						<xsl:element name="input">
							<xsl:attribute name="type">button</xsl:attribute>
							<xsl:attribute name="name">ViewPageButton</xsl:attribute>
							<xsl:attribute name="value">View Page</xsl:attribute>
							<xsl:attribute name="onClick">popupUrl("<xsl:value-of select="$cp"/>"+document.form1.<xsl:value-of select="$field/@name"/>.value);</xsl:attribute>
						</xsl:element>
				</xsl:if>
			</xsl:when>
			<xsl:when test="$fieldType='hidden'">
				<xsl:element name="input">
					<xsl:attribute name="type">hidden</xsl:attribute>
					<xsl:attribute name="name"><xsl:value-of select="$field/@name"/></xsl:attribute>
					<xsl:attribute name="value"><xsl:value-of select="$field/contents"/></xsl:attribute>
					<xsl:if test="$field/@disabled = 'true'">
						<xsl:attribute name="disabled">true</xsl:attribute>
					</xsl:if>
				</xsl:element>
			</xsl:when>
			<xsl:when test="$fieldType='select'">
				<xsl:element name="select">
					<xsl:attribute name="name"><xsl:value-of select="$field/@name"/></xsl:attribute>
					<xsl:if test="$field/@disabled = 'true'">
						<xsl:attribute name="disabled">true</xsl:attribute>
					</xsl:if>
					<xsl:for-each select="$field/contents/option">
						<xsl:element name="option">
							<xsl:attribute name="value"><xsl:value-of select="@name"/></xsl:attribute>
							<xsl:if test="@selected='true'">
								<xsl:attribute name="selected">true</xsl:attribute>
							</xsl:if>
							<xsl:value-of select="."/>
						</xsl:element>
					</xsl:for-each>
				</xsl:element>
			</xsl:when>
			<xsl:when test="$fieldType='boolean'">
				<xsl:element name="input">
					<xsl:attribute name="type">checkbox</xsl:attribute>
					<xsl:attribute name="name"><xsl:value-of select="$field/@name"/></xsl:attribute>
					<xsl:attribute name="onClick"><xsl:value-of select="$field/@name"/>changed()</xsl:attribute>
					<xsl:if test="$field/contents = 'true'">
						<xsl:attribute name="checked">true</xsl:attribute>
					</xsl:if>
					<xsl:if test="$field/@disabled = 'true'">
						<xsl:attribute name="disabled">true</xsl:attribute>
					</xsl:if>
				</xsl:element>
			</xsl:when>
		</xsl:choose>
		<!--if the field is mandatory, display the * unless we've said nomandatoryindicator-->
		<!--<xsl:if test="$field/validation/type[@name='mandatory']">
			<xsl:choose>
				<xsl:when test="string-length($nomandatoryindicator)!=0 and $nomandatoryindicator='true'"/>
				<xsl:otherwise>
					<font color="red">*</font>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:if>-->
	</xsl:template>
	<!--
	Generates the validation javascript based on the <validation></validation> nodes in the
	forms within the formgroup passed in as a variable.	
	-->
	<xsl:template name="generateValidation">
		<xsl:call-template name="genericfunctions"/>
		<script language="javascript">
			var names;
			<xsl:call-template name="generateValidationForForm">
	    	  <xsl:with-param name="form" select="form"/>
			</xsl:call-template>
		</script>
	</xsl:template>
	<!--
	Drops in the javascript function calls for a single form.
	-->
	<xsl:template name="generateValidationForForm">
		<xsl:param name="form"/>
		<xsl:variable name="formName" select="$form/@name"/>
		<xsl:variable name="fields" select="$form//field"/>
		
		//dropping in vaidation for form: <xsl:value-of select="$formName"/>
		function validate<xsl:value-of select="$formName"/>(){

			names = new Array();
		
		<!--rip through all the fields creating a function call for each type of validation required by each field-->
		<xsl:for-each select="$fields">		
			<xsl:variable name="fieldName" select="@name"/>
	
			<xsl:variable name="fieldPrompt">
				<xsl:call-template name="generateFieldPrompt">
					<xsl:with-param name="prompt" select="@prompt"/>
				</xsl:call-template>
			</xsl:variable>
			<xsl:variable name="fieldType" select="@type"/>
			<xsl:variable name="fullFieldName">document.<xsl:value-of select="$formName"/>.<xsl:value-of select="$fieldName"/>
			</xsl:variable>
			
			
			<xsl:if test="$fieldType != 'hidden'">
				<!--//validation for field: <xsl:value-of select="$fieldName"/>-->
				<xsl:for-each select="validation/type">
					<xsl:variable name="validationType" select="@name"/>
					<xsl:variable name="params" select="./param"/>

					<xsl:choose>
						<xsl:when test="$validationType = 'mandatory'">
							if (!mandatory(<xsl:value-of select="$fullFieldName"/>)){
								<xsl:value-of select="$fullFieldName"/>.focus();
								<xsl:value-of select="$fullFieldName"/>.select();
								alert("<xsl:value-of select="$fieldPrompt"/> is mandatory");		
								return false;
							}							
						</xsl:when>
						<xsl:when test="$validationType = 'unique'">
						if (!unique(<xsl:value-of select="$fullFieldName"/>)){
							alert("<xsl:value-of select="$fieldPrompt"/> must have a unique value");
							<xsl:value-of select="$fullFieldName"/>.focus();
							<xsl:value-of select="$fullFieldName"/>.select();
							return false;
						}
					</xsl:when>
					</xsl:choose>
				</xsl:for-each>
			</xsl:if>
		</xsl:for-each>
		return true;
		}		
		
		<!--rip through all the fields creating any changeactions.-->
		<xsl:for-each select="$fields">
			<xsl:variable name="fieldName" select="@name"/>
			<xsl:variable name="fieldType" select="@type"/>
			<xsl:variable name="fullFieldName">document.<xsl:value-of select="$formName"/>.<xsl:value-of select="$fieldName"/>
			</xsl:variable>
			<xsl:variable name="enableds" select="./changeaction/type[@name='enable']/param"/>
			<xsl:variable name="disables" select="./changeaction/type[@name='disable']/param"/>
			<xsl:variable name="truesubfields" select="./changeaction/type[@name='truesubfield']/param"/>
			<xsl:variable name="falsesubfields" select="./changeaction/type[@name='falsesubfield']/param"/>
			<xsl:variable name="truevalidatefields" select="./changeaction/type[@name='truevalidatefield']/param"/>
			
			<xsl:if test="$fieldType='boolean'">
				function <xsl:value-of select="$fieldName"/>changed(){
					
					if (<xsl:value-of select="$fullFieldName"/>.checked){
						//disable the disabed, enable the enabled
						<xsl:for-each select="$disables">
							document.<xsl:value-of select="$formName"/>.<xsl:value-of select="."/>.disabled=true;
						</xsl:for-each>
				<xsl:for-each select="$enableds">
							document.<xsl:value-of select="$formName"/>.<xsl:value-of select="."/>.disabled=false;
						</xsl:for-each>
				<xsl:for-each select="$truesubfields">
					<xsl:value-of select="."/>changed();
						</xsl:for-each>
						
						<xsl:for-each select="$truevalidatefields">							
								//alert("validate <xsl:value-of select="."></xsl:value-of>");							
						</xsl:for-each>
					}
					else{
						//enabled the disabled, disabled the enabled
						<xsl:for-each select="$disables">
							document.<xsl:value-of select="$formName"/>.<xsl:value-of select="."/>.disabled=false;
						</xsl:for-each>
				<xsl:for-each select="$enableds">
							document.<xsl:value-of select="$formName"/>.<xsl:value-of select="."/>.disabled=true;
						</xsl:for-each>
				<xsl:for-each select="$falsesubfields">
					<xsl:value-of select="."/>changed();
						</xsl:for-each>

					}
									
				}
			</xsl:if>
		</xsl:for-each>
		<!--rip through all the fields creating the onLoadFunction.-->
		function onLoadFunction(){
		<xsl:for-each select="$fields">
			<xsl:variable name="fieldName" select="@name"/>
			<xsl:variable name="fieldType" select="@type"/>
			<xsl:if test="$fieldType='boolean'">
				<xsl:value-of select="$fieldName"/>changed();
			</xsl:if>
		</xsl:for-each>
		<xsl:if test="/nis/concerto/xadmin/resource[@id='bodyLoad']">
			alert("<xsl:value-of select="/nis/concerto/xadmin/resource[@id='bodyLoadMsg']"/>");
			document.form1.<xsl:value-of select="/nis/concerto/xadmin/resource[@id='bodyLoad']"/>.focus();
		</xsl:if>
		<xsl:if test="/nis/concerto/xadmin/resource[@id='bodyLoadLogin']">
			document.form1.<xsl:value-of select="/nis/concerto/xadmin/resource[@id='bodyLoadLogin']"/>.focus();
		</xsl:if>
		}
	
	</xsl:template>
	<xsl:template name="genericfunctions">
		<script language="javascript">

			
		
			function mandatory(object) {
				if(object.value != null &amp;&amp; object.value != "") return true;
				return false;
			}

			function unique(object){
				if(notInNames(object.value))	return true;
				return false;
			}
			
			function notInNames(name){
				for(var x=0;x&lt;names.length;x++){
					if(names[x] == name){
						return false;
					}
				}
				names.push(name);
				return true;				
			}
			
			function popupUrl(url) {
				window.open(url);
			}

	  </script>
	</xsl:template>

	<!--Drop in a button-->
	<xsl:template name="insertButton">
		<xsl:param name="link"/>
		<xsl:param name="onclick"/>
		<xsl:element name="input">
			<xsl:attribute name="type">button</xsl:attribute>
			<xsl:attribute name="name"><xsl:value-of select="$link/name"/></xsl:attribute>
			<xsl:attribute name="value"><xsl:value-of select="$link/prompt"/></xsl:attribute>
			<xsl:if test="$onclick">
				<xsl:attribute name="onClick"><xsl:value-of select="$onclick"/></xsl:attribute>
			</xsl:if>
		</xsl:element>
	</xsl:template>
	
	<!--Drop in an Href-->
	<xsl:template name="insertHref">
		<xsl:param name="link"/>
		<xsl:element name="a">
			<xsl:attribute name="href"><xsl:value-of select="$link/url"/></xsl:attribute>
			<xsl:attribute name="title"><xsl:value-of select="$link/tooltip"/></xsl:attribute>
			<xsl:if test="$link/target='new'">
				<xsl:attribute name="target">_new</xsl:attribute>
			</xsl:if>
			<xsl:value-of select="$link/prompt"/>
		</xsl:element>
	</xsl:template>
	
	<!--Errors-->
	<xsl:template name="insertErrors">
		<xsl:param name="errors"/>
		<xsl:for-each select="$errors">
			<xsl:value-of select="display"/>
			<xsl:if test="position() &lt; last()">
				<br/>
			</xsl:if>
		</xsl:for-each>
	</xsl:template>
	<xsl:template name="insertPrompt">
		<xsl:param name="field"/>
		<xsl:element name="a">
			<xsl:attribute name="title"><xsl:value-of select="$field/tooltip"/></xsl:attribute>
			<xsl:value-of select="$field/@prompt"/>
		</xsl:element>
	</xsl:template>
	<xsl:template name="generateFieldPrompt">
		<xsl:param name="prompt"/>
		<xsl:choose>
			<xsl:when test=" string-length($prompt) = 0">The selected field</xsl:when>
			<xsl:otherwise>'<xsl:value-of select="$prompt"/>'</xsl:otherwise>
		</xsl:choose>
	</xsl:template>	
	
</xsl:stylesheet>