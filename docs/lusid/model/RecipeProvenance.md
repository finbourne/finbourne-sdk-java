# com.finbourne.sdk.services.lusid.model.RecipeProvenance
classname RecipeProvenance
The recipe a fund valuation was priced with, and where it came from. Absent when the fund has no portfolios  at the effective date, as nothing is priced and no recipe is resolved.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**source** | **String** | Where the recipe came from. &#39;NavType&#39; when it is the recipe on the nominated NAV type&#39;s definition;  &#39;Request&#39; when the request named a recipeId that replaced it for pricing in that request only. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RecipeProvenance;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId recipeId = new ResourceId();
@javax.annotation.Nullable String source = "example source";


RecipeProvenance recipeProvenanceInstance = new RecipeProvenance()
    .recipeId(recipeId)
    .source(source);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)