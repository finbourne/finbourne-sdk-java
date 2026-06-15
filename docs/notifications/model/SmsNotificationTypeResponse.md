# com.finbourne.sdk.services.notifications.model.SmsNotificationTypeResponse
classname SmsNotificationTypeResponse
Holds readonly information about an SMS notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of delivery mechanism for this notification | [optional] [default to String]
**body** | **String** | The body of the SMS | [optional] [default to String]
**recipients** | **List&lt;String&gt;** | The phone numbers to which the SMS will be sent to (E.164 format) | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.notifications.model.SmsNotificationTypeResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String body = "example body";
@javax.annotation.Nullable List<String> recipients = new List<String>();


SmsNotificationTypeResponse smsNotificationTypeResponseInstance = new SmsNotificationTypeResponse()
    .type(type)
    .body(body)
    .recipients(recipients);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)