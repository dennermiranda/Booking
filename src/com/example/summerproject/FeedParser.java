package com.example.summerproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

public class FeedParser {
	
	public void parseJSON(Resultado toPopulate, int id) throws IOException, JSONException
	{
		// Create JSON and Finance objects
		JSONObject jObject;

		System.out.println("teste1");
		// Generate URL
		URL feedUrl = new URL("http://" + "172.19.192.23:8080" + "/BookingServerV2/webresources/activity/" + id);
		// Read JSON
		InputStream is = feedUrl.openStream();
		BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1)
		{
			sb.append((char) cp);
		}
		String jsonText = sb.toString();
		
		jsonText = jsonText.substring(5, jsonText.length() - 2);
		is.close();
		// Init object
		jObject = new JSONObject(jsonText);
		// Set 'Last' value
		 toPopulate.setNome(jObject.getString("name"));
		//Log.v("LOGCATZ", "Estou aqui populando" );
		// Set 'Company' name
		toPopulate.setBeg(jObject.getString("type"));
		}
}
