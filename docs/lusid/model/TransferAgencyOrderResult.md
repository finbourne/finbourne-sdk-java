# com.finbourne.sdk.services.lusid.model.TransferAgencyOrderResult
classname TransferAgencyOrderResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transactionId** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TransferAgencyOrderResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId orderId = new ResourceId();
@javax.annotation.Nullable String transactionId = "example transactionId";


TransferAgencyOrderResult transferAgencyOrderResultInstance = new TransferAgencyOrderResult()
    .orderId(orderId)
    .transactionId(transactionId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)