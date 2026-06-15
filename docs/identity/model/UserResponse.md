# com.finbourne.sdk.services.identity.model.UserResponse
classname UserResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The user&#39;s system supplied unique identifier | [default to String]
**alternativeUserIds** | **Map&lt;String, String&gt;** | The user&#39;s alternative IDs | [optional] [default to Map<String, String>]
**emailAddress** | **String** | The user&#39;s emailAddress address, which must be unique within the system | [default to String]
**secondEmailAddress** | **String** | The user&#39;s second email address. Only allowed for service users. | [optional] [default to String]
**login** | **String** |  | [default to String]
**firstName** | **String** | The user&#39;s first name | [default to String]
**lastName** | **String** | The user&#39;s last name | [default to String]
**roles** | [**List&lt;RoleResponse&gt;**](RoleResponse.md) | The roles that the user has. | [optional] [default to List<RoleResponse>]
**type** | **String** | The type of user (e.g. Personal or Service) | [default to String]
**status** | **String** | The status of the user | [default to String]
**external** | **Boolean** | Whether or not the user originates from an external identity system | [default to Boolean]
**lastLogin** | [**OffsetDateTime**](OffsetDateTime.md) | Last time the user logged in | [optional] [default to OffsetDateTime]
**lastUpdated** | [**OffsetDateTime**](OffsetDateTime.md) | Last time the user was updated | [optional] [default to OffsetDateTime]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Date the user was created | [optional] [default to OffsetDateTime]
**passwordChanged** | [**OffsetDateTime**](OffsetDateTime.md) | Last time the password was changed for this user | [optional] [default to OffsetDateTime]
**userExpiry** | [**OffsetDateTime**](OffsetDateTime.md) | The user&#39;s expiry unix datetime | [optional] [default to OffsetDateTime]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.identity.model.UserResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String id = "example id";
@javax.annotation.Nullable Map<String, String> alternativeUserIds = new Map<String, String>();
String emailAddress = "example emailAddress";
@javax.annotation.Nullable String secondEmailAddress = "example secondEmailAddress";
String login = "example login";
String firstName = "example firstName";
String lastName = "example lastName";
@javax.annotation.Nullable List<RoleResponse> roles = new List<RoleResponse>();
String type = "example type";
String status = "example status";
Boolean external = true;
@javax.annotation.Nullable OffsetDateTime lastLogin = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime lastUpdated = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime created = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime passwordChanged = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime userExpiry = OffsetDateTime.now();
@javax.annotation.Nullable List<Link> links = new List<Link>();


UserResponse userResponseInstance = new UserResponse()
    .id(id)
    .alternativeUserIds(alternativeUserIds)
    .emailAddress(emailAddress)
    .secondEmailAddress(secondEmailAddress)
    .login(login)
    .firstName(firstName)
    .lastName(lastName)
    .roles(roles)
    .type(type)
    .status(status)
    .external(external)
    .lastLogin(lastLogin)
    .lastUpdated(lastUpdated)
    .created(created)
    .passwordChanged(passwordChanged)
    .userExpiry(userExpiry)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)