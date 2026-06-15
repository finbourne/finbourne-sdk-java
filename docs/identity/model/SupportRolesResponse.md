# com.finbourne.sdk.services.identity.model.SupportRolesResponse
classname SupportRolesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**supportRoles** | [**List&lt;SupportRole&gt;**](SupportRole.md) |  | [optional] [default to List<SupportRole>]

```java
import com.finbourne.sdk.services.identity.model.SupportRolesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<SupportRole> supportRoles = new List<SupportRole>();


SupportRolesResponse supportRolesResponseInstance = new SupportRolesResponse()
    .supportRoles(supportRoles);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)