package com.thiagopaiva.xyzreader.remote;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;

    static {
        URL url = null;
        try {
            url = new URL("https://go.udacity.com/xyz-reader-json");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        BASE_URL = url;
    }
}
