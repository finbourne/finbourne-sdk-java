# com.finbourne.sdk.services.scheduler.model.StartJobResponse
classname StartJobResponse
Response from starting a job

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**runId** | **String** | Unique RunId of the started job run | [optional] [default to String]
**status** | **String** | Link to the status of the started job | [optional] [default to String]
**result** | **String** | Link to the result of the job run when completed | [optional] [default to String]

```java
import com.finbourne.sdk.services.scheduler.model.StartJobResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId jobId = new ResourceId();
@javax.annotation.Nullable String runId = "example runId";
@javax.annotation.Nullable String status = "example status";
@javax.annotation.Nullable String result = "example result";


StartJobResponse startJobResponseInstance = new StartJobResponse()
    .jobId(jobId)
    .runId(runId)
    .status(status)
    .result(result);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)