# com.finbourne.sdk.services.horizon.model.WorkflowRunResultsResponse
classname WorkflowRunResultsResponse
A run's status and the result values it published, which is what the Workflow AQS polls while it waits for an integration it started to finish.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | **String** | The run these results belong to, as returned by the execute endpoint. | [default to String]
**instanceId** | **String** | The instance that ran. | [default to String]
**status** | **String** | The run&#39;s status, reported exactly as the runs endpoint reports it: Queued, Started, Completed, Errored or Interrupted. A caller waiting for the run to finish is waiting for one of the last three. | [default to String]
**queuedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**startedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**completedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Null until the run reaches a terminal status. | [optional] [default to OffsetDateTime]
**attempt** | **Integer** | Which attempt this run is, counting reruns of the same work. | [default to Integer]
**reportsToWorkflow** | **Boolean** | Whether this run was started by a Workflow task. False for a scheduled or file-triggered run, which publishes no results because nothing is waiting on them. | [default to Boolean]
**results** | [**List&lt;WorkflowRunResultResponse&gt;**](WorkflowRunResultResponse.md) | One entry per field the instance declares, so the shape matches what the discovery endpoint promised when the worker was created. A declared field the run never published carries a null value. | [default to List<WorkflowRunResultResponse>]

```java
import com.finbourne.sdk.services.horizon.model.WorkflowRunResultsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String runId = "example runId";
String instanceId = "example instanceId";
String status = "example status";
@javax.annotation.Nullable OffsetDateTime queuedAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime startedAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime completedAt = OffsetDateTime.now();
Integer attempt = new Integer("100.00");
Boolean reportsToWorkflow = true;
List<WorkflowRunResultResponse> results = new List<WorkflowRunResultResponse>();


WorkflowRunResultsResponse workflowRunResultsResponseInstance = new WorkflowRunResultsResponse()
    .runId(runId)
    .instanceId(instanceId)
    .status(status)
    .queuedAt(queuedAt)
    .startedAt(startedAt)
    .completedAt(completedAt)
    .attempt(attempt)
    .reportsToWorkflow(reportsToWorkflow)
    .results(results);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)