# com.finbourne.sdk.services.scheduler.model.Notification
classname Notification
Notification type

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fireOn** | **String** | Condition for the notification | [optional] [readonly] [default to String]
**transport** | **String** | The type of the notification | [optional] [default to String]
**destination** | **List&lt;String&gt;** | Where the notification should be sent | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.scheduler.model.Notification;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String fireOn = "example fireOn";
@javax.annotation.Nullable String transport = "example transport";
@javax.annotation.Nullable List<String> destination = new List<String>();


Notification notificationInstance = new Notification()
    .fireOn(fireOn)
    .transport(transport)
    .destination(destination);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)