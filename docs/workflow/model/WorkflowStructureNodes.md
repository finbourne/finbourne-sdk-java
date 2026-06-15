# com.finbourne.sdk.services.workflow.model.WorkflowStructureNodes
classname WorkflowStructureNodes
The nodes of a Workflow structure graph — the Task Definitions involved

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskDefinitions** | [**List&lt;TaskDefinition&gt;**](TaskDefinition.md) | The Task Definitions that make up the nodes of this Workflow | [optional] [default to List<TaskDefinition>]

```java
import com.finbourne.sdk.services.workflow.model.WorkflowStructureNodes;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<TaskDefinition> taskDefinitions = new List<TaskDefinition>();


WorkflowStructureNodes workflowStructureNodesInstance = new WorkflowStructureNodes()
    .taskDefinitions(taskDefinitions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)