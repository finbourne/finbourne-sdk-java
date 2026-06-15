# com.finbourne.sdk.services.notifications.model.EmailNotificationType
classname EmailNotificationType
The information required to create or update an Email notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of delivery mechanism for this notification | [default to String]
**subject** | **String** | The subject of the email | [default to String]
**plainTextBody** | **String** | The plain text body of the email | [default to String]
**htmlBody** | **String** | The HTML body of the email (if any) | [optional] [default to String]
**emailAddressTo** | **List&lt;String&gt;** | &#39;To&#39; recipients of the email | [default to List<String>]
**emailAddressCc** | **List&lt;String&gt;** | &#39;Cc&#39; recipients of the email | [optional] [default to List<String>]
**emailAddressBcc** | **List&lt;String&gt;** | &#39;Bcc&#39; recipients of the email | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.notifications.model.EmailNotificationType;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
String subject = "example subject";
String plainTextBody = "example plainTextBody";
@javax.annotation.Nullable String htmlBody = "example htmlBody";
List<String> emailAddressTo = new List<String>();
@javax.annotation.Nullable List<String> emailAddressCc = new List<String>();
@javax.annotation.Nullable List<String> emailAddressBcc = new List<String>();


EmailNotificationType emailNotificationTypeInstance = new EmailNotificationType()
    .type(type)
    .subject(subject)
    .plainTextBody(plainTextBody)
    .htmlBody(htmlBody)
    .emailAddressTo(emailAddressTo)
    .emailAddressCc(emailAddressCc)
    .emailAddressBcc(emailAddressBcc);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)