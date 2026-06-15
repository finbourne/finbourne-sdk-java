# com.finbourne.sdk.services.workflow.model.CreateWorkflowRequest
classname CreateWorkflowRequest
Contains required info to create a new Workflow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | Human readable name | [default to String]
**description** | **String** | Human readable description | [optional] [default to String]
**rootTaskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.sdk.services.workflow.model.CreateWorkflowRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
ResourceId rootTaskDefinitionId = new ResourceId();


CreateWorkflowRequest createWorkflowRequestInstance = new CreateWorkflowRequest()
    .id(id)
    .displayName(displayName)
    .description(description)
    .rootTaskDefinitionId(rootTaskDefinitionId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)