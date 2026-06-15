# com.finbourne.sdk.services.workflow.model.TriggerParentTaskAction
classname TriggerParentTaskAction
Defines a Trigger Parent Task Action

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type name for this Action | [default to String]
**trigger** | **String** | Trigger on parent task to be invoked | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.TriggerParentTaskAction;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
String trigger = "example trigger";


TriggerParentTaskAction triggerParentTaskActionInstance = new TriggerParentTaskAction()
    .type(type)
    .trigger(trigger);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)