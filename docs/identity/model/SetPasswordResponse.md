# com.finbourne.sdk.services.identity.model.SetPasswordResponse
classname SetPasswordResponse
The result of setting a password

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time at which the password was successfully updated | [default to OffsetDateTime]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.identity.model.SetPasswordResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime updatedAt = OffsetDateTime.now();
@javax.annotation.Nullable List<Link> links = new List<Link>();


SetPasswordResponse setPasswordResponseInstance = new SetPasswordResponse()
    .updatedAt(updatedAt)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)