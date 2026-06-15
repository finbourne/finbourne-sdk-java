# ActionLogsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getActionLogs**](ActionLogsApi.md#getActionLogs) | **GET** /workflow/api/actionlogs/{id} | GetActionLogs: Get the Action Logs for an Action Id |



## getActionLogs

> ActionLog getActionLogs(id)

GetActionLogs: Get the Action Logs for an Action Id

### Example

```java
import com.finbourne.sdk.services.workflow.model.*;
import com.finbourne.sdk.services.workflow.api.ActionLogsApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ActionLogsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        ActionLogsApi apiInstance = apiFactory.build(ActionLogsApi.class);
        String id = "id_example"; // String | The Action Id
        try {
            // uncomment the below to set overrides at the request level
            // ActionLog result = apiInstance.getActionLogs(id).execute(opts);

            ActionLog result = apiInstance.getActionLogs(id).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionLogsApi#getActionLogs");
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
| **id** | **String**| The Action Id | |

### Return type

[**ActionLog**](ActionLog.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | Action Log not found. |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
