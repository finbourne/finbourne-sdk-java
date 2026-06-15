# com.finbourne.sdk.services.lusid.model.PerformanceReturnsMetric
classname PerformanceReturnsMetric
The request used in the AggregatedReturns.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of the metric. Default value: Return. Available values: Return, Volatility, IndicativeAmount, Dispersion. | [optional] [default to String]
**window** | **String** | The given metric for the calculation i.e. 1Y, 1D. | [optional] [default to String]
**allowPartial** | **Boolean** | Bool if the metric is allowed partial results. Default to false. | [optional] [default to Boolean]
**annualised** | **Boolean** | Bool if the metric is annualized. Default to false. | [optional] [default to Boolean]
**withFee** | **Boolean** | Bool if the metric should consider the fees when is calculated. Default to false. | [optional] [default to Boolean]
**seedAmount** | **String** | The given seed amount for the calculation of the indicative amount metrics. | [optional] [default to String]
**alias** | **String** | The alias for the metric. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PerformanceReturnsMetric;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String window = "example window";
Boolean allowPartial = true;
Boolean annualised = true;
Boolean withFee = true;
@javax.annotation.Nullable String seedAmount = "example seedAmount";
@javax.annotation.Nullable String alias = "example alias";


PerformanceReturnsMetric performanceReturnsMetricInstance = new PerformanceReturnsMetric()
    .type(type)
    .window(window)
    .allowPartial(allowPartial)
    .annualised(annualised)
    .withFee(withFee)
    .seedAmount(seedAmount)
    .alias(alias);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)