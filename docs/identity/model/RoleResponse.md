# com.finbourne.sdk.services.identity.model.RoleResponse
classname RoleResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The role&#39;s system supplied unique identifier | [default to String]
**roleId** | [**RoleId**](RoleId.md) |  | [default to RoleId]
**source** | **String** | The source of the role | [default to String]
**name** | **String** | The role name, which must be unique within the system. | [default to String]
**description** | **String** | The description for this role | [optional] [default to String]
**samlName** | **String** | The name to use on the SAML request if assigning this role via SAML Just in Time (JIT) | [optional] [default to String]

```java
import com.finbourne.sdk.services.identity.model.RoleResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String id = "example id";
RoleId roleId = new RoleId();
String source = "example source";
String name = "example name";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable String samlName = "example samlName";


RoleResponse roleResponseInstance = new RoleResponse()
    .id(id)
    .roleId(roleId)
    .source(source)
    .name(name)
    .description(description)
    .samlName(samlName);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)