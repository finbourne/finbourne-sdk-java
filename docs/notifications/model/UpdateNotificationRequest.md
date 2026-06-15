# com.finbourne.sdk.services.notifications.model.UpdateNotificationRequest
classname UpdateNotificationRequest
The information required to update a notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the notification | [default to String]
**description** | **String** | The summary of the services provided by the notification | [optional] [default to String]
**notificationType** | [**NotificationType**](NotificationType.md) |  | [default to NotificationType]

```java
import com.finbourne.sdk.services.notifications.model.UpdateNotificationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
NotificationType notificationType = new NotificationType();


UpdateNotificationRequest updateNotificationRequestInstance = new UpdateNotificationRequest()
    .displayName(displayName)
    .description(description)
    .notificationType(notificationType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)