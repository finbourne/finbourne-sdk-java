# com.finbourne.sdk.services.workflow.model.ActionLog
classname ActionLog
An Action Log contains the processing history of an Action

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | Unique identifier of the Action | [default to UUID]
**origin** | [**ActionLogOrigin**](ActionLogOrigin.md) |  | [default to ActionLogOrigin]
**actionType** | **String** | The type of the Action | [default to String]
**runAsUserId** | **String** | The ID of the user that the Action was performed by. If not specified, the actions were performed by the \&quot;current user\&quot;. | [optional] [default to String]
**loggedItems** | [**List&lt;ActionLogItem&gt;**](ActionLogItem.md) | The logged items for this Action | [default to List<ActionLogItem>]

```java
import com.finbourne.sdk.services.workflow.model.ActionLog;
import java.util.*;
import java.lang.System;
import java.net.URI;

UUID id = "example id";
ActionLogOrigin origin = new ActionLogOrigin();
String actionType = "example actionType";
@javax.annotation.Nullable String runAsUserId = "example runAsUserId";
List<ActionLogItem> loggedItems = new List<ActionLogItem>();


ActionLog actionLogInstance = new ActionLog()
    .id(id)
    .origin(origin)
    .actionType(actionType)
    .runAsUserId(runAsUserId)
    .loggedItems(loggedItems);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)