# com.finbourne.sdk.services.lusid.model.FundPnlBreakdown
classname FundPnlBreakdown
The breakdown of PnL for a Fund on a specified date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nonClassSpecificPnl** | [**Map&lt;String, FundAmount&gt;**](FundAmount.md) | Bucket of detail for PnL within the queried period that is not specific to any share class. | [default to Map<String, FundAmount>]
**aggregatedClassPnl** | [**Map&lt;String, FundAmount&gt;**](FundAmount.md) | Bucket of detail for the sum of class PnL across all share classes in a fund and within the queried period. | [default to Map<String, FundAmount>]
**aggregatedGroupPnl** | [**Map&lt;String, FundAmount&gt;**](FundAmount.md) | Bucket of detail for the sum, across all share classes, of PnL allocated to allocation groups and apportioned to their member share classes, within the queried period. | [default to Map<String, FundAmount>]
**totalPnl** | [**Map&lt;String, FundAmount&gt;**](FundAmount.md) | Bucket of detail for the total PnL within the queried period: the sum of the class-specific, apportioned non-class-specific and allocation-group-apportioned PnL. | [default to Map<String, FundAmount>]

```java
import com.finbourne.sdk.services.lusid.model.FundPnlBreakdown;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, FundAmount> nonClassSpecificPnl = new Map<String, FundAmount>();
Map<String, FundAmount> aggregatedClassPnl = new Map<String, FundAmount>();
Map<String, FundAmount> aggregatedGroupPnl = new Map<String, FundAmount>();
Map<String, FundAmount> totalPnl = new Map<String, FundAmount>();


FundPnlBreakdown fundPnlBreakdownInstance = new FundPnlBreakdown()
    .nonClassSpecificPnl(nonClassSpecificPnl)
    .aggregatedClassPnl(aggregatedClassPnl)
    .aggregatedGroupPnl(aggregatedGroupPnl)
    .totalPnl(totalPnl);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)