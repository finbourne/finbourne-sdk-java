# com.finbourne.sdk.services.lusid.model.TransactionPrice
classname TransactionPrice

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**price** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**type** | **String** | Available values: Price, Yield, Spread, CashFlowPerUnit, CleanPrice, DirtyPrice, CdsPrice. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TransactionPrice;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal price = new java.math.BigDecimal("100.00");
String type = "example type";


TransactionPrice transactionPriceInstance = new TransactionPrice()
    .price(price)
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)