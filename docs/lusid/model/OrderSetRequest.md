# com.finbourne.sdk.services.lusid.model.OrderSetRequest
classname OrderSetRequest
A request to create or update multiple Orders.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderRequests** | [**List&lt;OrderRequest&gt;**](OrderRequest.md) | A collection of OrderRequests. | [optional] [default to List<OrderRequest>]

```java
import com.finbourne.sdk.services.lusid.model.OrderSetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<OrderRequest> orderRequests = new List<OrderRequest>();


OrderSetRequest orderSetRequestInstance = new OrderSetRequest()
    .orderRequests(orderRequests);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)