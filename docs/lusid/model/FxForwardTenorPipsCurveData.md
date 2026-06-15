# com.finbourne.sdk.services.lusid.model.FxForwardTenorPipsCurveData
classname FxForwardTenorPipsCurveData
Contains data (i.e. tenors and pips + metadata) for building fx forward curves (when combined with a spot rate and a date to build on)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataType** | **String** | Available values: DiscountFactorCurveData, EquityVolSurfaceData, FxVolSurfaceData, IrVolCubeData, OpaqueMarketData, YieldCurveData, FxForwardCurveData, FxForwardPipsCurveData, FxForwardTenorCurveData, FxForwardTenorPipsCurveData, FxForwardCurveByQuoteReference, CreditSpreadCurveData, EquityCurveByPricesData, ConstantVolatilitySurface. | [default to String]
**baseDate** | [**OffsetDateTime**](OffsetDateTime.md) | EffectiveAt date of the quoted pip rates | [default to OffsetDateTime]
**domCcy** | **String** | Domestic currency of the fx forward | [default to String]
**fgnCcy** | **String** | Foreign currency of the fx forward | [default to String]
**tenors** | **List&lt;String&gt;** | Tenors for which the forward rates apply.  For more information on tenors, see [knowledge base article KA-02097](https://support.lusid.com/knowledgebase/article/KA-02097) | [default to List<String>]
**pipRates** | **List&lt;java.math.BigDecimal&gt;** | Rates provided for the fx forward (price in FgnCcy per unit of DomCcy), expressed in pips | [default to List<java.math.BigDecimal>]
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**marketDataOptions** | [**MarketDataOptions**](MarketDataOptions.md) |  | [optional] [default to MarketDataOptions]
**calendars** | [**List&lt;FxTenorConvention&gt;**](FxTenorConvention.md) | The list of conventions that should be used when interpreting tenors as dates. | [optional] [default to List<FxTenorConvention>]
**spotDaysCalculationType** | **String** | Configures how to calculate the spot date from the build date using the Calendars provided. Available values: SingleCalendar, UnionCalendars. | [optional] [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.sdk.services.lusid.model.FxForwardTenorPipsCurveData;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime baseDate = OffsetDateTime.now();
String domCcy = "example domCcy";
String fgnCcy = "example fgnCcy";
List<String> tenors = new List<String>();
List<java.math.BigDecimal> pipRates = new List<java.math.BigDecimal>();
@javax.annotation.Nullable String lineage = "example lineage";
MarketDataOptions marketDataOptions = new MarketDataOptions();
@javax.annotation.Nullable List<FxTenorConvention> calendars = new List<FxTenorConvention>();
@javax.annotation.Nullable String spotDaysCalculationType = "example spotDaysCalculationType";
Version version = new Version();


FxForwardTenorPipsCurveData fxForwardTenorPipsCurveDataInstance = new FxForwardTenorPipsCurveData()
    .baseDate(baseDate)
    .domCcy(domCcy)
    .fgnCcy(fgnCcy)
    .tenors(tenors)
    .pipRates(pipRates)
    .lineage(lineage)
    .marketDataOptions(marketDataOptions)
    .calendars(calendars)
    .spotDaysCalculationType(spotDaysCalculationType)
    .version(version);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)