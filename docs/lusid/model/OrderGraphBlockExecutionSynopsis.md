# com.finbourne.sdk.services.lusid.model.OrderGraphBlockExecutionSynopsis
classname OrderGraphBlockExecutionSynopsis

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quantity** | **java.math.BigDecimal** | Total number of units executed. | [default to java.math.BigDecimal]
**details** | [**List&lt;OrderGraphBlockExecutionDetail&gt;**](OrderGraphBlockExecutionDetail.md) | Identifiers for each execution in this block. | [default to List<OrderGraphBlockExecutionDetail>]

```java
import com.finbourne.sdk.services.lusid.model.OrderGraphBlockExecutionSynopsis;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");
List<OrderGraphBlockExecutionDetail> details = new List<OrderGraphBlockExecutionDetail>();


OrderGraphBlockExecutionSynopsis orderGraphBlockExecutionSynopsisInstance = new OrderGraphBlockExecutionSynopsis()
    .quantity(quantity)
    .details(details);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)