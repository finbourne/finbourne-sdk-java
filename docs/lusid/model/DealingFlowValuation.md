# com.finbourne.sdk.services.lusid.model.DealingFlowValuation
classname DealingFlowValuation
The transfer agency's dealing flows with unit-denominated orders valued at one unit price, and the swing outcome that net flow leads the methodology to.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**netCashflow** | **java.math.BigDecimal** | The inflows less the outflows at this unit price, in the fund currency. | [default to java.math.BigDecimal]
**netCashflowPctOfNav** | **java.math.BigDecimal** | The net cashflow as a percentage of the fund&#39;s NAV at the previous valuation point. Absent when there is no previous NAV. | [optional] [default to java.math.BigDecimal]
**grossInflow** | **java.math.BigDecimal** | The sum of the inflows at this unit price, in the fund currency. Zero or more. | [default to java.math.BigDecimal]
**grossOutflow** | **java.math.BigDecimal** | The sum of the outflows at this unit price, in the fund currency, as a magnitude. Zero or more. | [default to java.math.BigDecimal]
**outcome** | [**EstimateValuationOutcome**](EstimateValuationOutcome.md) |  | [optional] [default to EstimateValuationOutcome]

```java
import com.finbourne.sdk.services.lusid.model.DealingFlowValuation;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal netCashflow = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal netCashflowPctOfNav = new java.math.BigDecimal("100.00");
java.math.BigDecimal grossInflow = new java.math.BigDecimal("100.00");
java.math.BigDecimal grossOutflow = new java.math.BigDecimal("100.00");
EstimateValuationOutcome outcome = new EstimateValuationOutcome();


DealingFlowValuation dealingFlowValuationInstance = new DealingFlowValuation()
    .netCashflow(netCashflow)
    .netCashflowPctOfNav(netCashflowPctOfNav)
    .grossInflow(grossInflow)
    .grossOutflow(grossOutflow)
    .outcome(outcome);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)