# com.finbourne.sdk.services.lusid.model.CashFlowHaircutTermPoint
classname CashFlowHaircutTermPoint
A point on a cashflow haircut term structure: the haircut rate applying at a given tenor from  the valuation date. Rates are linearly interpolated on time-to-payment between points and  extrapolated flat beyond either end of the term structure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenor** | **String** | The tenor from the valuation date at which the rate applies, e.g. &#39;6M&#39; or &#39;5Y&#39;. | [default to String]
**rate** | **java.math.BigDecimal** | The haircut rate applying at the tenor, as a fraction in the range [0, 1]. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.CashFlowHaircutTermPoint;
import java.util.*;
import java.lang.System;
import java.net.URI;

String tenor = "example tenor";
java.math.BigDecimal rate = new java.math.BigDecimal("100.00");


CashFlowHaircutTermPoint cashFlowHaircutTermPointInstance = new CashFlowHaircutTermPoint()
    .tenor(tenor)
    .rate(rate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)