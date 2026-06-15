# com.finbourne.sdk.services.lusid.model.GetStructuredResultDataResponse
classname GetStructuredResultDataResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**values** | [**Map&lt;String, StructuredResultData&gt;**](StructuredResultData.md) | The set of values that were successfully retrieved. | [optional] [default to Map<String, StructuredResultData>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The set of values that could not be retrieved due along with a reason for this, e.g badly formed request. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.GetStructuredResultDataResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable Map<String, StructuredResultData> values = new Map<String, StructuredResultData>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


GetStructuredResultDataResponse getStructuredResultDataResponseInstance = new GetStructuredResultDataResponse()
    .href(href)
    .values(values)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)