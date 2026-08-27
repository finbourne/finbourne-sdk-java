# com.finbourne.sdk.services.lusid.model.GetScenarioResponse
classname GetScenarioResponse
The response to a singular scenario read. There is deliberately no failure block on this  type: every route returning it is a singular (or list-of-singular) read, never a batch keyed  lookup, so there is no per-key error to report - an invalid entity is rejected at upsert and  a failed read fails the whole request. The IGetResponse batch members below throw for the  same reason; do not reintroduce a Failed property when copying this shape.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**value** | [**ScenarioDefinition**](ScenarioDefinition.md) |  | [optional] [default to ScenarioDefinition]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.GetScenarioResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ScenarioDefinition value = new ScenarioDefinition();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


GetScenarioResponse getScenarioResponseInstance = new GetScenarioResponse()
    .href(href)
    .value(value)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)