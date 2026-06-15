# com.finbourne.sdk.services.lusid.model.OrderGraphPlacementOrderSynopsis
classname OrderGraphPlacementOrderSynopsis

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**details** | [**List&lt;OrderGraphPlacementOrderDetail&gt;**](OrderGraphPlacementOrderDetail.md) | Identifiers for each order in the block. | [default to List<OrderGraphPlacementOrderDetail>]

```java
import com.finbourne.sdk.services.lusid.model.OrderGraphPlacementOrderSynopsis;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<OrderGraphPlacementOrderDetail> details = new List<OrderGraphPlacementOrderDetail>();


OrderGraphPlacementOrderSynopsis orderGraphPlacementOrderSynopsisInstance = new OrderGraphPlacementOrderSynopsis()
    .details(details);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)