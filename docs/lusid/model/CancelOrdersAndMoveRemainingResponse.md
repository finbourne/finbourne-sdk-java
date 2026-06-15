# com.finbourne.sdk.services.lusid.model.CancelOrdersAndMoveRemainingResponse
classname CancelOrdersAndMoveRemainingResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**values** | [**Map&lt;String, CancelOrderAndMoveRemainingResult&gt;**](CancelOrderAndMoveRemainingResult.md) | The orders which have been successfully cancelled, and any remaining quantities moved. | [optional] [default to Map<String, CancelOrderAndMoveRemainingResult>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The orders that could not be cancelled, along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**metadata** | [**Map&lt;String, List&lt;ResponseMetaData&gt;&gt;**](List.md) | Meta data associated with the cancellation event. | [optional] [default to Map<String, List<ResponseMetaData>>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.CancelOrdersAndMoveRemainingResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable Map<String, CancelOrderAndMoveRemainingResult> values = new Map<String, CancelOrderAndMoveRemainingResult>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable Map<String, List<ResponseMetaData>> metadata = new Map<String, List<ResponseMetaData>>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


CancelOrdersAndMoveRemainingResponse cancelOrdersAndMoveRemainingResponseInstance = new CancelOrdersAndMoveRemainingResponse()
    .href(href)
    .values(values)
    .failed(failed)
    .metadata(metadata)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)