# com.finbourne.sdk.services.identity.model.UserSummary
classname UserSummary
Lightweight view of an user details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The user id | [optional] [default to String]
**login** | **String** | The user login | [optional] [default to String]
**email** | **String** | The email address registered for that user | [optional] [default to String]
**secondEmail** | **String** |  | [optional] [default to String]
**firstName** | **String** | User&#39;s first name | [optional] [default to String]
**lastName** | **String** | User&#39;s last name | [optional] [default to String]
**type** | **String** | User&#39;s type (Personal, Service...) | [optional] [default to String]
**alternativeUserIds** | **Map&lt;String, String&gt;** | User&#39;s alternative user IDs. Only returned for the current user | [optional] [default to Map<String, String>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.identity.model.UserSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String id = "example id";
@javax.annotation.Nullable String login = "example login";
@javax.annotation.Nullable String email = "example email";
@javax.annotation.Nullable String secondEmail = "example secondEmail";
@javax.annotation.Nullable String firstName = "example firstName";
@javax.annotation.Nullable String lastName = "example lastName";
@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable Map<String, String> alternativeUserIds = new Map<String, String>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


UserSummary userSummaryInstance = new UserSummary()
    .id(id)
    .login(login)
    .email(email)
    .secondEmail(secondEmail)
    .firstName(firstName)
    .lastName(lastName)
    .type(type)
    .alternativeUserIds(alternativeUserIds)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)