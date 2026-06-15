# com.finbourne.sdk.services.identity.model.LogIpChainEntry
classname LogIpChainEntry
Represents a LogIpChainEntry resource in the Okta API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ip** | **String** |  | [optional] [default to String]
**geographicalContext** | [**LogGeographicalContext**](LogGeographicalContext.md) |  | [optional] [default to LogGeographicalContext]
**version** | **String** |  | [optional] [default to String]
**source** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.identity.model.LogIpChainEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String ip = "example ip";
LogGeographicalContext geographicalContext = new LogGeographicalContext();
@javax.annotation.Nullable String version = "example version";
@javax.annotation.Nullable String source = "example source";


LogIpChainEntry logIpChainEntryInstance = new LogIpChainEntry()
    .ip(ip)
    .geographicalContext(geographicalContext)
    .version(version)
    .source(source);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)