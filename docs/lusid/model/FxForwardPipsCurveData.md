# com.finbourne.sdk.services.lusid.model.FxForwardPipsCurveData
classname FxForwardPipsCurveData
Contains data (i.e. dates and pips + metadata) for building fx forward curves (when combined with a spot rate to build on)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataType** | **String** | Available values: DiscountFactorCurveData, EquityVolSurfaceData, FxVolSurfaceData, IrVolCubeData, OpaqueMarketData, YieldCurveData, FxForwardCurveData, FxForwardPipsCurveData, FxForwardTenorCurveData, FxForwardTenorPipsCurveData, FxForwardCurveByQuoteReference, CreditSpreadCurveData, EquityCurveByPricesData, ConstantVolatilitySurface. | [default to String]
**baseDate** | [**OffsetDateTime**](OffsetDateTime.md) | EffectiveAt date of the quoted pip rates | [default to OffsetDateTime]
**domCcy** | **String** | Domestic currency of the fx forward | [default to String]
**fgnCcy** | **String** | Foreign currency of the fx forward | [default to String]
**dates** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md) | Dates for which the forward rates apply | [default to List<OffsetDateTime>]
**pipRates** | **List&lt;java.math.BigDecimal&gt;** | Rates provided for the fx forward (price in FgnCcy per unit of DomCcy), expressed in pips | [default to List<java.math.BigDecimal>]
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**marketDataOptions** | [**MarketDataOptions**](MarketDataOptions.md) |  | [optional] [default to MarketDataOptions]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.sdk.services.lusid.model.FxForwardPipsCurveData;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime baseDate = OffsetDateTime.now();
String domCcy = "example domCcy";
String fgnCcy = "example fgnCcy";
List<OffsetDateTime> dates = new List<OffsetDateTime>();
List<java.math.BigDecimal> pipRates = new List<java.math.BigDecimal>();
@javax.annotation.Nullable String lineage = "example lineage";
MarketDataOptions marketDataOptions = new MarketDataOptions();
Version version = new Version();


FxForwardPipsCurveData fxForwardPipsCurveDataInstance = new FxForwardPipsCurveData()
    .baseDate(baseDate)
    .domCcy(domCcy)
    .fgnCcy(fgnCcy)
    .dates(dates)
    .pipRates(pipRates)
    .lineage(lineage)
    .marketDataOptions(marketDataOptions)
    .version(version);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)