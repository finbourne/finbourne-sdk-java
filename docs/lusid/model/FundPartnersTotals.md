# com.finbourne.sdk.services.lusid.model.FundPartnersTotals
classname FundPartnersTotals
Totals across every register line of the fund, independent of paging.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**committed** | **java.math.BigDecimal** | The total committed capital across all partners. | [default to java.math.BigDecimal]
**partnerCount** | **Integer** | The number of partners (register lines) in the fund. | [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.FundPartnersTotals;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal committed = new java.math.BigDecimal("100.00");
Integer partnerCount = new Integer("100.00");


FundPartnersTotals fundPartnersTotalsInstance = new FundPartnersTotals()
    .committed(committed)
    .partnerCount(partnerCount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)