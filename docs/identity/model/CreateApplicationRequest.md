# com.finbourne.sdk.services.identity.model.CreateApplicationRequest
classname CreateApplicationRequest
A request to create an application for authenticating the source of token requests

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The Display Name of the application | [default to String]
**clientId** | **String** | The OpenID Connect ClientId of the application | [default to String]
**type** | **String** | The Type of the application. This must be either Native or Web | [default to String]
**redirectUris** | **List&lt;String&gt;** | A web application&#39;s acceptable list of post-login redirect URIs | [optional] [default to List<String>]
**postLogoutRedirectUris** | **List&lt;String&gt;** | A web application&#39;s acceptable list of post-logout redirect URIs | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.identity.model.CreateApplicationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
String clientId = "example clientId";
String type = "example type";
@javax.annotation.Nullable List<String> redirectUris = new List<String>();
@javax.annotation.Nullable List<String> postLogoutRedirectUris = new List<String>();


CreateApplicationRequest createApplicationRequestInstance = new CreateApplicationRequest()
    .displayName(displayName)
    .clientId(clientId)
    .type(type)
    .redirectUris(redirectUris)
    .postLogoutRedirectUris(postLogoutRedirectUris);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)