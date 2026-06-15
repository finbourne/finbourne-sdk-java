# com.finbourne.sdk.services.workflow.model.ResultantChildTaskConfiguration
classname ResultantChildTaskConfiguration
Child Task Configuration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultMatchingPattern** | [**ResultMatchingPattern**](ResultMatchingPattern.md) |  | [optional] [default to ResultMatchingPattern]
**taskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**taskDefinitionAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | TaskDefinition AsAt timestamp | [optional] [default to OffsetDateTime]
**initialTrigger** | **String** | The Initial Trigger for automatic start | [optional] [default to String]
**childTaskFields** | [**Map&lt;String, FieldMapping&gt;**](FieldMapping.md) | Field Mappings | [default to Map<String, FieldMapping>]
**mapStackingKeyFrom** | **String** | The field to be mapped as the ChildTasks Stacking Key | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.ResultantChildTaskConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResultMatchingPattern resultMatchingPattern = new ResultMatchingPattern();
ResourceId taskDefinitionId = new ResourceId();
@javax.annotation.Nullable OffsetDateTime taskDefinitionAsAt = OffsetDateTime.now();
@javax.annotation.Nullable String initialTrigger = "example initialTrigger";
Map<String, FieldMapping> childTaskFields = new Map<String, FieldMapping>();
@javax.annotation.Nullable String mapStackingKeyFrom = "example mapStackingKeyFrom";


ResultantChildTaskConfiguration resultantChildTaskConfigurationInstance = new ResultantChildTaskConfiguration()
    .resultMatchingPattern(resultMatchingPattern)
    .taskDefinitionId(taskDefinitionId)
    .taskDefinitionAsAt(taskDefinitionAsAt)
    .initialTrigger(initialTrigger)
    .childTaskFields(childTaskFields)
    .mapStackingKeyFrom(mapStackingKeyFrom);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)