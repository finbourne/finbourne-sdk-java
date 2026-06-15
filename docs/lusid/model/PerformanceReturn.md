# com.finbourne.sdk.services.lusid.model.PerformanceReturn
classname PerformanceReturn
A list of Returns.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveAt for the return. | [default to OffsetDateTime]
**rateOfReturn** | **java.math.BigDecimal** | The return number. | [default to java.math.BigDecimal]
**openingMarketValue** | **java.math.BigDecimal** | The opening market value. | [optional] [default to java.math.BigDecimal]
**closingMarketValue** | **java.math.BigDecimal** | The closing market value. | [optional] [default to java.math.BigDecimal]
**period** | **String** | Upsert the returns on a Daily or Monthly period. Defaults to Daily. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PerformanceReturn;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime effectiveAt = OffsetDateTime.now();
java.math.BigDecimal rateOfReturn = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal openingMarketValue = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal closingMarketValue = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String period = "example period";


PerformanceReturn performanceReturnInstance = new PerformanceReturn()
    .effectiveAt(effectiveAt)
    .rateOfReturn(rateOfReturn)
    .openingMarketValue(openingMarketValue)
    .closingMarketValue(closingMarketValue)
    .period(period);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)