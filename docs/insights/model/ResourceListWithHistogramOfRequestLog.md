# com.finbourne.sdk.services.insights.model.ResourceListWithHistogramOfRequestLog
classname ResourceListWithHistogramOfRequestLog
ResourceList with additional aggregation data about the values.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**histogram** | [**Histogram**](Histogram.md) |  | [optional] [default to Histogram]
**values** | [**List&lt;RequestLog&gt;**](RequestLog.md) |  | [default to List<RequestLog>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.insights.model.ResourceListWithHistogramOfRequestLog;
import java.util.*;
import java.lang.System;
import java.net.URI;

Histogram histogram = new Histogram();
List<RequestLog> values = new List<RequestLog>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable String nextPage = "example nextPage";
@javax.annotation.Nullable String previousPage = "example previousPage";
@javax.annotation.Nullable List<Link> links = new List<Link>();


ResourceListWithHistogramOfRequestLog resourceListWithHistogramOfRequestLogInstance = new ResourceListWithHistogramOfRequestLog()
    .histogram(histogram)
    .values(values)
    .href(href)
    .nextPage(nextPage)
    .previousPage(previousPage)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)