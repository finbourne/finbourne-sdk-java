# com.finbourne.sdk.services.workflow.model.CreateChildTasksActionResponse
classname CreateChildTasksActionResponse
Defines a read-only Create Child Tasks Action

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type name for this Action | [optional] [default to String]
**childTaskConfigurations** | [**List&lt;CreateChildTaskConfiguration&gt;**](CreateChildTaskConfiguration.md) | The Child Task Configurations | [optional] [default to List<CreateChildTaskConfiguration>]

```java
import com.finbourne.sdk.services.workflow.model.CreateChildTasksActionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable List<CreateChildTaskConfiguration> childTaskConfigurations = new List<CreateChildTaskConfiguration>();


CreateChildTasksActionResponse createChildTasksActionResponseInstance = new CreateChildTasksActionResponse()
    .type(type)
    .childTaskConfigurations(childTaskConfigurations);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)