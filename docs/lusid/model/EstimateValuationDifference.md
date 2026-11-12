# com.finbourne.sdk.services.lusid.model.EstimateValuationDifference
classname EstimateValuationDifference
How far apart the estimate-price and last-official-price valuations of the net dealing flow are.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **java.math.BigDecimal** | The estimate-price net cashflow less the last-official-price net cashflow, in the fund currency. Negative when the last official price values the net flow higher. | [default to java.math.BigDecimal]
**pctOfNav** | **java.math.BigDecimal** | The amount as a percentage of the fund&#39;s NAV at the previous valuation point. Absent when there is no previous NAV. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.EstimateValuationDifference;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal pctOfNav = new java.math.BigDecimal("100.00");


EstimateValuationDifference estimateValuationDifferenceInstance = new EstimateValuationDifference()
    .amount(amount)
    .pctOfNav(pctOfNav);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)