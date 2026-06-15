# com.finbourne.sdk.services.workflow.model.CreateTaskDefinitionRequest
classname CreateTaskDefinitionRequest
Contains required info to create a new Task Definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | Human readable name | [default to String]
**description** | **String** | Human readable description | [optional] [default to String]
**states** | [**List&lt;TaskStateDefinition&gt;**](TaskStateDefinition.md) | The states this Task Definition operates over | [default to List<TaskStateDefinition>]
**fieldSchema** | [**List&lt;TaskFieldDefinition&gt;**](TaskFieldDefinition.md) | Defines the fields associated with this Task | [optional] [default to List<TaskFieldDefinition>]
**initialState** | [**InitialState**](InitialState.md) |  | [default to InitialState]
**triggers** | [**List&lt;TransitionTriggerDefinition&gt;**](TransitionTriggerDefinition.md) | Triggers | [optional] [default to List<TransitionTriggerDefinition>]
**transitions** | [**List&lt;TaskTransitionDefinition&gt;**](TaskTransitionDefinition.md) | Transitions | [optional] [default to List<TaskTransitionDefinition>]
**actions** | [**List&lt;ActionDefinition&gt;**](ActionDefinition.md) | Actions | [optional] [default to List<ActionDefinition>]

```java
import com.finbourne.sdk.services.workflow.model.CreateTaskDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
List<TaskStateDefinition> states = new List<TaskStateDefinition>();
@javax.annotation.Nullable List<TaskFieldDefinition> fieldSchema = new List<TaskFieldDefinition>();
InitialState initialState = new InitialState();
@javax.annotation.Nullable List<TransitionTriggerDefinition> triggers = new List<TransitionTriggerDefinition>();
@javax.annotation.Nullable List<TaskTransitionDefinition> transitions = new List<TaskTransitionDefinition>();
@javax.annotation.Nullable List<ActionDefinition> actions = new List<ActionDefinition>();


CreateTaskDefinitionRequest createTaskDefinitionRequestInstance = new CreateTaskDefinitionRequest()
    .id(id)
    .displayName(displayName)
    .description(description)
    .states(states)
    .fieldSchema(fieldSchema)
    .initialState(initialState)
    .triggers(triggers)
    .transitions(transitions)
    .actions(actions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)