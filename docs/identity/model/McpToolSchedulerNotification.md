# com.finbourne.sdk.services.identity.model.McpToolSchedulerNotification
classname McpToolSchedulerNotification
A notification configuration for a scheduler job

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of notification (e.g., \&quot;Email\&quot;, \&quot;Webhook\&quot;) | [default to String]
**target** | **String** | The target of the notification (e.g., email address, webhook URL) | [default to String]
**trigger** | **String** | When to send the notification (e.g., \&quot;OnSuccess\&quot;, \&quot;OnFailure\&quot;, \&quot;Always\&quot;) | [default to String]

```java
import com.finbourne.sdk.services.identity.model.McpToolSchedulerNotification;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
String target = "example target";
String trigger = "example trigger";


McpToolSchedulerNotification mcpToolSchedulerNotificationInstance = new McpToolSchedulerNotification()
    .type(type)
    .target(target)
    .trigger(trigger);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)