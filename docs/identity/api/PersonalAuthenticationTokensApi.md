# PersonalAuthenticationTokensApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createApiKey**](PersonalAuthenticationTokensApi.md#createApiKey) | **POST** /identity/api/keys | CreateApiKey: Create a Personal Access Token |
| [**deleteApiKey**](PersonalAuthenticationTokensApi.md#deleteApiKey) | **DELETE** /identity/api/keys/{id} | DeleteApiKey: Invalidate a Personal Access Token |
| [**listOwnApiKeys**](PersonalAuthenticationTokensApi.md#listOwnApiKeys) | **GET** /identity/api/keys | ListOwnApiKeys: Gets the meta data for all of the user&#39;s existing Personal Access Tokens. |



## createApiKey

> CreatedApiKey createApiKey(createApiKey)

CreateApiKey: Create a Personal Access Token

Generates a Personal Access Token and returns the new key and its associated metadata.

### Example

```java
import com.finbourne.sdk.services.identity.model.*;
import com.finbourne.sdk.services.identity.api.PersonalAuthenticationTokensApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PersonalAuthenticationTokensApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        PersonalAuthenticationTokensApi apiInstance = apiFactory.build(PersonalAuthenticationTokensApi.class);
        CreateApiKey createApiKey = new CreateApiKey(); // CreateApiKey | The request to create a new Personal Access Token
        try {
            // uncomment the below to set overrides at the request level
            // CreatedApiKey result = apiInstance.createApiKey(createApiKey).execute(opts);

            CreatedApiKey result = apiInstance.createApiKey(createApiKey).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PersonalAuthenticationTokensApi#createApiKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```
### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createApiKey** | [**CreateApiKey**](CreateApiKey.md)| The request to create a new Personal Access Token | |

### Return type

[**CreatedApiKey**](CreatedApiKey.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Personal Access Token and associated meta data. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## deleteApiKey

> ApiKey deleteApiKey(id)

DeleteApiKey: Invalidate a Personal Access Token

Immediately invalidates the specified Personal Access Token

### Example

```java
import com.finbourne.sdk.services.identity.model.*;
import com.finbourne.sdk.services.identity.api.PersonalAuthenticationTokensApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PersonalAuthenticationTokensApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        PersonalAuthenticationTokensApi apiInstance = apiFactory.build(PersonalAuthenticationTokensApi.class);
        String id = "id_example"; // String | The id of the Personal Access Token to delete
        try {
            // uncomment the below to set overrides at the request level
            // ApiKey result = apiInstance.deleteApiKey(id).execute(opts);

            ApiKey result = apiInstance.deleteApiKey(id).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PersonalAuthenticationTokensApi#deleteApiKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```
### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The id of the Personal Access Token to delete | |

### Return type

[**ApiKey**](ApiKey.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invalidates a Personal Access Token |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## listOwnApiKeys

> List&lt;ApiKey&gt; listOwnApiKeys()

ListOwnApiKeys: Gets the meta data for all of the user&#39;s existing Personal Access Tokens.

Gets the meta data for all of the user&#39;s Personal Access Tokens that have not been deleted. They may be invalid due to the deactivation date having passed.

### Example

```java
import com.finbourne.sdk.services.identity.model.*;
import com.finbourne.sdk.services.identity.api.PersonalAuthenticationTokensApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PersonalAuthenticationTokensApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        PersonalAuthenticationTokensApi apiInstance = apiFactory.build(PersonalAuthenticationTokensApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // List<ApiKey> result = apiInstance.listOwnApiKeys().execute(opts);

            List<ApiKey> result = apiInstance.listOwnApiKeys().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PersonalAuthenticationTokensApi#listOwnApiKeys");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```
### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;ApiKey&gt;**](ApiKey.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of user&#39;s existing Personal Access Tokens |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
