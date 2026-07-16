# com.finbourne.sdk.services.workflow.model.Task
classname Task
Defines a Task created based on a Task Definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The unique id for this Task | [default to UUID]
**taskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**taskDefinitionVersion** | [**TaskDefinitionVersion**](TaskDefinitionVersion.md) |  | [default to TaskDefinitionVersion]
**taskDefinitionDisplayName** | **String** | The display name of the Task Definition used by this Task | [default to String]
**workflowId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**workflowDisplayName** | **String** | The display name of the Workflow that this Task is a member of, if any | [optional] [default to String]
**state** | **String** | Current State | [default to String]
**stateDisplayName** | **String** | The display name of the current State, from the Task Definition, if one is provided | [optional] [default to String]
**ultimateParentTask** | [**TaskSummary**](TaskSummary.md) |  | [default to TaskSummary]
**parentTask** | [**TaskSummary**](TaskSummary.md) |  | [optional] [default to TaskSummary]
**childTasks** | [**List&lt;TaskSummary&gt;**](TaskSummary.md) | This Task&#39;s child tasks | [optional] [default to List<TaskSummary>]
**correlationIds** | **List&lt;String&gt;** | User-provided ID used to link entities and tasks | [optional] [default to List<String>]
**version** | [**VersionInfo**](VersionInfo.md) |  | [optional] [default to VersionInfo]
**terminalState** | **Boolean** | True if no onward transitions are possible | [default to Boolean]
**asAtLastTransition** | [**OffsetDateTime**](OffsetDateTime.md) | Last Transition timestamp | [optional] [default to OffsetDateTime]
**fields** | [**List&lt;TaskInstanceField&gt;**](TaskInstanceField.md) | Fields and their latest values - should correspond with the Task Definition field schema | [optional] [default to List<TaskInstanceField>]
**stackingKey** | **String** | The key used to determine which stack to add the Task to | [optional] [default to String]
**stack** | [**Stack**](Stack.md) |  | [optional] [default to Stack]
**actionLogIdCreated** | [**UUID**](UUID.md) | The Id of the Action that created this Task | [optional] [default to UUID]
**actionLogIdModified** | [**UUID**](UUID.md) | The Id of the Action that last modified this Task | [optional] [default to UUID]
**actionLogIdSubmitted** | [**UUID**](UUID.md) | The Id of the last Action submitted by this Task | [optional] [default to UUID]
**hierarchicalPosition** | **String** | The hierarchical position of this Task: UltimateParent, IntermediateParent, Child, or Standalone | [optional] [default to String]
**completionStatus** | **String** | The completion status of this Task: NotStarted, InProgress, or Completed | [optional] [default to String]
**openDuration** | **Long** | Duration in seconds since the Task was created. If the Task is Completed, this is the duration from creation to the last transition. | [optional] [default to Long]
**openDurationSinceLastUpdate** | **Long** | Duration in seconds since the Task was last updated. 0 if the Task is Completed. | [optional] [default to Long]
**openDurationSinceLastTransition** | **Long** | Duration in seconds since the Task last transitioned. 0 if the Task is Completed. | [optional] [default to Long]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The requested TaskDefinition and Workflow properties decorated onto this Task, keyed by property key. Only populated when property keys were requested. | [optional] [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.sdk.services.workflow.model.Task;
import java.util.*;
import java.lang.System;
import java.net.URI;

UUID id = "example id";
ResourceId taskDefinitionId = new ResourceId();
TaskDefinitionVersion taskDefinitionVersion = new TaskDefinitionVersion();
String taskDefinitionDisplayName = "example taskDefinitionDisplayName";
ResourceId workflowId = new ResourceId();
@javax.annotation.Nullable String workflowDisplayName = "example workflowDisplayName";
String state = "example state";
@javax.annotation.Nullable String stateDisplayName = "example stateDisplayName";
TaskSummary ultimateParentTask = new TaskSummary();
TaskSummary parentTask = new TaskSummary();
@javax.annotation.Nullable List<TaskSummary> childTasks = new List<TaskSummary>();
@javax.annotation.Nullable List<String> correlationIds = new List<String>();
VersionInfo version = new VersionInfo();
Boolean terminalState = true;
@javax.annotation.Nullable OffsetDateTime asAtLastTransition = OffsetDateTime.now();
@javax.annotation.Nullable List<TaskInstanceField> fields = new List<TaskInstanceField>();
@javax.annotation.Nullable String stackingKey = "example stackingKey";
Stack stack = new Stack();
@javax.annotation.Nullable UUID actionLogIdCreated = "example actionLogIdCreated";
@javax.annotation.Nullable UUID actionLogIdModified = "example actionLogIdModified";
@javax.annotation.Nullable UUID actionLogIdSubmitted = "example actionLogIdSubmitted";
@javax.annotation.Nullable String hierarchicalPosition = "example hierarchicalPosition";
@javax.annotation.Nullable String completionStatus = "example completionStatus";
@javax.annotation.Nullable Long openDuration = new Long("100.00");
@javax.annotation.Nullable Long openDurationSinceLastUpdate = new Long("100.00");
@javax.annotation.Nullable Long openDurationSinceLastTransition = new Long("100.00");
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();


Task taskInstance = new Task()
    .id(id)
    .taskDefinitionId(taskDefinitionId)
    .taskDefinitionVersion(taskDefinitionVersion)
    .taskDefinitionDisplayName(taskDefinitionDisplayName)
    .workflowId(workflowId)
    .workflowDisplayName(workflowDisplayName)
    .state(state)
    .stateDisplayName(stateDisplayName)
    .ultimateParentTask(ultimateParentTask)
    .parentTask(parentTask)
    .childTasks(childTasks)
    .correlationIds(correlationIds)
    .version(version)
    .terminalState(terminalState)
    .asAtLastTransition(asAtLastTransition)
    .fields(fields)
    .stackingKey(stackingKey)
    .stack(stack)
    .actionLogIdCreated(actionLogIdCreated)
    .actionLogIdModified(actionLogIdModified)
    .actionLogIdSubmitted(actionLogIdSubmitted)
    .hierarchicalPosition(hierarchicalPosition)
    .completionStatus(completionStatus)
    .openDuration(openDuration)
    .openDurationSinceLastUpdate(openDurationSinceLastUpdate)
    .openDurationSinceLastTransition(openDurationSinceLastTransition)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)