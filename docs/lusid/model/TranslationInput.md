# com.finbourne.sdk.services.lusid.model.TranslationInput
classname TranslationInput
The input to a translation script.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity** | **String** | The serialised entity to be passed to the translation script. This could represent e.g. an instrument in any  dialect. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TranslationInput;
import java.util.*;
import java.lang.System;
import java.net.URI;

String entity = "example entity";


TranslationInput translationInputInstance = new TranslationInput()
    .entity(entity);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)