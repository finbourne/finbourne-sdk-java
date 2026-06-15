# com.finbourne.sdk.services.workflow.model.TriggerChildTasksActionResponse
classname TriggerChildTasksActionResponse
Defines a read-only Trigger Child Tasks Action

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type name for this Action | [optional] [default to String]
**trigger** | **String** | Trigger on child tasks to be invoked | [optional] [default to String]
**filter** | **String** | Optional LUSID filter expression to limit the action to a subset of the child tasks | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.TriggerChildTasksActionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String trigger = "example trigger";
@javax.annotation.Nullable String filter = "example filter";


TriggerChildTasksActionResponse triggerChildTasksActionResponseInstance = new TriggerChildTasksActionResponse()
    .type(type)
    .trigger(trigger)
    .filter(filter);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)