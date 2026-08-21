# com.finbourne.sdk.services.horizon.model.WorkflowResultFieldsResponse
classname WorkflowResultFieldsResponse
The result fields an instance returns to the Workflow task that started its run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceId** | **String** | The instance these fields belong to. | [default to String]
**reportsToWorkflow** | **Boolean** | Whether this instance has an enabled RunWorkflow post-process task at all. | [default to Boolean]
**resultFields** | [**List&lt;WorkflowResultFieldResponse&gt;**](WorkflowResultFieldResponse.md) | Every distinct field declared across this instance&#39;s RunWorkflow tasks. | [default to List<WorkflowResultFieldResponse>]
**tasks** | [**List&lt;WorkflowResultFieldsTaskResponse&gt;**](WorkflowResultFieldsTaskResponse.md) | Per-task breakdown: an instance may declare different fields on success and on failure. | [default to List<WorkflowResultFieldsTaskResponse>]

```java
import com.finbourne.sdk.services.horizon.model.WorkflowResultFieldsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String instanceId = "example instanceId";
Boolean reportsToWorkflow = true;
List<WorkflowResultFieldResponse> resultFields = new List<WorkflowResultFieldResponse>();
List<WorkflowResultFieldsTaskResponse> tasks = new List<WorkflowResultFieldsTaskResponse>();


WorkflowResultFieldsResponse workflowResultFieldsResponseInstance = new WorkflowResultFieldsResponse()
    .instanceId(instanceId)
    .reportsToWorkflow(reportsToWorkflow)
    .resultFields(resultFields)
    .tasks(tasks);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)