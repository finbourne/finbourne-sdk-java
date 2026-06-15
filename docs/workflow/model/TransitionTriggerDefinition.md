# com.finbourne.sdk.services.workflow.model.TransitionTriggerDefinition
classname TransitionTriggerDefinition
State changes happen in response to Triggers

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The key/Name of this Trigger | [default to String]
**trigger** | [**TriggerSchema**](TriggerSchema.md) |  | [default to TriggerSchema]
**displayName** | **String** | Display name for trigger | [optional] [default to String]
**description** | **String** | Description of trigger | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.TransitionTriggerDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
TriggerSchema trigger = new TriggerSchema();
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";


TransitionTriggerDefinition transitionTriggerDefinitionInstance = new TransitionTriggerDefinition()
    .name(name)
    .trigger(trigger)
    .displayName(displayName)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)