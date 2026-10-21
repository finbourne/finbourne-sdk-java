# com.finbourne.sdk.services.lusid.model.WithholdingTaxRateTiers
classname WithholdingTaxRateTiers

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countryRate** | **java.math.BigDecimal** | The statutory rate of the matched row, before relief. | [default to java.math.BigDecimal]
**treatyRate** | **java.math.BigDecimal** | The treaty rate of the matched row. Null when the tier does not apply. | [optional] [default to java.math.BigDecimal]
**betterRate** | **java.math.BigDecimal** | The better rate of the matched row. Null when the tier does not apply. | [optional] [default to java.math.BigDecimal]
**enhancedRate** | **java.math.BigDecimal** | The enhanced rate of the matched row. Null when the tier does not apply. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.WithholdingTaxRateTiers;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal countryRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal treatyRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal betterRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal enhancedRate = new java.math.BigDecimal("100.00");


WithholdingTaxRateTiers withholdingTaxRateTiersInstance = new WithholdingTaxRateTiers()
    .countryRate(countryRate)
    .treatyRate(treatyRate)
    .betterRate(betterRate)
    .enhancedRate(enhancedRate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)