# com.finbourne.sdk.services.access.model.PolicySelectorDefinition
classname PolicySelectorDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identityRestriction** | **Map&lt;String, String&gt;** |  | [optional] [default to Map<String, String>]
**restrictionSelectors** | [**List&lt;SelectorDefinition&gt;**](SelectorDefinition.md) |  | [optional] [default to List<SelectorDefinition>]
**actions** | [**List&lt;ActionId&gt;**](ActionId.md) |  | [default to List<ActionId>]
**name** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.access.model.PolicySelectorDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, String> identityRestriction = new Map<String, String>();
@javax.annotation.Nullable List<SelectorDefinition> restrictionSelectors = new List<SelectorDefinition>();
List<ActionId> actions = new List<ActionId>();
@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable String description = "example description";


PolicySelectorDefinition policySelectorDefinitionInstance = new PolicySelectorDefinition()
    .identityRestriction(identityRestriction)
    .restrictionSelectors(restrictionSelectors)
    .actions(actions)
    .name(name)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)