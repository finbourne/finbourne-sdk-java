# com.finbourne.sdk.services.lusid.model.OrderGraphPlacementExecutionSynopsis
classname OrderGraphPlacementExecutionSynopsis

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quantity** | **java.math.BigDecimal** | Total number of units executed. | [default to java.math.BigDecimal]
**amount** | **java.math.BigDecimal** | Total monetary value executed, derived from the quantity and price of each execution, in the placement&#39;s amount currency. Null where the placement has no amount, or where an execution cannot be expressed in that currency. | [optional] [default to java.math.BigDecimal]
**details** | [**List&lt;OrderGraphPlacementExecutionDetail&gt;**](OrderGraphPlacementExecutionDetail.md) | Identifiers info for each execution against this placement. | [default to List<OrderGraphPlacementExecutionDetail>]

```java
import com.finbourne.sdk.services.lusid.model.OrderGraphPlacementExecutionSynopsis;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
List<OrderGraphPlacementExecutionDetail> details = new List<OrderGraphPlacementExecutionDetail>();


OrderGraphPlacementExecutionSynopsis orderGraphPlacementExecutionSynopsisInstance = new OrderGraphPlacementExecutionSynopsis()
    .quantity(quantity)
    .amount(amount)
    .details(details);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)