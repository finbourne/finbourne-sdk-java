# com.finbourne.sdk.services.lusid.model.ExternalDealingEstimateAmount
classname ExternalDealingEstimateAmount
A cash amount in a stated currency.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**currency** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ExternalDealingEstimateAmount;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal value = new java.math.BigDecimal("100.00");
String currency = "example currency";


ExternalDealingEstimateAmount externalDealingEstimateAmountInstance = new ExternalDealingEstimateAmount()
    .value(value)
    .currency(currency);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)