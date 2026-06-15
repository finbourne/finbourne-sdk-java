# com.finbourne.sdk.services.access.model.RoleResponse
classname RoleResponse
Response object from the role API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**RoleId**](RoleId.md) |  | [default to RoleId]
**roleHierarchyIndex** | **Integer** | The hierarchical index of the role | [default to Integer]
**description** | **String** | The description of the role | [optional] [default to String]
**resource** | [**RoleResourceRequest**](RoleResourceRequest.md) |  | [default to RoleResourceRequest]
**when** | [**WhenSpec**](WhenSpec.md) |  | [default to WhenSpec]
**permission** | **String** | The action key of the role | [default to String]
**limit** | **Map&lt;String, String&gt;** | The identifiers of the role with the maximum privileges that this role can have | [optional] [default to Map<String, String>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.access.model.RoleResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

RoleId id = new RoleId();
Integer roleHierarchyIndex = new Integer("100.00");
@javax.annotation.Nullable String description = "example description";
RoleResourceRequest resource = new RoleResourceRequest();
WhenSpec when = new WhenSpec();
String permission = "example permission";
@javax.annotation.Nullable Map<String, String> limit = new Map<String, String>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


RoleResponse roleResponseInstance = new RoleResponse()
    .id(id)
    .roleHierarchyIndex(roleHierarchyIndex)
    .description(description)
    .resource(resource)
    .when(when)
    .permission(permission)
    .limit(limit)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)