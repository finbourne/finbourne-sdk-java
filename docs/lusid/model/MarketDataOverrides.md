# com.finbourne.sdk.services.lusid.model.MarketDataOverrides
classname MarketDataOverrides
Class which holds market data overrides to be used in valuation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complexMarketData** | [**List&lt;EconomicDependencyWithComplexMarketData&gt;**](EconomicDependencyWithComplexMarketData.md) | A list of EconomicDependency paired with quote data satisfying that economic dependency | [optional] [default to List<EconomicDependencyWithComplexMarketData>]
**quotes** | [**List&lt;EconomicDependencyWithQuote&gt;**](EconomicDependencyWithQuote.md) | A list of EconomicDependency paired with a ComplexMarketData satisfying that economic dependency | [optional] [default to List<EconomicDependencyWithQuote>]

```java
import com.finbourne.sdk.services.lusid.model.MarketDataOverrides;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<EconomicDependencyWithComplexMarketData> complexMarketData = new List<EconomicDependencyWithComplexMarketData>();
@javax.annotation.Nullable List<EconomicDependencyWithQuote> quotes = new List<EconomicDependencyWithQuote>();


MarketDataOverrides marketDataOverridesInstance = new MarketDataOverrides()
    .complexMarketData(complexMarketData)
    .quotes(quotes);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)