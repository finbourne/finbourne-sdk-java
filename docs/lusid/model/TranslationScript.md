# com.finbourne.sdk.services.lusid.model.TranslationScript
classname TranslationScript

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**TranslationScriptId**](TranslationScriptId.md) |  | [default to TranslationScriptId]
**body** | **String** | Body of the translation script, i.e. the actual translation code. | [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.sdk.services.lusid.model.TranslationScript;
import java.util.*;
import java.lang.System;
import java.net.URI;

TranslationScriptId id = new TranslationScriptId();
String body = "example body";
Version version = new Version();


TranslationScript translationScriptInstance = new TranslationScript()
    .id(id)
    .body(body)
    .version(version);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)