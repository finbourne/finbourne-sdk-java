# com.finbourne.sdk.services.lusid.model.TranslationContext
classname TranslationContext
Options for overriding default scripted translation configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disableScriptedTranslation** | **Boolean** |  | [optional] [default to Boolean]
**scriptMap** | [**ScriptMapReference**](ScriptMapReference.md) |  | [optional] [default to ScriptMapReference]

```java
import com.finbourne.sdk.services.lusid.model.TranslationContext;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean disableScriptedTranslation = true;
ScriptMapReference scriptMap = new ScriptMapReference();


TranslationContext translationContextInstance = new TranslationContext()
    .disableScriptedTranslation(disableScriptedTranslation)
    .scriptMap(scriptMap);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)