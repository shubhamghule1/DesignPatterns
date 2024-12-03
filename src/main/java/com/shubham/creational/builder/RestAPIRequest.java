package com.shubham.creational.builder;

import java.util.HashMap;
import java.util.Map;

public class RestAPIRequest {
    private String url;
    private String method;
    private String body;
    private Map<String, String> headers;
    private Map<String, String> queryParameters;

    public RestAPIRequest(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.body = builder.body;
        this.headers = builder.headers;
        this.queryParameters = builder.queryParameters;
    }

    @Override
    public String toString()
    {
        return "RestAPIRequest [" +
                "method=" + method + ", " +
                "url=" + url + ", " +
                "body=" + body + ", " +
                "headers=" + headers + ", " +
                "queryParameters=" + queryParameters + "]";
    }

    public static class Builder {
        private String url;
        private String method;
        private String body;
        private Map<String, String> headers = new HashMap<>();
        private Map<String, String> queryParameters = new HashMap<>();

        public Builder url(String url) {
            this.url = url;
            return this;
        }
        public Builder method(String method) {
            this.method = method;
            return this;
        }
        public Builder body(String body) {
            this.body = body;
            return this;
        }
        public Builder addHeader(String name, String value) {
            headers.put(name, value);
            return this;
        }

        public Builder addQueryParameter(String name, String value) {
            queryParameters.put(name, value);
            return this;
        }

        public RestAPIRequest build() {
            return new RestAPIRequest(this);
        }
    }
}
