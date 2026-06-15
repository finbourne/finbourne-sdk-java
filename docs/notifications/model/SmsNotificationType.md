# com.finbourne.sdk.services.notifications.model.SmsNotificationType
classname SmsNotificationType
The information required to create or update an SMS notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of delivery mechanism for this notification | [default to String]
**body** | **String** | The body of the SMS | [default to String]
**recipients** | **List&lt;String&gt;** | The phone numbers to which the SMS will be sent to (E.164 format) | [default to List<String>]

```java
import com.finbourne.sdk.services.notifications.model.SmsNotificationType;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
String body = "example body";
List<String> recipients = new List<String>();


SmsNotificationType smsNotificationTypeInstance = new SmsNotificationType()
    .type(type)
    .body(body)
    .recipients(recipients);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)