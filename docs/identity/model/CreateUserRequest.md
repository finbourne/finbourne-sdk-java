# com.finbourne.sdk.services.identity.model.CreateUserRequest
classname CreateUserRequest
Details necessary for creating a new user

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstName** | **String** | The first name of the user | [default to String]
**lastName** | **String** | The last name of the user | [default to String]
**emailAddress** | **String** | The user&#39;s email address - to which the account validation email will be sent. For user accounts this should exactly match the Login. | [default to String]
**secondEmailAddress** | **String** | The user&#39;s second email address. Only allowed for Service users | [optional] [default to String]
**login** | **String** | The user&#39;s login username, which must be unique within the system. For user accounts this should exactly match the user&#39;s email address. | [default to String]
**alternativeUserIds** | **Map&lt;String, String&gt;** |  | [optional] [default to Map<String, String>]
**roles** | [**List&lt;RoleId&gt;**](RoleId.md) | Optional. Any known roles the user should be created with. | [optional] [default to List<RoleId>]
**type** | **String** | The type of user (e.g. Personal or Service) | [default to String]
**userExpiry** | [**OffsetDateTime**](OffsetDateTime.md) | The user&#39;s expiry unix datetime | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.identity.model.CreateUserRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String firstName = "example firstName";
String lastName = "example lastName";
String emailAddress = "example emailAddress";
@javax.annotation.Nullable String secondEmailAddress = "example secondEmailAddress";
String login = "example login";
@javax.annotation.Nullable Map<String, String> alternativeUserIds = new Map<String, String>();
@javax.annotation.Nullable List<RoleId> roles = new List<RoleId>();
String type = "example type";
@javax.annotation.Nullable OffsetDateTime userExpiry = OffsetDateTime.now();


CreateUserRequest createUserRequestInstance = new CreateUserRequest()
    .firstName(firstName)
    .lastName(lastName)
    .emailAddress(emailAddress)
    .secondEmailAddress(secondEmailAddress)
    .login(login)
    .alternativeUserIds(alternativeUserIds)
    .roles(roles)
    .type(type)
    .userExpiry(userExpiry);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)