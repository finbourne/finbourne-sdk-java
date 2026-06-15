# com.finbourne.sdk.services.workflow.model.TriggerParentTaskActionResponse
classname TriggerParentTaskActionResponse
Defines a read-only Trigger Parent Task Action

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type name for this Action | [optional] [default to String]
**trigger** | **String** | Trigger on parent task to be invoked | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.TriggerParentTaskActionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String trigger = "example trigger";


TriggerParentTaskActionResponse triggerParentTaskActionResponseInstance = new TriggerParentTaskActionResponse()
    .type(type)
    .trigger(trigger);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)