# com.finbourne.sdk.services.identity.model.CreateExternalTokenIssuerRequest
classname CreateExternalTokenIssuerRequest
Client input for creating an external token issuer.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | [default to String]
**issuer** | **String** |  | [default to String]
**audience** | **String** |  | [default to String]
**description** | **String** |  | [optional] [default to String]
**claimMappings** | [**ClaimMappings**](ClaimMappings.md) |  | [optional] [default to ClaimMappings]
**logoutUrl** | [**URI**](URI.md) |  | [default to URI]

```java
import com.finbourne.sdk.services.identity.model.CreateExternalTokenIssuerRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
String issuer = "example issuer";
String audience = "example audience";
@javax.annotation.Nullable String description = "example description";
ClaimMappings claimMappings = new ClaimMappings();
URI logoutUrl = URI.create("http://example.com/logoutUrl");


CreateExternalTokenIssuerRequest createExternalTokenIssuerRequestInstance = new CreateExternalTokenIssuerRequest()
    .code(code)
    .issuer(issuer)
    .audience(audience)
    .description(description)
    .claimMappings(claimMappings)
    .logoutUrl(logoutUrl);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)