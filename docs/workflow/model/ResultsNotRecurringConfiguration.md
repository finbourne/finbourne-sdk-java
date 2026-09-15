# com.finbourne.sdk.services.workflow.model.ResultsNotRecurringConfiguration
classname ResultsNotRecurringConfiguration
Behaviour applied when a new child task candidate's stacking key does not match any existing (non-terminal) child task, and to an existing child task whose stacking key is not matched by any new candidate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**existingTasks** | [**ExistingTasksNotRecurringConfiguration**](ExistingTasksNotRecurringConfiguration.md) |  | [default to ExistingTasksNotRecurringConfiguration]

```java
import com.finbourne.sdk.services.workflow.model.ResultsNotRecurringConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

ExistingTasksNotRecurringConfiguration existingTasks = new ExistingTasksNotRecurringConfiguration();


ResultsNotRecurringConfiguration resultsNotRecurringConfigurationInstance = new ResultsNotRecurringConfiguration()
    .existingTasks(existingTasks);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)