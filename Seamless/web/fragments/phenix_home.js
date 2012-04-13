function phenix_home() {

	// Page Layout
	this.initHTML = initHTML;
	this.buildHomeMenu = buildHomeMenu;
	this.openHead = openHead;
	this.openBody = openBody;
	this.buildTopImg = buildTopImg;
	this.buildPageFooter = buildPageFooter;

	// Session methods & properties
	createSession();
	this.session = request.jsession;
	this.sessionKeyLifetime = (project.sessionKeyLifetime != null) ? parseInt(project.sessionKeyLifetime) : 120;
	this.session.setMaxInactiveInterval(this.sessionKeyLifetime * 60);
	this.sessionKeyName = request.jsession.id;
	this.keyExpired = request.jsession.isNew;
	this.set = set;
	this.get = get;
	this.href = href;
	this.writeSessionVars = writeSessionVars;

  this.session.setAttribute("sClientName", "test");

	// Error handling & debugging
	this.appendToErrLog = appendToErrLog;
	this.logTaskError = logTaskError;
	this.handleTaskError = handleTaskError;
	this.logDebugMsg = logDebugMsg;
	this.writeFile = writeFile;
	this.writeFileNo = writeFileNo;
	this.sendMail = sendMail;
	this.taskErrorMessage = taskErrorMessage;
	this.logUser = logUser;

	// Common Functions
	this.loadStates = loadStates;
	this.returnStates = returnStates;
	this.loadPHXStates = loadPHXStates;
	this.loadStates2 = loadStates2;
	this.convertState = convertState;
	this.reqField = reqField;
	this.convertIllegalXMLChars = convertIllegalXMLChars;
	this.toString = toString;
	this.trim = trim;
	this.formatZip = formatZip;
	this.formatDate = formatDate;
	this.replaceChar = replaceChar;
	this.replaceSubstring = replaceSubstring;
	this.write360Trigger = write360Trigger;

	// server name and context path generated dynamically from the url
	//this.sServerPath = request.serverName;
	var sTempServerName = request.serverName;
	this.sServerPath = sTempServerName.substring(0,sTempServerName.indexOf(':'));
	this.sContextPath = request.contextPath;

	// Task methods
	this.tRunTask = tRunTask;
	this.tOutputParams = tOutputParams;
	this.tRunTaskNoOut = tRunTaskNoOut;

	//Page Building methods
	this.writeHdnVar = writeHdnVar;
	this.writeTextField = writeTextField;
	this.returnTextField = returnTextField;

	// deprecated methods
	this.writeGreyBoxRoot = writeGreyBoxRoot;
	this.buildHeader = buildHeader;
	this.buildEndHeader = buildEndHeader;
	this.buildMenu = buildMenu;
	this.buildFooter = buildFooter;
	this.buildEndFooter = buildEndFooter;
	this.buildTabs = buildTabs;
	this.newQuoteForm = newQuoteForm;
	this.callErrorPage = callErrorPage;
	this.getErrorScript = getErrorScript;
	this.debugMsg = debugMsg;
	this.displayDate = displayDate;
	this.taskError = taskError;
	//this.userLogFile = userLogFile;
}

//==============================================================================
//Page Building Functions
//==============================================================================

/**
 * This method is run at the beginning of almost every page.
 * It verifies that the user is logged in and has a currently active session within Concerto and Oracle.
 * If so, it will begin writing out the html page we send to the client
 * If not, the user will be redirected to the login page with the appropriate message displayed
 *
 * @input: bChildWin[boolean] - page requesting script is a child page/frame rather than the main app window
 */

function initHTML(pageName, docType, bChildWin) {
	// default input parameter
	if (!bChildWin) { var bChildWin = false; }
	var sHTML = "";
	var sUser_Id = toString(get("sUser_Id"));
	this.sPageName = pageName;

	// don't verify active session on the login or change password page
	if (this.sPageName != "login" && this.sPageName != "change_password" && this.sPageName != "logoff") {
		if (sUser_Id == '') {	// The session has expired
			// certain windows need to be closed instead of redirected to login page
			if (bChildWindow || this.sPageName == "endorsement" || this.sPageName == "quote_summary" || this.sPageName == "policy_summary" || this.sPageName == "loss_list_print" || this.sPageName == "billing_print")
				redirect("http://" + this.sServerPath + this.sContextPath + "/close.xsp");
			// else redirect to login
			else
				redirect("http://" + this.sServerPath + this.sContextPath + "/logoff.xsp?iErr=1");
		}
		// else call java method to block multiple simultaneous logins by the same user
		else {
			var iBit = 1;
			var sErrMsg = '';
			var sSession_Id = toString( this.session.id );
			var iUser_Id = sUser_Id * 1;

			// isValidSession - Invokes the Oracle validsession function
			var oLogin = new com.phenix.qHO.Login();
			var iBit = oLogin.isValidSession( iUser_Id, sSession_Id );

			if (oLogin.eMsg) {			// Execption thrown from _Valid_Session - redirect to login
				sErrMsg = new String( oLogin.getErrorMsg() );
				redirect("http://" + this.sServerPath + this.sContextPath + "/logoff.xsp?iErr=" + sErrMsg);
			}
			else if ( iBit == 0 ) {		// This session has been overridden - redirect to the login
				redirect("http://" + this.sServerPath + this.sContextPath + "/logoff.xsp?iErr=2");
			}
		}
	}

	// set some properties of the http response object
	response['Cache-control'] = "no-cache";		// prevent caching

	sHTML =	'<?xml version="1.0"?>\n'

	// Define Doctype
	if (docType == "strict") {
		sHTML += '<!DOCTYPE html PUBLIC '
			+ '"-//W3C//DTD XHTML 1.0 Strict//EN" '
			+ '"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">\n';
	}
	else {
		sHTML += '<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" '
			+ '"http://www.w3.org/TR/html4/loose.dtd">\n';
	}

	// Define html tag
	sHTML += '<html xmlns="http://www.w3.org/1999/xhtml">\n';

	// Prevent caching & '?'s.
	sHTML += '<meta http-equiv="Cache-Control" content="no-cache" />\n'
		+ '<meta http-equiv="Pragma" content="no-cache" />\n'
		+ '<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />\n';

	write(sHTML);
}

