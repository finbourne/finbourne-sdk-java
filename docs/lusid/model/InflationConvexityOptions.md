# com.finbourne.sdk.services.lusid.model.InflationConvexityOptions
classname InflationConvexityOptions
Parameters of the Jarrow-Yildirim convexity correction applied to projected inflation index  values. Unlike most option blocks there is no defaulting here: nothing in the pricing chain  infers an index volatility, a nominal volatility or a correlation from market data, so an armed  correction is entirely the caller's stated view and every member must be supplied.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nominalIndexCorrelation** | **java.math.BigDecimal** | Correlation between the inflation index and the nominal short rate, in [-1, 1]. A positive  correlation makes the factor greater than one for a projection funded later than the curve&#39;s  own observation basis. | [optional] [default to java.math.BigDecimal]
**indexVolatility** | **java.math.BigDecimal** | Lognormal volatility of the inflation index, as a decimal (0.0095 is 0.95%). Must be  strictly positive - a zero volatility disarms the correction arithmetically, which is what  omitting the whole block already expresses. | [optional] [default to java.math.BigDecimal]
**nominalVolatility** | **java.math.BigDecimal** | Volatility of the nominal short rate in the Hull-White dynamics the correction assumes, as a  decimal (0.008 is 80bp). Must be strictly positive. | [optional] [default to java.math.BigDecimal]
**nominalMeanReversion** | **java.math.BigDecimal** | Mean reversion speed of the nominal short rate, per year. Must be strictly positive: the  closed form divides by it. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.InflationConvexityOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable java.math.BigDecimal nominalIndexCorrelation = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal indexVolatility = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal nominalVolatility = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal nominalMeanReversion = new java.math.BigDecimal("100.00");


InflationConvexityOptions inflationConvexityOptionsInstance = new InflationConvexityOptions()
    .nominalIndexCorrelation(nominalIndexCorrelation)
    .indexVolatility(indexVolatility)
    .nominalVolatility(nominalVolatility)
    .nominalMeanReversion(nominalMeanReversion);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)