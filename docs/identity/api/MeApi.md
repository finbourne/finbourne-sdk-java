# MeApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUserInfo**](MeApi.md#getUserInfo) | **GET** /identity/api/me | GetUserInfo: Get User Info |
| [**setPassword**](MeApi.md#setPassword) | **PUT** /identity/api/me/password | SetPassword: Set password of current user |



## getUserInfo

> CurrentUserResponse getUserInfo()

GetUserInfo: Get User Info

Get the requesting user&#39;s basic info

### Example

```java
import com.finbourne.sdk.services.identity.model.*;
import com.finbourne.sdk.services.identity.api.MeApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class MeApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        MeApi apiInstance = apiFactory.build(MeApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // CurrentUserResponse result = apiInstance.getUserInfo().execute(opts);

            CurrentUserResponse result = apiInstance.getUserInfo().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling MeApi#getUserInfo");
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

[**CurrentUserResponse**](CurrentUserResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get the specified user&#39;s info |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## setPassword

> SetPasswordResponse setPassword(setPassword)

SetPassword: Set password of current user

Set the password of the current user to the specified value.              Note this is feature is only available to Service users authenticated using OpenID. For further information relating to usage of this feature please consult the documentation.

### Example

```java
import com.finbourne.sdk.services.identity.model.*;
import com.finbourne.sdk.services.identity.api.MeApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class MeApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        MeApi apiInstance = apiFactory.build(MeApi.class);
        SetPassword setPassword = new SetPassword(); // SetPassword | The request containing the new password value
        try {
            // uncomment the below to set overrides at the request level
            // SetPasswordResponse result = apiInstance.setPassword(setPassword).execute(opts);

            SetPasswordResponse result = apiInstance.setPassword(setPassword).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling MeApi#setPassword");
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
| **setPassword** | [**SetPassword**](SetPassword.md)| The request containing the new password value | |

### Return type

[**SetPasswordResponse**](SetPasswordResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set the current user&#39;s password |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
