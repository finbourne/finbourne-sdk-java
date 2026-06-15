# com.finbourne.sdk.services.lusid.model.OrderGraphBlockOrderSynopsis
classname OrderGraphBlockOrderSynopsis

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quantity** | **java.math.BigDecimal** | Total number of units ordered. | [default to java.math.BigDecimal]
**quantityByState** | **Map&lt;String, java.math.BigDecimal&gt;** | Total number of units placed. | [optional] [default to Map<String, java.math.BigDecimal>]
**details** | [**List&lt;OrderGraphBlockOrderDetail&gt;**](OrderGraphBlockOrderDetail.md) | Identifiers and other info for each order in this block. | [default to List<OrderGraphBlockOrderDetail>]

```java
import com.finbourne.sdk.services.lusid.model.OrderGraphBlockOrderSynopsis;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable Map<String, java.math.BigDecimal> quantityByState = new Map<String, java.math.BigDecimal>();
List<OrderGraphBlockOrderDetail> details = new List<OrderGraphBlockOrderDetail>();


OrderGraphBlockOrderSynopsis orderGraphBlockOrderSynopsisInstance = new OrderGraphBlockOrderSynopsis()
    .quantity(quantity)
    .quantityByState(quantityByState)
    .details(details);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)