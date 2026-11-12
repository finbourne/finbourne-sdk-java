# com.finbourne.sdk.services.lusid.model.CollateralOptimisationTerms
classname CollateralOptimisationTerms
When a cheaper arrangement for the agreement's trades is worth recommending.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**novationCost** | **java.math.BigDecimal** | The one-off cost of novating trades away from the counterparty, in the agreement&#39;s base currency. At least 0. | [default to java.math.BigDecimal]
**minSavingPerDay** | **java.math.BigDecimal** | A change saving no more than this a day is not recommended. At least 0. | [default to java.math.BigDecimal]
**maxPaybackDays** | **Integer** | A change whose one-off cost takes longer than this many days to earn back is not recommended. At least 0. | [default to Integer]
**maxPerAgreement** | **Integer** | The most recommendations kept for the agreement, best first. Zero means no cap. At least 0. | [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.CollateralOptimisationTerms;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal novationCost = new java.math.BigDecimal("100.00");
java.math.BigDecimal minSavingPerDay = new java.math.BigDecimal("100.00");
Integer maxPaybackDays = new Integer("100.00");
Integer maxPerAgreement = new Integer("100.00");


CollateralOptimisationTerms collateralOptimisationTermsInstance = new CollateralOptimisationTerms()
    .novationCost(novationCost)
    .minSavingPerDay(minSavingPerDay)
    .maxPaybackDays(maxPaybackDays)
    .maxPerAgreement(maxPerAgreement);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)