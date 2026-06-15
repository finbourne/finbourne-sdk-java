# com.finbourne.sdk.services.workflow.model.BatchUpdateTasksRequest
classname BatchUpdateTasksRequest
A request to update multiple Tasks

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**updateTasks** | [**List&lt;UpdateTaskWithIdAndTriggerRequest&gt;**](UpdateTaskWithIdAndTriggerRequest.md) | A Dictionary of task IDs to UpdateTaskRequest | [optional] [default to List<UpdateTaskWithIdAndTriggerRequest>]

```java
import com.finbourne.sdk.services.workflow.model.BatchUpdateTasksRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<UpdateTaskWithIdAndTriggerRequest> updateTasks = new List<UpdateTaskWithIdAndTriggerRequest>();


BatchUpdateTasksRequest batchUpdateTasksRequestInstance = new BatchUpdateTasksRequest()
    .updateTasks(updateTasks);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)