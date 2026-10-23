# com.finbourne.sdk.services.lusid.model.FundPartnersTotals
classname FundPartnersTotals
Totals across every register line of the fund, independent of paging. Commitments are totalled per commitment  currency; amounts in different currencies are never added together.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**committedByCurrency** | **Map&lt;String, java.math.BigDecimal&gt;** | The total committed capital across all partners, per commitment currency, keyed by currency code. Commitments in different currencies are not added together. | [default to Map<String, java.math.BigDecimal>]
**partnerCount** | **Integer** | The number of partners (register lines) in the fund. | [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.FundPartnersTotals;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, java.math.BigDecimal> committedByCurrency = new Map<String, java.math.BigDecimal>();
Integer partnerCount = new Integer("100.00");


FundPartnersTotals fundPartnersTotalsInstance = new FundPartnersTotals()
    .committedByCurrency(committedByCurrency)
    .partnerCount(partnerCount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)