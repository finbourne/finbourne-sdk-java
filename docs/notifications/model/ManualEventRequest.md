# com.finbourne.sdk.services.notifications.model.ManualEventRequest
classname ManualEventRequest
The information required to trigger a manual event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | [**ManualEventBody**](ManualEventBody.md) |  | [default to ManualEventBody]

```java
import com.finbourne.sdk.services.notifications.model.ManualEventRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ManualEventBody body = new ManualEventBody();


ManualEventRequest manualEventRequestInstance = new ManualEventRequest()
    .body(body);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)