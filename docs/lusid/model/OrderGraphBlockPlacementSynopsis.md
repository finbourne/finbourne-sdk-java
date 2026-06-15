# com.finbourne.sdk.services.lusid.model.OrderGraphBlockPlacementSynopsis
classname OrderGraphBlockPlacementSynopsis

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quantity** | **java.math.BigDecimal** | Total number of units placed. | [default to java.math.BigDecimal]
**quantityByState** | **Map&lt;String, java.math.BigDecimal&gt;** | Total number of units placed. | [optional] [default to Map<String, java.math.BigDecimal>]
**details** | [**List&lt;OrderGraphBlockPlacementDetail&gt;**](OrderGraphBlockPlacementDetail.md) | Identifiers for each placement in this block. | [default to List<OrderGraphBlockPlacementDetail>]

```java
import com.finbourne.sdk.services.lusid.model.OrderGraphBlockPlacementSynopsis;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable Map<String, java.math.BigDecimal> quantityByState = new Map<String, java.math.BigDecimal>();
List<OrderGraphBlockPlacementDetail> details = new List<OrderGraphBlockPlacementDetail>();


OrderGraphBlockPlacementSynopsis orderGraphBlockPlacementSynopsisInstance = new OrderGraphBlockPlacementSynopsis()
    .quantity(quantity)
    .quantityByState(quantityByState)
    .details(details);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)