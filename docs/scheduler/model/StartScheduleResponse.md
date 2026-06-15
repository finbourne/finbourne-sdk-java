# com.finbourne.sdk.services.scheduler.model.StartScheduleResponse
classname StartScheduleResponse
Response from a manual run of a schedule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**jobId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**runId** | **String** | Unique RunId of the started schedule | [optional] [default to String]
**status** | **String** | Status of the started schedule | [optional] [default to String]
**result** | **String** | Link to the result of the job run when completed | [optional] [default to String]

```java
import com.finbourne.sdk.services.scheduler.model.StartScheduleResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId scheduleId = new ResourceId();
ResourceId jobId = new ResourceId();
@javax.annotation.Nullable String runId = "example runId";
@javax.annotation.Nullable String status = "example status";
@javax.annotation.Nullable String result = "example result";


StartScheduleResponse startScheduleResponseInstance = new StartScheduleResponse()
    .scheduleId(scheduleId)
    .jobId(jobId)
    .runId(runId)
    .status(status)
    .result(result);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)