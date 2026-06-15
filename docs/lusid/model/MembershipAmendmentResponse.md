# com.finbourne.sdk.services.lusid.model.MembershipAmendmentResponse
classname MembershipAmendmentResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customDataModelId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**entityType** | **String** | The type of the entity that was added or removed from the Custom Data Model. | [default to String]
**entityUniqueId** | **String** | The entity unique identifier of the entity that was added or removed from the Custom Data Model. | [default to String]
**operation** | **String** | The operation that was performed on the entity&#39;s membership in the Custom Data Model. Either &#39;Add&#39; or &#39;Remove&#39;. | [default to String]
**entityDisplayName** | **String** | The display name of the entity that was added or removed from the Custom Data Model. | [default to String]
**dataModelMembership** | [**DataModelMembership**](DataModelMembership.md) |  | [optional] [default to DataModelMembership]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  | [optional] [default to StagedModificationsInfo]

```java
import com.finbourne.sdk.services.lusid.model.MembershipAmendmentResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId customDataModelId = new ResourceId();
String entityType = "example entityType";
String entityUniqueId = "example entityUniqueId";
String operation = "example operation";
String entityDisplayName = "example entityDisplayName";
DataModelMembership dataModelMembership = new DataModelMembership();
Version version = new Version();
StagedModificationsInfo stagedModifications = new StagedModificationsInfo();


MembershipAmendmentResponse membershipAmendmentResponseInstance = new MembershipAmendmentResponse()
    .customDataModelId(customDataModelId)
    .entityType(entityType)
    .entityUniqueId(entityUniqueId)
    .operation(operation)
    .entityDisplayName(entityDisplayName)
    .dataModelMembership(dataModelMembership)
    .version(version)
    .stagedModifications(stagedModifications);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)