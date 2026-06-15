# com.finbourne.sdk.services.lusid.model.UpsertRecipeRequest
classname UpsertRecipeRequest
A recipe that is to be stored in the recipe structured data store.  Only one of these must be present.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configurationRecipe** | [**ConfigurationRecipe**](ConfigurationRecipe.md) |  | [optional] [default to ConfigurationRecipe]

```java
import com.finbourne.sdk.services.lusid.model.UpsertRecipeRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ConfigurationRecipe configurationRecipe = new ConfigurationRecipe();


UpsertRecipeRequest upsertRecipeRequestInstance = new UpsertRecipeRequest()
    .configurationRecipe(configurationRecipe);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)