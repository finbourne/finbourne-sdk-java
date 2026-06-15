# com.finbourne.sdk.services.lusid.model.UpsertRecipeComposerRequest
classname UpsertRecipeComposerRequest
A recipe composer that is to be stored in the recipe composer data store or used for inline resolving.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recipeComposer** | [**RecipeComposer**](RecipeComposer.md) |  | [optional] [default to RecipeComposer]

```java
import com.finbourne.sdk.services.lusid.model.UpsertRecipeComposerRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecipeComposer recipeComposer = new RecipeComposer();


UpsertRecipeComposerRequest upsertRecipeComposerRequestInstance = new UpsertRecipeComposerRequest()
    .recipeComposer(recipeComposer);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)