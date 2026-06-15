# com.finbourne.sdk.services.identity.model.LogRequest
classname LogRequest
Represents a LogRequest resource in the Okta API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ipChain** | [**List&lt;LogIpChainEntry&gt;**](LogIpChainEntry.md) |  | [optional] [default to List<LogIpChainEntry>]

```java
import com.finbourne.sdk.services.identity.model.LogRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<LogIpChainEntry> ipChain = new List<LogIpChainEntry>();


LogRequest logRequestInstance = new LogRequest()
    .ipChain(ipChain);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)