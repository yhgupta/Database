package com.database_example.database.Connection;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;

public class HTTP {

    public static String getData(String word) throws IOException {
        HTTP http = new HTTP();
        return http.getRequest(word);
    }

    private HTTP() {
    }


    private String buildURL(String word) throws IOException {
        String s = Mapping.getInstance(word);
        return "https://finnhub.io/api/v1/quote?symbol=" + s + ".NS&token=brceju7rh5rap841k3vg";
    }

    private String getRequest(String word) throws IOException {
        String link = buildURL(word);
        try {
            URL url = new URL(link);
            HttpsURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
            urlConnection.setRequestProperty("Accept", "application/json");
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            return stringBuilder.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return e.toString();
        }
    }
}
