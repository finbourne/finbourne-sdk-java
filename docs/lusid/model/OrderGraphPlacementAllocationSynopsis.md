# com.finbourne.sdk.services.lusid.model.OrderGraphPlacementAllocationSynopsis
classname OrderGraphPlacementAllocationSynopsis

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quantity** | **java.math.BigDecimal** | Total number of units allocated. | [default to java.math.BigDecimal]
**amount** | **java.math.BigDecimal** | Total monetary value allocated, derived from the quantity and price of each allocation, in the placement&#39;s amount currency. Null where the placement has no amount, or where an allocation cannot be expressed in that currency. | [optional] [default to java.math.BigDecimal]
**details** | [**List&lt;OrderGraphPlacementAllocationDetail&gt;**](OrderGraphPlacementAllocationDetail.md) | Identifiers for each allocation in this placement. | [default to List<OrderGraphPlacementAllocationDetail>]

```java
import com.finbourne.sdk.services.lusid.model.OrderGraphPlacementAllocationSynopsis;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
List<OrderGraphPlacementAllocationDetail> details = new List<OrderGraphPlacementAllocationDetail>();


OrderGraphPlacementAllocationSynopsis orderGraphPlacementAllocationSynopsisInstance = new OrderGraphPlacementAllocationSynopsis()
    .quantity(quantity)
    .amount(amount)
    .details(details);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)