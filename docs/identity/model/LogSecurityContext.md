# com.finbourne.sdk.services.identity.model.LogSecurityContext
classname LogSecurityContext
Represents a LogSecurityContext resource in the Okta API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asNumber** | **Integer** |  | [optional] [default to Integer]
**asOrg** | **String** |  | [optional] [default to String]
**isp** | **String** |  | [optional] [default to String]
**domain** | **String** |  | [optional] [default to String]
**isProxy** | **Boolean** |  | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.identity.model.LogSecurityContext;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Integer asNumber = new Integer("100.00");
@javax.annotation.Nullable String asOrg = "example asOrg";
@javax.annotation.Nullable String isp = "example isp";
@javax.annotation.Nullable String domain = "example domain";
@javax.annotation.Nullable Boolean isProxy = true;


LogSecurityContext logSecurityContextInstance = new LogSecurityContext()
    .asNumber(asNumber)
    .asOrg(asOrg)
    .isp(isp)
    .domain(domain)
    .isProxy(isProxy);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)