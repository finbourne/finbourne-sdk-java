# com.finbourne.sdk.services.lusid.model.RateBreakdownComponent
classname RateBreakdownComponent
A tax-characterised payout line within a CashElection on a CashDividendEvent.  Each line carries a rate-type classifier and a per-unit amount in the parent election's currency.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rateType** | **String** | Free-string distribution rate-type code (e.g. UNFR, FLFR, PID). | [default to String]
**dividendRate** | **java.math.BigDecimal** | Per-unit amount for this line, in the parent election&#39;s dividend currency. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.RateBreakdownComponent;
import java.util.*;
import java.lang.System;
import java.net.URI;

String rateType = "example rateType";
java.math.BigDecimal dividendRate = new java.math.BigDecimal("100.00");


RateBreakdownComponent rateBreakdownComponentInstance = new RateBreakdownComponent()
    .rateType(rateType)
    .dividendRate(dividendRate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)