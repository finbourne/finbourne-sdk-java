# com.finbourne.sdk.services.identity.model.AuthenticationInformation
classname AuthenticationInformation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**issuerUrl** | **String** |  | [default to String]
**fallbackIssuerUrls** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**samlIdentityProviderId** | **String** |  | [optional] [default to String]
**support** | [**SupportAccessExpiry**](SupportAccessExpiry.md) |  | [optional] [default to SupportAccessExpiry]
**supportAccessExpiryWithRole** | [**List&lt;SupportAccessExpiryWithRole&gt;**](SupportAccessExpiryWithRole.md) |  | [optional] [default to List<SupportAccessExpiryWithRole>]
**status** | **Boolean** |  | [optional] [default to Boolean]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.identity.model.AuthenticationInformation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String issuerUrl = "example issuerUrl";
@javax.annotation.Nullable List<String> fallbackIssuerUrls = new List<String>();
@javax.annotation.Nullable String samlIdentityProviderId = "example samlIdentityProviderId";
SupportAccessExpiry support = new SupportAccessExpiry();
@javax.annotation.Nullable List<SupportAccessExpiryWithRole> supportAccessExpiryWithRole = new List<SupportAccessExpiryWithRole>();
Boolean status = true;
@javax.annotation.Nullable List<Link> links = new List<Link>();


AuthenticationInformation authenticationInformationInstance = new AuthenticationInformation()
    .issuerUrl(issuerUrl)
    .fallbackIssuerUrls(fallbackIssuerUrls)
    .samlIdentityProviderId(samlIdentityProviderId)
    .support(support)
    .supportAccessExpiryWithRole(supportAccessExpiryWithRole)
    .status(status)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)