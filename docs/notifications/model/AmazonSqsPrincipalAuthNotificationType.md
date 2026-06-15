# com.finbourne.sdk.services.notifications.model.AmazonSqsPrincipalAuthNotificationType
classname AmazonSqsPrincipalAuthNotificationType
The information required to create or update an AWS SQS notification with principal authentication

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of delivery mechanism for this notification | [default to String]
**body** | **String** | The body of the Amazon Queue Message | [default to String]
**queueUrlRef** | **String** | Reference to queue url from Configuration Store | [default to String]

```java
import com.finbourne.sdk.services.notifications.model.AmazonSqsPrincipalAuthNotificationType;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
String body = "example body";
String queueUrlRef = "example queueUrlRef";


AmazonSqsPrincipalAuthNotificationType amazonSqsPrincipalAuthNotificationTypeInstance = new AmazonSqsPrincipalAuthNotificationType()
    .type(type)
    .body(body)
    .queueUrlRef(queueUrlRef);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)