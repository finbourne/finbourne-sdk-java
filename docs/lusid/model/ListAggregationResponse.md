# com.finbourne.sdk.services.lusid.model.ListAggregationResponse
classname ListAggregationResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregationEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**aggregationAsAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**data** | [**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md) |  | [optional] [default to List<Map<String, Object>>]
**aggregationCurrency** | **String** |  | [optional] [default to String]
**dataSchema** | [**ResultDataSchema**](ResultDataSchema.md) |  | [optional] [default to ResultDataSchema]
**aggregationFailures** | [**List&lt;AggregationMeasureFailureDetail&gt;**](AggregationMeasureFailureDetail.md) |  | [optional] [default to List<AggregationMeasureFailureDetail>]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.ListAggregationResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime aggregationEffectiveAt = OffsetDateTime.now();
OffsetDateTime aggregationAsAt = OffsetDateTime.now();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Map<String, Object>> data = new List<Map<String, Object>>();
@javax.annotation.Nullable String aggregationCurrency = "example aggregationCurrency";
ResultDataSchema dataSchema = new ResultDataSchema();
@javax.annotation.Nullable List<AggregationMeasureFailureDetail> aggregationFailures = new List<AggregationMeasureFailureDetail>();
ResourceId recipeId = new ResourceId();
@javax.annotation.Nullable List<Link> links = new List<Link>();


ListAggregationResponse listAggregationResponseInstance = new ListAggregationResponse()
    .aggregationEffectiveAt(aggregationEffectiveAt)
    .aggregationAsAt(aggregationAsAt)
    .href(href)
    .data(data)
    .aggregationCurrency(aggregationCurrency)
    .dataSchema(dataSchema)
    .aggregationFailures(aggregationFailures)
    .recipeId(recipeId)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)