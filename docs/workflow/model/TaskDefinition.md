# com.finbourne.sdk.services.workflow.model.TaskDefinition
classname TaskDefinition
Task Definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**version** | [**VersionInfo**](VersionInfo.md) |  | [optional] [default to VersionInfo]
**displayName** | **String** | Human readable name | [default to String]
**description** | **String** | Human readable description | [optional] [default to String]
**states** | [**List&lt;TaskStateDefinition&gt;**](TaskStateDefinition.md) | The states this Task Definition operates over | [default to List<TaskStateDefinition>]
**fieldSchema** | [**List&lt;TaskFieldDefinition&gt;**](TaskFieldDefinition.md) | The Fields that this Task Definition operates on | [optional] [default to List<TaskFieldDefinition>]
**initialState** | [**InitialState**](InitialState.md) |  | [default to InitialState]
**triggers** | [**List&lt;TransitionTriggerDefinition&gt;**](TransitionTriggerDefinition.md) | The Triggers for State transition | [optional] [default to List<TransitionTriggerDefinition>]
**actions** | [**List&lt;ActionDefinitionResponse&gt;**](ActionDefinitionResponse.md) | The Actions of this Task - executed after a Transition completion | [optional] [default to List<ActionDefinitionResponse>]
**transitions** | [**List&lt;TaskTransitionDefinition&gt;**](TaskTransitionDefinition.md) | The Transitions between States | [optional] [default to List<TaskTransitionDefinition>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The properties of the Task Definition, keyed by property key. Only populated when set on the request (Create/Update) or when property keys are requested (Get/List). | [optional] [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.sdk.services.workflow.model.TaskDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
VersionInfo version = new VersionInfo();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
List<TaskStateDefinition> states = new List<TaskStateDefinition>();
@javax.annotation.Nullable List<TaskFieldDefinition> fieldSchema = new List<TaskFieldDefinition>();
InitialState initialState = new InitialState();
@javax.annotation.Nullable List<TransitionTriggerDefinition> triggers = new List<TransitionTriggerDefinition>();
@javax.annotation.Nullable List<ActionDefinitionResponse> actions = new List<ActionDefinitionResponse>();
@javax.annotation.Nullable List<TaskTransitionDefinition> transitions = new List<TaskTransitionDefinition>();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();


TaskDefinition taskDefinitionInstance = new TaskDefinition()
    .id(id)
    .version(version)
    .displayName(displayName)
    .description(description)
    .states(states)
    .fieldSchema(fieldSchema)
    .initialState(initialState)
    .triggers(triggers)
    .actions(actions)
    .transitions(transitions)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)