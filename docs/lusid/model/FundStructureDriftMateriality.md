# com.finbourne.sdk.services.lusid.model.FundStructureDriftMateriality
classname FundStructureDriftMateriality
How much ownership drift a Fund Structure member tolerates on the members it holds through an instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**warnAmount** | **java.math.BigDecimal** | The misallocated P&amp;L, in base currency, above which the valuation point carries a warning naming the holder, the held member and both shares. Optional; unset means never warn. | [optional] [default to java.math.BigDecimal]
**refuseAmount** | **java.math.BigDecimal** | The misallocated P&amp;L, in base currency, above which the P&amp;L flow is refused until the sharing percentage is corrected. Must not be less than the warning amount. Optional; unset means never refuse. A share bought from another investor at a premium or a discount shows as drift however correct the sharing percentage. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.FundStructureDriftMateriality;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable java.math.BigDecimal warnAmount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal refuseAmount = new java.math.BigDecimal("100.00");


FundStructureDriftMateriality fundStructureDriftMaterialityInstance = new FundStructureDriftMateriality()
    .warnAmount(warnAmount)
    .refuseAmount(refuseAmount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)