# com.finbourne.sdk.services.lusid.model.GetCdsFlowConventionsResponse
classname GetCdsFlowConventionsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**value** | [**CdsFlowConventions**](CdsFlowConventions.md) |  | [optional] [default to CdsFlowConventions]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The identifiers that did not resolve to a conventions along with the nature of the failure. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.GetCdsFlowConventionsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
CdsFlowConventions value = new CdsFlowConventions();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


GetCdsFlowConventionsResponse getCdsFlowConventionsResponseInstance = new GetCdsFlowConventionsResponse()
    .href(href)
    .value(value)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)