# TransfersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTransfer**](TransfersApi.md#createTransfer) | **POST** /api/api/transfers | [EXPERIMENTAL] CreateTransfer: Create a transfer. |
| [**getTransfer**](TransfersApi.md#getTransfer) | **POST** /api/api/transfers/$get | [EXPERIMENTAL] GetTransfer: Get a transfer |



## createTransfer

> CreateTransferResponse createTransfer(createTransferRequest)

[EXPERIMENTAL] CreateTransfer: Create a transfer.

Move a position between two portfolios, exchange one instrument for another within a portfolio, or do  both at once.  The outgoing and incoming transaction legs and the Transfer entity recording them are written as a single  atomic operation: if any part of the request is rejected, nothing is written.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.TransfersApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransfersApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        TransfersApi apiInstance = apiFactory.build(TransfersApi.class);
        CreateTransferRequest createTransferRequest = new CreateTransferRequest(); // CreateTransferRequest | The transfer to create.
        try {
            // uncomment the below to set overrides at the request level
            // CreateTransferResponse result = apiInstance.createTransfer(createTransferRequest).execute(opts);

            CreateTransferResponse result = apiInstance.createTransfer(createTransferRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransfersApi#createTransfer");
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
| **createTransferRequest** | [**CreateTransferRequest**](../model/CreateTransferRequest.md)| The transfer to create. | |

### Return type

[**CreateTransferResponse**](../model/CreateTransferResponse.md)


### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The transfer that was created. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## getTransfer

> GetTransferResponse getTransfer(getTransferRequest, asAt)

[EXPERIMENTAL] GetTransfer: Get a transfer

Retrieve a transfer and both of the transactions it booked.  A transfer is identified by its scope, its code and both of its portfolios, so all four are supplied in  the request body rather than in the path.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.TransfersApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransfersApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        TransfersApi apiInstance = apiFactory.build(TransfersApi.class);
        GetTransferRequest getTransferRequest = new GetTransferRequest(); // GetTransferRequest | The transfer to retrieve.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the transfer. Defaults to latest              version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // GetTransferResponse result = apiInstance.getTransfer(getTransferRequest, asAt).execute(opts);

            GetTransferResponse result = apiInstance.getTransfer(getTransferRequest, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransfersApi#getTransfer");
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
| **getTransferRequest** | [**GetTransferRequest**](../model/GetTransferRequest.md)| The transfer to retrieve. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the transfer. Defaults to latest              version if not specified. | [optional] |

### Return type

[**GetTransferResponse**](../model/GetTransferResponse.md)


### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested transfer and both of its transactions. |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No transfer exists with the requested scope, code and portfolios. |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
