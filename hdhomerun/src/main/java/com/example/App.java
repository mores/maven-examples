package com.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class App {
    private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(App.class);

    private String[] args;

    public static void main(String[] args) throws Exception {
        new App(args).run();
    }

    public App(String[] args) {
        this.args = args;
    }

    public void run() throws Exception {
        log.info("run");

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://hdhomerun.local/discover.json"))
                .header("Accept", "application/json").build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            String jsonResponse = response.body();

            Gson gson = new Gson();
            MyClass data = gson.fromJson(jsonResponse, MyClass.class);
            log.info("Auth: " + data.DeviceAuth);
        }

    }
}
