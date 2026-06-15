# com.finbourne.sdk.services.lusid.model.GetInstrumentsResponse
classname GetInstrumentsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**values** | [**Map&lt;String, Instrument&gt;**](Instrument.md) | The instrument definitions, keyed by the identifier used to retrieve them. Only instruments that were found will be contained in this collection. | [optional] [default to Map<String, Instrument>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The identifiers that did not resolve to an instrument along with the nature of the failure. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.GetInstrumentsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable Map<String, Instrument> values = new Map<String, Instrument>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


GetInstrumentsResponse getInstrumentsResponseInstance = new GetInstrumentsResponse()
    .href(href)
    .values(values)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)