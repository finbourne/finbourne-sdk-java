# com.finbourne.sdk.services.workflow.model.CreateWorkerRequest
classname CreateWorkerRequest
Request to Create a new worker

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | Human readable name | [default to String]
**description** | **String** | Human readable description | [optional] [default to String]
**workerConfiguration** | [**WorkerConfiguration**](WorkerConfiguration.md) |  | [default to WorkerConfiguration]

```java
import com.finbourne.sdk.services.workflow.model.CreateWorkerRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
WorkerConfiguration workerConfiguration = new WorkerConfiguration();


CreateWorkerRequest createWorkerRequestInstance = new CreateWorkerRequest()
    .id(id)
    .displayName(displayName)
    .description(description)
    .workerConfiguration(workerConfiguration);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)