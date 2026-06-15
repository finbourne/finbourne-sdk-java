# com.finbourne.sdk.services.lusid.model.CreateCorporateActionSourceRequest
classname CreateCorporateActionSourceRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope of the corporate action source | [default to String]
**code** | **String** | The code of the corporate action source | [default to String]
**displayName** | **String** | The name of the corporate action source | [default to String]
**description** | **String** | The description of the corporate action source | [optional] [default to String]
**instrumentScopes** | **List&lt;String&gt;** | The list of instrument scopes used as the scope resolution strategy when resolving instruments of upserted corporate actions. | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.CreateCorporateActionSourceRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String code = "example code";
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<String> instrumentScopes = new List<String>();


CreateCorporateActionSourceRequest createCorporateActionSourceRequestInstance = new CreateCorporateActionSourceRequest()
    .scope(scope)
    .code(code)
    .displayName(displayName)
    .description(description)
    .instrumentScopes(instrumentScopes);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)