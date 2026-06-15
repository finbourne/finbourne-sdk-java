# com.finbourne.sdk.services.lusid.model.SettlementInLieu
classname SettlementInLieu

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**originalSettlementCurrency** | **String** |  | [default to String]
**amount** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.SettlementInLieu;
import java.util.*;
import java.lang.System;
import java.net.URI;

String originalSettlementCurrency = "example originalSettlementCurrency";
@javax.annotation.Nullable java.math.BigDecimal amount = new java.math.BigDecimal("100.00");


SettlementInLieu settlementInLieuInstance = new SettlementInLieu()
    .originalSettlementCurrency(originalSettlementCurrency)
    .amount(amount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)