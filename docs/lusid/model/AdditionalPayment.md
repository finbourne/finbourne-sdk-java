# com.finbourne.sdk.services.lusid.model.AdditionalPayment
classname AdditionalPayment
Record describing additional payment entity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **java.math.BigDecimal** | The payment amount. | [default to java.math.BigDecimal]
**currency** | **String** | The payment currency. | [default to String]
**payDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date when the payment is made. | [default to OffsetDateTime]
**payReceive** | **String** | Is it pay or receive.    Supported string (enumeration) values are: [Pay, Receive]. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AdditionalPayment;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
String currency = "example currency";
OffsetDateTime payDate = OffsetDateTime.now();
String payReceive = "example payReceive";


AdditionalPayment additionalPaymentInstance = new AdditionalPayment()
    .amount(amount)
    .currency(currency)
    .payDate(payDate)
    .payReceive(payReceive);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)