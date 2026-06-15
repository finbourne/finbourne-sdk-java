# com.finbourne.sdk.services.access.model.RoleCreationRequest
classname RoleCreationRequest
Request to create a role

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the role | [default to String]
**description** | **String** | The description of the role | [optional] [default to String]
**resource** | [**RoleResourceRequest**](RoleResourceRequest.md) |  | [default to RoleResourceRequest]
**when** | [**WhenSpec**](WhenSpec.md) |  | [default to WhenSpec]

```java
import com.finbourne.sdk.services.access.model.RoleCreationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
@javax.annotation.Nullable String description = "example description";
RoleResourceRequest resource = new RoleResourceRequest();
WhenSpec when = new WhenSpec();


RoleCreationRequest roleCreationRequestInstance = new RoleCreationRequest()
    .code(code)
    .description(description)
    .resource(resource)
    .when(when);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)