# SettlementActivityApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**querySettlementActivity**](SettlementActivityApi.md#querySettlementActivity) | **POST** /api/api/settlementactivities/$query | [EARLY ACCESS] QuerySettlementActivity: Query Settlement Activity |



## querySettlementActivity

> ResourceListWithPostBodiesOfSettlementActivityToSettlementActivityQuery querySettlementActivity(settlementActivityQuery)

[EARLY ACCESS] QuerySettlementActivity: Query Settlement Activity

Queries settlement activity (Expected and Settled) for the specified portfolios and/or portfolio groups.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.SettlementActivityApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SettlementActivityApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        SettlementActivityApi apiInstance = apiFactory.build(SettlementActivityApi.class);
        SettlementActivityQuery settlementActivityQuery = new SettlementActivityQuery(); // SettlementActivityQuery | The query parameters controlling which settlement activity is returned.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListWithPostBodiesOfSettlementActivityToSettlementActivityQuery result = apiInstance.querySettlementActivity(settlementActivityQuery).execute(opts);

            ResourceListWithPostBodiesOfSettlementActivityToSettlementActivityQuery result = apiInstance.querySettlementActivity(settlementActivityQuery).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SettlementActivityApi#querySettlementActivity");
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
| **settlementActivityQuery** | [**SettlementActivityQuery**](SettlementActivityQuery.md)| The query parameters controlling which settlement activity is returned. | |

### Return type

[**ResourceListWithPostBodiesOfSettlementActivityToSettlementActivityQuery**](ResourceListWithPostBodiesOfSettlementActivityToSettlementActivityQuery.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested settlement activity for the specified portfolios and portfolio groups |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
