# com.finbourne.sdk.services.workflow.model.SchedulerJob
classname SchedulerJob
Configuration for a Worker that calls a Scheduler Job

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [default to String]
**jobId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.sdk.services.workflow.model.SchedulerJob;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
ResourceId jobId = new ResourceId();


SchedulerJob schedulerJobInstance = new SchedulerJob()
    .type(type)
    .jobId(jobId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)