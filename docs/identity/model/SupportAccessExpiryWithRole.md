# com.finbourne.sdk.services.identity.model.SupportAccessExpiryWithRole
classname SupportAccessExpiryWithRole
Time at which the support access granted for a role expires

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expiry** | [**OffsetDateTime**](OffsetDateTime.md) | DateTimeOffset at which the access will be revoked | [default to OffsetDateTime]
**permittedRole** | **String** | Unique identifier for permitted role.  Use GET /identity/api/authentication/support-roles to lookup role label/code from identifier. | [default to String]

```java
import com.finbourne.sdk.services.identity.model.SupportAccessExpiryWithRole;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime expiry = OffsetDateTime.now();
String permittedRole = "example permittedRole";


SupportAccessExpiryWithRole supportAccessExpiryWithRoleInstance = new SupportAccessExpiryWithRole()
    .expiry(expiry)
    .permittedRole(permittedRole);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)