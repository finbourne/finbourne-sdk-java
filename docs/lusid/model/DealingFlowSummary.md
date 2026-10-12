# com.finbourne.sdk.services.lusid.model.DealingFlowSummary
classname DealingFlowSummary
The transfer agency estimates a swing decision was made on: how many orders were dealt at the valuation point and what they summed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **Integer** | How many orders were summed. | [default to Integer]
**grossInflow** | **java.math.BigDecimal** | The sum of the inflows, in the fund currency. Zero or more. | [default to java.math.BigDecimal]
**grossOutflow** | **java.math.BigDecimal** | The sum of the outflows, in the fund currency, as a magnitude. Zero or more. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.DealingFlowSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer count = new Integer("100.00");
java.math.BigDecimal grossInflow = new java.math.BigDecimal("100.00");
java.math.BigDecimal grossOutflow = new java.math.BigDecimal("100.00");


DealingFlowSummary dealingFlowSummaryInstance = new DealingFlowSummary()
    .count(count)
    .grossInflow(grossInflow)
    .grossOutflow(grossOutflow);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)