// top navigation menu for search, admin, tools and memos pages
function buildHomeMenu() {
	var sHTML = '';

	sHTML = '<div id="topNav">'
		+ '<ul id="menuNavList">\n'
		+ '<span class="leftLinks"><li><a href="' + href(this.sContextPath + "/home.xsp") + '">Home</a></li>\n'
		+ '<li><a href="' + href(this.sContextPath + "/tools/index.xsp") + '">Tools</a></li>\n';
		//+ '<li><a href="#">Tools</a></li>\n';

	// Only certain users have access to the administration area
	var oRoles = get("oRoles");
	if (oRoles['user_admin'] == 1 || 1==1) { sHTML += '<li><a href="' + href(this.sContextPath + "/adminnew/") + '">New Admin</a></li>'; }
	if (oRoles['user_admin'] == 1) { sHTML += '<li><a href="' + href(this.sContextPath + "/admin/admin.xsp") + '">Admin</a></li>'; }

	sHTML += '<li><a href="' + href(this.sContextPath + "/memos/memos.xsp") + '">Memos</a></li></span>\n'
		+ '<li><a class="right" href="'+ href(this.sContextPath + "/logoff.xsp") +'?bLog_Off=Y">Logoff</a></li>\n'
		+ '<li><a class="right" href="#" onclick="' + popHelp() + '">Help</a></li>\n'
		+ '</ul>'
		+ '</div><!-- end topNav -->\n';

	return sHTML;
}

function openHead(sPageTitle, bNeedCalJs, bGreyBox) {
	//open the head and setup the style sheet and common js files we use on every page
	var sHTML = '';
	sHTML += '<head>\n'
		+ '<title>Phenix Mutual VIO: ' + sPageTitle + '</title>\n'
		+ '<script type="text/javascript" src="' + this.sContextPath + '/scripts/utilities.js"></script>\n'

		// load a browser specific utilities file
		+ '<script type="text/javascript" src="' + this.sContextPath + '/scripts/utilities' + this.get("sBrowser") + '.js"></script>\n'
		// utilities js file that applies to all browsers
		+ '<link rel="stylesheet" type="text/css" href="' + this.sContextPath + '/css/phenix_maine.css" />\n'

		// conditional comment will apply ie7 specific style sheet to ie7 users
		+ '<!--[if IE 7]>\n'
		+ '<link rel="stylesheet" type="text/css" href="' + this.sContextPath + '/css/phenix_maine_ie7.css" />\n'
		+ '<![endif]-->\n'

		// conditional comment will apply ie6 specific style sheet to ie6 users
		+ '<!--[if IE 6]>\n'
		+ '<link rel="stylesheet" type="text/css" href="' + this.sContextPath + '/css/phenix_maine_ie6.css" />\n'
		+ '<![endif]-->\n'

		+ '<script type="text/javascript" src="' + this.sContextPath + '/scripts/validator.js" DEFER></script>\n';

	//add the next lines if the page needs the calendar
	if (bNeedCalJs) {
		sHTML += '<!-- required files for calendar popup widget -->\n'
			+ '<link rel="stylesheet" type="text/css" href="' + this.sContextPath + '/jscalendar/calendar-win2k-1.css" />\n'
			+ '<script type="text/javascript" src="' + this.sContextPath + '/jscalendar/calendar.js"></script>\n'
			+ '<script type="text/javascript" src="' + this.sContextPath + '/jscalendar/lang/calendar-en.js"></script>\n'
			+ '<script type="text/javascript" src="' + this.sContextPath + '/jscalendar/calendar-setup.js"></script>\n'
			+ '<!-- end calendar files -->\n\n';
	}

	//write out the html to the page then flush the sHTML variable
	writeln(sHTML);

	// need to include this block for pages that require greybox
	if (bGreyBox) {
		write('<!-- required files for greybox -->\n');
		writeln('<script type="text/javascript">');
		writeln('var GB_ROOT_DIR = "http://' + this.sServerPath + this.sContextPath + '/greybox/";');
		writeln('</scr'+'ipt>');

		writeln('<script type="text/javascript" src="' + this.sContextPath + '/greybox/AJS.js"></scr'+'ipt>');
		writeln('<script type="text/javascript" src="' + this.sContextPath + '/greybox/AJS_fx.js"></scr'+'ipt>');
		writeln('<script type="text/javascript" src="' + this.sContextPath + '/greybox/gb_scripts.js"></scr'+'ipt>');
		writeln('<link href="' + this.sContextPath + '/greybox/gb_styles.css" rel="stylesheet" type="text/css" />');
		writeln('<!-- end greybox files -->');
	}
	sHTML = null;
}


function openBody(bEnd) {
	writeln('</head>');
	writeln('<body>\n');
	if (bEnd)
		writeln('<div id="containerEnd">\n');
	else
		writeln('<div id="container">\n');
	writeln('<div id="phenixLogo">\n');
	
	if (!bEnd)
		writeln('<span id="logoDate">' + dateText() + '</span>\n');
	writeln('<img src="' + this.sContextPath + '/images/logo_header_white.gif" />\n');
	writeln('</div><!-- end of phenixLogo -->\n');
}

function buildTopImg( sSection ) {
	if (!sSection) { sSection = "HOME"; }
	var sHeaderImg = this.sContextPath + "/images/" + sSection.toLowerCase() + ".jpg";
	// replacing background image with an image element
	writeln('<div id="topImage" style="background-image:url(\'' + sHeaderImg + '\');">');
	//writeln('&nbsp;');
	//writeln('<div id="topImage"><img src="' + sHeaderImg + '" height="125px" width="100%" />');
	writeln('</div>\n');
}

function buildPageFooter() {
	var dDate = new Date();
	var sYear = dDate.getYear();

	writeln( '<div id="footerBlock">\n');
	writeln( '<img src="' + this.sContextPath + '/images/stretchbar-bottom.jpg" width="100%" height="20"/><br/>\n');
	writeln( '<!-- <img src="' + this.sContextPath + '/images/bottom-shade2.gif" /> -->\n');
	writeln( '&copy;' + sYear + ' <a href="http://www.phenixmutual.com" target="_blank">Phenix Mutual Fire Insurance Co.</a> |\n');
	writeln( '<a href="http://' + this.sServerPath + this.sContextPath + '/common/privacystatement.html" target="_blank">Privacy Statement</a> |\n');
	writeln( '<a href="mailto:agentsupport@cedarspringstec.com" target="_blank">Feedback</a>\n');
	writeln( '</div>	<!-- end of footerBlock -->\n');
	writeln( '</div>  <!-- end of container -->\n');
}
//==============================================================================
//Session Functions
//==============================================================================
/**
* Use this function to store an object in the session object.
* @param name: the name of the object to add to the session.
* @param value: the value of the object to add to the session.
* @return undefined
**/
function set( name, value ){ this.session.setAttribute(name,value); }

/**
* The get function is used to retrieve an object from a session object.
* @param name The name of the object to retrieve from the session.
* @return object The object stored in the session.
**/
function get( name ){ return this.session.getAttribute(name); }

