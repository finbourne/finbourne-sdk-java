# SearchApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**search**](SearchApi.md#search) | **POST** /drive/api/search | [EARLY ACCESS] Search: Search for a file or folder with a given name and path |



## search

> PagedResourceListOfStorageObject search(searchBody, page, sortBy, limit, filter)

[EARLY ACCESS] Search: Search for a file or folder with a given name and path

### Example

```java
import com.finbourne.sdk.services.drive.model.*;
import com.finbourne.sdk.services.drive.api.SearchApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SearchApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        SearchApi apiInstance = apiFactory.build(SearchApi.class);
        SearchBody searchBody = new SearchBody(); // SearchBody | Search parameters
        String page = "page_example"; // String | 
        List<String> sortBy = Arrays.asList(); // List<String> | 
        Integer limit = 56; // Integer | 
        String filter = ""; // String | 
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfStorageObject result = apiInstance.search(searchBody, page, sortBy, limit, filter).execute(opts);

            PagedResourceListOfStorageObject result = apiInstance.search(searchBody, page, sortBy, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#search");
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
| **searchBody** | [**SearchBody**](SearchBody.md)| Search parameters | |
| **page** | **String**|  | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **filter** | **String**|  | [optional] [default to ] |

### Return type

[**PagedResourceListOfStorageObject**](PagedResourceListOfStorageObject.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
