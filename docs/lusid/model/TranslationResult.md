# com.finbourne.sdk.services.lusid.model.TranslationResult
classname TranslationResult
The result of invoking a translation script.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity** | **String** | The serialised entity the translation script produced. | [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Any properties the translation script produced. | [default to Map<String, Property>]

```java
import com.finbourne.sdk.services.lusid.model.TranslationResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

String entity = "example entity";
Map<String, Property> properties = new Map<String, Property>();


TranslationResult translationResultInstance = new TranslationResult()
    .entity(entity)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)