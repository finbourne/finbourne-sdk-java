# com.finbourne.sdk.services.lusid.model.Premium
classname Premium
A class containing information for a given premium payment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **java.math.BigDecimal** | Premium amount. | [default to java.math.BigDecimal]
**currency** | **String** | Premium currency. | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | Date when premium paid. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.Premium;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
String currency = "example currency";
OffsetDateTime date = OffsetDateTime.now();


Premium premiumInstance = new Premium()
    .amount(amount)
    .currency(currency)
    .date(date);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)