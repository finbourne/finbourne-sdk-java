# com.finbourne.sdk.services.lusid.model.CurrencyAndAmount
classname CurrencyAndAmount
An amount of a specific currency, specifying a value and an associated unit

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**currency** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CurrencyAndAmount;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
String currency = "example currency";


CurrencyAndAmount currencyAndAmountInstance = new CurrencyAndAmount()
    .amount(amount)
    .currency(currency);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)