# com.finbourne.sdk.services.notifications.model.WebhookNotificationTypeResponse
classname WebhookNotificationTypeResponse
Holds readonly information about a Webhook notification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of delivery mechanism for this notification | [optional] [default to String]
**httpMethod** | **String** | The HTTP method such as GET, POST, etc. to use on the request | [optional] [default to String]
**url** | **String** | The URL to send the request to | [optional] [default to String]
**authenticationType** | **String** | The type of authentication to use on the request | [optional] [default to String]
**authenticationConfigurationItemPaths** | **Map&lt;String, String&gt;** | The paths of the Configuration Store configuration items that contain the authentication configuration. Each authentication type requires different keys: - Lusid - None required - BasicAuth - Requires &#39;Username&#39; and &#39;Password&#39; - BearerToken - Requires &#39;BearerToken&#39; and optionally &#39;BearerScheme&#39;              e.g. the following would be valid assuming that the config is present in the configuration store at the specified paths:                  \&quot;authenticationType\&quot;: \&quot;BasicAuth\&quot;,     \&quot;authenticationConfigurationItemPaths\&quot;: {         \&quot;Username\&quot;: \&quot;config://personal/myUserId/WebhookConfigurations/ExampleService/AdminUser\&quot;,         \&quot;Password\&quot;: \&quot;config://personal/myUserId/WebhookConfigurations/ExampleService/AdminPassword\&quot;     } | [optional] [default to Map<String, String>]
**contentType** | **String** | The type of the content e.g. Json | [optional] [default to String]
**content** | **Object** | The content of the request | [optional] [default to Object]

```java
import com.finbourne.sdk.services.notifications.model.WebhookNotificationTypeResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String httpMethod = "example httpMethod";
@javax.annotation.Nullable String url = "example url";
@javax.annotation.Nullable String authenticationType = "example authenticationType";
@javax.annotation.Nullable Map<String, String> authenticationConfigurationItemPaths = new Map<String, String>();
@javax.annotation.Nullable String contentType = "example contentType";
@javax.annotation.Nullable Object 

WebhookNotificationTypeResponse webhookNotificationTypeResponseInstance = new WebhookNotificationTypeResponse()
    .type(type)
    .httpMethod(httpMethod)
    .url(url)
    .authenticationType(authenticationType)
    .authenticationConfigurationItemPaths(authenticationConfigurationItemPaths)
    .contentType(contentType)
    .content(content);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)