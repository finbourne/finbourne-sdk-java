# com.finbourne.sdk.services.workflow.model.ActionDefinition
classname ActionDefinition
Defines the Actions for a Task

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The Name of this Action | [default to String]
**runAsUserId** | **String** | The ID of the user that this action will be performed by. If not specified, the actions will be performed by the \&quot;current user\&quot;. | [optional] [default to String]
**actionDetails** | [**ActionDetails**](ActionDetails.md) |  | [default to ActionDetails]
**displayName** | **String** | The display name of this Action | [optional] [default to String]
**description** | **String** | The description of this Action | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.ActionDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
@javax.annotation.Nullable String runAsUserId = "example runAsUserId";
ActionDetails actionDetails = new ActionDetails();
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";


ActionDefinition actionDefinitionInstance = new ActionDefinition()
    .name(name)
    .runAsUserId(runAsUserId)
    .actionDetails(actionDetails)
    .displayName(displayName)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)