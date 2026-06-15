# com.finbourne.sdk.services.workflow.model.TriggerChildTasksAction
classname TriggerChildTasksAction
Defines a Trigger Child Tasks Action

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type name for this Action | [default to String]
**trigger** | **String** | Trigger on child tasks to be invoked | [default to String]
**filter** | **String** | Optional LUSID filter expression to limit the action to a subset of the child tasks | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.TriggerChildTasksAction;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
String trigger = "example trigger";
@javax.annotation.Nullable String filter = "example filter";


TriggerChildTasksAction triggerChildTasksActionInstance = new TriggerChildTasksAction()
    .type(type)
    .trigger(trigger)
    .filter(filter);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)