# com.finbourne.sdk.services.workflow.model.WorkflowStructureNodes
classname WorkflowStructureNodes
The nodes of a Workflow structure graph — the Task Definitions and the Launchers involved

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskDefinitions** | [**List&lt;TaskDefinition&gt;**](TaskDefinition.md) | The Task Definitions that make up the nodes of this Workflow | [optional] [default to List<TaskDefinition>]
**launchers** | [**List&lt;LauncherResponse&gt;**](LauncherResponse.md) | The Launchers of this Workflow, as full Launcher objects. At most the first 10 by launcher id are returned, in the same order as ListLaunchers gives by default. Inactive Launchers are included. When the Workflow has more, launchersTruncated is true and ListLaunchers returns the full set | [optional] [default to List<LauncherResponse>]

```java
import com.finbourne.sdk.services.workflow.model.WorkflowStructureNodes;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<TaskDefinition> taskDefinitions = new List<TaskDefinition>();
@javax.annotation.Nullable List<LauncherResponse> launchers = new List<LauncherResponse>();


WorkflowStructureNodes workflowStructureNodesInstance = new WorkflowStructureNodes()
    .taskDefinitions(taskDefinitions)
    .launchers(launchers);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)