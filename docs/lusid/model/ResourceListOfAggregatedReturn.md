# com.finbourne.sdk.services.lusid.model.ResourceListOfAggregatedReturn
classname ResourceListOfAggregatedReturn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;AggregatedReturn&gt;**](AggregatedReturn.md) |  | [default to List<AggregatedReturn>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ResourceListOfAggregatedReturn;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<AggregatedReturn> values = new List<AggregatedReturn>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Link> links = new List<Link>();
@javax.annotation.Nullable String nextPage = "example nextPage";
@javax.annotation.Nullable String previousPage = "example previousPage";


ResourceListOfAggregatedReturn resourceListOfAggregatedReturnInstance = new ResourceListOfAggregatedReturn()
    .values(values)
    .href(href)
    .links(links)
    .nextPage(nextPage)
    .previousPage(previousPage);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)