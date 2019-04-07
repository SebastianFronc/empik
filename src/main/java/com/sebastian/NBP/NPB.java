package com.sebastian.NBP;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class NPB {
    private final static String BASE_REQUEST_URL = "http://api.nbp.pl/api/exchangerates/tables/A";

    private final HttpClient httpClient;

    public NPB() {
        httpClient = HttpClients.createDefault();
    }

    public String getResponse(){
        HttpGet httpGet = new HttpGet(BASE_REQUEST_URL);
        try {
            HttpResponse response = httpClient.execute(httpGet);
            InputStream contentResponse = response.getEntity().getContent();
            Scanner s = new Scanner(contentResponse).useDelimiter("\\A");
            return s.hasNext() ? s.next() : "";

        } catch (IOException e){
            e.printStackTrace();
        }
        throw new ParseException("buuu");
    }
}
