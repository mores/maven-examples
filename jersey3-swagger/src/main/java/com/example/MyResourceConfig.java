package com.example;

import jakarta.ws.rs.ext.Provider;

@Provider
public class MyResourceConfig extends org.glassfish.jersey.server.ResourceConfig {
    public MyResourceConfig() {
        packages(true, "com.example");
    }
}
