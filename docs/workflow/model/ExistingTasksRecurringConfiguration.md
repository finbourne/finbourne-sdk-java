# com.finbourne.sdk.services.workflow.model.ExistingTasksRecurringConfiguration
classname ExistingTasksRecurringConfiguration
Behaviour applied to an existing (non-terminal) child task whose stacking key matches one or more new child task candidates

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**incrementAsAtModified** | **Boolean** | When true, the existing task&#39;s asAtModified is incremented even if no other change (Trigger or MergeFields) is applied | [optional] [default to Boolean]
**trigger** | **String** | The existing task receives this trigger | [optional] [default to String]
**mergeFields** | **List&lt;String&gt;** | The named fields on the existing task are updated with the values from the latest run. Only applies where the new-to-existing stacking key cardinality is one-to-one or one-to-many; unspecified fields are untouched. Data will be merged in even if these fields are in a read-only state. | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.workflow.model.ExistingTasksRecurringConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean incrementAsAtModified = true;
@javax.annotation.Nullable String trigger = "example trigger";
@javax.annotation.Nullable List<String> mergeFields = new List<String>();


ExistingTasksRecurringConfiguration existingTasksRecurringConfigurationInstance = new ExistingTasksRecurringConfiguration()
    .incrementAsAtModified(incrementAsAtModified)
    .trigger(trigger)
    .mergeFields(mergeFields);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)