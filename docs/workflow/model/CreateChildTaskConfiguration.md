# com.finbourne.sdk.services.workflow.model.CreateChildTaskConfiguration
classname CreateChildTaskConfiguration
Create Child Task Configuration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**taskDefinitionAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | TaskDefinition AsAt timestamp | [optional] [default to OffsetDateTime]
**initialTrigger** | **String** | The Initial Trigger for automatic start | [optional] [default to String]
**childTaskFields** | [**Map&lt;String, FieldMapping&gt;**](FieldMapping.md) | Field Mappings | [optional] [default to Map<String, FieldMapping>]
**mapStackingKeyFrom** | **String** | If present, the value of this field on the parent task will be the Stacking Key on any created child tasks | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.CreateChildTaskConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId taskDefinitionId = new ResourceId();
@javax.annotation.Nullable OffsetDateTime taskDefinitionAsAt = OffsetDateTime.now();
@javax.annotation.Nullable String initialTrigger = "example initialTrigger";
@javax.annotation.Nullable Map<String, FieldMapping> childTaskFields = new Map<String, FieldMapping>();
@javax.annotation.Nullable String mapStackingKeyFrom = "example mapStackingKeyFrom";


CreateChildTaskConfiguration createChildTaskConfigurationInstance = new CreateChildTaskConfiguration()
    .taskDefinitionId(taskDefinitionId)
    .taskDefinitionAsAt(taskDefinitionAsAt)
    .initialTrigger(initialTrigger)
    .childTaskFields(childTaskFields)
    .mapStackingKeyFrom(mapStackingKeyFrom);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)