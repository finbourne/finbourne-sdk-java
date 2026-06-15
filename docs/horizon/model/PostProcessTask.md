# com.finbourne.sdk.services.horizon.model.PostProcessTask
classname PostProcessTask
Request defining a post-processing task for an instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **String** | The type of action to perform (Allowed: RunIntegration, RunWorkflow, TriggerEmail) | [default to String]
**targetInstance** | **String** | The instance identifier to trigger (for TriggerIntegration action). | [optional] [default to String]
**triggerOn** | **String** | When the task should be triggered (Allowed: OnSuccess, OnFailure, Always) | [default to String]
**parameters** | **Object** | JSON parameters specific to the action type. | [optional] [default to Object]

```java
import com.finbourne.sdk.services.horizon.model.PostProcessTask;
import java.util.*;
import java.lang.System;
import java.net.URI;

String action = "example action";
@javax.annotation.Nullable String targetInstance = "example targetInstance";
String triggerOn = "example triggerOn";
@javax.annotation.Nullable Object 

PostProcessTask postProcessTaskInstance = new PostProcessTask()
    .action(action)
    .targetInstance(targetInstance)
    .triggerOn(triggerOn)
    .parameters(parameters);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)