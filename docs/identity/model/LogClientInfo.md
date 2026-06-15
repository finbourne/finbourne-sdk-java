# com.finbourne.sdk.services.identity.model.LogClientInfo
classname LogClientInfo
Represents a LogClientInfo resource in the Okta API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userAgent** | [**LogUserAgent**](LogUserAgent.md) |  | [optional] [default to LogUserAgent]
**zone** | **String** |  | [optional] [default to String]
**device** | **String** |  | [optional] [default to String]
**id** | **String** |  | [optional] [default to String]
**ipAddress** | **String** |  | [optional] [default to String]
**geographicalContext** | [**LogGeographicalContext**](LogGeographicalContext.md) |  | [optional] [default to LogGeographicalContext]

```java
import com.finbourne.sdk.services.identity.model.LogClientInfo;
import java.util.*;
import java.lang.System;
import java.net.URI;

LogUserAgent userAgent = new LogUserAgent();
@javax.annotation.Nullable String zone = "example zone";
@javax.annotation.Nullable String device = "example device";
@javax.annotation.Nullable String id = "example id";
@javax.annotation.Nullable String ipAddress = "example ipAddress";
LogGeographicalContext geographicalContext = new LogGeographicalContext();


LogClientInfo logClientInfoInstance = new LogClientInfo()
    .userAgent(userAgent)
    .zone(zone)
    .device(device)
    .id(id)
    .ipAddress(ipAddress)
    .geographicalContext(geographicalContext);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)