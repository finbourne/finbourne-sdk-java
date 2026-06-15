# com.finbourne.sdk.services.lusid.model.TranslateEntitiesInlinedRequest
classname TranslateEntitiesInlinedRequest
Request to translate financial entities with a given script body.  The output of the translation is validated against a schema specified in the request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityPayloads** | [**Map&lt;String, TranslationInput&gt;**](TranslationInput.md) | Entity payloads to be translated indexed by (ephemeral) unique correlation ids. | [default to Map<String, TranslationInput>]
**scriptBody** | **String** | The body of the translation script to use for translating the entities. | [default to String]
**schema** | [**DialectSchema**](DialectSchema.md) |  | [optional] [default to DialectSchema]

```java
import com.finbourne.sdk.services.lusid.model.TranslateEntitiesInlinedRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, TranslationInput> entityPayloads = new Map<String, TranslationInput>();
String scriptBody = "example scriptBody";
DialectSchema schema = new DialectSchema();


TranslateEntitiesInlinedRequest translateEntitiesInlinedRequestInstance = new TranslateEntitiesInlinedRequest()
    .entityPayloads(entityPayloads)
    .scriptBody(scriptBody)
    .schema(schema);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)