# com.finbourne.sdk.services.workflow.model.TriggerNextTaskFallbackActions
classname TriggerNextTaskFallbackActions
Actions on the same task definition that a Trigger Next Task action runs instead of triggering the next task

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endOfSequence** | **String** | Run when this task has no next task to trigger | [optional] [default to String]
**nextTaskError** | **String** | Run when the next task cannot be triggered, e.g. it was deleted or is not in its initial state | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.TriggerNextTaskFallbackActions;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String endOfSequence = "example endOfSequence";
@javax.annotation.Nullable String nextTaskError = "example nextTaskError";


TriggerNextTaskFallbackActions triggerNextTaskFallbackActionsInstance = new TriggerNextTaskFallbackActions()
    .endOfSequence(endOfSequence)
    .nextTaskError(nextTaskError);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)