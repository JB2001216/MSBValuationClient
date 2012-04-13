package org.msb.valuationservices;

import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.*;
import javax.xml.stream.XMLStreamException;
import java.net.MalformedURLException;
import java.net.ProtocolException;


/**
 * Created by IntelliJ IDEA.
 * User: amy
 * Date: Apr 12, 2012
 * Time: 3:55:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class FastTrackValuationServiceGateway {

    private String urlDomain;

    public FastTrackValuationServiceGateway(String url) throws org.apache.axis2.AxisFault, XMLStreamException {

         urlDomain = url;
    }

    public int requestPdfReport(String saveToPath, String valuationId, String userName, String password, String policyNumber) {

        HttpMethod method = null;
		DataInputStream dis;
		FileOutputStream fos ;
		BufferedInputStream bis ;
		// return code identifies success/failure, defaults to zero which represents success
		int iStatus = 0;

		File pdf = new File(saveToPath + valuationId + ".pdf");

		// string object representing the url request made to the MSB Fast Track server
		String sRequestUrl = urlDomain + "/AutoLogin.asp?P1=" + userName + "&seamlesspwd=" + password + "&PolicyNum=" + policyNumber + "&operation=view&ReportType=Standard&ReportFormat=PDF";

		try {

            HttpClient httpClient = new HttpClient();
            method = new GetMethod(sRequestUrl);

            // Per default HttpClient will automatically attempt to recover from the not-fatal errors, that is,
            // when a plain IOException is thrown. HttpClient will retry the method three times provided that
            // the request has never been fully transmitted to the target server. For a detailed discussion on
            // HTTP method recovery please refer to the HttpClient exception handling guide
            httpClient.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());

            httpClient.executeMethod(method);

            dis = new DataInputStream(method.getResponseBodyAsStream());
			bis = new BufferedInputStream(dis);
			fos = new FileOutputStream(pdf);

			int data;
			while ((data = bis.read()) != -1) {
				fos.write(data);
			}
		}
		catch (MalformedURLException e) {
			iStatus = 1;	// pathetic error handling, but better than nothing I guess...
		}
		catch (FileNotFoundException e) {
			iStatus = 2;
		}
		catch (ProtocolException e) {
			iStatus = 3;
		}
		catch (IOException e) {
			iStatus = 4;
		}
		finally {
            method.releaseConnection();
		}

		return iStatus;

    }
}
