# com.finbourne.sdk.services.workflow.model.LauncherEdge
classname LauncherEdge
Represents the relationship between a Launcher of a Workflow and the Task Definition it starts a run of

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**launcherId** | **String** | The identifier of the Launcher inside its Workflow | [optional] [default to String]
**targetTaskDefinition** | [**VersionedTaskDefinitionId**](VersionedTaskDefinitionId.md) |  | [optional] [default to VersionedTaskDefinitionId]

```java
import com.finbourne.sdk.services.workflow.model.LauncherEdge;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String launcherId = "example launcherId";
VersionedTaskDefinitionId targetTaskDefinition = new VersionedTaskDefinitionId();


LauncherEdge launcherEdgeInstance = new LauncherEdge()
    .launcherId(launcherId)
    .targetTaskDefinition(targetTaskDefinition);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)