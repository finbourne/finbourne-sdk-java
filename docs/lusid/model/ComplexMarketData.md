# com.finbourne.sdk.services.lusid.model.ComplexMarketData
classname ComplexMarketData
Base class for representing complex market data in LUSID.  Generally speaking, market data is complex when it cannot be represented as a single quote.  Examples include discounting curves, projection curves, and volatility surfaces, which are used to compute instrument analytics.  This base class should not be directly instantiated; each supported MarketDataType has a corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataType** | **String** | Available values: DiscountFactorCurveData, EquityVolSurfaceData, FxVolSurfaceData, IrVolCubeData, OpaqueMarketData, YieldCurveData, FxForwardCurveData, FxForwardPipsCurveData, FxForwardTenorCurveData, FxForwardTenorPipsCurveData, FxForwardCurveByQuoteReference, CreditSpreadCurveData, EquityCurveByPricesData, ConstantVolatilitySurface. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ComplexMarketData;
import java.util.*;
import java.lang.System;
import java.net.URI;

String marketDataType = "example marketDataType";


ComplexMarketData complexMarketDataInstance = new ComplexMarketData()
    .marketDataType(marketDataType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)