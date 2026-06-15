# com.finbourne.sdk.services.lusid.model.LoanPeriod
classname LoanPeriod

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**notional** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**interestAmount** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.LoanPeriod;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime paymentDate = OffsetDateTime.now();
java.math.BigDecimal notional = new java.math.BigDecimal("100.00");
java.math.BigDecimal interestAmount = new java.math.BigDecimal("100.00");


LoanPeriod loanPeriodInstance = new LoanPeriod()
    .paymentDate(paymentDate)
    .notional(notional)
    .interestAmount(interestAmount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)