# com.finbourne.sdk.services.workflow.model.CreateChildTasksAction
classname CreateChildTasksAction
Defines a Create Child Tasks Action

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type name for this Action | [default to String]
**childTaskConfigurations** | [**List&lt;CreateChildTaskConfiguration&gt;**](CreateChildTaskConfiguration.md) | The Child Task Configurations | [default to List<CreateChildTaskConfiguration>]

```java
import com.finbourne.sdk.services.workflow.model.CreateChildTasksAction;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
List<CreateChildTaskConfiguration> childTaskConfigurations = new List<CreateChildTaskConfiguration>();


CreateChildTasksAction createChildTasksActionInstance = new CreateChildTasksAction()
    .type(type)
    .childTaskConfigurations(childTaskConfigurations);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)