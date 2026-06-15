# com.finbourne.sdk.services.lusid.model.CompositeBreakdownResponse
classname CompositeBreakdownResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**results** | [**Map&lt;String, List&lt;CompositeBreakdown&gt;&gt;**](List.md) | The Composite calculation with the constituens which were included. | [default to Map<String, List<CompositeBreakdown>>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.CompositeBreakdownResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
Map<String, List<CompositeBreakdown>> results = new Map<String, List<CompositeBreakdown>>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


CompositeBreakdownResponse compositeBreakdownResponseInstance = new CompositeBreakdownResponse()
    .href(href)
    .results(results)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)