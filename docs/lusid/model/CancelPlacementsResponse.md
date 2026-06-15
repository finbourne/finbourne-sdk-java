# com.finbourne.sdk.services.lusid.model.CancelPlacementsResponse
classname CancelPlacementsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**values** | [**Map&lt;String, CancelledPlacementResult&gt;**](CancelledPlacementResult.md) | The placements which have been successfully cancelled. | [optional] [default to Map<String, CancelledPlacementResult>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The placements that could not be cancelled, along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**metadata** | [**Map&lt;String, List&lt;ResponseMetaData&gt;&gt;**](List.md) | Meta data associated with the cancellation event. | [optional] [default to Map<String, List<ResponseMetaData>>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.CancelPlacementsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable Map<String, CancelledPlacementResult> values = new Map<String, CancelledPlacementResult>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable Map<String, List<ResponseMetaData>> metadata = new Map<String, List<ResponseMetaData>>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


CancelPlacementsResponse cancelPlacementsResponseInstance = new CancelPlacementsResponse()
    .href(href)
    .values(values)
    .failed(failed)
    .metadata(metadata)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)