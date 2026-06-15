# com.finbourne.sdk.services.access.model.RoleResourceRequest
classname RoleResourceRequest
RoleResourceRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nonTransitiveSupervisorRoleResource** | [**NonTransitiveSupervisorRoleResource**](NonTransitiveSupervisorRoleResource.md) |  | [optional] [default to NonTransitiveSupervisorRoleResource]
**policyIdRoleResource** | [**PolicyIdRoleResource**](PolicyIdRoleResource.md) |  | [optional] [default to PolicyIdRoleResource]

```java
import com.finbourne.sdk.services.access.model.RoleResourceRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

NonTransitiveSupervisorRoleResource nonTransitiveSupervisorRoleResource = new NonTransitiveSupervisorRoleResource();
PolicyIdRoleResource policyIdRoleResource = new PolicyIdRoleResource();


RoleResourceRequest roleResourceRequestInstance = new RoleResourceRequest()
    .nonTransitiveSupervisorRoleResource(nonTransitiveSupervisorRoleResource)
    .policyIdRoleResource(policyIdRoleResource);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)