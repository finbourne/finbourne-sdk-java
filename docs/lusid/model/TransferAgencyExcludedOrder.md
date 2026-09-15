# com.finbourne.sdk.services.lusid.model.TransferAgencyExcludedOrder
classname TransferAgencyExcludedOrder
An order left out of the sizing an estimate was struck from, with the reason it was left out.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**reason** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TransferAgencyExcludedOrder;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId orderId = new ResourceId();
@javax.annotation.Nullable String reason = "example reason";


TransferAgencyExcludedOrder transferAgencyExcludedOrderInstance = new TransferAgencyExcludedOrder()
    .orderId(orderId)
    .reason(reason);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)