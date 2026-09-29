# com.finbourne.sdk.services.lusid.model.FxForwardTenorPipsCurveData
classname FxForwardTenorPipsCurveData
Contains data (i.e. tenors and pips + metadata) for building fx forward curves (when combined with a spot rate and a date to build on)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataType** | **String** | Available values: DiscountFactorCurveData, EquityVolSurfaceData, FxVolSurfaceData, IrVolCubeData, OpaqueMarketData, YieldCurveData, FxForwardCurveData, FxForwardPipsCurveData, FxForwardTenorCurveData, FxForwardTenorPipsCurveData, FxForwardCurveByQuoteReference, CreditSpreadCurveData, EquityCurveByPricesData, ConstantVolatilitySurface, InflationCurveData. | [default to String]
**baseDate** | [**OffsetDateTime**](OffsetDateTime.md) | EffectiveAt date of the quoted pip rates | [default to OffsetDateTime]
**domCcy** | **String** | Domestic currency of the fx forward | [default to String]
**fgnCcy** | **String** | Foreign currency of the fx forward | [default to String]
**tenors** | **List&lt;String&gt;** | Tenors for which the forward rates apply.  For more information on tenors, see [Specifying tenors in LUSID](https://support.lusid.com/docs/specifying-tenors-in-lusid) | [default to List<String>]
**pipRates** | **List&lt;java.math.BigDecimal&gt;** | Rates provided for the fx forward (price in FgnCcy per unit of DomCcy), expressed in pips | [default to List<java.math.BigDecimal>]
**pipMultiplier** | **java.math.BigDecimal** | Optional. The scaling factor applied to the pip rates to convert them into a forward rate adjustment,  so that forwardRate &#x3D; spotRate + pipRate * pipMultiplier. Must be strictly positive when supplied.  When omitted, the market convention for the currency pair is used:  0.01 when the foreign (quote) currency is JPY, and 0.0001 (the four-decimal-place convention of the major pairs) otherwise. | [optional] [default to java.math.BigDecimal]
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
@javax.annotation.Nullable java.math.BigDecimal pipMultiplier = new java.math.BigDecimal("100.00");
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
    .pipMultiplier(pipMultiplier)
    .lineage(lineage)
    .marketDataOptions(marketDataOptions)
    .calendars(calendars)
    .spotDaysCalculationType(spotDaysCalculationType)
    .version(version);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)