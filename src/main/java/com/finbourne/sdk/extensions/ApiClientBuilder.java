package com.finbourne.sdk.extensions;

import java.util.LinkedHashMap;
import java.util.Map;

import com.finbourne.sdk.ApiClient;
import com.finbourne.sdk.Configuration;
import com.finbourne.sdk.core.auth.FinbourneTokenException;
import com.finbourne.sdk.core.config.ApiConfiguration;
import com.finbourne.sdk.core.http.HttpClient;
import com.finbourne.sdk.core.transport.TransportFactory;

public class ApiClientBuilder {

    private Map<String, String> userDefinedHeaders;
    private ApiConfiguration apiConfiguration;
    private HttpClient httpClient;

    public ApiClientBuilder withUserDefinedHeaders(Map<String, String> userDefinedHeaders) {
        this.userDefinedHeaders = userDefinedHeaders;
        return this;
    }

    public ApiClientBuilder withApiConfiguration(ApiConfiguration apiConfiguration) {
        this.apiConfiguration = apiConfiguration;
        return this;
    }

    public ApiClientBuilder withHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    public ApiClient build() throws FinbourneTokenException {
        if (apiConfiguration == null) {
            throw new IllegalStateException("ApiConfiguration cannot be null when building an ApiClient");
        }

        Map<String, String> allHeaders = new LinkedHashMap<>();
        allHeaders.put("X-LUSID-Sdk-Language", "Java-V3");
        allHeaders.put("X-LUSID-Sdk-Version", Configuration.VERSION);
        if (userDefinedHeaders != null) {
            allHeaders.putAll(userDefinedHeaders);
        }

        HttpClient transport;
        if (httpClient != null) {
            transport = TransportFactory.create(httpClient, apiConfiguration, allHeaders);
        } else {
            transport = TransportFactory.create(apiConfiguration, allHeaders);
        }

        ApiClient defaultApiClient = new ApiClient(transport);
        defaultApiClient.setBasePath(apiConfiguration.getApiUrl());

        if (apiConfiguration.getApplicationName() != null) {
            defaultApiClient.addDefaultHeader("X-LUSID-Application", apiConfiguration.getApplicationName());
        }
        if (userDefinedHeaders != null) {
            userDefinedHeaders.forEach(defaultApiClient::addDefaultHeader);
        }

        return defaultApiClient;
    }
}
