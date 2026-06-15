# com.finbourne.sdk.services.lusid.model.UpsertReturnsResponse
classname UpsertReturnsResponse
Response from upserting Returns

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [default to Version]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**values** | [**List&lt;Map&lt;String, OffsetDateTime&gt;&gt;**](Map.md) | The set of values that were successfully retrieved. | [optional] [default to List<Map<String, OffsetDateTime>>]
**failed** | [**List&lt;Map&lt;String, ErrorDetail&gt;&gt;**](Map.md) | The set of values that could not be retrieved due along with a reason for this, e.g badly formed request. | [optional] [default to List<Map<String, ErrorDetail>>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertReturnsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version version = new Version();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Map<String, OffsetDateTime>> values = new List<Map<String, OffsetDateTime>>();
@javax.annotation.Nullable List<Map<String, ErrorDetail>> failed = new List<Map<String, ErrorDetail>>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


UpsertReturnsResponse upsertReturnsResponseInstance = new UpsertReturnsResponse()
    .version(version)
    .href(href)
    .values(values)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)