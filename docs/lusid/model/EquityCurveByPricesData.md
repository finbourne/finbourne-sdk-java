# com.finbourne.sdk.services.lusid.model.EquityCurveByPricesData
classname EquityCurveByPricesData
Contains data (i.e. dates and prices + metadata) for building Equity curves

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataType** | **String** | Available values: DiscountFactorCurveData, EquityVolSurfaceData, FxVolSurfaceData, IrVolCubeData, OpaqueMarketData, YieldCurveData, FxForwardCurveData, FxForwardPipsCurveData, FxForwardTenorCurveData, FxForwardTenorPipsCurveData, FxForwardCurveByQuoteReference, CreditSpreadCurveData, EquityCurveByPricesData, ConstantVolatilitySurface. | [default to String]
**baseDate** | [**OffsetDateTime**](OffsetDateTime.md) | EffectiveAt date of the provided prices | [default to OffsetDateTime]
**dates** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md) | Dates provided for the forward price of the Equity at the corresponding price in Prices.  These dates should be in the future with respect to the BaseDate. | [default to List<OffsetDateTime>]
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**prices** | **List&lt;java.math.BigDecimal&gt;** | Prices provided for the forward price of the Equity at the corresponding date in Dates. | [default to List<java.math.BigDecimal>]
**marketDataOptions** | [**MarketDataOptions**](MarketDataOptions.md) |  | [optional] [default to MarketDataOptions]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.sdk.services.lusid.model.EquityCurveByPricesData;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime baseDate = OffsetDateTime.now();
List<OffsetDateTime> dates = new List<OffsetDateTime>();
@javax.annotation.Nullable String lineage = "example lineage";
List<java.math.BigDecimal> prices = new List<java.math.BigDecimal>();
MarketDataOptions marketDataOptions = new MarketDataOptions();
Version version = new Version();


EquityCurveByPricesData equityCurveByPricesDataInstance = new EquityCurveByPricesData()
    .baseDate(baseDate)
    .dates(dates)
    .lineage(lineage)
    .prices(prices)
    .marketDataOptions(marketDataOptions)
    .version(version);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)