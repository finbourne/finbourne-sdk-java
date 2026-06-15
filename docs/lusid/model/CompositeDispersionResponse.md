# com.finbourne.sdk.services.lusid.model.CompositeDispersionResponse
classname CompositeDispersionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**results** | [**Map&lt;String, List&lt;CompositeDispersion&gt;&gt;**](List.md) | Dispersion returns calculation grouped by ReturnId | [optional] [default to Map<String, List<CompositeDispersion>>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.CompositeDispersionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable Map<String, List<CompositeDispersion>> results = new Map<String, List<CompositeDispersion>>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


CompositeDispersionResponse compositeDispersionResponseInstance = new CompositeDispersionResponse()
    .href(href)
    .results(results)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)