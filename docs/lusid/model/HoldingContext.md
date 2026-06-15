# com.finbourne.sdk.services.lusid.model.HoldingContext
classname HoldingContext
Holding context node.  Contains settings that control how LUSID handles holdings within portfolios.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taxLotLevelHoldings** | **Boolean** | Whether or not to expand the holdings to return the underlying tax-lots. Defaults to True. | [optional] [default to Boolean]
**aggregateCashCommitments** | **Boolean** | When true, cash commitment holdings sharing a SubHoldingKey are folded into a single aggregated  row per portfolio, mirroring how cash balances are already aggregated. Defaults to false to  preserve existing behaviour. Ignored when TaxLotLevelHoldings is true — tax-lot granularity  takes precedence. Aggregation is per-portfolio: cross-portfolio rows in portfolio-group / fund  responses stay separate, matching the behaviour of positions and cash balances. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.HoldingContext;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean taxLotLevelHoldings = true;
Boolean aggregateCashCommitments = true;


HoldingContext holdingContextInstance = new HoldingContext()
    .taxLotLevelHoldings(taxLotLevelHoldings)
    .aggregateCashCommitments(aggregateCashCommitments);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)