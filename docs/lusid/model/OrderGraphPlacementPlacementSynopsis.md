# com.finbourne.sdk.services.lusid.model.OrderGraphPlacementPlacementSynopsis
classname OrderGraphPlacementPlacementSynopsis

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**details** | [**List&lt;OrderGraphPlacementChildPlacementDetail&gt;**](OrderGraphPlacementChildPlacementDetail.md) | Identifiers for each child placement for this placement. | [default to List<OrderGraphPlacementChildPlacementDetail>]
**quantity** | **java.math.BigDecimal** | Total number of units placed. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.OrderGraphPlacementPlacementSynopsis;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<OrderGraphPlacementChildPlacementDetail> details = new List<OrderGraphPlacementChildPlacementDetail>();
java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");


OrderGraphPlacementPlacementSynopsis orderGraphPlacementPlacementSynopsisInstance = new OrderGraphPlacementPlacementSynopsis()
    .details(details)
    .quantity(quantity);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)