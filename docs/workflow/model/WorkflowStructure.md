# com.finbourne.sdk.services.workflow.model.WorkflowStructure
classname WorkflowStructure
Describes the structure of a Workflow as a graph of Task Definitions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodes** | [**WorkflowStructureNodes**](WorkflowStructureNodes.md) |  | [optional] [default to WorkflowStructureNodes]
**edges** | [**WorkflowStructureEdges**](WorkflowStructureEdges.md) |  | [optional] [default to WorkflowStructureEdges]

```java
import com.finbourne.sdk.services.workflow.model.WorkflowStructure;
import java.util.*;
import java.lang.System;
import java.net.URI;

WorkflowStructureNodes nodes = new WorkflowStructureNodes();
WorkflowStructureEdges edges = new WorkflowStructureEdges();


WorkflowStructure workflowStructureInstance = new WorkflowStructure()
    .nodes(nodes)
    .edges(edges);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)