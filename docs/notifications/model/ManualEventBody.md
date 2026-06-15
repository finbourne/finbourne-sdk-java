# com.finbourne.sdk.services.notifications.model.ManualEventBody
classname ManualEventBody
The body of the manual event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subject** | **String** | The subject of the manual event | [default to String]
**message** | **String** | The message of the manual event | [default to String]
**jsonMessage** | **Object** | The JSON message of the manual event | [optional] [default to Object]

```java
import com.finbourne.sdk.services.notifications.model.ManualEventBody;
import java.util.*;
import java.lang.System;
import java.net.URI;

String subject = "example subject";
String message = "example message";
@javax.annotation.Nullable Object 

ManualEventBody manualEventBodyInstance = new ManualEventBody()
    .subject(subject)
    .message(message)
    .jsonMessage(jsonMessage);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)