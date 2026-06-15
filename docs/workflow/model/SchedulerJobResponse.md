# com.finbourne.sdk.services.workflow.model.SchedulerJobResponse
classname SchedulerJobResponse
Readonly configuration for a Worker that calls a Scheduler job

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [optional] [default to String]
**jobId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.sdk.services.workflow.model.SchedulerJobResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
ResourceId jobId = new ResourceId();


SchedulerJobResponse schedulerJobResponseInstance = new SchedulerJobResponse()
    .type(type)
    .jobId(jobId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)