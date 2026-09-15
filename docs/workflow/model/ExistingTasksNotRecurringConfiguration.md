# com.finbourne.sdk.services.workflow.model.ExistingTasksNotRecurringConfiguration
classname ExistingTasksNotRecurringConfiguration
Behaviour applied to an existing (non-terminal) child task whose stacking key is not matched by any new child task candidate (i.e. it did not recur on this run)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**trigger** | **String** | The existing task receives this trigger | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.ExistingTasksNotRecurringConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String trigger = "example trigger";


ExistingTasksNotRecurringConfiguration existingTasksNotRecurringConfigurationInstance = new ExistingTasksNotRecurringConfiguration()
    .trigger(trigger);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)