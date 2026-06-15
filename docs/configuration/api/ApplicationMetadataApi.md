# ApplicationMetadataApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listAccessControlledResources**](ApplicationMetadataApi.md#listAccessControlledResources) | **GET** /configuration/api/metadata/access/resources | [EARLY ACCESS] ListAccessControlledResources: Get resources available for access control |



## listAccessControlledResources

> ResourceListOfAccessControlledResource listAccessControlledResources()

[EARLY ACCESS] ListAccessControlledResources: Get resources available for access control

Get the comprehensive set of resources that are available for access control

### Example

```java
import com.finbourne.sdk.services.configuration.model.*;
import com.finbourne.sdk.services.configuration.api.ApplicationMetadataApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ApplicationMetadataApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        ApplicationMetadataApi apiInstance = apiFactory.build(ApplicationMetadataApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfAccessControlledResource result = apiInstance.listAccessControlledResources().execute(opts);

            ResourceListOfAccessControlledResource result = apiInstance.listAccessControlledResources().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationMetadataApi#listAccessControlledResources");
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

[**ResourceListOfAccessControlledResource**](ResourceListOfAccessControlledResource.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
