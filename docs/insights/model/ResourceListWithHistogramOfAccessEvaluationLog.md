# com.finbourne.sdk.services.insights.model.ResourceListWithHistogramOfAccessEvaluationLog
classname ResourceListWithHistogramOfAccessEvaluationLog
ResourceList with additional aggregation data about the values.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**histogram** | [**Histogram**](Histogram.md) |  | [optional] [default to Histogram]
**values** | [**List&lt;AccessEvaluationLog&gt;**](AccessEvaluationLog.md) |  | [default to List<AccessEvaluationLog>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.insights.model.ResourceListWithHistogramOfAccessEvaluationLog;
import java.util.*;
import java.lang.System;
import java.net.URI;

Histogram histogram = new Histogram();
List<AccessEvaluationLog> values = new List<AccessEvaluationLog>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable String nextPage = "example nextPage";
@javax.annotation.Nullable String previousPage = "example previousPage";
@javax.annotation.Nullable List<Link> links = new List<Link>();


ResourceListWithHistogramOfAccessEvaluationLog resourceListWithHistogramOfAccessEvaluationLogInstance = new ResourceListWithHistogramOfAccessEvaluationLog()
    .histogram(histogram)
    .values(values)
    .href(href)
    .nextPage(nextPage)
    .previousPage(previousPage)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)