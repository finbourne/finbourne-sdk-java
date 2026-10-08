# com.finbourne.sdk.services.workflow.model.WorkflowStructure
classname WorkflowStructure
Describes the structure of a Workflow as a graph of its Task Definitions and its Launchers

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodes** | [**WorkflowStructureNodes**](WorkflowStructureNodes.md) |  | [optional] [default to WorkflowStructureNodes]
**edges** | [**WorkflowStructureEdges**](WorkflowStructureEdges.md) |  | [optional] [default to WorkflowStructureEdges]
**launchersTruncated** | **Boolean** | True when the Workflow has more Launchers than were returned inline in nodes.launchers. Call ListLaunchers for the full set | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.workflow.model.WorkflowStructure;
import java.util.*;
import java.lang.System;
import java.net.URI;

WorkflowStructureNodes nodes = new WorkflowStructureNodes();
WorkflowStructureEdges edges = new WorkflowStructureEdges();
Boolean launchersTruncated = true;


WorkflowStructure workflowStructureInstance = new WorkflowStructure()
    .nodes(nodes)
    .edges(edges)
    .launchersTruncated(launchersTruncated);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)