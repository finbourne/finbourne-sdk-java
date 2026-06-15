# com.finbourne.sdk.services.lusid.model.UpsertQuoteRequest
classname UpsertQuoteRequest
The details of the quote including its unique identifier, value and lineage.  Please note the Unit field on MetricValue is nullable on the upsert but there  is validation within the quote store to make sure this field is populated.  In the absence of a real unit then we recommend putting something in line with  the data in QuoteId.QuoteSeriesId.quoteType e.g. InterestRate.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quoteId** | [**QuoteId**](QuoteId.md) |  | [default to QuoteId]
**metricValue** | [**MetricValue**](MetricValue.md) |  | [optional] [default to MetricValue]
**lineage** | **String** | Description of the quote&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**scaleFactor** | **java.math.BigDecimal** | An optional scale factor for non-standard scaling of quotes against the instrument. For example, if you wish the quote&#39;s Value to be scaled down by a factor of 100, enter 100. If not supplied, the default ScaleFactor is 1. | [optional] [default to java.math.BigDecimal]
**metadataFields** | **Map&lt;String, Object&gt;** | The metadata field values for this quote, keyed by field name. | [optional] [default to Map<String, Object>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertQuoteRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

QuoteId quoteId = new QuoteId();
MetricValue metricValue = new MetricValue();
@javax.annotation.Nullable String lineage = "example lineage";
@javax.annotation.Nullable java.math.BigDecimal scaleFactor = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable Map<String, Object> metadataFields = new Map<String, Object>();


UpsertQuoteRequest upsertQuoteRequestInstance = new UpsertQuoteRequest()
    .quoteId(quoteId)
    .metricValue(metricValue)
    .lineage(lineage)
    .scaleFactor(scaleFactor)
    .metadataFields(metadataFields);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)