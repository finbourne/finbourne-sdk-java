# com.finbourne.sdk.services.workflow.model.NewTasksRecurringConfiguration
classname NewTasksRecurringConfiguration
Behaviour applied to a new child task candidate whose stacking key matches an existing (non-terminal) child task

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**doNotCreate** | **Boolean** | When true, the new child task will not be created | [optional] [default to Boolean]
**initialTriggerOverride** | **String** | When DoNotCreate is false, the new child task will be created with this trigger instead of the ChildTaskConfiguration&#39;s InitialTrigger | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.NewTasksRecurringConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean doNotCreate = true;
@javax.annotation.Nullable String initialTriggerOverride = "example initialTriggerOverride";


NewTasksRecurringConfiguration newTasksRecurringConfigurationInstance = new NewTasksRecurringConfiguration()
    .doNotCreate(doNotCreate)
    .initialTriggerOverride(initialTriggerOverride);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)