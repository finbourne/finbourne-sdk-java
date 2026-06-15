# com.finbourne.sdk.services.identity.model.UpdateExternalTokenIssuerRequest
classname UpdateExternalTokenIssuerRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**issuer** | **String** |  | [optional] [default to String]
**audience** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**claimMappings** | [**ClaimMappings**](ClaimMappings.md) |  | [optional] [default to ClaimMappings]
**logoutUrl** | [**URI**](URI.md) |  | [optional] [default to URI]

```java
import com.finbourne.sdk.services.identity.model.UpdateExternalTokenIssuerRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String issuer = "example issuer";
@javax.annotation.Nullable String audience = "example audience";
@javax.annotation.Nullable String description = "example description";
ClaimMappings claimMappings = new ClaimMappings();
@javax.annotation.Nullable URI logoutUrl = URI.create("http://example.com/logoutUrl");


UpdateExternalTokenIssuerRequest updateExternalTokenIssuerRequestInstance = new UpdateExternalTokenIssuerRequest()
    .issuer(issuer)
    .audience(audience)
    .description(description)
    .claimMappings(claimMappings)
    .logoutUrl(logoutUrl);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)