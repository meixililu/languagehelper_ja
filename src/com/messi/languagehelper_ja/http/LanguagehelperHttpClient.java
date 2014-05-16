package com.messi.languagehelper_ja.http;

import com.messi.languagehelper_ja.util.Settings;

public class LanguagehelperHttpClient {

	private static AsyncHttpClient client = new AsyncHttpClient();

	public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
		client.get(url, params, responseHandler);
	}

	public static void post(RequestParams params, AsyncHttpResponseHandler responseHandler) {
		client.post(Settings.baiduUrl, params, responseHandler);
	}
	
	public static void get_google_translate(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
		client.get(url, params, responseHandler);
	}

}
