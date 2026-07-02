# com.finbourne.sdk.services.workflow.model.UpdateWorkflowRequest
classname UpdateWorkflowRequest
Contains required info to update an existing Workflow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | Human readable name | [default to String]
**description** | **String** | Human readable description | [optional] [default to String]
**rootTaskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The properties to set on the Workflow, keyed by property key. Optional. A null property value deletes the property. | [optional] [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.sdk.services.workflow.model.UpdateWorkflowRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
ResourceId rootTaskDefinitionId = new ResourceId();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();


UpdateWorkflowRequest updateWorkflowRequestInstance = new UpdateWorkflowRequest()
    .displayName(displayName)
    .description(description)
    .rootTaskDefinitionId(rootTaskDefinitionId)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)