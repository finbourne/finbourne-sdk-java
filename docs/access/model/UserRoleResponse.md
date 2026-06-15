# com.finbourne.sdk.services.access.model.UserRoleResponse
classname UserRoleResponse
Response object from the user role API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resource** | [**RoleResourceRequest**](RoleResourceRequest.md) |  | [default to RoleResourceRequest]
**id** | [**RoleId**](RoleId.md) |  | [default to RoleId]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.access.model.UserRoleResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

RoleResourceRequest resource = new RoleResourceRequest();
RoleId id = new RoleId();
@javax.annotation.Nullable List<Link> links = new List<Link>();


UserRoleResponse userRoleResponseInstance = new UserRoleResponse()
    .resource(resource)
    .id(id)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)