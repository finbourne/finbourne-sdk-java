# com.finbourne.sdk.services.lusid.model.YieldCurveData
classname YieldCurveData
Market data for a yield curve,  represented by a list of instruments and corresponding market quotes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataType** | **String** | Available values: DiscountFactorCurveData, EquityVolSurfaceData, FxVolSurfaceData, IrVolCubeData, OpaqueMarketData, YieldCurveData, FxForwardCurveData, FxForwardPipsCurveData, FxForwardTenorCurveData, FxForwardTenorPipsCurveData, FxForwardCurveByQuoteReference, CreditSpreadCurveData, EquityCurveByPricesData, ConstantVolatilitySurface, InflationCurveData. | [default to String]
**baseDate** | [**OffsetDateTime**](OffsetDateTime.md) | Base date | [default to OffsetDateTime]
**instruments** | [**List&lt;LusidInstrument&gt;**](LusidInstrument.md) | The set of instruments that define the curve. | [default to List<LusidInstrument>]
**quotes** | [**List&lt;MarketQuote&gt;**](MarketQuote.md) | The market quotes corresponding to the the instruments used to define the curve | [default to List<MarketQuote>]
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**marketDataOptions** | [**MarketDataOptions**](MarketDataOptions.md) |  | [optional] [default to MarketDataOptions]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**fundingCurveName** | **String** | Optional name of the funding curve under which the calibration instruments are discounted,  for projection curves that are bootstrapped under a separate discount curve. This is the  funding identifier of the rates dependency for the calibration instruments&#39; domestic currency,  so a value of &#39;EUROIS&#39; names the discounting dependency Rates/EUR/EUROIS. When omitted the  calibration instruments are discounted on the curve being built, which is the classic  single-curve bootstrap. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.YieldCurveData;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime baseDate = OffsetDateTime.now();
List<LusidInstrument> instruments = new List<LusidInstrument>();
List<MarketQuote> quotes = new List<MarketQuote>();
@javax.annotation.Nullable String lineage = "example lineage";
MarketDataOptions marketDataOptions = new MarketDataOptions();
Version version = new Version();
@javax.annotation.Nullable String fundingCurveName = "example fundingCurveName";


YieldCurveData yieldCurveDataInstance = new YieldCurveData()
    .baseDate(baseDate)
    .instruments(instruments)
    .quotes(quotes)
    .lineage(lineage)
    .marketDataOptions(marketDataOptions)
    .version(version)
    .fundingCurveName(fundingCurveName);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)