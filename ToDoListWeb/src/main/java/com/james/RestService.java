package com.james;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class RestService 
{
	private static HttpURLConnection mConnection = null;
	
	public static void openConnection(String url)
	{
		try {
			URL mUrl = new URL(url);
			mConnection = (HttpURLConnection) mUrl.openConnection();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static HttpURLConnection returnConnection()
	{
		return mConnection;
	}
	
	public static void setConnectionRequestMethod(String type)
	{
		try {
			mConnection.setRequestMethod(type);
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void setConnectionRequestProperty(String prop, String value)
	{
		mConnection.setRequestProperty(prop, value);
	}
	
	public static void readPage() throws IOException
	{
		BufferedReader mReader = new BufferedReader(new InputStreamReader(mConnection.getInputStream()));
		
		String mLine;
		
		while((mLine = mReader.readLine()) != null)
		{
			System.out.println("Line from webpage: " + mLine);
		}
	}

}
