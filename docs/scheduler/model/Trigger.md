# com.finbourne.sdk.services.scheduler.model.Trigger
classname Trigger
Holds different kinds of triggers A schedule may only have one type of trigger

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timeTrigger** | [**TimeTrigger**](TimeTrigger.md) |  | [optional] [default to TimeTrigger]

```java
import com.finbourne.sdk.services.scheduler.model.Trigger;
import java.util.*;
import java.lang.System;
import java.net.URI;

TimeTrigger timeTrigger = new TimeTrigger();


Trigger triggerInstance = new Trigger()
    .timeTrigger(timeTrigger);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)