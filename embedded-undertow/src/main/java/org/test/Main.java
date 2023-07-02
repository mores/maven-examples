package org.test;

import io.undertow.Undertow;
import io.undertow.util.Headers;

public class Main {

    public static void main(String[] args) {
        Undertow server = Undertow.builder()
                // Set up the listener - you can change the port/host here
                // 0.0.0.0 means "listen on ALL available addresses"
                .addHttpListener(8080, "0.0.0.0")

                .setHandler(exchange -> {
                    // Sets the return Content-Type to text/html
                    exchange.getResponseHeaders()
                            .put(Headers.CONTENT_TYPE, "text/html");

                    // Returns a hard-coded HTML document
                    exchange.getResponseSender()
                            .send("<html>" +
                                    "<body>" +
                                    "<h1>Hello, world!</h1>" +
                                    "</body>" +
                                    "</html>");
                }).build();

        // Boot the web server
        server.start();
    }
}
