# com.finbourne.sdk.services.identity.model.CurrentUserResponse
classname CurrentUserResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The user&#39;s system supplied unique identifier | [default to String]
**emailAddress** | **String** | The user&#39;s email address which may be null depending on the authentication method | [default to String]
**type** | **String** | The type of user (e.g. Personal or Service) | [default to String]
**domainType** | **String** | The type of domain in which the user exists | [optional] [default to String]
**userExpiry** | [**OffsetDateTime**](OffsetDateTime.md) | The user&#39;s user expiry datetime | [optional] [default to OffsetDateTime]
**groups** | **List&lt;String&gt;** | The groups this user belongs to | [optional] [default to List<String>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.identity.model.CurrentUserResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String id = "example id";
String emailAddress = "example emailAddress";
String type = "example type";
@javax.annotation.Nullable String domainType = "example domainType";
@javax.annotation.Nullable OffsetDateTime userExpiry = OffsetDateTime.now();
@javax.annotation.Nullable List<String> groups = new List<String>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


CurrentUserResponse currentUserResponseInstance = new CurrentUserResponse()
    .id(id)
    .emailAddress(emailAddress)
    .type(type)
    .domainType(domainType)
    .userExpiry(userExpiry)
    .groups(groups)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)