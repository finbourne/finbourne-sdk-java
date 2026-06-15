# com.finbourne.sdk.services.lusid.model.OrderGraphBlockTransactionSynopsis
classname OrderGraphBlockTransactionSynopsis

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quantity** | **java.math.BigDecimal** | Total number of units booked. | [default to java.math.BigDecimal]
**details** | [**List&lt;OrderGraphBlockTransactionDetail&gt;**](OrderGraphBlockTransactionDetail.md) | Identifiers for each transaction in this block. | [default to List<OrderGraphBlockTransactionDetail>]

```java
import com.finbourne.sdk.services.lusid.model.OrderGraphBlockTransactionSynopsis;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");
List<OrderGraphBlockTransactionDetail> details = new List<OrderGraphBlockTransactionDetail>();


OrderGraphBlockTransactionSynopsis orderGraphBlockTransactionSynopsisInstance = new OrderGraphBlockTransactionSynopsis()
    .quantity(quantity)
    .details(details);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)