/**
* This function creates an href with session key
* included in the URL.  This function should be used for all hrefs in the
* pages to support non cookie sessions.  This will mean that the session key
* will always be returned to the server.
* @param href This is the href URL
**/
function href( href ) {
  var newHref;
  var pos = href.indexOf("?");

  if ( pos == -1) {
    newHref = href + ';jsessionid=' + this.sessionKeyName;
  }
  else {
    newHref = href.slice(0,pos) + ';jsessionid=' + this.sessionKeyName + href.slice(pos);
  }

  return newHref;
}

/**
* Return a string containing all session vars that exist and their values - strictly for debugging
**/
function writeSessionVars() {
	var currentSessVars = request.jsession.getAttributeNames();
	var thelen = currentSessVars.length;
	var hSessVars = '';
	for (var x = 0; x < thelen; x++) {
		hSessVars += '<p>' + currentSessVars[x] + '=' + get(currentSessVars[x]) + '</p>';
	}
	return hSessVars;
}

//==============================================================================
//Debugging & Error Handling Functions
//==============================================================================
/**
* display an 'alert' debug message on the client.
* @param name - a description of the variable.
* @value - the value to be displayed.
*/
function debugMsg( name, value ) { writeln('<script type="text/javascript">alert( "Debug: ' + name + ' = ' + value + '" );</script>'); }

/**
* @param-sErrMsg : the error string that shall be appended to the file
*/
function appendToErrLog(sErrMsg) { return (writeFile("/logs/errors.log", sErrMsg, "a")); }

/**
 * @param sErrMsg [string] : the error string that shall be appended to the file
 * @return : true if the string was written to the file successfully, or an error string if the write failed
*/
function logTaskError(sErrMsg) {
	sendMail("Task error encountered", sErrMsg);
	return (writeFile("/logs/task_errors.log", sErrMsg, "a"));
}

/** error handling for task errors
 * @input taskobject [object] = the object created from the original task
 * @input aParmNames [array] - an array of the parameter names supplied as inputs for the task
 * @input aParmVals [array] - an array of parameter values supplied as inputs for the original task
 *
 */
function handleTaskError(oTaskObject, aParmNames, aParmVals, sPolId, sLogText, bFatal) {
	var sTaskName = oTaskObject.taskName;
	var sTaskError = oTaskObject.error;
	var sPage = this.sPageName;

	// build date string to use for the log file name
	var d = new Date();
	var t = d.getYear() + '_' + (d.getMonth() + 1) + '_' + d.getDate();

	// build the text that will be written to the log file
	var s = taskErrorMessage(sPage, sTaskName, sTaskError, sPolId) + "Details: " + sLogText + ";\n\n";

	// write out the original task input parameters to the log file
	s += "Original Task Parameters: \n";
	for (x = 0; x < aParmNames.length; x++) {
		s += aParmNames[x] + '=' + aParmVals[x] + '\n';
	}

	// dump contents of user session into the log file
	s += "Current session variables: \n";
	var sessAtts = this.session.getAttributeNames();
	var thelen = sessAtts.length;
	for (var x = 0; x < thelen; x++) {
		s += sessAtts[x] + '=' + this.get(sessAtts[x]) + '\n';
	}

	// mark the end of this record block
	s += '*****************************';

	writeFile("/logs/task_errors/" + t + ".log", s);	// write an entry to the log file
	sendMail("Task error", s);	// send an email alert to agentsupport

	if (bFatal) { redirect(href(this.sContextPath + "/taskerror.xsp?p=" + sPage)); }	// if the task error was fatal, redirect the user to the task error page

}

function logTaskErr(page,task,error,text) {
	return (writeFile("/logs/task_errors.log", taskErrorMessage(page, task, error) + ";Details: " + text));
}

/**
 * @param - sMsg : the string that shall be added to the log file
 */
function logDebugMsg(sMsg) { return (writeFile("/logs/debug.log", "Page:" + this.sPageName + "\n" + sMsg + "\n", "a")); }

/**
* Generic method for writing files to the server file system
* @param filePathName: full path and file name under the project root directory
* @param logText: text string to write to the body of the object file
* @param mode: "a" = append, "w" = overwrite
* @param encoding: object file encoding type
* @return: true if the file is written successfully or an error string if not
*/
function writeFile(filePathName, logText, mode, encoding) {
	if (!mode) { var mode = "a"; }			// default mode is append
	if (!encoding) { var encoding = "UTF-8"; }	// default character encoding
	var oFile = new FileWriter(filePathName, mode, encoding);	//create the file object
	return (oFile.writeln('* * * * *\n' + new Date() + '\n' + logText));		// attempt to write the file, returns true if successful or sets the error property if false
}

// same as previous but no time stamp included
function writeFileNo(filePathName, logText, mode, encoding) {
	if (!mode) { var mode = "a"; }			// default mode is append
	if (!encoding) { var encoding = "UTF-8"; }	// default character encoding
	var oFile = new FileWriter(filePathName, mode, encoding);	//create the file object
	return (oFile.writeln(logText));		// attempt to write the file, returns true if successful or sets the error property if false
}
/**
* This method will send an email to agentsupport with the subject and body as input parameters
* @param - mailSubject : string value that will appear in the subject line of the email message
* @param - mailMessage : text string that will comprise the body of the email message
* @return : true if mail sent successfully or an error string if not
*/
function sendMail(mailSubject, mailMessage) {
	var mailMsg = new Email();	//create the mail object

	mailMsg.server = servlet.context.params.smtpServer;		//set some properties for the mail object
	mailMsg.from = 'system@cedarspringstec.com';
	mailMsg.to = 'agentsupport@cedarspringstec.com';
	mailMsg.subject = mailSubject + ": " + this.sServerPath;
	mailMsg.message = mailMessage;

	return (mailMsg.send());	//attempt to send the message, returning the appropriate value
}


/**
 * This method returns the string we use to send email and write log files for task errors
 */
function taskErrorMessage(sPage, sTaskName, sError, sPolicyId) {
	var sErrorText = "Page: " + sPage + ";\nTask: " + sTaskName + ";\nError: " + sError + ";\n";
	if (sPolicyId) { sErrorText += "QuotePolicyId: " + sPolicyId + ";\n"; }
	return sErrorText;
}

function logUser(s) { writeFile("/logs/logUser.log", s); }

//==============================================================================
// Common Utility Functions
//==============================================================================

