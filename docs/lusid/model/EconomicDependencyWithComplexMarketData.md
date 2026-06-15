# com.finbourne.sdk.services.lusid.model.EconomicDependencyWithComplexMarketData
classname EconomicDependencyWithComplexMarketData
Container class pairing economic dependency and complex market data (i.e. discounting curves, etc.)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**economicDependency** | [**EconomicDependency**](EconomicDependency.md) |  | [default to EconomicDependency]
**complexMarketData** | [**ComplexMarketData**](ComplexMarketData.md) |  | [default to ComplexMarketData]

```java
import com.finbourne.sdk.services.lusid.model.EconomicDependencyWithComplexMarketData;
import java.util.*;
import java.lang.System;
import java.net.URI;

EconomicDependency economicDependency = new EconomicDependency();
ComplexMarketData complexMarketData = new ComplexMarketData();


EconomicDependencyWithComplexMarketData economicDependencyWithComplexMarketDataInstance = new EconomicDependencyWithComplexMarketData()
    .economicDependency(economicDependency)
    .complexMarketData(complexMarketData);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)