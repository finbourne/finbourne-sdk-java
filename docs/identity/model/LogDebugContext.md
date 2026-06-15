# com.finbourne.sdk.services.identity.model.LogDebugContext
classname LogDebugContext
Represents a LogDebugContext resource in the Okta API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**debugData** | **Map&lt;String, Object&gt;** |  | [optional] [default to Map<String, Object>]

```java
import com.finbourne.sdk.services.identity.model.LogDebugContext;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, Object> debugData = new Map<String, Object>();


LogDebugContext logDebugContextInstance = new LogDebugContext()
    .debugData(debugData);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)