function loadStates( defVal ) {
	var sHTML = ( toString( defVal ) == '' )? '<option value="">Select</option>': '';
	//State options
	var strStateAbbr = "AL,AK,AZ,AR,CA,CO,CT,DE,DC,FL,GA,HI,ID,IL,IN,IA,KS,KY,LA,ME,MD,MA,MI,MN,MS,MO,MT,NB,NH,NJ,NM,NY,NV,NC,ND,"
		+ "OH,OK,OR,PA,PR,RI,SC,SD,TN,TX,UT,VT,VA,WA,WV,WI,WY";
	var strStates = "ALABAMA,ALASKA,ARIZONA,ARKANSAS,CALIFORNIA,COLORADO,CONNECTICUT,DELAWARE,DIST. OF COLUMBIA,FLORIDA,GEORGIA,HAWAII,IDAHO,ILLINOIS,"
		+ "INDIANA,IOWA,KANSAS,KENTUCKY,LOUISIANA,MAINE,MARYLAND,MASSACHUSETTS,MICHIGAN,MINNESOTA,MISSISSIPPI,MISSOURI,MONTANA,"
		+ "NEBRASKA,NEW HAMPSHIRE,NEW JERSEY,NEW MEXICO,NEW YORK,NEVADA,NORTH CAROLINA,NORTH DAKOTA,OHIO,OKLAHOMA,OREGON,"
		+ "PENNSYLVANIA,PUERTO RICO,RHODE ISLAND,SOUTH CAROLINA,SOUTH DAKOTA,TENNESSEE,TEXAS,UTAH,VERMONT,VIRGINIA,WASHINGTON,"
		+ "WEST VIRGINIA,WISCONSIN,WYOMING";
	var arrStatesAbbr = strStateAbbr.split( ',' );
	var arrStates = strStates.split( ',' );

	for ( var i=0; arrStates[ i ] != null; i++ ) {
		sHTML += '<option value="'+arrStatesAbbr[ i ]+'" ';
		sHTML += ( defVal == arrStatesAbbr[ i ] )? "selected": "";
		sHTML += '>'+arrStates[ i ]+'</option>\n';
	}

	write( sHTML );
}

function returnStates (defVal) {
	var sStateList = (toString(defVal) == '' ) ? '<option value="">Select</option>' : '';
	//State options
	var strStateAbbr = "AL,AK,AZ,AR,CA,CO,CT,DE,DC,FL,GA,HI,ID,IL,IN,IA,KS,KY,LA,ME,MD,MA,MI,MN,MS,MO,MT,NB,NH,NJ,NM,NY,NV,NC,ND,"
		+ "OH,OK,OR,PA,PR,RI,SC,SD,TN,TX,UT,VT,VA,WA,WV,WI,WY";

	var strStates = "ALABAMA,ALASKA,ARIZONA,ARKANSAS,CALIFORNIA,COLORADO,CONNECTICUT,DELAWARE,DIST. OF COLUMBIA,FLORIDA,GEORGIA,HAWAII,IDAHO,ILLINOIS,"
		+ "INDIANA,IOWA,KANSAS,KENTUCKY,LOUISIANA,MAINE,MARYLAND,MASSACHUSETTS,MICHIGAN,MINNESOTA,MISSISSIPPI,MISSOURI,MONTANA,"
		+ "NEBRASKA,NEW HAMPSHIRE,NEW JERSEY,NEW MEXICO,NEW YORK,NEVADA,NORTH CAROLINA,NORTH DAKOTA,OHIO,OKLAHOMA,OREGON,"
		+ "PENNSYLVANIA,PUERTO RICO,RHODE ISLAND,SOUTH CAROLINA,SOUTH DAKOTA,TENNESSEE,TEXAS,UTAH,VERMONT,VIRGINIA,WASHINGTON,"
		+ "WEST VIRGINIA,WISCONSIN,WYOMING";

	var arrStatesAbbr = strStateAbbr.split( ',' );
	var arrStates = strStates.split( ',' );

	for ( var i=0; arrStates[ i ] != null; i++ ) {
		sStateList += '<option value="'+arrStatesAbbr[ i ]+'" ';
		sStateList += ( defVal == arrStatesAbbr[ i ] )? "selected": "";
		sStateList += '>'+arrStates[ i ]+'</option>\n';
	}

	return sStateList;
}

//Load Phenix's states of business only
function loadPHXStates( defVal ) {
	var sHTML = ( toString( defVal ) == '' )? '<option value="">Select</option>': '';
	//State options
	var strStateAbbr = "ME,MA,NH,RI,SC,VT";
	var strStates = "MAINE,MASSACHUSETTS,NEW HAMPSHIRE,RHODE ISLAND,SOUTH CAROLINA,VERMONT";
	var arrStatesAbbr = strStateAbbr.split( ',' );
	var arrStates = strStates.split( ',' );

	for ( var i=0; arrStates[ i ] != null; i++ ) {
		sHTML += '<option value="'+arrStatesAbbr[ i ]+'" ';
		sHTML += ( defVal == arrStatesAbbr[ i ] )? "selected": "";
		sHTML += '>'+arrStates[ i ]+'</option>\n';
	}

	write( sHTML );
}

function loadStates2( name, defVal, attributes ) {
	writeln( '<select id="'+name+'" name="'+name+'" '+attributes+'>' );
	writeln( loadStates( defVal ) );
	writeln( '</select>' );
}

//the function takes a state abbreviation and returns the corresponding state name
function convertState(stateAbbrev) {

	var theState = '';		//empty var
	var i = 0;			//counter for loop

	//State options
	var strStateAbbr = "AL,AK,AZ,AR,CA,CO,CT,DE,DC,FL,GA,HI,ID,IL,IN,IA,KS,KY,LA,ME,MD,MA,MI,MN,MS,MO,MT,NB,NH,NJ,NM,NY,NV,NC,ND,"
		+ "OH,OK,OR,PA,PR,RI,SC,SD,TN,TX,UT,VT,VA,WA,WV,WI,WY";
	var strStates = "ALABAMA,ALASKA,ARIZONA,ARKANSAS,CALIFORNIA,COLORADO,CONNECTICUT,DELAWARE,DIST. OF COLUMBIA,FLORIDA,GEORGIA,HAWAII,IDAHO,ILLINOIS,"
		+ "INDIANA,IOWA,KANSAS,KENTUCKY,LOUISIANA,MAINE,MARYLAND,MASSACHUSETTS,MICHIGAN,MINNESOTA,MISSISSIPPI,MISSOURI,MONTANA,"
		+ "NEBRASKA,NEW HAMPSHIRE,NEW JERSEY,NEW MEXICO,NEW YORK,NEVADA,NORTH CAROLINA,NORTH DAKOTA,OHIO,OKLAHOMA,OREGON,"
		+ "PENNSYLVANIA,PUERTO RICO,RHODE ISLAND,SOUTH CAROLINA,SOUTH DAKOTA,TENNESSEE,TEXAS,UTAH,VERMONT,VIRGINIA,WASHINGTON,"
		+ "WEST VIRGINIA,WISCONSIN,WYOMING";

	//convert strings to arrays
	var arrStatesAbbr = strStateAbbr.split( ',' );
	var arrStates = strStates.split( ',' );

	//loop through arrays to find a match for the abbreviation
	while (theState == '') {
		theState = (stateAbbrev == arrStatesAbbr[i])? arrStates[i]: '';
		i++;
	}
	//return the state name
	return theState;
}

