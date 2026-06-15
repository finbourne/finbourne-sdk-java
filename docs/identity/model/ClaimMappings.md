# com.finbourne.sdk.services.identity.model.ClaimMappings
classname ClaimMappings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **String** |  | [default to String]
**login** | **String** |  | [default to String]
**email** | **String** |  | [default to String]
**firstName** | **String** |  | [default to String]
**lastName** | **String** |  | [default to String]
**userType** | **String** |  | [default to String]
**groups** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.identity.model.ClaimMappings;
import java.util.*;
import java.lang.System;
import java.net.URI;

String userId = "example userId";
String login = "example login";
String email = "example email";
String firstName = "example firstName";
String lastName = "example lastName";
String userType = "example userType";
@javax.annotation.Nullable String groups = "example groups";


ClaimMappings claimMappingsInstance = new ClaimMappings()
    .userId(userId)
    .login(login)
    .email(email)
    .firstName(firstName)
    .lastName(lastName)
    .userType(userType)
    .groups(groups);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)