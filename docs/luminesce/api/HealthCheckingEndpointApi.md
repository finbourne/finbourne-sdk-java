# HealthCheckingEndpointApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fakeNodeReclaim**](HealthCheckingEndpointApi.md#fakeNodeReclaim) | **GET** /honeycomb/fakeNodeReclaim | [INTERNAL] FakeNodeReclaim: Helps testing of AWS node reclaim behaviour |



## fakeNodeReclaim

> Object fakeNodeReclaim(secondsUntilReclaim)

[INTERNAL] FakeNodeReclaim: Helps testing of AWS node reclaim behaviour

 An internal Method used to mark the next SIGTERM as though an Aws Node reclaim were about to take place. Simulates having received an AWS node reclaim warning, or similar.

### Example

```java
import com.finbourne.sdk.services.luminesce.model.*;
import com.finbourne.sdk.services.luminesce.api.HealthCheckingEndpointApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class HealthCheckingEndpointApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        HealthCheckingEndpointApi apiInstance = apiFactory.build(HealthCheckingEndpointApi.class);
        Integer secondsUntilReclaim = 119; // Integer | the number of seconds from which to assume node termination
        try {
            // uncomment the below to set overrides at the request level
            // Object result = apiInstance.fakeNodeReclaim(secondsUntilReclaim).execute(opts);

            Object result = apiInstance.fakeNodeReclaim(secondsUntilReclaim).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling HealthCheckingEndpointApi#fakeNodeReclaim");
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
| **secondsUntilReclaim** | **Integer**| the number of seconds from which to assume node termination | [optional] [default to 119] |

### Return type

**Object**

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
