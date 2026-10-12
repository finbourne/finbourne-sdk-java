# com.finbourne.sdk.services.lusid.model.UpsertInstrumentEventsResponse
classname UpsertInstrumentEventsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**values** | [**Map&lt;String, InstrumentEventHolder&gt;**](InstrumentEventHolder.md) | The instrument events which have been successfully updated or inserted. | [optional] [default to Map<String, InstrumentEventHolder>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The instrument events that could not be updated or inserted along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**staged** | [**Map&lt;String, InstrumentEventHolder&gt;**](InstrumentEventHolder.md) | The instrument events that have been staged pending approval. | [optional] [default to Map<String, InstrumentEventHolder>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertInstrumentEventsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable Map<String, InstrumentEventHolder> values = new Map<String, InstrumentEventHolder>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable Map<String, InstrumentEventHolder> staged = new Map<String, InstrumentEventHolder>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


UpsertInstrumentEventsResponse upsertInstrumentEventsResponseInstance = new UpsertInstrumentEventsResponse()
    .href(href)
    .values(values)
    .failed(failed)
    .staged(staged)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)