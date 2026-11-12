# com.finbourne.sdk.services.lusid.model.BondDefaultSuppressionDetails
classname BondDefaultSuppressionDetails
Which parts of the instrument the default suspends, and by what fraction: 0.0 is fully suppressed and 1.0  unaffected, applying from the default's effective date onwards. An empty block suppresses nothing - every  unset field means 1.0. Omitting the block entirely is different: that cancels coupons and principal  outright from the default onwards, while interest keeps accruing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accrualPercentage** | **java.math.BigDecimal** | Fraction of interest accruing from the default&#39;s effective date onwards, between 0.0 and 1.0. Interest  accrued before that date is unaffected, and a later default restates the fraction from its own date.  Accrued interest supplied through a results store is returned unchanged. Optional, defaulting to 1.0. | [optional] [default to java.math.BigDecimal]
**couponPercentage** | **java.math.BigDecimal** | Fraction of each coupon from the default onwards that is still paid, between 0.0 and 1.0. Optional,  defaulting to 1.0. | [optional] [default to java.math.BigDecimal]
**principalPercentage** | **java.math.BigDecimal** | Fraction of each principal repayment from the default onwards still paid, between 0.0 and 1.0.  Optional, defaulting to 1.0. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.BondDefaultSuppressionDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable java.math.BigDecimal accrualPercentage = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal couponPercentage = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal principalPercentage = new java.math.BigDecimal("100.00");


BondDefaultSuppressionDetails bondDefaultSuppressionDetailsInstance = new BondDefaultSuppressionDetails()
    .accrualPercentage(accrualPercentage)
    .couponPercentage(couponPercentage)
    .principalPercentage(principalPercentage);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)