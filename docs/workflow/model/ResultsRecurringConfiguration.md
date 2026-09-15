# com.finbourne.sdk.services.workflow.model.ResultsRecurringConfiguration
classname ResultsRecurringConfiguration
Behaviour applied to new child task candidates, and to existing child tasks, when their stacking keys match one another

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**newTasks** | [**NewTasksRecurringConfiguration**](NewTasksRecurringConfiguration.md) |  | [default to NewTasksRecurringConfiguration]
**existingTasks** | [**ExistingTasksRecurringConfiguration**](ExistingTasksRecurringConfiguration.md) |  | [default to ExistingTasksRecurringConfiguration]

```java
import com.finbourne.sdk.services.workflow.model.ResultsRecurringConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

NewTasksRecurringConfiguration newTasks = new NewTasksRecurringConfiguration();
ExistingTasksRecurringConfiguration existingTasks = new ExistingTasksRecurringConfiguration();


ResultsRecurringConfiguration resultsRecurringConfigurationInstance = new ResultsRecurringConfiguration()
    .newTasks(newTasks)
    .existingTasks(existingTasks);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)