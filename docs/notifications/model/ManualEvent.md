# com.finbourne.sdk.services.notifications.model.ManualEvent
classname ManualEvent
Details of a manually triggered event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**header** | [**ManualEventHeader**](ManualEventHeader.md) |  | [default to ManualEventHeader]
**body** | [**ManualEventBody**](ManualEventBody.md) |  | [default to ManualEventBody]

```java
import com.finbourne.sdk.services.notifications.model.ManualEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

ManualEventHeader header = new ManualEventHeader();
ManualEventBody body = new ManualEventBody();


ManualEvent manualEventInstance = new ManualEvent()
    .header(header)
    .body(body);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)