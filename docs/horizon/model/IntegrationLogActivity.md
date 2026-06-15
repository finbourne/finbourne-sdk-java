# com.finbourne.sdk.services.horizon.model.IntegrationLogActivity
classname IntegrationLogActivity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**resultingStatus** | **String** |  | [default to String]
**messageType** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.horizon.model.IntegrationLogActivity;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime timestamp = OffsetDateTime.now();
String resultingStatus = "example resultingStatus";
@javax.annotation.Nullable String messageType = "example messageType";
@javax.annotation.Nullable String description = "example description";


IntegrationLogActivity integrationLogActivityInstance = new IntegrationLogActivity()
    .timestamp(timestamp)
    .resultingStatus(resultingStatus)
    .messageType(messageType)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)