package com.westernunion.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.sling.commons.json.JSONObject;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpUtil {

	private HttpUtil() {

	}

	/** The logger constant. */
	final private static Logger LOG = LoggerFactory.getLogger(HttpUtil.class);

	public static void main(String args[]) {
		String abc = "{\"cruiseCustomer\":\"{\"state\":\"US\",\"country\":null,\"promoCodeUseCount\":0,\"providerId\":\"Brightwell\",\"empId\":\"200057655\",\"shipId\":null,\"customerId\":0,\"fname\":null,\"lname\":null,\"addr1\":null,\"addr2\":null,\"city\":null,\"zip\":null,\"email\":null,\"phone\":null,\"cardbin\":null,\"street1\":null,\"street2\":null,\"clientId\":\"441850\"}\"}";
		abc.replace("\\", "");
		System.out.println("abc.................." + abc);
	}

	/**
	 * Makes a POST call to POST_URL.
	 * 
	 * @param parameters
	 *            Map of parsed data.
	 * @param url
	 *            POST call endpoint.
	 * @return POST response
	 * @throws IOException
	 *             ioException
	 */
	/*
	 * public static String sendPost(final Map<String, String> parameters,
	 * String url) throws IOException {
	 */
	/*public static String sendPost(final Map<String, String> map, String url) {*/
	public static String sendPost(final JSONObject jSONObject, String url) {

		// if (url == null || parameters.size() <= 0) {
		// return "";
		// }
		if (url == null || jSONObject == null) {
			return "";
		}
		// System.out.println("Making POST call to " + url);
		// System.out.println("Parameters to be send in a POST call: " +
		// parameters);
		// if (LOG.isDebugEnabled()) {
		// LOG.debug("Making POST call to " + url);
		// LOG.debug("Parameters to be send in a POST call: " + parameters);
		// }
		final List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		final HttpClient httpClient = new DefaultHttpClient();
		final HttpPost post = new HttpPost(url);
		final StringBuffer result = new StringBuffer();
		System.out.println("params..............1");
		
		
		try {
			/*******************************************************************************/
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(
					DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES,
					false);
			System.out.println("params..............2");

			// String JsonObjectString =
			// mapper.writeValueAsString(cruiseCustomer);			
			
			// JsonString.replace("\\", "");
			System.out.println("params..............3" + jSONObject);
			System.out.println("params..............3.1"
					+ jSONObject.toString());
			StringEntity params = new StringEntity(jSONObject.toString());
			System.out.println("params..............4");
			post.addHeader("Content-Type", "application/json");
			/*******************************************************************************/
			System.out.println("params.............." + params);

			/*
			 * for (final String keys : parameters.keySet()) {
			 * urlParameters.add(new BasicNameValuePair(keys,
			 * parameters.get(keys))); }
			 */
			post.setEntity(params);

			final HttpResponse response = httpClient.execute(post);

			System.out.println("Response for POST call: StatusCode: "
					+ response.getStatusLine().getStatusCode());
			System.out.println("Response for POST call: ReasonPhrase: "
					+ response.getStatusLine().getReasonPhrase());
			System.out.println("Response for POST call: Entity-> Content: "
					+ response.getEntity().getContent());
			if (LOG.isDebugEnabled()) {
				LOG.debug("Response for POST call: StatusCode: "
						+ response.getStatusLine().getStatusCode());
				LOG.debug("Response for POST call: ReasonPhrase: "
						+ response.getStatusLine().getReasonPhrase());
				LOG.debug("Response for POST call: Entity-> Content: "
						+ response.getEntity().getContent());
			}
			final BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(response.getEntity().getContent()));

			System.out.println("bufferedReader : " + bufferedReader);

			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println("Im here: line: " + line);
				result.append(line);
			}
			System.out.println("result: " + result);
			// httpClient.getConnectionManager().shutdown();
			if (LOG.isDebugEnabled()) {
				LOG.debug("POST call returns JSON: " + result.toString());
			}
			System.out.println("POST call returns JSON: " + result.toString());
		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
		return result.toString();
	}
}