//this function provides a standard way to indicate required fields.
function reqField(sHtml) { return (sHtml + '<span class="redText">*</span>&nbsp;'); }

//This function gets rid of all illegal xml data chars
function convertIllegalXMLChars(inString) {
	if ( toString( inString ) != "") {
		var tmpSearch, tmpReplace = '';
		var aSearch = new Array( '&', '<', '>', '"', "'" );
		var aReplace = new Array( "&amp;", "&lt;", "&gt;", "&quot;", "&apos;" );

		for ( var i=0 ; i < aSearch.length; i++ ) {
			tmpSearch = aSearch[ i ];
			tmpReplace = aReplace[ i ];
			inString = replaceSubstring( inString, tmpSearch, tmpReplace );
		}
	}
	return inString;
}

function toString( str ) { return ( str == null )? '': trim(str); }

//Trim leading and trailing whitespace from string
function trim( str ) {
	var strTmp = new String( str );

	if ( strTmp.length > 0 ) {
		// this will get rid of leading spaces
		while ( strTmp.substring( 0, 1 ) == ' ' )
			strTmp = String( strTmp.substring( 1, strTmp.length ) );

		// this will get rid of trailing spaces
		while (strTmp.substring(strTmp.length-1,strTmp.length) == ' ')
			strTmp = String( strTmp.substring( 0, strTmp.length-1 ) );
	}

	return strTmp;
}

/**
*  formatDate (date_object, format)
*  Returns a zip with '-' seperator if there are > than 5 chars
*/
function formatZip( zip ) {
	zip = trim( zip );
	zip = ( zip.length > 5 )? zip.substring( 0, 5 ) + '-' + zip.substring( 5 ): zip;

	return zip;
}

/**
*  formatDate (date_object, format)
*  Returns a date in the output format specified.
*/
function formatDate( date, format ) {
	var result = '';
	var i_format = 0;
	var c = '';
	var token = '';
	var y = date.getYear() + '';
	var M = date.getMonth() + 1;
	var d = date.getDate();
	var H = date.getHours();
	var m = date.getMinutes();
	var s = date.getSeconds();
	var yyyy,yy,MMM,MM,dd,hh,h,mm,ss,ampm,HH,H,KK,K,kk,k;
	var month_names = new Array( "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" );
	// Convert real date parts into formatted versions
	var value = new Object();

	format += '';

	if ( y.length < 4 ) { y = '' + ( y - 0 + 1900 ); }

	value[ "y" ] = '' + y;
	value[ "yyyy" ]=y;
	value[ "yy" ] = y.substring( 2,4 );

	value[ "M" ] = M;
	value[ "MM" ] = leadingZero( M );
	value[ "MMM" ] = month_names[ M - 1 ];

	value[ "d" ] = d;
	value[ "dd" ] = leadingZero( d );

	value[ "H" ] = H;
	value[ "HH" ] = leadingZero( H );
	value[ "h" ] = ( H == 0 ) ? 12 :
			 ( H > 12 ) ? H-12 : H;
	value[ "hh" ] = leadingZero( value[ "h" ] );
	value[ "K" ] = ( H > 11 )? H - 12: H;
	value[ "k" ] = H + 1;
	value[ "KK" ] = leadingZero( value[ "K" ] );
	value[ "kk" ] = leadingZero( value[ "k" ] );
	value[ "a" ] = ( H > 11 )? "PM": "AM";

	value[ "m" ] = m;
	value[ "mm" ] = leadingZero( m );

	value[ "s" ] = s;
	value[ "ss" ] = leadingZero( s );

	while ( i_format < format.length ) {
		c = format.charAt( i_format );
		token="";
		while ( ( format.charAt( i_format ) ==c ) && ( i_format < format.length ) ) {
			token += format.charAt( i_format++ );
		}
		result += ( value[ token ] != null )? value[ token ]: token;
	}

	return result;
}

/**
*  Replaces all occurrences of a char in a string with another
*/
function replaceChar( inString, toReplace, replaceVal ) {
	inString = toString( inString );

	if ( inString != "" ) {
		var tmpString = inString;
		var tmpSearch = toReplace;
		var tmpReplace = replaceVal;

		tmpIndex = inString.indexOf( tmpSearch );
		while ( tmpIndex > -1 ) {
			inString = inString.substring( 0,tmpIndex ) + tmpReplace + inString.substring( tmpIndex+1 );
			tmpIndex = inString.indexOf( tmpSearch,tmpIndex+2 );
		}
	}

	return inString;
}

/*
*  Goes through the inputString and replaces every occurrence of searchString with replaceString
*/
function replaceSubstring( inputString, searchString, replaceString ) {
  var temp = inputString;

  if ( toString( searchString ) == "" ) {
    return inputString;
  }

  // If the string being replaced is not a part of the replacement string (normal situation)
  if ( replaceString.indexOf( searchString ) == -1 ) {
    while ( temp.indexOf( searchString ) != -1 ) {
      var toTheLeft = temp.substring( 0, temp.indexOf( searchString ) );
      var toTheRight = temp.substring( temp.indexOf( searchString ) + searchString.length, temp.length );
      temp = toTheLeft + replaceString + toTheRight;
    }
  }
  else {  // String being replaced is part of replacement string (like "+" being replaced with "++") - prevent an infinite loop
    var midStrings = new Array( "~", "`", "_", "^", "#" );
    var midStringLen = 1;
    var midString = "";

    // Find a string that doesn't exist in the inputString to be used
    // as an "inbetween" string
    while ( midString == "" ) {
      for ( var i=0; i < midStrings.length; i++ ) {
        var tempMidString = "";

        for ( var j=0; j < midStringLen; j++) { tempMidString += midStrings[ i ]; }

		if ( searchString.indexOf( tempMidString ) == -1 ) {
          midString = tempMidString;
          i = midStrings.length + 1;
        }
      }
    } // Keep on going until we build an "inbetween" string that doesn't exist

	// Now go through and do two replaces - first, replace the "searchString" with the "inbetween" string
    while (temp.indexOf(searchString) != -1) {
      var toTheLeft = temp.substring(0, temp.indexOf(searchString));
      var toTheRight = temp.substring(temp.indexOf(searchString) + searchString.length, temp.length);

      temp = toTheLeft + midString + toTheRight;
    }

    // Next, replace the "inbetween" string with the "replaceString"
    while (temp.indexOf(midString) != -1) {
      var toTheLeft = temp.substring(0, temp.indexOf(midString));
      var toTheRight = temp.substring(temp.indexOf(midString)+midString.length, temp.length);

      temp = toTheLeft + replaceString + toTheRight;
    }
  } // Ends the check to see if the string being replaced is part of the replacement string or not

  return temp;
}

