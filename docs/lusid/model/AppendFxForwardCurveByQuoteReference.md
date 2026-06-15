# com.finbourne.sdk.services.lusid.model.AppendFxForwardCurveByQuoteReference
classname AppendFxForwardCurveByQuoteReference
Used to append a new point to an FX curve defined using `FxForwardCurveByQuoteReference`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketDataType** | **String** | Available values: AppendFxForwardCurveByQuoteReference, AppendFxForwardCurveData, AppendFxForwardPipsCurveData, AppendFxForwardTenorCurveData, AppendFxForwardTenorPipsCurveData. | [default to String]
**tenor** | **String** | Tenor for which the forward rate applies. | [default to String]
**quoteReference** | **Map&lt;String, String&gt;** | A collection of identifiers for the tenor, which will be used to query the LUSID Quote Store to resolve the actual rates.  The keys must be chosen from the following enumeration:  [LusidInstrumentId, Isin, Sedol, Cusip, ClientInternal, Figi, RIC, QuotePermId, REDCode, BBGId, ICECode].    For example:    \&quot;quoteReference\&quot;: {\&quot;ClientInternal\&quot;: \&quot;SomeIdentifierForTenor\&quot;} | [default to Map<String, String>]

```java
import com.finbourne.sdk.services.lusid.model.AppendFxForwardCurveByQuoteReference;
import java.util.*;
import java.lang.System;
import java.net.URI;

String tenor = "example tenor";
Map<String, String> quoteReference = new Map<String, String>();


AppendFxForwardCurveByQuoteReference appendFxForwardCurveByQuoteReferenceInstance = new AppendFxForwardCurveByQuoteReference()
    .tenor(tenor)
    .quoteReference(quoteReference);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)