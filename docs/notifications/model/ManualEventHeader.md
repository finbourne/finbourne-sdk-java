# com.finbourne.sdk.services.notifications.model.ManualEventHeader
classname ManualEventHeader
The header of the manual event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventType** | **String** | The event type of the manual event | [optional] [readonly] [default to String]
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of the manual event | [optional] [default to OffsetDateTime]
**userId** | **String** | The user ID of the manual event | [optional] [default to String]
**requestId** | **String** | The request ID of the manual event | [optional] [default to String]

```java
import com.finbourne.sdk.services.notifications.model.ManualEventHeader;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String eventType = "example eventType";
OffsetDateTime timestamp = OffsetDateTime.now();
@javax.annotation.Nullable String userId = "example userId";
@javax.annotation.Nullable String requestId = "example requestId";


ManualEventHeader manualEventHeaderInstance = new ManualEventHeader()
    .eventType(eventType)
    .timestamp(timestamp)
    .userId(userId)
    .requestId(requestId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)