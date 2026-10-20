# com.finbourne.sdk.services.workflow.model.TriggerNextTaskAction
classname TriggerNextTaskAction
Defines a Trigger Next Task Action

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type name for this Action | [default to String]
**defaultTrigger** | **String** | Trigger sent to the next task when this task has no nextTaskInitialTrigger of its own | [optional] [default to String]
**fallbackActions** | [**TriggerNextTaskFallbackActions**](TriggerNextTaskFallbackActions.md) |  | [optional] [default to TriggerNextTaskFallbackActions]

```java
import com.finbourne.sdk.services.workflow.model.TriggerNextTaskAction;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
@javax.annotation.Nullable String defaultTrigger = "example defaultTrigger";
TriggerNextTaskFallbackActions fallbackActions = new TriggerNextTaskFallbackActions();


TriggerNextTaskAction triggerNextTaskActionInstance = new TriggerNextTaskAction()
    .type(type)
    .defaultTrigger(defaultTrigger)
    .fallbackActions(fallbackActions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)