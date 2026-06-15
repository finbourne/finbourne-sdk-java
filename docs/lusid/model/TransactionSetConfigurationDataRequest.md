# com.finbourne.sdk.services.lusid.model.TransactionSetConfigurationDataRequest
classname TransactionSetConfigurationDataRequest
A bundle of requests to configure a set of transaction types.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionConfigRequests** | [**List&lt;TransactionConfigurationDataRequest&gt;**](TransactionConfigurationDataRequest.md) | Collection of transaction type models | [default to List<TransactionConfigurationDataRequest>]
**sideConfigRequests** | [**List&lt;SideConfigurationDataRequest&gt;**](SideConfigurationDataRequest.md) | Collection of side definition requests. | [optional] [default to List<SideConfigurationDataRequest>]

```java
import com.finbourne.sdk.services.lusid.model.TransactionSetConfigurationDataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<TransactionConfigurationDataRequest> transactionConfigRequests = new List<TransactionConfigurationDataRequest>();
@javax.annotation.Nullable List<SideConfigurationDataRequest> sideConfigRequests = new List<SideConfigurationDataRequest>();


TransactionSetConfigurationDataRequest transactionSetConfigurationDataRequestInstance = new TransactionSetConfigurationDataRequest()
    .transactionConfigRequests(transactionConfigRequests)
    .sideConfigRequests(sideConfigRequests);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)