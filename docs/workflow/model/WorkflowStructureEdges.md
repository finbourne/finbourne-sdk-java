# com.finbourne.sdk.services.workflow.model.WorkflowStructureEdges
classname WorkflowStructureEdges
The edges of a Workflow structure graph — the parent-child relationships between Task Definitions and the relationships between Launchers and the Task Definitions they start

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**childTaskDefinitions** | [**List&lt;ChildTaskDefinitionEdge&gt;**](ChildTaskDefinitionEdge.md) | The child Task Definition relationships | [optional] [default to List<ChildTaskDefinitionEdge>]
**launchers** | [**List&lt;LauncherEdge&gt;**](LauncherEdge.md) | The Launcher relationships. There is one entry per Launcher in nodes.launchers, in the same order | [optional] [default to List<LauncherEdge>]

```java
import com.finbourne.sdk.services.workflow.model.WorkflowStructureEdges;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<ChildTaskDefinitionEdge> childTaskDefinitions = new List<ChildTaskDefinitionEdge>();
@javax.annotation.Nullable List<LauncherEdge> launchers = new List<LauncherEdge>();


WorkflowStructureEdges workflowStructureEdgesInstance = new WorkflowStructureEdges()
    .childTaskDefinitions(childTaskDefinitions)
    .launchers(launchers);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)