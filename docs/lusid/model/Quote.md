# com.finbourne.sdk.services.lusid.model.Quote
classname Quote
The quote id, value and lineage of the quotes all keyed by a unique correlation id.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quoteId** | [**QuoteId**](QuoteId.md) |  | [default to QuoteId]
**metricValue** | [**MetricValue**](MetricValue.md) |  | [optional] [default to MetricValue]
**lineage** | **String** | Description of the quote&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**cutLabel** | **String** | The cut label that this quote was updated or inserted with. | [optional] [default to String]
**uploadedBy** | **String** | The unique id of the user that updated or inserted the quote. | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the quote was committed to LUSID. | [default to OffsetDateTime]
**scaleFactor** | **java.math.BigDecimal** | An optional scale factor for non-standard scaling of quotes against the instrument. For example, if you wish the quote&#39;s Value to be scaled down by a factor of 100, enter 100. If not supplied, the default ScaleFactor is 1. | [optional] [default to java.math.BigDecimal]
**metadataFields** | **Map&lt;String, Object&gt;** | The metadata field values for this quote, keyed by field name. | [optional] [default to Map<String, Object>]

```java
import com.finbourne.sdk.services.lusid.model.Quote;
import java.util.*;
import java.lang.System;
import java.net.URI;

QuoteId quoteId = new QuoteId();
MetricValue metricValue = new MetricValue();
@javax.annotation.Nullable String lineage = "example lineage";
@javax.annotation.Nullable String cutLabel = "example cutLabel";
String uploadedBy = "example uploadedBy";
OffsetDateTime asAt = OffsetDateTime.now();
@javax.annotation.Nullable java.math.BigDecimal scaleFactor = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable Map<String, Object> metadataFields = new Map<String, Object>();


Quote quoteInstance = new Quote()
    .quoteId(quoteId)
    .metricValue(metricValue)
    .lineage(lineage)
    .cutLabel(cutLabel)
    .uploadedBy(uploadedBy)
    .asAt(asAt)
    .scaleFactor(scaleFactor)
    .metadataFields(metadataFields);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)