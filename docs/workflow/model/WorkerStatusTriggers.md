# com.finbourne.sdk.services.workflow.model.WorkerStatusTriggers
classname WorkerStatusTriggers
Defines triggers that will be invoked per Worker outcome

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**started** | **String** | Trigger to invoke when the Worker has Started | [optional] [default to String]
**completedWithResults** | **String** | Trigger to invoke when the Worker has Completed (with results) | [optional] [default to String]
**completedNoResults** | **String** | Trigger to invoke when the Worker has Completed (no results) | [optional] [default to String]
**failedToStart** | **String** | Trigger to invoke when the Worker has Failed to Start | [optional] [default to String]
**failedToComplete** | **String** | Trigger to invoke when the Worker has Failed to Complete | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.WorkerStatusTriggers;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String started = "example started";
@javax.annotation.Nullable String completedWithResults = "example completedWithResults";
@javax.annotation.Nullable String completedNoResults = "example completedNoResults";
@javax.annotation.Nullable String failedToStart = "example failedToStart";
@javax.annotation.Nullable String failedToComplete = "example failedToComplete";


WorkerStatusTriggers workerStatusTriggersInstance = new WorkerStatusTriggers()
    .started(started)
    .completedWithResults(completedWithResults)
    .completedNoResults(completedNoResults)
    .failedToStart(failedToStart)
    .failedToComplete(failedToComplete);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)