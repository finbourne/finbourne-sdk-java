# com.finbourne.sdk.services.scheduler.model.IdSelectorDefinition
classname IdSelectorDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **Map&lt;String, String&gt;** |  | [default to Map<String, String>]
**actions** | [**List&lt;ActionId&gt;**](ActionId.md) |  | [default to List<ActionId>]
**name** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.scheduler.model.IdSelectorDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> identifier = new Map<String, String>();
List<ActionId> actions = new List<ActionId>();
@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable String description = "example description";


IdSelectorDefinition idSelectorDefinitionInstance = new IdSelectorDefinition()
    .identifier(identifier)
    .actions(actions)
    .name(name)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)