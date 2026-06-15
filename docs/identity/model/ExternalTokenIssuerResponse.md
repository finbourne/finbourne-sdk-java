# com.finbourne.sdk.services.identity.model.ExternalTokenIssuerResponse
classname ExternalTokenIssuerResponse
Response DTO exposed to client for an external token issuer.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The External Token Issuer Code | [optional] [default to String]
**issuer** | **String** | Issuer of the External Token Issuer | [optional] [default to String]
**audience** | **String** | Audience of the External Token Issuer | [optional] [default to String]
**description** | **String** | The Description of the External Token Issuer | [optional] [default to String]
**claimMappings** | [**ClaimMappings**](ClaimMappings.md) |  | [optional] [default to ClaimMappings]
**logoutUrl** | **String** | The LogoutUrl of the External Token Issuer | [optional] [default to String]

```java
import com.finbourne.sdk.services.identity.model.ExternalTokenIssuerResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String code = "example code";
@javax.annotation.Nullable String issuer = "example issuer";
@javax.annotation.Nullable String audience = "example audience";
@javax.annotation.Nullable String description = "example description";
ClaimMappings claimMappings = new ClaimMappings();
@javax.annotation.Nullable String logoutUrl = "example logoutUrl";


ExternalTokenIssuerResponse externalTokenIssuerResponseInstance = new ExternalTokenIssuerResponse()
    .code(code)
    .issuer(issuer)
    .audience(audience)
    .description(description)
    .claimMappings(claimMappings)
    .logoutUrl(logoutUrl);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)