# com.finbourne.sdk.services.lusid.model.DeleteTransferAgencyOrderResult
classname DeleteTransferAgencyOrderResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**cancelledTransactionIds** | **List&lt;String&gt;** |  | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.DeleteTransferAgencyOrderResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId orderId = new ResourceId();
@javax.annotation.Nullable List<String> cancelledTransactionIds = new List<String>();


DeleteTransferAgencyOrderResult deleteTransferAgencyOrderResultInstance = new DeleteTransferAgencyOrderResult()
    .orderId(orderId)
    .cancelledTransactionIds(cancelledTransactionIds);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)