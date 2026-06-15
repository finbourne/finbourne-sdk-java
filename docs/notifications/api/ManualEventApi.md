# ManualEventApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**triggerManualEvent**](ManualEventApi.md#triggerManualEvent) | **POST** /notification/api/manualevent | TriggerManualEvent: Trigger a manual event. |



## triggerManualEvent

> ManualEvent triggerManualEvent(manualEventRequest)

TriggerManualEvent: Trigger a manual event.

### Example

```java
import com.finbourne.sdk.services.notifications.model.*;
import com.finbourne.sdk.services.notifications.api.ManualEventApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ManualEventApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        ManualEventApi apiInstance = apiFactory.build(ManualEventApi.class);
        ManualEventRequest manualEventRequest = new ManualEventRequest(); // ManualEventRequest | The data required to trigger a manual event.
        try {
            // uncomment the below to set overrides at the request level
            // ManualEvent result = apiInstance.triggerManualEvent(manualEventRequest).execute(opts);

            ManualEvent result = apiInstance.triggerManualEvent(manualEventRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManualEventApi#triggerManualEvent");
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
| **manualEventRequest** | [**ManualEventRequest**](ManualEventRequest.md)| The data required to trigger a manual event. | |

### Return type

[**ManualEvent**](ManualEvent.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
