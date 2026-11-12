# com.finbourne.sdk.services.lusid.model.ProposedBlockAndOrders
classname ProposedBlockAndOrders

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request** | [**BlockAndOrdersRequest**](BlockAndOrdersRequest.md) |  | [optional] [default to BlockAndOrdersRequest]
**netQuantity** | **java.math.BigDecimal** | The block&#39;s quantity, netted by direction, where any order is quantity-based. | [optional] [default to java.math.BigDecimal]
**netAmount** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]

```java
import com.finbourne.sdk.services.lusid.model.ProposedBlockAndOrders;
import java.util.*;
import java.lang.System;
import java.net.URI;

BlockAndOrdersRequest request = new BlockAndOrdersRequest();
@javax.annotation.Nullable java.math.BigDecimal netQuantity = new java.math.BigDecimal("100.00");
CurrencyAndAmount netAmount = new CurrencyAndAmount();


ProposedBlockAndOrders proposedBlockAndOrdersInstance = new ProposedBlockAndOrders()
    .request(request)
    .netQuantity(netQuantity)
    .netAmount(netAmount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)