# com.finbourne.sdk.services.lusid.model.MarketDataOptions
classname MarketDataOptions
Base class for representing market data options in LUSID.  Abstractly, these are any options that one should be able to specify for ComplexMarketData entities.  For example, CurveOptions allows one to decide how the data provided in a discountFactorCurve is interpolated.  This base class should not be directly instantiated;  each supported MarketDataOptionsType has a corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataOptionsType** | **String** | Available values: CurveOptions. Available values: CurveOptions. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.MarketDataOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

String marketDataOptionsType = "example marketDataOptionsType";


MarketDataOptions marketDataOptionsInstance = new MarketDataOptions()
    .marketDataOptionsType(marketDataOptionsType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)