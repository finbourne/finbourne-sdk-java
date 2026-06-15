# com.finbourne.sdk.services.lusid.model.ResourceListOfScopeDefinition
classname ResourceListOfScopeDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;ScopeDefinition&gt;**](ScopeDefinition.md) |  | [default to List<ScopeDefinition>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ResourceListOfScopeDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ScopeDefinition> values = new List<ScopeDefinition>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable List<Link> links = new List<Link>();
@javax.annotation.Nullable String nextPage = "example nextPage";
@javax.annotation.Nullable String previousPage = "example previousPage";


ResourceListOfScopeDefinition resourceListOfScopeDefinitionInstance = new ResourceListOfScopeDefinition()
    .values(values)
    .href(href)
    .links(links)
    .nextPage(nextPage)
    .previousPage(previousPage);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)