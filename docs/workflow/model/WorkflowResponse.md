# com.finbourne.sdk.services.workflow.model.WorkflowResponse
classname WorkflowResponse
A Workflow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**version** | [**VersionInfo**](VersionInfo.md) |  | [optional] [default to VersionInfo]
**displayName** | **String** | Human readable name | [default to String]
**description** | **String** | Human readable description | [optional] [default to String]
**rootTaskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**workflowStructure** | [**WorkflowStructure**](WorkflowStructure.md) |  | [optional] [default to WorkflowStructure]

```java
import com.finbourne.sdk.services.workflow.model.WorkflowResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
VersionInfo version = new VersionInfo();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
ResourceId rootTaskDefinitionId = new ResourceId();
WorkflowStructure workflowStructure = new WorkflowStructure();


WorkflowResponse workflowResponseInstance = new WorkflowResponse()
    .id(id)
    .version(version)
    .displayName(displayName)
    .description(description)
    .rootTaskDefinitionId(rootTaskDefinitionId)
    .workflowStructure(workflowStructure);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)