/**
 * Method writes a record to the trigger file that imports 360 pdfs to Image Right
 */
function write360Trigger(msg) {
	var oFile = new FileWriter("/xactware/queue.txt", 'a', 'UTF-8');
	return (oFile.writeln(msg));
}


//=============================================
// Task functions
//=============================================
function tRunTask(sTaskName, aParmIds, aParmVals, bPipeDelim) {
	//context params
	var oParams = servlet.context.params;
	//create the task object and assign it some properties
	var oTask = new Task(sTaskName, oParams.hostName, oParams.codiv, oParams.operatorId, oParams.password, oParams.systemUserName, oParams.systemUserPassword, oParams.systemEnvironment, oParams.systemPort);

	for (var i=0; i<aParmIds.length; i++) {
		oTask.parameters[aParmIds[i]] = aParmVals[i];
	}
	//define some additional properties for the task object
	oTask.disableOutput = true;
	oTask.collectReports = true;
	oTask.delimiterSplit = true;
	if (bPipeDelim) // If not pipe, use default ',' delimiter - 44
		oTask.delimiter = 124; // Delimit with '|'

	// execute the task
	oTask.execute();

	//return the task object
	return oTask;

}

/**use tRunTaskNoOut if there will be no reports returned
* @param - sTaskName : the name of the task to be run
* @param - aParmIds : an array containing the input parameter names for the task
* @param - aParmVals : an array containing the input parameter values for the task
*/
function tRunTaskNoOut(sTaskName, aParmIds, aParmVals) {
	//context params
	var oParams = servlet.context.params;

	//create the task object and assign it some properties
	var oTask = new Task(sTaskName, oParams.hostName, oParams.codiv, oParams.operatorId, oParams.password, oParams.systemUserName, oParams.systemUserPassword, oParams.systemEnvironment, oParams.systemPort);

	//parse the parm ids and values
	for (var i=0; i<aParmIds.length; i++) {
		oTask.parameters[aParmIds[i]] = aParmVals[i];
	}

	// execute the task
	oTask.execute();

	//return the task object
	return oTask;
}

//use this function for debugging tasks, pass in a task object and the function will write a list of the task params with values
function tOutputParams(oTask) {
	var tskParams = "<ul>";
	for(i in oTask.parameters) {
	  tskParams += "<li>" + i + "=" + oTask.parameters[i] + "</li>";
	}
	tskParams += "</ul>"
	writeln(tskParams);
}


//========================================================
// Page Building Functions
//========================================================
function writeHdnVar(idName, value) {
	writeln('<input type="hidden" id="' + idName + '" name="' + idName + '" value="' + value + '" />');
}
function writeTextField(sNameId, sVal, sSize, sLength, bReadOnly, sJscript) {
	write (returnTextField(sNameId, sVal, sSize, sLength, bReadOnly, sJscript));
}
function returnTextField(sNameId, sVal, sSize, sLength, bReadOnly, sJscript) {
	var s = '<input type="text" name="' + sNameId + '" id="' + sNameId + '" value="' + sVal + '" ' + sJscript + ' maxlength="' + sLength + '" size="' + sSize + '"';
	if (bReadOnly) { s += ' readonly'; }
	s += ' />';
	return s;
}



//==============================================================================
// Help Page Functions
//==============================================================================
function getHelpPageName( path ) {
	// This function strips off .xsp and adds .html
	intFound = path.indexOf(".");
	if (intFound == -1)
		return "general.html";
	else {
		var pageName = path.substring(0, intFound);
		return pageName.toLowerCase() + '.html';
	}
}



//=====================
// Private methods
// ====================

// Pad single digit numbers with a leading zero
function leadingZero( x ) { return ( ( x < 0 || x > 9 )? "" : "0" ) + x; }

