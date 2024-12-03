package com.shubham.creational.builder;

public class BuilderTest {
    public static void main(String[] args) {
        RestAPIRequest newRequest = new RestAPIRequest.Builder()
                .method("GET")
                .url("www.shubham.com")
                .body("Hello")
                .addHeader("Accept", "application/json")
                .addQueryParameter("name", "Omkar")
                .addQueryParameter("age", "27")
                .build();
        System.out.println(newRequest);
    }
}
