# com.finbourne.sdk.services.lusid.model.BatchManageCommentResponse
classname BatchManageCommentResponse
The response to a batch manage-comments request. Keyed by the client-supplied batch item key; each  success returns the full updated rec result.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, RecResult&gt;**](RecResult.md) | The successfully-processed batch items, keyed by the client-supplied batch item key. | [default to Map<String, RecResult>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The failed batch items, keyed by the client-supplied batch item key. | [optional] [default to Map<String, ErrorDetail>]
**metadata** | [**Map&lt;String, List&lt;ResponseMetaData&gt;&gt;**](List.md) | Response metadata, keyed by the client-supplied batch item key. | [optional] [default to Map<String, List<ResponseMetaData>>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.BatchManageCommentResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, RecResult> values = new Map<String, RecResult>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable Map<String, List<ResponseMetaData>> metadata = new Map<String, List<ResponseMetaData>>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Link> links = new List<Link>();


BatchManageCommentResponse batchManageCommentResponseInstance = new BatchManageCommentResponse()
    .values(values)
    .failed(failed)
    .metadata(metadata)
    .href(href)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)