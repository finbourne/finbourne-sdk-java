# com.finbourne.sdk.services.lusid.model.CancelOrdersAndMoveRemainingRequest
classname CancelOrdersAndMoveRemainingRequest
A request to create or update a Order.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cancelOrderId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**moveRemainingToOrderId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**moveRemainingToBlockId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.CancelOrdersAndMoveRemainingRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId cancelOrderId = new ResourceId();
ResourceId moveRemainingToOrderId = new ResourceId();
ResourceId moveRemainingToBlockId = new ResourceId();


CancelOrdersAndMoveRemainingRequest cancelOrdersAndMoveRemainingRequestInstance = new CancelOrdersAndMoveRemainingRequest()
    .cancelOrderId(cancelOrderId)
    .moveRemainingToOrderId(moveRemainingToOrderId)
    .moveRemainingToBlockId(moveRemainingToBlockId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)