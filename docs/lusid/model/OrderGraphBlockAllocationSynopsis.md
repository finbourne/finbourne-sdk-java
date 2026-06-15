# com.finbourne.sdk.services.lusid.model.OrderGraphBlockAllocationSynopsis
classname OrderGraphBlockAllocationSynopsis

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quantity** | **java.math.BigDecimal** | Total number of units allocated. | [default to java.math.BigDecimal]
**details** | [**List&lt;OrderGraphBlockAllocationDetail&gt;**](OrderGraphBlockAllocationDetail.md) | Identifiers for each allocation in this block. | [default to List<OrderGraphBlockAllocationDetail>]

```java
import com.finbourne.sdk.services.lusid.model.OrderGraphBlockAllocationSynopsis;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");
List<OrderGraphBlockAllocationDetail> details = new List<OrderGraphBlockAllocationDetail>();


OrderGraphBlockAllocationSynopsis orderGraphBlockAllocationSynopsisInstance = new OrderGraphBlockAllocationSynopsis()
    .quantity(quantity)
    .details(details);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)