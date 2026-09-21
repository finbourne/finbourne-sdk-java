# com.finbourne.sdk.services.workflow.model.WorkflowRun
classname WorkflowRun
Information about the run of the Workflow that created this Task, inherited from the root/ultimate parent Task.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The id of this run of the Workflow. Assigned once, when the run is instantiated. | [default to Integer]
**asAtCreated** | [**OffsetDateTime**](OffsetDateTime.md) | The version.asAtCreated of the root/ultimate parent Task of this run. | [default to OffsetDateTime]
**completionStatus** | **String** | The completion status of the root/ultimate parent Task of this run: NotStarted, InProgress, or Completed. | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.WorkflowRun;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer id = new Integer("100.00");
OffsetDateTime asAtCreated = OffsetDateTime.now();
String completionStatus = "example completionStatus";


WorkflowRun workflowRunInstance = new WorkflowRun()
    .id(id)
    .asAtCreated(asAtCreated)
    .completionStatus(completionStatus);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)