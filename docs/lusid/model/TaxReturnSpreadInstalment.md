# com.finbourne.sdk.services.lusid.model.TaxReturnSpreadInstalment
classname TaxReturnSpreadInstalment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourcePeriodId** | **String** | The label of the period whose deemed disposal is being spread. | [optional] [default to String]
**periodId** | **String** | The label of the period the amount falls into. | [optional] [default to String]
**fraction** | **java.math.BigDecimal** | The fraction of the source period&#39;s spread amount that falls into the period. | [optional] [default to java.math.BigDecimal]
**amount** | **java.math.BigDecimal** | The amount, in pounds. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.TaxReturnSpreadInstalment;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String sourcePeriodId = "example sourcePeriodId";
@javax.annotation.Nullable String periodId = "example periodId";
java.math.BigDecimal fraction = new java.math.BigDecimal("100.00");
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");


TaxReturnSpreadInstalment taxReturnSpreadInstalmentInstance = new TaxReturnSpreadInstalment()
    .sourcePeriodId(sourcePeriodId)
    .periodId(periodId)
    .fraction(fraction)
    .amount(amount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)