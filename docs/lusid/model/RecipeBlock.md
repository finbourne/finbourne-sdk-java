# com.finbourne.sdk.services.lusid.model.RecipeBlock
classname RecipeBlock
An atomic operation used in Recipe composer to compose a Configuration Recipe

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | [**RecipeValue**](RecipeValue.md) |  | [optional] [default to RecipeValue]
**path** | **String** | Path of the Value that the operation is to be performed on. | [optional] [default to String]
**op** | **String** | Operation to be performed on the part of the value. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RecipeBlock;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecipeValue value = new RecipeValue();
@javax.annotation.Nullable String path = "example path";
@javax.annotation.Nullable String op = "example op";


RecipeBlock recipeBlockInstance = new RecipeBlock()
    .value(value)
    .path(path)
    .op(op);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)