# com.finbourne.sdk.services.scheduler.model.TimeTrigger
classname TimeTrigger
Time-based trigger

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expression** | **String** | Cron expression | [optional] [default to String]
**timeZone** | **String** | Time zone of the Cron expression. If not provided, defaults to UTC | [optional] [default to String]

```java
import com.finbourne.sdk.services.scheduler.model.TimeTrigger;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String expression = "example expression";
@javax.annotation.Nullable String timeZone = "example timeZone";


TimeTrigger timeTriggerInstance = new TimeTrigger()
    .expression(expression)
    .timeZone(timeZone);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)