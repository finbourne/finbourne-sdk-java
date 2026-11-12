# com.finbourne.sdk.services.lusid.model.CollateralFundingTerms
classname CollateralFundingTerms
What margin posted under the agreement costs us: the annual rate it is funded at, the basis it accrues on and the  lending fee assumed forgone on a security with no fee quote of its own when collateral is ranked.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rate** | **java.math.BigDecimal** | The annual rate posted margin is funded at, as a fraction, for example 0.053 for 5.3%. Between -1 and 1. | [default to java.math.BigDecimal]
**dayCountBasis** | **Integer** | The number of days in the year the funding rate accrues over. Either 360 or 365. | [default to Integer]
**defaultLendingFee** | **java.math.BigDecimal** | The annual lending fee, as a fraction, assumed forgone on a security with no fee quote of its own when collateral is ranked. Between 0 and 1. A security with no fee at all cannot be ranked. Optional. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.CollateralFundingTerms;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal rate = new java.math.BigDecimal("100.00");
Integer dayCountBasis = new Integer("100.00");
@javax.annotation.Nullable java.math.BigDecimal defaultLendingFee = new java.math.BigDecimal("100.00");


CollateralFundingTerms collateralFundingTermsInstance = new CollateralFundingTerms()
    .rate(rate)
    .dayCountBasis(dayCountBasis)
    .defaultLendingFee(defaultLendingFee);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)