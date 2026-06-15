# com.finbourne.sdk.services.workflow.model.TaskTransitionDefinition
classname TaskTransitionDefinition
Defines a State change

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fromState** | **String** | The State this Transition if coming From | [default to String]
**toState** | **String** | The State this Transition is going To | [default to String]
**trigger** | **String** | The Trigger for this Transition | [default to String]
**guard** | **String** | The Guard for this Transition, if any | [optional] [default to String]
**action** | **String** | The Action to invoke on successful Transition | [optional] [default to String]
**displayName** | **String** | Display name for transition | [optional] [default to String]
**description** | **String** | Description for transition | [optional] [default to String]
**guardDescription** | **String** | Guard description for transition | [optional] [default to String]
**guardConditionNotMetMessage** | **String** | Message when guard has not been met | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.TaskTransitionDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String fromState = "example fromState";
String toState = "example toState";
String trigger = "example trigger";
@javax.annotation.Nullable String guard = "example guard";
@javax.annotation.Nullable String action = "example action";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable String guardDescription = "example guardDescription";
@javax.annotation.Nullable String guardConditionNotMetMessage = "example guardConditionNotMetMessage";


TaskTransitionDefinition taskTransitionDefinitionInstance = new TaskTransitionDefinition()
    .fromState(fromState)
    .toState(toState)
    .trigger(trigger)
    .guard(guard)
    .action(action)
    .displayName(displayName)
    .description(description)
    .guardDescription(guardDescription)
    .guardConditionNotMetMessage(guardConditionNotMetMessage);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)