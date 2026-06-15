# com.finbourne.sdk.services.lusid.model.EquityVolSurfaceData
classname EquityVolSurfaceData
Market Data for an equity vol surface, represented by a list of instruments and corresponding market quotes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataType** | **String** | Available values: DiscountFactorCurveData, EquityVolSurfaceData, FxVolSurfaceData, IrVolCubeData, OpaqueMarketData, YieldCurveData, FxForwardCurveData, FxForwardPipsCurveData, FxForwardTenorCurveData, FxForwardTenorPipsCurveData, FxForwardCurveByQuoteReference, CreditSpreadCurveData, EquityCurveByPricesData, ConstantVolatilitySurface. | [default to String]
**baseDate** | [**OffsetDateTime**](OffsetDateTime.md) | Base date of the surface | [default to OffsetDateTime]
**instruments** | [**List&lt;LusidInstrument&gt;**](LusidInstrument.md) | The set of instruments that define the surface. | [default to List<LusidInstrument>]
**quotes** | [**List&lt;MarketQuote&gt;**](MarketQuote.md) | The set of market quotes that define the surface, in NormalVol or LogNormalVol terms. | [default to List<MarketQuote>]
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.sdk.services.lusid.model.EquityVolSurfaceData;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime baseDate = OffsetDateTime.now();
List<LusidInstrument> instruments = new List<LusidInstrument>();
List<MarketQuote> quotes = new List<MarketQuote>();
@javax.annotation.Nullable String lineage = "example lineage";
Version version = new Version();


EquityVolSurfaceData equityVolSurfaceDataInstance = new EquityVolSurfaceData()
    .baseDate(baseDate)
    .instruments(instruments)
    .quotes(quotes)
    .lineage(lineage)
    .version(version);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)