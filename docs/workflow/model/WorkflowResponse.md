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
**workflowStructure** | [**WorkflowStructure**](WorkflowStructure.md) |  | [default to WorkflowStructure]
**runCount** | **Integer** | The number of times this Workflow has been run. Starts at 0 and increments by 1 each time a new run is instantiated. | [default to Integer]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The properties of the Workflow, keyed by property key. | [optional] [default to Map<String, PerpetualProperty>]

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
Integer runCount = new Integer("100.00");
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();


WorkflowResponse workflowResponseInstance = new WorkflowResponse()
    .id(id)
    .version(version)
    .displayName(displayName)
    .description(description)
    .rootTaskDefinitionId(rootTaskDefinitionId)
    .workflowStructure(workflowStructure)
    .runCount(runCount)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)