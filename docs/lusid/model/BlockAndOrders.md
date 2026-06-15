# com.finbourne.sdk.services.lusid.model.BlockAndOrders
classname BlockAndOrders

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**block** | [**Block**](Block.md) |  | [default to Block]
**orders** | [**List&lt;Order&gt;**](Order.md) |  | [default to List<Order>]

```java
import com.finbourne.sdk.services.lusid.model.BlockAndOrders;
import java.util.*;
import java.lang.System;
import java.net.URI;

Block block = new Block();
List<Order> orders = new List<Order>();


BlockAndOrders blockAndOrdersInstance = new BlockAndOrders()
    .block(block)
    .orders(orders);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)