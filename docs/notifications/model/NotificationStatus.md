# com.finbourne.sdk.services.notifications.model.NotificationStatus
classname NotificationStatus
The status object of a notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | **String** | The status of the notification | [optional] [default to String]
**lastUpdated** | [**OffsetDateTime**](OffsetDateTime.md) | The time at which the notification status was last updated | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.notifications.model.NotificationStatus;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String result = "example result";
OffsetDateTime lastUpdated = OffsetDateTime.now();


NotificationStatus notificationStatusInstance = new NotificationStatus()
    .result(result)
    .lastUpdated(lastUpdated);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)