# com.finbourne.sdk.services.workflow.model.CreateChildTasksAction
classname CreateChildTasksAction
Defines a Create Child Tasks Action

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type name for this Action | [default to String]
**childTaskConfigurations** | [**List&lt;CreateChildTaskConfiguration&gt;**](CreateChildTaskConfiguration.md) | The Child Task Configurations | [default to List<CreateChildTaskConfiguration>]
**ordering** | **String** | How the created child tasks are ordered for execution: Parallel (default) or Series. In Series the child tasks form a chain and only the first is started; each later one is started by its predecessor&#39;s TriggerNextTask action, or by another trigger such as a TriggerChildTasks filter on previousTask. Without one, the chain stops after the first child. | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.CreateChildTasksAction;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
List<CreateChildTaskConfiguration> childTaskConfigurations = new List<CreateChildTaskConfiguration>();
@javax.annotation.Nullable String ordering = "example ordering";


CreateChildTasksAction createChildTasksActionInstance = new CreateChildTasksAction()
    .type(type)
    .childTaskConfigurations(childTaskConfigurations)
    .ordering(ordering);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)