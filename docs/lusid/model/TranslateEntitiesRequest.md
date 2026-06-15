# com.finbourne.sdk.services.lusid.model.TranslateEntitiesRequest
classname TranslateEntitiesRequest
Request to translate financial entities with a specified script stored in LUSID,  specified in the request by its id. The output of the translation is validated against a dialect stored in LUSID,  again specified in the request by its id.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityPayloads** | [**Map&lt;String, TranslationInput&gt;**](TranslationInput.md) | Entity payloads to be translated, indexed by (ephemeral) unique correlation ids. | [default to Map<String, TranslationInput>]
**scriptId** | [**TranslationScriptId**](TranslationScriptId.md) |  | [default to TranslationScriptId]
**dialectId** | [**DialectId**](DialectId.md) |  | [optional] [default to DialectId]

```java
import com.finbourne.sdk.services.lusid.model.TranslateEntitiesRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, TranslationInput> entityPayloads = new Map<String, TranslationInput>();
TranslationScriptId scriptId = new TranslationScriptId();
DialectId dialectId = new DialectId();


TranslateEntitiesRequest translateEntitiesRequestInstance = new TranslateEntitiesRequest()
    .entityPayloads(entityPayloads)
    .scriptId(scriptId)
    .dialectId(dialectId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)