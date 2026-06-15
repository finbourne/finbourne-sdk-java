# com.finbourne.sdk.services.workflow.model.TaskSummary
classname TaskSummary
Summary of a Task created based on a Task Definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The unique id for this Task | [default to UUID]
**taskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**taskDefinitionVersion** | [**TaskDefinitionVersion**](TaskDefinitionVersion.md) |  | [default to TaskDefinitionVersion]
**taskDefinitionDisplayName** | **String** | The display name of the Task Definition used by this Task | [default to String]
**state** | **String** | Current State | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.TaskSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

UUID id = "example id";
ResourceId taskDefinitionId = new ResourceId();
TaskDefinitionVersion taskDefinitionVersion = new TaskDefinitionVersion();
String taskDefinitionDisplayName = "example taskDefinitionDisplayName";
String state = "example state";


TaskSummary taskSummaryInstance = new TaskSummary()
    .id(id)
    .taskDefinitionId(taskDefinitionId)
    .taskDefinitionVersion(taskDefinitionVersion)
    .taskDefinitionDisplayName(taskDefinitionDisplayName)
    .state(state);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)