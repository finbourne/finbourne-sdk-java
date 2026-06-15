# com.finbourne.sdk.services.lusid.model.FxForwardCurveByQuoteReference
classname FxForwardCurveByQuoteReference
Contains data (i.e. tenors and rates + metadata) for building fx forward curves (when combined with a date to build on)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataType** | **String** | Available values: DiscountFactorCurveData, EquityVolSurfaceData, FxVolSurfaceData, IrVolCubeData, OpaqueMarketData, YieldCurveData, FxForwardCurveData, FxForwardPipsCurveData, FxForwardTenorCurveData, FxForwardTenorPipsCurveData, FxForwardCurveByQuoteReference, CreditSpreadCurveData, EquityCurveByPricesData, ConstantVolatilitySurface. | [default to String]
**domCcy** | **String** | Domestic currency of the fx forward | [default to String]
**fgnCcy** | **String** | Foreign currency of the fx forward | [default to String]
**tenors** | **List&lt;String&gt;** | Tenors for which the forward rates apply.  For more information on tenors, see [knowledge base article KA-02097](https://support.lusid.com/knowledgebase/article/KA-02097) | [default to List<String>]
**quoteReferences** | [**List&lt;Map&lt;String, String&gt;&gt;**](Map.md) | For each tenor, a collection of identifiers. These will be looked up in the LUSID Quote Store to resolve the actual rates.  Accepts an array of Dictionary&lt;string, string&gt;. The keys of each dictionary must be chosen from the following enumeration:  [LusidInstrumentId, Isin, Sedol, Cusip, ClientInternal, Figi, RIC, QuotePermId, REDCode, BBGId, ICECode].  For example:    \&quot;quoteReferences\&quot;: [{\&quot;ClientInternal\&quot;: \&quot;SomeIdentifierForFirstTenor\&quot;},{\&quot;ClientInternal\&quot;: \&quot;SomeIdentifierForSecondTenor\&quot;} | [default to List<Map<String, String>>]
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**marketDataOptions** | [**MarketDataOptions**](MarketDataOptions.md) |  | [optional] [default to MarketDataOptions]
**calendars** | [**List&lt;FxTenorConvention&gt;**](FxTenorConvention.md) | The list of conventions that should be used when interpreting tenors as dates. | [optional] [default to List<FxTenorConvention>]
**spotDaysCalculationType** | **String** | Configures how to calculate the spot date from the build date using the Calendars provided. Available values: SingleCalendar, UnionCalendars. | [optional] [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.sdk.services.lusid.model.FxForwardCurveByQuoteReference;
import java.util.*;
import java.lang.System;
import java.net.URI;

String domCcy = "example domCcy";
String fgnCcy = "example fgnCcy";
List<String> tenors = new List<String>();
List<Map<String, String>> quoteReferences = new List<Map<String, String>>();
@javax.annotation.Nullable String lineage = "example lineage";
MarketDataOptions marketDataOptions = new MarketDataOptions();
@javax.annotation.Nullable List<FxTenorConvention> calendars = new List<FxTenorConvention>();
@javax.annotation.Nullable String spotDaysCalculationType = "example spotDaysCalculationType";
Version version = new Version();


FxForwardCurveByQuoteReference fxForwardCurveByQuoteReferenceInstance = new FxForwardCurveByQuoteReference()
    .domCcy(domCcy)
    .fgnCcy(fgnCcy)
    .tenors(tenors)
    .quoteReferences(quoteReferences)
    .lineage(lineage)
    .marketDataOptions(marketDataOptions)
    .calendars(calendars)
    .spotDaysCalculationType(spotDaysCalculationType)
    .version(version);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)