# com.finbourne.sdk.services.lusid.model.UpsertStructuredDataResponse
classname UpsertStructuredDataResponse
Response from upserting structured data document

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**values** | [**Map&lt;String, OffsetDateTime&gt;**](OffsetDateTime.md) | The set of values that were successfully retrieved. | [optional] [default to Map<String, OffsetDateTime>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The set of values that could not be retrieved due along with a reason for this, e.g badly formed request. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertStructuredDataResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable Map<String, OffsetDateTime> values = new Map<String, OffsetDateTime>();
@javax.annotation.Nullable Map<String, ErrorDetail> failed = new Map<String, ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


UpsertStructuredDataResponse upsertStructuredDataResponseInstance = new UpsertStructuredDataResponse()
    .href(href)
    .values(values)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)