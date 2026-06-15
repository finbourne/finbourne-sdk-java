# com.finbourne.sdk.services.lusid.model.UpsertTranslationScriptRequest
classname UpsertTranslationScriptRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**TranslationScriptId**](TranslationScriptId.md) |  | [default to TranslationScriptId]
**body** | **String** | Body of the translation script, i.e. the actual translation code. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.UpsertTranslationScriptRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

TranslationScriptId id = new TranslationScriptId();
String body = "example body";


UpsertTranslationScriptRequest upsertTranslationScriptRequestInstance = new UpsertTranslationScriptRequest()
    .id(id)
    .body(body);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)