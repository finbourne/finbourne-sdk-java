# com.finbourne.sdk.services.notifications.model.WebhookNotificationType
classname WebhookNotificationType
The information required to create or update a Webhook notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of delivery mechanism for this notification | [default to String]
**httpMethod** | **String** | The HTTP method such as GET, POST, etc. to use on the request | [default to String]
**url** | **String** | The URL to send the request to | [default to String]
**authenticationType** | **String** | The type of authentication to use on the request, can be one of the following values: - Lusid -  Internal LUSID call - BasicAuth - User specified Username and password - BearerToken - Authorization header with Bearer scheme and user specified key - None - No Authorization required on the webhook call | [default to String]
**authenticationConfigurationItemPaths** | **Map&lt;String, String&gt;** | The paths of the Configuration Store configuration items that contain the authentication configuration. Each authentication type requires different keys: - Lusid - None required - BasicAuth - Requires &#39;Username&#39; and &#39;Password&#39; - BearerToken - Requires &#39;BearerToken&#39; and optionally &#39;BearerScheme&#39; - None - None required              e.g. the following would be valid assuming that the config is present in the configuration store at the specified paths:                  \&quot;authenticationType\&quot;: \&quot;BasicAuth\&quot;,     \&quot;authenticationConfigurationItemPaths\&quot;: {         \&quot;Username\&quot;: \&quot;config://personal/myUserId/WebhookConfigurations/ExampleService/AdminUser\&quot;,         \&quot;Password\&quot;: \&quot;config://personal/myUserId/WebhookConfigurations/ExampleService/AdminPassword\&quot;     } | [optional] [default to Map<String, String>]
**contentType** | **String** | The type of the content e.g. Json | [default to String]
**content** | **Object** | The content of the request | [optional] [default to Object]

```java
import com.finbourne.sdk.services.notifications.model.WebhookNotificationType;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
String httpMethod = "example httpMethod";
String url = "example url";
String authenticationType = "example authenticationType";
@javax.annotation.Nullable Map<String, String> authenticationConfigurationItemPaths = new Map<String, String>();
String contentType = "example contentType";
@javax.annotation.Nullable Object 

WebhookNotificationType webhookNotificationTypeInstance = new WebhookNotificationType()
    .type(type)
    .httpMethod(httpMethod)
    .url(url)
    .authenticationType(authenticationType)
    .authenticationConfigurationItemPaths(authenticationConfigurationItemPaths)
    .contentType(contentType)
    .content(content);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)