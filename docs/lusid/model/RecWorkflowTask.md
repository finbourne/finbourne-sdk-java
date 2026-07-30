# com.finbourne.sdk.services.lusid.model.RecWorkflowTask
classname RecWorkflowTask
The workflow service task that instantiated a rec instance.  Minimal placeholder until the full workflow service task DTO is available.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier of the workflow service task. | [optional] [default to String]
**taskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**state** | **String** | The current state of the workflow service task. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RecWorkflowTask;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String id = "example id";
ResourceId taskDefinitionId = new ResourceId();
@javax.annotation.Nullable String state = "example state";


RecWorkflowTask recWorkflowTaskInstance = new RecWorkflowTask()
    .id(id)
    .taskDefinitionId(taskDefinitionId)
    .state(state);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)