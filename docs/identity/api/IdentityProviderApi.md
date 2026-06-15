# IdentityProviderApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addScim**](IdentityProviderApi.md#addScim) | **PUT** /identity/api/identityprovider/scim | AddScim: Add SCIM |
| [**removeScim**](IdentityProviderApi.md#removeScim) | **DELETE** /identity/api/identityprovider/scim | RemoveScim: Remove SCIM |



## addScim

> AddScimResponse addScim(apiTokenAction, oldApiTokenDeactivation)

AddScim: Add SCIM

Generates an API token to be used for SCIM

### Example

```java
import com.finbourne.sdk.services.identity.model.*;
import com.finbourne.sdk.services.identity.api.IdentityProviderApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IdentityProviderApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        IdentityProviderApi apiInstance = apiFactory.build(IdentityProviderApi.class);
        String apiTokenAction = "apiTokenAction_example"; // String | The action to take. For the API token. Defaults to \"ensure\"
        OffsetDateTime oldApiTokenDeactivation = OffsetDateTime.now(); // OffsetDateTime | Optional deactivation date for the old API token. Only used if apiTokenAction is \"regenerate\"
        try {
            // uncomment the below to set overrides at the request level
            // AddScimResponse result = apiInstance.addScim(apiTokenAction, oldApiTokenDeactivation).execute(opts);

            AddScimResponse result = apiInstance.addScim(apiTokenAction, oldApiTokenDeactivation).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentityProviderApi#addScim");
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
| **apiTokenAction** | **String**| The action to take. For the API token. Defaults to \&quot;ensure\&quot; | [optional] |
| **oldApiTokenDeactivation** | **OffsetDateTime**| Optional deactivation date for the old API token. Only used if apiTokenAction is \&quot;regenerate\&quot; | [optional] |

### Return type

[**AddScimResponse**](AddScimResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The base URL and API token to be used |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## removeScim

> removeScim()

RemoveScim: Remove SCIM

Deactivates any existing SCIM API token

### Example

```java
import com.finbourne.sdk.services.identity.model.*;
import com.finbourne.sdk.services.identity.api.IdentityProviderApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IdentityProviderApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        IdentityProviderApi apiInstance = apiFactory.build(IdentityProviderApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // apiInstance.removeScim().execute(opts);

            apiInstance.removeScim().execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentityProviderApi#removeScim");
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

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
