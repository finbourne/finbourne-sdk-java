# com.finbourne.sdk.services.notifications.model.EmailNotificationTypeResponse
classname EmailNotificationTypeResponse
Holds readonly information about an Email notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of delivery mechanism for this notification | [optional] [default to String]
**subject** | **String** | The subject of the email | [optional] [default to String]
**plainTextBody** | **String** | The plain text body of the email | [optional] [default to String]
**htmlBody** | **String** | The HTML body of the email (if any) | [optional] [default to String]
**emailAddressTo** | **List&lt;String&gt;** | &#39;To&#39; recipients of the email | [optional] [default to List<String>]
**emailAddressCc** | **List&lt;String&gt;** | &#39;Cc&#39; recipients of the email | [optional] [default to List<String>]
**emailAddressBcc** | **List&lt;String&gt;** | &#39;Bcc&#39; recipients of the email | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.notifications.model.EmailNotificationTypeResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String subject = "example subject";
@javax.annotation.Nullable String plainTextBody = "example plainTextBody";
@javax.annotation.Nullable String htmlBody = "example htmlBody";
@javax.annotation.Nullable List<String> emailAddressTo = new List<String>();
@javax.annotation.Nullable List<String> emailAddressCc = new List<String>();
@javax.annotation.Nullable List<String> emailAddressBcc = new List<String>();


EmailNotificationTypeResponse emailNotificationTypeResponseInstance = new EmailNotificationTypeResponse()
    .type(type)
    .subject(subject)
    .plainTextBody(plainTextBody)
    .htmlBody(htmlBody)
    .emailAddressTo(emailAddressTo)
    .emailAddressCc(emailAddressCc)
    .emailAddressBcc(emailAddressBcc);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)