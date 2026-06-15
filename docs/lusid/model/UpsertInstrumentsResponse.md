# com.finbourne.sdk.services.lusid.model.UpsertInstrumentsResponse
classname UpsertInstrumentsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**values** | [**Map&lt;String, Instrument&gt;**](Instrument.md) | The instruments which have been successfully updated or created. | [optional] [default to Map<String, Instrument>]
**staged** | [**Map&lt;String, Instrument&gt;**](Instrument.md) | The instruments that have been staged for updation or creation. | [optional] [default to Map<String, Instrument>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The instruments that could not be updated or created or were left unchanged without error along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**metadata** | [**Map&lt;String, List&lt;ResponseMetaData&gt;&gt;**](List.md) | Meta data associated with the upsert event. | [optional] [default to Map<String, List<ResponseMetaData>>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertInstrumentsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable Map<String, Instrument> values = new Map<String, Instrument>();
@javax.annotation.Nullable Map<String, Instrument> staged = new Map<String, Instrument>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable Map<String, List<ResponseMetaData>> metadata = new Map<String, List<ResponseMetaData>>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


UpsertInstrumentsResponse upsertInstrumentsResponseInstance = new UpsertInstrumentsResponse()
    .href(href)
    .values(values)
    .staged(staged)
    .failed(failed)
    .metadata(metadata)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)