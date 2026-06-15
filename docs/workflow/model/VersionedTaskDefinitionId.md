# com.finbourne.sdk.services.workflow.model.VersionedTaskDefinitionId
classname VersionedTaskDefinitionId
A Task Definition Id with an optional asAt timestamp identifying a specific version

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**taskDefinitionAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time of this version of the Task Definition. Null means the latest version. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.workflow.model.VersionedTaskDefinitionId;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId taskDefinitionId = new ResourceId();
@javax.annotation.Nullable OffsetDateTime taskDefinitionAsAt = OffsetDateTime.now();


VersionedTaskDefinitionId versionedTaskDefinitionIdInstance = new VersionedTaskDefinitionId()
    .taskDefinitionId(taskDefinitionId)
    .taskDefinitionAsAt(taskDefinitionAsAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)