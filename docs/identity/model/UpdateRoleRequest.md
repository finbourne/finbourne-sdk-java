# com.finbourne.sdk.services.identity.model.UpdateRoleRequest
classname UpdateRoleRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | The description for this role | [optional] [default to String]

```java
import com.finbourne.sdk.services.identity.model.UpdateRoleRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String description = "example description";


UpdateRoleRequest updateRoleRequestInstance = new UpdateRoleRequest()
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)