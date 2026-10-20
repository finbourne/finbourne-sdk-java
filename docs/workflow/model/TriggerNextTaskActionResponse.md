# com.finbourne.sdk.services.workflow.model.TriggerNextTaskActionResponse
classname TriggerNextTaskActionResponse
Trigger Next Task Action Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type name for this Action | [optional] [default to String]
**defaultTrigger** | **String** | Trigger sent to the next task when this task has no nextTaskInitialTrigger of its own | [optional] [default to String]
**fallbackActions** | [**TriggerNextTaskFallbackActionsResponse**](TriggerNextTaskFallbackActionsResponse.md) |  | [optional] [default to TriggerNextTaskFallbackActionsResponse]

```java
import com.finbourne.sdk.services.workflow.model.TriggerNextTaskActionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String defaultTrigger = "example defaultTrigger";
TriggerNextTaskFallbackActionsResponse fallbackActions = new TriggerNextTaskFallbackActionsResponse();


TriggerNextTaskActionResponse triggerNextTaskActionResponseInstance = new TriggerNextTaskActionResponse()
    .type(type)
    .defaultTrigger(defaultTrigger)
    .fallbackActions(fallbackActions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)