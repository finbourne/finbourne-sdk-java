# com.finbourne.sdk.services.lusid.model.CancelOrderAndMoveRemainingResult
classname CancelOrderAndMoveRemainingResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cancelledOrder** | [**Order**](Order.md) |  | [optional] [default to Order]
**newOrder** | [**Order**](Order.md) |  | [optional] [default to Order]
**newBlockId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.CancelOrderAndMoveRemainingResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

Order cancelledOrder = new Order();
Order newOrder = new Order();
ResourceId newBlockId = new ResourceId();


CancelOrderAndMoveRemainingResult cancelOrderAndMoveRemainingResultInstance = new CancelOrderAndMoveRemainingResult()
    .cancelledOrder(cancelledOrder)
    .newOrder(newOrder)
    .newBlockId(newBlockId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)