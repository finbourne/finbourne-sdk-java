# com.finbourne.sdk.services.lusid.model.MovedOrderToDifferentBlockResponse
classname MovedOrderToDifferentBlockResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destinationBlock** | [**Block**](Block.md) |  | [optional] [default to Block]
**order** | [**Order**](Order.md) |  | [optional] [default to Order]
**sourceBlockId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.MovedOrderToDifferentBlockResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Block destinationBlock = new Block();
Order order = new Order();
ResourceId sourceBlockId = new ResourceId();


MovedOrderToDifferentBlockResponse movedOrderToDifferentBlockResponseInstance = new MovedOrderToDifferentBlockResponse()
    .destinationBlock(destinationBlock)
    .order(order)
    .sourceBlockId(sourceBlockId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)