# com.finbourne.sdk.services.lusid.model.MarketDataType
classname MarketDataType
The format of the complex market data stored. Complex market data is used to store any  data which requires more context than just a simple single point as is the case with a  quote.  Examples of such complex market data are Discount Curve and Volatility Surfaces.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MarketDataType** | [**String**](.md) | **The format of the complex market data stored. Complex market data is used to store any  data which requires more context than just a simple single point as is the case with a  quote.  Examples of such complex market data are Discount Curve and Volatility Surfaces.** | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.MarketDataType;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of MarketDataType:
MarketDataType method = MarketDataType.DISCOUNT_FACTOR_CURVE_DATA;
MarketDataType method = MarketDataType.EQUITY_VOL_SURFACE_DATA;
MarketDataType method = MarketDataType.FX_VOL_SURFACE_DATA;
MarketDataType method = MarketDataType.IR_VOL_CUBE_DATA;
MarketDataType method = MarketDataType.OPAQUE_MARKET_DATA;
MarketDataType method = MarketDataType.YIELD_CURVE_DATA;
MarketDataType method = MarketDataType.FX_FORWARD_CURVE_DATA;
MarketDataType method = MarketDataType.FX_FORWARD_PIPS_CURVE_DATA;
MarketDataType method = MarketDataType.FX_FORWARD_TENOR_CURVE_DATA;
MarketDataType method = MarketDataType.FX_FORWARD_TENOR_PIPS_CURVE_DATA;
MarketDataType method = MarketDataType.FX_FORWARD_CURVE_BY_QUOTE_REFERENCE;
MarketDataType method = MarketDataType.CREDIT_SPREAD_CURVE_DATA;
MarketDataType method = MarketDataType.EQUITY_CURVE_BY_PRICES_DATA;
MarketDataType method = MarketDataType.CONSTANT_VOLATILITY_SURFACE;
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)