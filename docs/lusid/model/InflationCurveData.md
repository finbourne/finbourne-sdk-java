# com.finbourne.sdk.services.lusid.model.InflationCurveData
classname InflationCurveData
Market data for an inflation curve, represented by a list of zero-coupon inflation swap  instruments and corresponding market quotes.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataType** | **String** | Available values: DiscountFactorCurveData, EquityVolSurfaceData, FxVolSurfaceData, IrVolCubeData, OpaqueMarketData, YieldCurveData, FxForwardCurveData, FxForwardPipsCurveData, FxForwardTenorCurveData, FxForwardTenorPipsCurveData, FxForwardCurveByQuoteReference, CreditSpreadCurveData, EquityCurveByPricesData, ConstantVolatilitySurface, InflationCurveData. | [default to String]
**buildDate** | [**OffsetDateTime**](OffsetDateTime.md) | Build date of the curve - this is the reference date for resolution of the swap constituents. | [default to OffsetDateTime]
**instruments** | [**List&lt;LusidInstrument&gt;**](LusidInstrument.md) | The set of instruments that define the curve.  The only supported instrument type is: [InflationSwap]. | [default to List<LusidInstrument>]
**quotes** | [**List&lt;MarketQuote&gt;**](MarketQuote.md) | The market quotes corresponding to the the instruments used to define the curve | [default to List<MarketQuote>]
**seasonalFactors** | **List&lt;java.math.BigDecimal&gt;** | Optional multiplicative seasonal adjustment factors, one per calendar month starting from January.  If provided there must be exactly 12 factors. | [optional] [default to List<java.math.BigDecimal>]
**outputType** | **String** | What the values of the built curve represent.  Supported string (enumeration) values are: [Level, Ratio].  Defaults to \&quot;Level\&quot; if not provided. | [optional] [default to String]
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**marketDataOptions** | [**MarketDataOptions**](MarketDataOptions.md) |  | [optional] [default to MarketDataOptions]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.sdk.services.lusid.model.InflationCurveData;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime buildDate = OffsetDateTime.now();
List<LusidInstrument> instruments = new List<LusidInstrument>();
List<MarketQuote> quotes = new List<MarketQuote>();
@javax.annotation.Nullable List<java.math.BigDecimal> seasonalFactors = new List<java.math.BigDecimal>();
@javax.annotation.Nullable String outputType = "example outputType";
@javax.annotation.Nullable String lineage = "example lineage";
MarketDataOptions marketDataOptions = new MarketDataOptions();
Version version = new Version();


InflationCurveData inflationCurveDataInstance = new InflationCurveData()
    .buildDate(buildDate)
    .instruments(instruments)
    .quotes(quotes)
    .seasonalFactors(seasonalFactors)
    .outputType(outputType)
    .lineage(lineage)
    .marketDataOptions(marketDataOptions)
    .version(version);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)