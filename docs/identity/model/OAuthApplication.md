# com.finbourne.sdk.services.identity.model.OAuthApplication
classname OAuthApplication

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | [default to String]
**type** | **String** |  | [default to String]
**displayName** | **String** |  | [default to String]
**secret** | **String** |  | [optional] [default to String]
**clientId** | **String** |  | [default to String]
**issuer** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.identity.model.OAuthApplication;
import java.util.*;
import java.lang.System;
import java.net.URI;

String id = "example id";
String type = "example type";
String displayName = "example displayName";
@javax.annotation.Nullable String secret = "example secret";
String clientId = "example clientId";
String issuer = "example issuer";


OAuthApplication oAuthApplicationInstance = new OAuthApplication()
    .id(id)
    .type(type)
    .displayName(displayName)
    .secret(secret)
    .clientId(clientId)
    .issuer(issuer);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)