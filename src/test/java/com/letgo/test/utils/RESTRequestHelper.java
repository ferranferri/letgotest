package com.letgo.test.utils;

import org.junit.Assert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

/**
 * Helper to make REST calls
 */
public class RESTRequestHelper {


    private final String BASE_URL;

    public RESTRequestHelper(final String baseURL) {
        BASE_URL = baseURL;
    }

    protected String makeRequestURIAndProcess(String responseType, String command){
        try {
            URI uri = new URI(
                    "http",
                    BASE_URL,
                    "/service/" + responseType,
                    command,
                    null
            );
            String request = uri.toASCIIString();
            URL url = new URL(request);
            return makeRequestURLAndProcess(url);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Malformed URL");
        } catch (URISyntaxException e) {
            throw new RuntimeException("URI Syntax problem");
        }

    }

    /**
     * Opens a connection, and process the response from URLDecoder
     * @param url The Url to call
     * @return The response as String
     */
    private String makeRequestURLAndProcess(URL url){

        try {
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            Assert.assertEquals(200, connection.getResponseCode());

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (connection.getInputStream())));

            String response = br.readLine();
            connection.disconnect();

            return URLDecoder.decode(response, "UTF-8");
        } catch (IOException ioe) {
            throw new RuntimeException("Something went really bad!");
        }

    }
}
