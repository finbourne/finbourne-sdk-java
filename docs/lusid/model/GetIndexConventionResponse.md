# com.finbourne.sdk.services.lusid.model.GetIndexConventionResponse
classname GetIndexConventionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**value** | [**IndexConvention**](IndexConvention.md) |  | [optional] [default to IndexConvention]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The identifiers that did not resolve to a conventions along with the nature of the failure. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.GetIndexConventionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
IndexConvention value = new IndexConvention();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


GetIndexConventionResponse getIndexConventionResponseInstance = new GetIndexConventionResponse()
    .href(href)
    .value(value)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)