// format the date to use at the top of the page next to the Phenix logo
function dateText() {

	var d = new Date();
	var weekday = new Array("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
	var monthname = new Array("January","February","March","April","May","June","July","August","September","October","November","December");
	var sDateText = "";

	sDateText = weekday[d.getDay()] + ' ' + monthname[d.getMonth()] +' ' + d.getDate() +  ', ' + d.getFullYear();

	return sDateText;
}

function logDepMeth(sMethName) {
	this.writeFile('/logs/deprecated_methods.log','Method = ' + sMethName + '; Page called from = ' + this.sPageName);
}

// ====================================================================================================================
// Deprecated methods
// ====================================================================================================================
// method writes out the script element necessary to run Grey Box
function writeGreyBoxRoot() {
	writeln('<script type="text/javascript">');
	writeln('var GB_ROOT_DIR = "http://' + this.sServerPath + this.sContextPath + '/greybox/";');
	writeln('</scr'+'ipt>');
	logDepMeth('writeGreyBoxRoot');
}
function userLogFile(pageName, sUserId) {
	writeFile("/logs/session.log", "pageName = " + pageName + ", sUser_Id = " + sUserId, "", "");
	logDepMeth('userLogFile');
}
function buildHeader( bMenu, bFlash, sSection ) {
	writeFile("/logs/deprecated_methods.log", this.pageName + "/fragments/phenix_home.js: buildHeader()");
	var sHTML = '';
	var sHeaderImg = this.sContextPath + "/images/";

	//select the correct image to show
	sHeaderImg += (sSection == "HOME")? "home.jpg"
		: (sSection == "TOOLS")? "tools.jpg"
		: (sSection == "ADMIN")? "admin.jpg"
		: (sSection == "MEMOS")? "memos.jpg"
		: (sSection == "ERROR")? "error.jpg": '';

	sHTML = '<table cellpadding="0" cellspacing="0" border="0" width="100%" height="100%"><tr><td valign="top">\n';

	var logoLR = "left";  // logo alignment
	var logoX1	= "12";	 // logo1 x position
	var logoY1	= "3";	// logo1 y position
	var logoX2	= "10";	 // logo2 x position
	var logoY2	= "-20";  // logo2 y position

	sHTML += '<table cellpadding="0" cellspacing="0" border="0" width="100%" bgcolor="#' + color + '">\n'
	+ '  <tr><td align="left" height="50" nowrap>&nbsp;</td></tr>\n'
	+ '</table>\n'
	+ '<div id="logo-location1" style="' + logoLR + ': ' + logoX1 + 'px; position: absolute; top: ' + logoY1 + 'px;"><img id="imgHeader" src="' + this.sContextPath + '/images/logo_header_white.gif"></div>\n';

	sHTML += displayDate("left");
	sHTML += '<img src="' + this.sContextPath + '/images/stretchbar.jpg" width="100%" height="10"/><br/>\n';

	sHTML += '<table cellpadding="0" cellspacing="0" border="0" width="100%" background="'+ sHeaderImg + '">\n'
	+ '	<tr><td>\n'
	+ '	  <img src="' + this.sContextPath + '/images/spacer.gif" border="0" width="100%" height="125"><br/>\n'
	+ '	</td></tr>\n'
	+ '</table>\n';

	sHTML += bMenu ? buildMenu() : '';

	writeln(sHTML);
	logDepMeth('buildHeader');
}

/**
* Function will build the top part of the endorsement detail screens
*/
function buildEndHeader(title) {
	writeFile("/logs/deprecated_methods.log", this.pageName + "/fragments/phenix_home.js: buildEndHeader()");
	var sHTML = "";
	var logoLR = "left"	// logo alignment
	var logoX1	= "10"	// logo1 x position
	var logoY1	= "3"	// logo1 y position
	var logoX2	= "15"	// logo2 x position
	var logoY2	= "-20"	// logo2 y position

	sHTML += '<table cellpadding="0" cellspacing="0" border="0" width="100%" bgcolor="#'+color+'">\n'
		+ '  <tr><td align="left" height="50">&nbsp;</td></tr>\n'
		+ '</table>\n'
		+ '<div id="logo-location1" style="' + logoLR + ': ' + logoX1 + 'px; position: absolute; top: ' + logoY1 + 'px;"><img id="imgHeader" src="' + this.sContextPath + '/images/logo_header_white.gif"></div>\n';

	sHTML += displayDate("right");

	sHTML += '<table width="100%" class="endorsementHeader"><tr><td align="left">'
		+ '  <input type="button" value="Close" name="btnClose"  class="buttonA" accesskey="C" title="Close Page without Saving" onmouseover="this.className=\'buttonA buttonAhover\'" onmouseout="this.className=\'buttonA\'" onclick="closeEnd();" />'
		+ '<td align="center">' + title + '</td>'
		+ '<td align="right">'
		+ '  <input type="button" value="Close" name="btnClose"  class="buttonA" accesskey="C" title="Close Page without Saving" onmouseover="this.className=\'buttonA buttonAhover\'" onmouseout="this.className=\'buttonA\'" onclick="closeEnd();" />'
		+ '</td></tr></table>'//</div>';
		+ '<img src="' + this.sContextPath + '/images/spacer.gif" height="10" width="1" border="0"/><br/>\n';

	writeln(sHTML);
	logDepMeth('buildEndHeader');
}

function buildMenu() {
	logDepMeth('buildMenu');
	var sHTML = '';

	sHTML = '<img src="' + this.sContextPath + '/images/stretchbar.jpg" width="100%" height="10"/><br/>\n'
		+ '<ul id="menuNavList">\n'
		+ '<li><a href="' + href(this.sContextPath + "/home.xsp") + '">Home</a></li>\n'
		+ '<li><a href="javascript:window.refresh();">Tools</a></li>\n'
		+ '<li><a href="';

	// If user is an Admin, open link
	sHTML += (this.get("sUser_Admin")*1 == 1)? href(this.sContextPath + "/admin/admin.xsp"): '#';

	sHTML += '">Administration</a></li>\n'
		+ '<li><a href="' + href(this.sContextPath + "/memos/memos.xsp") + '">Memos</a></li>\n'
		+ '<li><a class="right" href="'+ href(this.sContextPath + "/logoff.xsp") +'?bLog_Off=Y">Logoff</a></li>\n'
		+ '<li><a class="right" href="javascript: void 0;" onclick="' + popHelp() + '">Help</a></li>\n'
		+ '</ul>\n'
		+ '<img src="' + this.sContextPath + '/images/spacer.gif" height="20" width="225" border="0"/><br/>\n';

	return sHTML;
}

function buildFooter() {
	logDepMeth('buildFooter');
	var sHTML = "";
	var dDate = new Date();
	var sYear = dDate.getYear();

	sHTML = '</td></tr><tr><td valign="bottom">\n'
		+ '<img src="' + this.sContextPath + '/images/stretchbar-bottom.jpg" width="100%" height="20"/><br/>\n'
		+ '<table cellpadding="0" cellspacing="0" border="0" width="100%" background="' + this.sContextPath + '/images/bottom-shade.gif">\n'
		+ '<tr><td align="center" class="copyright"><br/>\n'
		+ '  &copy;2006 - ' + sYear
		+ '  <a href="http://www.phenixmutual.com" target="_blank">Phenix Mutual Fire Insurance Co.</a> |\n'
		+ '  <a href="' + this.sContextPath + '/common/privacystatement.html" target="_blank">Privacy & Security</a> |\n'
		+ '  <a href="mailto:agentsupport@cedarspringstec.com" target="_blank">Feedback</a>\n'
		+ '</td></tr></table>'
		+ '<img src="' + this.sContextPath + '/images/spacer.gif" height="10" width="10" border="0"/><br/>\n'
		+ '</td></tr></table>\n';

	write(sHTML);
}

function buildEndFooter() {
	logDepMeth('buildEndFooter');
  var sHTML = "";
  var dDate = new Date();
  var sYear = dDate.getYear();

  sHTML = '<img src="../images/stretchbar-bottom.jpg" width="100%" height="20"/><br/>\n'
		+ '<table cellpadding="0" cellspacing="0" border="0" width="100%" background="../images/bottom-shade.gif">\n'
		+ '<tr><td align="center" class="copyright"><br/>\n'
		+ '  &copy;2006 - ' + sYear
		+ '  <a href="http://www.phenixmutual.com" target="_blank">Phenix Mutual Fire Insurance Co.</a> |\n'
		+ '  <a href="../common/privacystatement.html" target="_blank">Privacy & Security</a> |\n'
		+ '  <a href="mailto:agentsupport@cedarspringstec.com" target="_blank">Feedback</a>\n'
		+ '</td></tr></table>'
		+ '<img src="../images/spacer.gif" height="10" width="10" border="0"/><br/>\n';

  writeln(sHTML);
}

function buildTabs() {

  var sHTML = '';

	// Build the welcome banner
	sHTML = '<div align="center" style="font-family: arial, verdana, helvetica, sans;font-size:14;font-weight:bold;color:#996600;">'
		+ 'Welcome <span style="color:#004000;font-style:italic;">' + this.get("sUser") + ' - ' + this.get("sAgency_Id")
		+ '</span>, to the Phenix Mutual Virtual Insurance Office!</div>\n';

	sHTML += '<div id="tabWrapper" style="clear:both;">\n'
		+ '<ul id="navlist">\n';

	if (this.sPageName == "home") {
		sHTML += '<li><a href="' + href("home.xsp") + '" id="current">Search</a></li>\n'
			+ '<li class="disabled">Results</li>\n'
			+ '<li class="disabled">Info</li>\n';
	}
	else if (this.sPageName == "client_info") {
		sHTML += '<li><a href="' + href("home.xsp") + '">Search</a></li>\n'
			+ '<li><a href="javascript:window.history.back();">Results</a></li>\n'
			+ '<li><a href="' + href("client_info.xsp") + '" id="current">Info</a></li>\n';
	}
	else {  // Policy_list or client_list
	sHTML += '<li><a href="' + href("home.xsp") + '">Search</a></li>\n'
		+ '<li><a href="' + href(this.sPageName+'.xsp') + '" id="current">Results</a></li>\n'
		+ '<li class="disabled">Info</li>\n';
	}

	sHTML += '</ul>\n'
		+ '</div>\n';

	write(sHTML);
	logDepMeth('buildTabs');
}

/**
* newQuoteForm writes out the block of code to let the user begin a new quote from home, client_info, client_list, policy_list, etc.
*/
function newQuoteForm() {
	write('<fieldset>\n');
	write('  <legend class="containerTitle">Get a New Quote</legend>\n');
	write('	 <table border="0" width="100%">\n');
	write('	 	 <tr>\n');
	write('		   <td align="center">\n');
	write('        <span class="quoteTitle" style="font-style:italic;">Please select the type of quote you wish to rate:</span><br>\n');
	write('				 <select size="1" id="cboQuote_type" name="cboQuote_type" title="Quote Type">\n');
	write('					 <option value="">Select One</option>\n');
	write('					 <option value="H">Homeowner</option>\n');
	write('					 <option value="D">Dwelling/Fire</option>\n');
	write('				 </select>\n');
	write('			 </td>\n');
	write('		 </tr>\n');
	write('		 <tr>\n');
	write('		   <td align="center">\n');
	write('				 <span class="quoteTitle" style="font-style:italic;">Please enter the client\'s zip code:</span><br>\n');
	write('				 <input type="text" id="txtZip_1" name="txtZip_1"  maxlength="5" size="5" title="Zip Code" onkeyup="javascript:NumRange2(this,0);autoTab(this.form,this,\'txtZip_2\',event);" value="" />\n');
	write('				 <input type="text" id="txtZip_2" name="txtZip_2" size="4" maxlength="4" onkeyup="NumRange(this,0);" value="" />\n');
	write('				 <span style="color:#F00;font-weight:bold;">*</span>\n');
	write('			 </td>\n');
	write('		 </tr>\n');
	write('		 <tr>\n');
	write('			 <td align="center">\n');
	write('				 <span class="quoteTitle" style="font-style:italic;">Please enter the quote effective date:</span><br>\n');
	write('				 <input type="text" id="txtIncept" name="txtIncept" maxlength="10" size="12" onchange="javascript:dTmpVal=fixDate(this,true);if(!dTmpVal){bDateChanged=false;}else{this.value=dTmpVal;bDateChanged=true;}" />\n');
	write('				 <span style="color:#F00;font-weight:bold;">*</span>\n');
	write('				 <img src="' + this.sContextPath + '/jscalendar/calendar_1.gif" id="imgIncept_Date" name="imgIncept_Date" style="cursor:pointer;" title="Pick a Date" />');
	write('			 </td>\n');
	write('		 </tr>\n');
	write('		 <tr>\n');
	write('			 <td align="right">\n');
	write('				 <input type="button" value="Go!" name="btnGo" class="btn" alt="GO" title="Get a Quote" onmouseover="this.className=\'btn btnhov\'" onmouseout="this.className=\'btn\'" onclick="javascript: isValid(this.form, \'QUOTE\');" />');
	write('			 </td>\n');
	write('		 </tr>\n');
	write('	 </table>\n');
	write('</fieldset>\n');
	logDepMeth('newQuoteForm');
}

function callErrorPage( msg, stype ) {
	logDepMeth('callErrorPage');
  // The callErrorPage function is for calling the error page from the server.
  redirect('common/error.xsp?page=' + this.pageName + '&msg=' + msg + '&Type=' + stype);
}

function getErrorScript( msg ){
	logDepMeth('getErrorScript');
  // The getErrorScript function is for calling the error page from the client.
  return "<script" + " type='text/javascript'>\n"
		 + 'sURLVis = "common/error.xsp?page=' + this.pageName + '&msg=' + msg + '&Type=0";\n'
		 + "</" + "script>";
}



function displayDate(sAlign) {
	logDepMeth('displayDate');
	var sDateHTML = "";
	var dateLR = '';	// date alignment
	var dateX	= 0; // x position
	var dateY	= 0; // y position
	var d = new Date();
	var weekday = new Array("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
	var monthname = new Array("January","February","March","April","May","June","July","August","September","October","November","December");
	var sDateText = "";

	if ( sAlign == "left" ) {
	dateLR = "left";
	dateX	= "8";
	dateY	= "68";
	}
	else { // Right alignment
	dateLR = "right";
	dateX	= "20";
	dateY	= "20";
	}

	sDateText = weekday[d.getDay()] + ' ' + d.getDate() + '. ' + monthname[d.getMonth()] + ' ' + d.getFullYear();
	sDateHTML = '<div class="date-font" id="date-location" style="position: absolute;'+dateLR+':'+dateX+'px;top:'+dateY+'px;">' + sDateText + '</div>\n';

	/*
	var d = new Date();
	var weekday = new Array("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
	var monthname = new Array("January","February","March","April","May","June","July","August","September","October","November","December");

	sDateHTML += '<div id="date-location" style="'+dateLR+': '+dateX+'px; position: absolute; top: '+dateY+'px;">\n'
	+ '  <span class="date-font" style="color:#ffffff;"><nobr>'
	+ weekday[d.getDay()] + ' ' + d.getDate() + '. ' + monthname[d.getMonth()] + ' ' + d.getFullYear()
	+ '  </nobr><br></span>\n'
	+ '</div>\n';
	*/

	return sDateHTML;
}

function popHelp() {
	logDepMeth('popHelp');
  return 'window.open(\'' + this.sContextPath + '/help/'+ this.sPageName +'.html\', \'help\', \'height=450, width=850, scrollbars, resizable\');';
}
