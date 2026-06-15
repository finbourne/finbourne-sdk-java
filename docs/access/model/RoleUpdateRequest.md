# com.finbourne.sdk.services.access.model.RoleUpdateRequest
classname RoleUpdateRequest
Role update does not allow the changing of the id

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | The description of the role | [optional] [default to String]
**resource** | [**RoleResourceRequest**](RoleResourceRequest.md) |  | [default to RoleResourceRequest]
**when** | [**WhenSpec**](WhenSpec.md) |  | [default to WhenSpec]

```java
import com.finbourne.sdk.services.access.model.RoleUpdateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String description = "example description";
RoleResourceRequest resource = new RoleResourceRequest();
WhenSpec when = new WhenSpec();


RoleUpdateRequest roleUpdateRequestInstance = new RoleUpdateRequest()
    .description(description)
    .resource(resource)
    .when(when);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)