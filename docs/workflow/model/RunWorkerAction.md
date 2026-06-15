# com.finbourne.sdk.services.workflow.model.RunWorkerAction
classname RunWorkerAction
Defines a Run Worker Action

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type name for this Action | [default to String]
**workerId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**workerAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | Worker AsAt | [optional] [default to OffsetDateTime]
**workerParameters** | [**Map&lt;String, FieldMapping&gt;**](FieldMapping.md) | Parameters for this Worker | [optional] [default to Map<String, FieldMapping>]
**workerStatusTriggers** | [**WorkerStatusTriggers**](WorkerStatusTriggers.md) |  | [optional] [default to WorkerStatusTriggers]
**childTaskConfigurations** | [**List&lt;ResultantChildTaskConfiguration&gt;**](ResultantChildTaskConfiguration.md) | Tasks can be generated from run worker results; this is the configuration | [optional] [default to List<ResultantChildTaskConfiguration>]
**workerTimeout** | **Integer** | Worker WorkerTimeout in seconds | [optional] [default to Integer]

```java
import com.finbourne.sdk.services.workflow.model.RunWorkerAction;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
ResourceId workerId = new ResourceId();
@javax.annotation.Nullable OffsetDateTime workerAsAt = OffsetDateTime.now();
@javax.annotation.Nullable Map<String, FieldMapping> workerParameters = new Map<String, FieldMapping>();
WorkerStatusTriggers workerStatusTriggers = new WorkerStatusTriggers();
@javax.annotation.Nullable List<ResultantChildTaskConfiguration> childTaskConfigurations = new List<ResultantChildTaskConfiguration>();
@javax.annotation.Nullable Integer workerTimeout = new Integer("100.00");


RunWorkerAction runWorkerActionInstance = new RunWorkerAction()
    .type(type)
    .workerId(workerId)
    .workerAsAt(workerAsAt)
    .workerParameters(workerParameters)
    .workerStatusTriggers(workerStatusTriggers)
    .childTaskConfigurations(childTaskConfigurations)
    .workerTimeout(workerTimeout);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)