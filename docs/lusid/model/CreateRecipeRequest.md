# com.finbourne.sdk.services.lusid.model.CreateRecipeRequest
classname CreateRecipeRequest
Specification class to request for the creation/supplementing of a configuration recipe

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recipeCreationMarketDataScopes** | **List&lt;String&gt;** | The scopes in which the recipe creation would look for quotes/data. | [default to List<String>]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**inlineRecipe** | [**ConfigurationRecipe**](ConfigurationRecipe.md) |  | [optional] [default to ConfigurationRecipe]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt date to use | [optional] [default to OffsetDateTime]
**effectiveAt** | **String** | The market data time, i.e. the recipe generated will look for rules with this effectiveAt. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CreateRecipeRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> recipeCreationMarketDataScopes = new List<String>();
ResourceId recipeId = new ResourceId();
ConfigurationRecipe inlineRecipe = new ConfigurationRecipe();
@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();
String effectiveAt = "example effectiveAt";


CreateRecipeRequest createRecipeRequestInstance = new CreateRecipeRequest()
    .recipeCreationMarketDataScopes(recipeCreationMarketDataScopes)
    .recipeId(recipeId)
    .inlineRecipe(inlineRecipe)
    .asAt(asAt)
    .effectiveAt(effectiveAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)