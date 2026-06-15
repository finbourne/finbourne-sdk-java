# com.finbourne.sdk.services.identity.model.UpdateUserRequest
classname UpdateUserRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstName** | **String** |  | [default to String]
**lastName** | **String** |  | [default to String]
**emailAddress** | **String** |  | [default to String]
**secondEmailAddress** | **String** |  | [optional] [default to String]
**login** | **String** | The user&#39;s login username, in the form of an email address, which must be unique within the system. For user accounts this should exactly match the user&#39;s email address. | [default to String]
**alternativeUserIds** | **Map&lt;String, String&gt;** |  | [optional] [default to Map<String, String>]
**roles** | [**List&lt;RoleId&gt;**](RoleId.md) | Deprecated. To update a user&#39;s roles use the AddUserToRole and RemoveUserFromRole endpoints | [optional] [default to List<RoleId>]
**userExpiry** | [**OffsetDateTime**](OffsetDateTime.md) | The user&#39;s expiry unix datetime | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.identity.model.UpdateUserRequest;
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
@javax.annotation.Nullable OffsetDateTime userExpiry = OffsetDateTime.now();


UpdateUserRequest updateUserRequestInstance = new UpdateUserRequest()
    .firstName(firstName)
    .lastName(lastName)
    .emailAddress(emailAddress)
    .secondEmailAddress(secondEmailAddress)
    .login(login)
    .alternativeUserIds(alternativeUserIds)
    .roles(roles)
    .userExpiry(userExpiry);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)