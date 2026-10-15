# com.finbourne.sdk.services.lusid.model.CarryTierAmount
classname CarryTierAmount
A partner's carry split by waterfall tier.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tier** | **String** | The waterfall tier. | [default to String]
**realised** | **java.math.BigDecimal** | The carry realised in the tier. | [default to java.math.BigDecimal]
**hypothetical** | **java.math.BigDecimal** | The carry the tier would pay if the fund liquidated at the period end. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.CarryTierAmount;
import java.util.*;
import java.lang.System;
import java.net.URI;

String tier = "example tier";
java.math.BigDecimal realised = new java.math.BigDecimal("100.00");
java.math.BigDecimal hypothetical = new java.math.BigDecimal("100.00");


CarryTierAmount carryTierAmountInstance = new CarryTierAmount()
    .tier(tier)
    .realised(realised)
    .hypothetical(hypothetical);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)