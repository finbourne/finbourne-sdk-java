# com.finbourne.sdk.services.notifications.model.CreateNotificationRequest
classname CreateNotificationRequest
The information required to create a notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**notificationId** | **String** | The identifier of the notification. | [default to String]
**displayName** | **String** | The name of the notification | [default to String]
**description** | **String** | The summary of the services provided by the notification | [optional] [default to String]
**notificationType** | [**NotificationType**](NotificationType.md) |  | [default to NotificationType]

```java
import com.finbourne.sdk.services.notifications.model.CreateNotificationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String notificationId = "example notificationId";
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
NotificationType notificationType = new NotificationType();


CreateNotificationRequest createNotificationRequestInstance = new CreateNotificationRequest()
    .notificationId(notificationId)
    .displayName(displayName)
    .description(description)
    .notificationType(notificationType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)