# com.finbourne.sdk.services.lusid.model.RecipeValue
classname RecipeValue
Recipe value represents a data that is then used to perform an atomic operation which is then used in composition of Configuration Recipe.  This object either includes the data itself (in json form or as simple string) or is a reference where the data can be obtained from (from a Configuration Recipe say).  Only one field is to be populated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asJson** | **String** | Field to allow providing a potentially complex json value. | [optional] [default to String]
**asString** | **String** | For simple value, a single input value, note complex nested objects are not allowed here. | [optional] [default to String]
**fromRecipe** | [**FromRecipe**](FromRecipe.md) |  | [optional] [default to FromRecipe]

```java
import com.finbourne.sdk.services.lusid.model.RecipeValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String asJson = "example asJson";
@javax.annotation.Nullable String asString = "example asString";
FromRecipe fromRecipe = new FromRecipe();


RecipeValue recipeValueInstance = new RecipeValue()
    .asJson(asJson)
    .asString(asString)
    .fromRecipe(fromRecipe);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)