# com.finbourne.sdk.services.workflow.model.WorkflowStructureEdges
classname WorkflowStructureEdges
The edges of a Workflow structure graph — the parent-child relationships between Task Definitions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**childTaskDefinitions** | [**List&lt;ChildTaskDefinitionEdge&gt;**](ChildTaskDefinitionEdge.md) | The child Task Definition relationships | [optional] [default to List<ChildTaskDefinitionEdge>]

```java
import com.finbourne.sdk.services.workflow.model.WorkflowStructureEdges;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<ChildTaskDefinitionEdge> childTaskDefinitions = new List<ChildTaskDefinitionEdge>();


WorkflowStructureEdges workflowStructureEdgesInstance = new WorkflowStructureEdges()
    .childTaskDefinitions(childTaskDefinitions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)