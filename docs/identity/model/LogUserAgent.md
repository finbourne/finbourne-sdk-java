# com.finbourne.sdk.services.identity.model.LogUserAgent
classname LogUserAgent
Represents a LogUserAgent resource in the Okta API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rawUserAgent** | **String** |  | [optional] [default to String]
**operatingSystem** | **String** |  | [optional] [default to String]
**browser** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.identity.model.LogUserAgent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String rawUserAgent = "example rawUserAgent";
@javax.annotation.Nullable String operatingSystem = "example operatingSystem";
@javax.annotation.Nullable String browser = "example browser";


LogUserAgent logUserAgentInstance = new LogUserAgent()
    .rawUserAgent(rawUserAgent)
    .operatingSystem(operatingSystem)
    .browser(browser);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)