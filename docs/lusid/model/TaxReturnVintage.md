# com.finbourne.sdk.services.lusid.model.TaxReturnVintage
classname TaxReturnVintage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodId** | **String** | The label of the period the amount falls into. | [optional] [default to String]
**start** | [**OffsetDateTime**](OffsetDateTime.md) | The first day of the period, inclusive. | [optional] [default to OffsetDateTime]
**end** | [**OffsetDateTime**](OffsetDateTime.md) | The last day of the period, inclusive. | [optional] [default to OffsetDateTime]
**deemedGains** | **java.math.BigDecimal** | The deemed gains arising at the end of the period. | [optional] [default to java.math.BigDecimal]
**deemedLosses** | **java.math.BigDecimal** | The deemed losses arising at the end of the period. | [optional] [default to java.math.BigDecimal]
**netAmount** | **java.math.BigDecimal** | The net deemed amount, gains less losses. | [optional] [default to java.math.BigDecimal]
**carryBackReduction** | **java.math.BigDecimal** | The reduction to the net amount from losses carried back from later periods. | [optional] [default to java.math.BigDecimal]
**spreadAmount** | **java.math.BigDecimal** | The net amount after carry-back that is spread over seven periods. | [optional] [default to java.math.BigDecimal]
**outstanding** | **java.math.BigDecimal** | The amount of the spread that has not yet been brought into charge. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.TaxReturnVintage;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String periodId = "example periodId";
OffsetDateTime start = OffsetDateTime.now();
OffsetDateTime end = OffsetDateTime.now();
java.math.BigDecimal deemedGains = new java.math.BigDecimal("100.00");
java.math.BigDecimal deemedLosses = new java.math.BigDecimal("100.00");
java.math.BigDecimal netAmount = new java.math.BigDecimal("100.00");
java.math.BigDecimal carryBackReduction = new java.math.BigDecimal("100.00");
java.math.BigDecimal spreadAmount = new java.math.BigDecimal("100.00");
java.math.BigDecimal outstanding = new java.math.BigDecimal("100.00");


TaxReturnVintage taxReturnVintageInstance = new TaxReturnVintage()
    .periodId(periodId)
    .start(start)
    .end(end)
    .deemedGains(deemedGains)
    .deemedLosses(deemedLosses)
    .netAmount(netAmount)
    .carryBackReduction(carryBackReduction)
    .spreadAmount(spreadAmount)
    .outstanding(outstanding);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)