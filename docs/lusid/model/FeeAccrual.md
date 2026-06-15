# com.finbourne.sdk.services.lusid.model.FeeAccrual
classname FeeAccrual

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date for which the fee accrual has been calculated. | [default to OffsetDateTime]
**code** | **String** | The code of the fee for which the accrual has been calculated. | [default to String]
**name** | **String** | The name of the fee for which the accrual has been calculated. | [default to String]
**calculationBase** | **java.math.BigDecimal** | The result of the evaluating the fee&#39;s calculation base expression. | [optional] [default to java.math.BigDecimal]
**amount** | **java.math.BigDecimal** | The result of applying the fee to the calculation base, and scaled down to a day. | [optional] [default to java.math.BigDecimal]
**previousAccrual** | **java.math.BigDecimal** | The previous valuation point&#39;s total accrual. | [optional] [default to java.math.BigDecimal]
**previousTotalAccrual** | **java.math.BigDecimal** | The previous valuation point&#39;s total accrual. | [optional] [default to java.math.BigDecimal]
**totalAccrual** | **java.math.BigDecimal** | The sum of the PreviousAccrual and Amount. | [optional] [default to java.math.BigDecimal]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.FeeAccrual;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime effectiveAt = OffsetDateTime.now();
String code = "example code";
String name = "example name";
java.math.BigDecimal calculationBase = new java.math.BigDecimal("100.00");
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
java.math.BigDecimal previousAccrual = new java.math.BigDecimal("100.00");
java.math.BigDecimal previousTotalAccrual = new java.math.BigDecimal("100.00");
java.math.BigDecimal totalAccrual = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<Link> links = new List<Link>();


FeeAccrual feeAccrualInstance = new FeeAccrual()
    .effectiveAt(effectiveAt)
    .code(code)
    .name(name)
    .calculationBase(calculationBase)
    .amount(amount)
    .previousAccrual(previousAccrual)
    .previousTotalAccrual(previousTotalAccrual)
    .totalAccrual(totalAccrual)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)