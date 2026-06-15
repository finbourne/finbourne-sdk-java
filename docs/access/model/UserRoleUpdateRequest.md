# com.finbourne.sdk.services.access.model.UserRoleUpdateRequest
classname UserRoleUpdateRequest
Dto used to request updating a user's role

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resource** | [**PolicyIdRoleResource**](PolicyIdRoleResource.md) |  | [default to PolicyIdRoleResource]

```java
import com.finbourne.sdk.services.access.model.UserRoleUpdateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

PolicyIdRoleResource resource = new PolicyIdRoleResource();


UserRoleUpdateRequest userRoleUpdateRequestInstance = new UserRoleUpdateRequest()
    .resource(resource);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)