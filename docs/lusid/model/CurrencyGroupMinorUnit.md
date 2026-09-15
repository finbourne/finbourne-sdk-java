# com.finbourne.sdk.services.lusid.model.CurrencyGroupMinorUnit
classname CurrencyGroupMinorUnit
A minor unit currency within a currency group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | The three-letter, case-sensitive currency code of the minor unit, e.g. GBX. | [default to String]
**fractionOfMajor** | **java.math.BigDecimal** | The fraction of the major unit that one minor unit is worth, greater than zero and no more than one, e.g. 0.01 for GBX against GBP. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.CurrencyGroupMinorUnit;
import java.util.*;
import java.lang.System;
import java.net.URI;

String currency = "example currency";
java.math.BigDecimal fractionOfMajor = new java.math.BigDecimal("100.00");


CurrencyGroupMinorUnit currencyGroupMinorUnitInstance = new CurrencyGroupMinorUnit()
    .currency(currency)
    .fractionOfMajor(fractionOfMajor);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)