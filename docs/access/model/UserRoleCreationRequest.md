# com.finbourne.sdk.services.access.model.UserRoleCreationRequest
classname UserRoleCreationRequest
Dto used to request creating a user's role

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **String** | The Id of the user for whom to create the role. | [default to String]
**resource** | [**PolicyIdRoleResource**](PolicyIdRoleResource.md) |  | [default to PolicyIdRoleResource]

```java
import com.finbourne.sdk.services.access.model.UserRoleCreationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String userId = "example userId";
PolicyIdRoleResource resource = new PolicyIdRoleResource();


UserRoleCreationRequest userRoleCreationRequestInstance = new UserRoleCreationRequest()
    .userId(userId)
    .resource(resource);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)