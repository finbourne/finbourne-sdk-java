package com.finbourne.sdk.extensions;

import com.finbourne.sdk.ApiClient;
import com.finbourne.sdk.core.auth.FinbourneTokenException;
import com.finbourne.sdk.core.config.ApiConfiguration;
import com.finbourne.sdk.core.config.ApiConfigurationBuilder;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.core.config.ConfigurationOptions;
import com.finbourne.sdk.core.http.HttpClient;
import java.util.HashMap;
import java.util.Map;

public class ApiFactoryBuilder {

    private String configurationFile;
    private String profileName;
    private Map<String, String> config;
    private Map<String, String> headers = new HashMap<>();
    private ConfigurationOptions configurationOptions;
    private HttpClient httpClient;

    public ApiFactoryBuilder withConfigurationFile(String secretsFile) {
        this.configurationFile = secretsFile;
        return this;
    }

    public ApiFactoryBuilder withConfigurationOptions(ConfigurationOptions configurationOptions) {
        this.configurationOptions = configurationOptions;
        return this;
    }

    public ApiFactoryBuilder withProfileName(String profileName) {
        this.profileName = profileName;
        return this;
    }

    public ApiFactoryBuilder withEnvVarConfig(Map<String, String> config) {
        this.config = config;
        return this;
    }

    public ApiFactoryBuilder withHeaders(Map<String, String> defaultHeaders) {
        if (defaultHeaders == null || defaultHeaders.isEmpty()) {
            return this;
        }
        this.headers.putAll(defaultHeaders);
        return this;
    }

    public ApiFactoryBuilder withHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    public ApiFactory build() throws ApiConfigurationException, FinbourneTokenException {
        ApiConfiguration apiConfiguration = new ApiConfigurationBuilder()
                .build(configurationFile, configurationOptions, profileName, config);
        ApiClientBuilder builder = new ApiClientBuilder()
                .withUserDefinedHeaders(this.headers.isEmpty() ? null : new HashMap<>(this.headers))
                .withApiConfiguration(apiConfiguration);
        if (httpClient != null) {
            builder = builder.withHttpClient(httpClient);
        }
        ApiClient apiClient = builder.build();
        return new ApiFactory(apiClient);
    }
}
