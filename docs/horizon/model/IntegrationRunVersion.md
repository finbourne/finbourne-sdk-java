# com.finbourne.sdk.services.horizon.model.IntegrationRunVersion
classname IntegrationRunVersion
Integration Run Version

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAtCreated** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**asAtModified** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.horizon.model.IntegrationRunVersion;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable OffsetDateTime asAtCreated = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime asAtModified = OffsetDateTime.now();


IntegrationRunVersion integrationRunVersionInstance = new IntegrationRunVersion()
    .asAtCreated(asAtCreated)
    .asAtModified(asAtModified);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)