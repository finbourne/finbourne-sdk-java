# com.finbourne.sdk.services.identity.model.LogAuthenticationContext
classname LogAuthenticationContext
Represents a LogAuthenticationContext resource in the Okta API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authenticationProvider** | **String** |  | [optional] [default to String]
**credentialProvider** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**credentialType** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**issuer** | [**LogIssuer**](LogIssuer.md) |  | [optional] [default to LogIssuer]
**_interface** | **String** |  | [optional] [default to String]
**authenticationStep** | **Integer** |  | [optional] [default to Integer]
**externalSessionId** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.identity.model.LogAuthenticationContext;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String authenticationProvider = "example authenticationProvider";
@javax.annotation.Nullable List<String> credentialProvider = new List<String>();
@javax.annotation.Nullable List<String> credentialType = new List<String>();
LogIssuer issuer = new LogIssuer();
@javax.annotation.Nullable String interface = "example interface";
@javax.annotation.Nullable Integer authenticationStep = new Integer("100.00");
@javax.annotation.Nullable String externalSessionId = "example externalSessionId";


LogAuthenticationContext logAuthenticationContextInstance = new LogAuthenticationContext()
    .authenticationProvider(authenticationProvider)
    .credentialProvider(credentialProvider)
    .credentialType(credentialType)
    .issuer(issuer)
    .interface(interface)
    .authenticationStep(authenticationStep)
    .externalSessionId(externalSessionId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)