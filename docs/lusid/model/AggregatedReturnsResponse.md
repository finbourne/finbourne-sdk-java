# com.finbourne.sdk.services.lusid.model.AggregatedReturnsResponse
classname AggregatedReturnsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**results** | [**Map&lt;String, List&lt;AggregatedReturn&gt;&gt;**](List.md) | Aggregated returns grouped by ReturnId | [optional] [default to Map<String, List<AggregatedReturn>>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.AggregatedReturnsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable Map<String, List<AggregatedReturn>> results = new Map<String, List<AggregatedReturn>>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


AggregatedReturnsResponse aggregatedReturnsResponseInstance = new AggregatedReturnsResponse()
    .href(href)
    .results(results)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)