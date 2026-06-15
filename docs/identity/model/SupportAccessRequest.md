# com.finbourne.sdk.services.identity.model.SupportAccessRequest
classname SupportAccessRequest
A Request to grant support access to your account

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration** | **String** | The duration for which access is requested (in any ISO-8601 format) | [default to String]
**description** | **String** | The description of why the support access has been granted (i.e. support ticket numbers) | [optional] [default to String]
**permittedRoles** | **List&lt;String&gt;** |  | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.identity.model.SupportAccessRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String duration = "example duration";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<String> permittedRoles = new List<String>();


SupportAccessRequest supportAccessRequestInstance = new SupportAccessRequest()
    .duration(duration)
    .description(description)
    .permittedRoles(permittedRoles);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)