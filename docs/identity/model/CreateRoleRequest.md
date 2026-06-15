# com.finbourne.sdk.services.identity.model.CreateRoleRequest
classname CreateRoleRequest
Specifies the information required to create a new role.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The role name, which must be unique within the system. | [default to String]
**description** | **String** | The description for this role | [optional] [default to String]

```java
import com.finbourne.sdk.services.identity.model.CreateRoleRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
@javax.annotation.Nullable String description = "example description";


CreateRoleRequest createRoleRequestInstance = new CreateRoleRequest()
    .name(name)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)