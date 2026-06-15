# com.finbourne.sdk.services.lusid.model.CreateUnitDefinition
classname CreateUnitDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | [default to String]
**displayName** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**details** | **Map&lt;String, String&gt;** |  | [optional] [default to Map<String, String>]

```java
import com.finbourne.sdk.services.lusid.model.CreateUnitDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
String displayName = "example displayName";
String description = "example description";
@javax.annotation.Nullable Map<String, String> details = new Map<String, String>();


CreateUnitDefinition createUnitDefinitionInstance = new CreateUnitDefinition()
    .code(code)
    .displayName(displayName)
    .description(description)
    .details(details);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)