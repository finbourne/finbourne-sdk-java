# com.finbourne.sdk.services.luminesce.model.AccessControlledAction
classname AccessControlledAction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** |  | [optional] [default to String]
**action** | [**ActionId**](ActionId.md) |  | [optional] [default to ActionId]
**limitedSet** | [**List&lt;IdSelectorDefinition&gt;**](IdSelectorDefinition.md) |  | [optional] [default to List<IdSelectorDefinition>]

```java
import com.finbourne.sdk.services.luminesce.model.AccessControlledAction;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String description = "example description";
ActionId action = new ActionId();
@javax.annotation.Nullable List<IdSelectorDefinition> limitedSet = new List<IdSelectorDefinition>();


AccessControlledAction accessControlledActionInstance = new AccessControlledAction()
    .description(description)
    .action(action)
    .limitedSet(limitedSet);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)