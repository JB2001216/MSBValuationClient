package com.phenix.xactware;

import java.io.*;
// SHA-1
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
// make URL connection to 360 servers
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class Xactware {

	// private method needed for sha encryption
	private static String convertToHex(byte[] data) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < data.length; i++) {
        	int halfbyte = (data[i] >>> 4) & 0x0F;
        	int two_halfs = 0;
        	do {
	            if ((0 <= halfbyte) && (halfbyte <= 9))
	                buf.append((char) ('0' + halfbyte));
	            else
	            	buf.append((char) ('a' + (halfbyte - 10)));
	            halfbyte = data[i] & 0x0F;
        	} while(two_halfs++ < 1);
        }
        return buf.toString();
    }
 
    public static String convertHexToShaOne(String text) throws NoSuchAlgorithmException, UnsupportedEncodingException  {
		MessageDigest md;
		md = MessageDigest.getInstance("SHA-1");
		byte[] sha1hash = new byte[40];
		md.update(text.getBytes("iso-8859-1"), 0, text.length());
		sha1hash = md.digest();
		return convertToHex(sha1hash);
    }

	public String getNewValId(String URL_DOMAIN, String sHash, String sDate, String GROUP_ID) {
		
		// method based on this sample: http://digiassn.blogspot.com/2008/10/java-simple-httpurlconnection-example.html
		
		// this is the return string
		String sResponse = "";
		
		HttpURLConnection connection = null;
		BufferedReader rd  = null;
		StringBuilder sb = null;
		String line = null;
		URL serverAddress = null;
		
		// start building the url to which we will send the request
		String sRequestUrl = URL_DOMAIN + "/apps/iv/HndTransfer?";
		sRequestUrl += "ticket_hash=" + sHash + "&ticket_date=" + sDate + "&ticket_groupid=" + GROUP_ID + "&ticket_userid=" +  GROUP_ID + "&val_valuationid=";
		
		try {
			serverAddress = new URL(sRequestUrl);
			//set up out communications stuff
			connection = null;
			
			//Set up the initial connection
			connection = (HttpURLConnection)serverAddress.openConnection();
			connection.setRequestMethod("GET");
			connection.setDoOutput(true);
			connection.setReadTimeout(10000);
			connection.connect();
			
			//read the result from the server
			rd  = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			sb = new StringBuilder();
			
			while ((line = rd.readLine()) != null) {
				sb.append(line + '\n');
			}
			
			sResponse = sb.toString();
			
	
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			//close the connection, set all objects to null
			connection.disconnect();
			rd = null;
			sb = null;
			connection = null;
			//return the response string
			return sResponse;
		}
		
	}
	
	public static int requestPdfReport (String sUrlDomain, String sHash, String sDate, String sValId, String sGroupId) {
		
		HttpURLConnection connection = null;
		URL serverAddress = null;
		DataInputStream dis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		// return code identifies success/failure, defaults to zero which represents success
		int iStatus = 0;
		
		File pdf = new File("/tomcat/webapps/phenix/planetpress/output/360-valuations/" + sValId + ".pdf");
		
		//String sRequestUrl = "https://test.xactvalue.com/apps/iv/HndTransfer?ticket_hash=ba6d67d14e1fe8bf72a8f7b9030404d38b34176f&ticket_date=2009-02-27T20:08:42&ticket_groupid=5435888&ticket_userid=5435888&report_format=PDF&report_detailed=TRUE&val_valuationid=AA2AG85";
		
		// string object representing the url request made to the 360 server
		String sRequestUrl = sUrlDomain + "/apps/iv/HndTransfer?ticket_hash=" + sHash + "&ticket_date=" + sDate + "&ticket_groupid=" + sGroupId + "&ticket_userid=" + sGroupId + "&report_format=PDF&report_detailed=TRUE&val_valuationid=" + sValId;
		
		try {
			serverAddress = new URL(sRequestUrl);
			//set up out communications stuff
			connection = null;
			
			//Set up the initial connection
			connection = (HttpURLConnection)serverAddress.openConnection();
			connection.setRequestMethod("GET");
			connection.setDoOutput(true);
			connection.setReadTimeout(10000);
			connection.connect();
			
			bis = new BufferedInputStream(new DataInputStream(connection.getInputStream()));
			fos = new FileOutputStream(pdf);
			
			int data;
			while ((data = bis.read()) != -1) {
				fos.write(data);
			}
		}
		catch (MalformedURLException e) {
			
		}
		catch (FileNotFoundException e) {
			
		} 
		catch (ProtocolException e) {
			
		} 
		catch (IOException e) {
			
		}
		finally {
			//close the connection, set all objects to null
			connection.disconnect();
			connection = null;
			serverAddress = null;
			dis = null;
			fos = null;
			bis = null;
			bos = null;
			pdf = null;
			sRequestUrl = null;
			
		}
		
		
		return iStatus;
	}
	

	public String requestXmlReport (String sUrlDomain, String sHash, String sDate, String sValId, String sGroupId) {
	
		HttpURLConnection connection = null;
		BufferedReader rd  = null;
		StringBuilder sb = null;
		String line = null;
		String sResponse = null;
		
		URL serverAddress = null;
		InputStream  is = null;
		
		String sRequestUrl = sUrlDomain + "/apps/iv/HndTransfer?";
		sRequestUrl += "ticket_hash=" + sHash + "&ticket_date=" + sDate + "&ticket_groupid=" + sGroupId + "&ticket_userid=" +  sGroupId + "&report_format=XML&report_detailed=TRUE&val_valuationid=" + sValId;
		
		try {
			serverAddress = new URL(sRequestUrl);
			//set up out communications stuff
			connection = null;
			
			//Set up the initial connection
			connection = (HttpURLConnection)serverAddress.openConnection();
			connection.setRequestMethod("GET");
			connection.setDoOutput(true);
			connection.setReadTimeout(10000);
			connection.connect();			
			
			//read the result from the server
			rd  = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			sb = new StringBuilder();
			
			while ((line = rd.readLine()) != null) {
				sb.append(line + '\n');
			}
			
			sResponse = sb.toString();
	
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			//close the connection, set all objects to null
			connection.disconnect();
			rd = null;
			sb = null;
			//wr = null;
			connection = null;
		
		}
		
		return sResponse;
	}

}
