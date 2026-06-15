# com.finbourne.sdk.services.access.model.RoleId
classname RoleId

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** |  | [optional] [default to String]
**code** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.access.model.RoleId;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String scope = "example scope";
String code = "example code";


RoleId roleIdInstance = new RoleId()
    .scope(scope)
    .code(code);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)