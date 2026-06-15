# com.finbourne.sdk.services.notifications.model.Notification
classname Notification
A notification object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**notificationId** | **String** | The identifier of the notification | [default to String]
**displayName** | **String** | The name of the notification | [default to String]
**description** | **String** | The summary of the services provided by the notification | [optional] [default to String]
**notificationType** | [**NotificationTypeResponse**](NotificationTypeResponse.md) |  | [default to NotificationTypeResponse]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time at which the subscription was made | [default to OffsetDateTime]
**userIdCreated** | **String** | The user who made the subscription | [default to String]
**modifiedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time at which the subscription was last modified | [default to OffsetDateTime]
**userIdModified** | **String** | The user who last modified the subscription | [default to String]
**href** | [**URI**](URI.md) | A URI for retrieving this notification | [optional] [default to URI]

```java
import com.finbourne.sdk.services.notifications.model.Notification;
import java.util.*;
import java.lang.System;
import java.net.URI;

String notificationId = "example notificationId";
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
NotificationTypeResponse notificationType = new NotificationTypeResponse();
OffsetDateTime createdAt = OffsetDateTime.now();
String userIdCreated = "example userIdCreated";
OffsetDateTime modifiedAt = OffsetDateTime.now();
String userIdModified = "example userIdModified";
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");


Notification notificationInstance = new Notification()
    .notificationId(notificationId)
    .displayName(displayName)
    .description(description)
    .notificationType(notificationType)
    .createdAt(createdAt)
    .userIdCreated(userIdCreated)
    .modifiedAt(modifiedAt)
    .userIdModified(userIdModified)
    .href(href);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)