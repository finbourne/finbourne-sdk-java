# com.finbourne.sdk.services.lusid.model.EconomicDependencyWithQuote
classname EconomicDependencyWithQuote
Container class pairing economic dependencies and quote data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**economicDependency** | [**EconomicDependency**](EconomicDependency.md) |  | [default to EconomicDependency]
**metricValue** | [**MetricValue**](MetricValue.md) |  | [default to MetricValue]
**scaleFactor** | **java.math.BigDecimal** | Scale factor for the quote - this can be null, in which case we default to 1. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.EconomicDependencyWithQuote;
import java.util.*;
import java.lang.System;
import java.net.URI;

EconomicDependency economicDependency = new EconomicDependency();
MetricValue metricValue = new MetricValue();
@javax.annotation.Nullable java.math.BigDecimal scaleFactor = new java.math.BigDecimal("100.00");


EconomicDependencyWithQuote economicDependencyWithQuoteInstance = new EconomicDependencyWithQuote()
    .economicDependency(economicDependency)
    .metricValue(metricValue)
    .scaleFactor(scaleFactor);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)