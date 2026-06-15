# EventTypesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEventType**](EventTypesApi.md#getEventType) | **GET** /notification/api/eventtypes/{eventType} | GetEventType: Gets the specified event type schema. |
| [**listEventTypes**](EventTypesApi.md#listEventTypes) | **GET** /notification/api/eventtypes | ListEventTypes: Lists all of the available event types. |



## getEventType

> EventTypeSchema getEventType(eventType)

GetEventType: Gets the specified event type schema.

### Example

```java
import com.finbourne.sdk.services.notifications.model.*;
import com.finbourne.sdk.services.notifications.api.EventTypesApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EventTypesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        EventTypesApi apiInstance = apiFactory.build(EventTypesApi.class);
        String eventType = "eventType_example"; // String | The event type to retrieve schema for.
        try {
            // uncomment the below to set overrides at the request level
            // EventTypeSchema result = apiInstance.getEventType(eventType).execute(opts);

            EventTypeSchema result = apiInstance.getEventType(eventType).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EventTypesApi#getEventType");
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
| **eventType** | **String**| The event type to retrieve schema for. | |

### Return type

[**EventTypeSchema**](EventTypeSchema.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No event type exists with the specified type |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## listEventTypes

> ResourceListOfEventTypeSchema listEventTypes()

ListEventTypes: Lists all of the available event types.

### Example

```java
import com.finbourne.sdk.services.notifications.model.*;
import com.finbourne.sdk.services.notifications.api.EventTypesApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EventTypesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        EventTypesApi apiInstance = apiFactory.build(EventTypesApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfEventTypeSchema result = apiInstance.listEventTypes().execute(opts);

            ResourceListOfEventTypeSchema result = apiInstance.listEventTypes().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EventTypesApi#listEventTypes");
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

[**ResourceListOfEventTypeSchema**](ResourceListOfEventTypeSchema.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | No event types found |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
