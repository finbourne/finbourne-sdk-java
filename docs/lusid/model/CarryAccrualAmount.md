# com.finbourne.sdk.services.lusid.model.CarryAccrualAmount
classname CarryAccrualAmount
A partner's carry to date as produced by the waterfall.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the amount belongs to. | [default to String]
**carryToDate** | **java.math.BigDecimal** | The cumulative carry the partner has earned to the period end. | [default to java.math.BigDecimal]
**byTier** | [**List&lt;CarryTierAmount&gt;**](CarryTierAmount.md) | The carry by waterfall tier. | [optional] [default to List<CarryTierAmount>]
**clawbackExposure** | **java.math.BigDecimal** | The carry that would have to be returned if the fund liquidated at the period end. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.CarryAccrualAmount;
import java.util.*;
import java.lang.System;
import java.net.URI;

String investorRecordId = "example investorRecordId";
java.math.BigDecimal carryToDate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<CarryTierAmount> byTier = new List<CarryTierAmount>();
java.math.BigDecimal clawbackExposure = new java.math.BigDecimal("100.00");


CarryAccrualAmount carryAccrualAmountInstance = new CarryAccrualAmount()
    .investorRecordId(investorRecordId)
    .carryToDate(carryToDate)
    .byTier(byTier)
    .clawbackExposure(clawbackExposure);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)