# com.finbourne.sdk.services.lusid.model.GetScenarioResponse
classname GetScenarioResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**value** | [**ScenarioDefinition**](ScenarioDefinition.md) |  | [optional] [default to ScenarioDefinition]
**failed** | [**ErrorDetail**](ErrorDetail.md) |  | [optional] [default to ErrorDetail]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.GetScenarioResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ScenarioDefinition value = new ScenarioDefinition();
ErrorDetail failed = new ErrorDetail();
@javax.annotation.Nullable List<Link> links = new List<Link>();


GetScenarioResponse getScenarioResponseInstance = new GetScenarioResponse()
    .href(href)
    .value(value)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)