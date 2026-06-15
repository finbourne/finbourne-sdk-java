# com.finbourne.sdk.services.lusid.model.MembershipAmendmentRequest
classname MembershipAmendmentRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customDataModelId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**entityType** | **String** | The type of the entity that is being added or removed from the Custom Data Model. | [default to String]
**entityUniqueId** | **String** | The entity unique identifier of the entity that is being added or removed from the Custom Data Model. | [default to String]
**operation** | **String** | The operation to be performed on the entity&#39;s membership in the Custom Data Model. Available values: Add, Remove. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.MembershipAmendmentRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId customDataModelId = new ResourceId();
String entityType = "example entityType";
String entityUniqueId = "example entityUniqueId";
String operation = "example operation";


MembershipAmendmentRequest membershipAmendmentRequestInstance = new MembershipAmendmentRequest()
    .customDataModelId(customDataModelId)
    .entityType(entityType)
    .entityUniqueId(entityUniqueId)
    .operation(operation);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)