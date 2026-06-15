# com.finbourne.sdk.services.lusid.model.RecipeComposer
classname RecipeComposer
Recipe composer is an object used to dynamically compose Configuration Recipe from atomic operations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope used when updating or inserting the Recipe Composer. | [default to String]
**code** | **String** | User given string name (code) to identify the recipe. | [default to String]
**operations** | [**List&lt;RecipeBlock&gt;**](RecipeBlock.md) | Atomic operations used to compose a Configuration Recipe. | [optional] [default to List<RecipeBlock>]

```java
import com.finbourne.sdk.services.lusid.model.RecipeComposer;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String code = "example code";
@javax.annotation.Nullable List<RecipeBlock> operations = new List<RecipeBlock>();


RecipeComposer recipeComposerInstance = new RecipeComposer()
    .scope(scope)
    .code(code)
    .operations(operations);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)