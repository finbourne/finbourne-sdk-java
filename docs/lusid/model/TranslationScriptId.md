# com.finbourne.sdk.services.lusid.model.TranslationScriptId
classname TranslationScriptId
Id of the Translation Script.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | Scope of the translation script. | [default to String]
**code** | **String** | Code of the translation script. | [default to String]
**version** | **String** | Semantic Version of the translation script of the form MAJOR.MINOR.PATCH. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TranslationScriptId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String code = "example code";
String version = "example version";


TranslationScriptId translationScriptIdInstance = new TranslationScriptId()
    .scope(scope)
    .code(code)
    .version(version);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)