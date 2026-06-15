# com.finbourne.sdk.services.lusid.model.GetQuotesResponse
classname GetQuotesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**values** | [**Map&lt;String, Quote&gt;**](Quote.md) | The quotes which have been successfully retrieved. | [optional] [default to Map<String, Quote>]
**notFound** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The quotes that could not be found along with a reason why. | [optional] [default to Map<String, ErrorDetail>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The quotes that could not be retrieved due to an error along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.GetQuotesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable Map<String, Quote> values = new Map<String, Quote>();
@javax.annotation.Nullable Map<String, ErrorDetail> notFound = new Map<String, ErrorDetail>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


GetQuotesResponse getQuotesResponseInstance = new GetQuotesResponse()
    .href(href)
    .values(values)
    .notFound(notFound)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)