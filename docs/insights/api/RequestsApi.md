# RequestsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRequest**](RequestsApi.md#getRequest) | **GET** /insights/api/requests/{id}/request | GetRequest: Get the request content for a specific API request. |
| [**getRequestLog**](RequestsApi.md#getRequestLog) | **GET** /insights/api/requests/{id} | GetRequestLog: Get the log for a specific API request. |
| [**getResponse**](RequestsApi.md#getResponse) | **GET** /insights/api/requests/{id}/response | GetResponse: Get the response for a specific API request. |
| [**listRequestLogs**](RequestsApi.md#listRequestLogs) | **GET** /insights/api/requests | ListRequestLogs: Get the logs for API requests. |



## getRequest

> Request getRequest(id)

GetRequest: Get the request content for a specific API request.

### Example

```java
import com.finbourne.sdk.services.insights.model.*;
import com.finbourne.sdk.services.insights.api.RequestsApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RequestsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        RequestsApi apiInstance = apiFactory.build(RequestsApi.class);
        String id = "id_example"; // String | The identifier of the request to obtain the content for.
        try {
            // uncomment the below to set overrides at the request level
            // Request result = apiInstance.getRequest(id).execute(opts);

            Request result = apiInstance.getRequest(id).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RequestsApi#getRequest");
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
| **id** | **String**| The identifier of the request to obtain the content for. | |

### Return type

[**Request**](Request.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## getRequestLog

> RequestLog getRequestLog(id)

GetRequestLog: Get the log for a specific API request.

### Example

```java
import com.finbourne.sdk.services.insights.model.*;
import com.finbourne.sdk.services.insights.api.RequestsApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RequestsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        RequestsApi apiInstance = apiFactory.build(RequestsApi.class);
        String id = "id_example"; // String | The identifier of the request to obtain the log for.
        try {
            // uncomment the below to set overrides at the request level
            // RequestLog result = apiInstance.getRequestLog(id).execute(opts);

            RequestLog result = apiInstance.getRequestLog(id).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RequestsApi#getRequestLog");
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
| **id** | **String**| The identifier of the request to obtain the log for. | |

### Return type

[**RequestLog**](RequestLog.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## getResponse

> Response getResponse(id)

GetResponse: Get the response for a specific API request.

### Example

```java
import com.finbourne.sdk.services.insights.model.*;
import com.finbourne.sdk.services.insights.api.RequestsApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RequestsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        RequestsApi apiInstance = apiFactory.build(RequestsApi.class);
        String id = "id_example"; // String | The identifier of the request to obtain the response for.
        try {
            // uncomment the below to set overrides at the request level
            // Response result = apiInstance.getResponse(id).execute(opts);

            Response result = apiInstance.getResponse(id).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RequestsApi#getResponse");
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
| **id** | **String**| The identifier of the request to obtain the response for. | |

### Return type

[**Response**](Response.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## listRequestLogs

> ResourceListWithHistogramOfRequestLog listRequestLogs(filter, sortBy, limit, page, histogramInterval)

ListRequestLogs: Get the logs for API requests.

### Example

```java
import com.finbourne.sdk.services.insights.model.*;
import com.finbourne.sdk.services.insights.api.RequestsApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RequestsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        RequestsApi apiInstance = apiFactory.build(RequestsApi.class);
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about [filtering results from LUSID](https://support.lusid.com/filtering-results-from-lusid).
        String sortBy = "sortBy_example"; // String | Order the results by these fields. Use the '-' sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName
        Integer limit = 56; // Integer | When paginating, only return this number of records. The minimum value is 0 and the maximum is 10000.
        String page = "page_example"; // String | Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter and sortby fields should not be supplied.
        String histogramInterval = "histogramInterval_example"; // String | Optional interval to use in a histogram of the returned values. If not provided, no histogram will be generated.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListWithHistogramOfRequestLog result = apiInstance.listRequestLogs(filter, sortBy, limit, page, histogramInterval).execute(opts);

            ResourceListWithHistogramOfRequestLog result = apiInstance.listRequestLogs(filter, sortBy, limit, page, histogramInterval).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RequestsApi#listRequestLogs");
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
| **filter** | **String**| Expression to filter the result set. Read more about [filtering results from LUSID](https://support.lusid.com/filtering-results-from-lusid). | [optional] |
| **sortBy** | **String**| Order the results by these fields. Use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName | [optional] |
| **limit** | **Integer**| When paginating, only return this number of records. The minimum value is 0 and the maximum is 10000. | [optional] |
| **page** | **String**| Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter and sortby fields should not be supplied. | [optional] |
| **histogramInterval** | **String**| Optional interval to use in a histogram of the returned values. If not provided, no histogram will be generated. | [optional] |

### Return type

[**ResourceListWithHistogramOfRequestLog**](ResourceListWithHistogramOfRequestLog.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
