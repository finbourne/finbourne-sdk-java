# com.finbourne.sdk.services.lusid.model.GetRecipeComposerResponse
classname GetRecipeComposerResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**value** | [**RecipeComposer**](RecipeComposer.md) |  | [optional] [default to RecipeComposer]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.GetRecipeComposerResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
RecipeComposer value = new RecipeComposer();
@javax.annotation.Nullable List<Link> links = new List<Link>();


GetRecipeComposerResponse getRecipeComposerResponseInstance = new GetRecipeComposerResponse()
    .href(href)
    .value(value)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)