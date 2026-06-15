# com.finbourne.sdk.services.workflow.model.ScheduledTimeAdjustment
classname ScheduledTimeAdjustment
Represents an adjustment to the scheduled time of an EventHandler. Only relevant for EventHandlers with a Finbourne.Workflow.WebApi.Common.Dto.Json.EventHandlers.ScheduleMatchingPattern

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateAdjustment** | [**DateAdjustment**](DateAdjustment.md) |  | [default to DateAdjustment]
**timeAdjustment** | [**TimeAdjustment**](TimeAdjustment.md) |  | [default to TimeAdjustment]

```java
import com.finbourne.sdk.services.workflow.model.ScheduledTimeAdjustment;
import java.util.*;
import java.lang.System;
import java.net.URI;

DateAdjustment dateAdjustment = new DateAdjustment();
TimeAdjustment timeAdjustment = new TimeAdjustment();


ScheduledTimeAdjustment scheduledTimeAdjustmentInstance = new ScheduledTimeAdjustment()
    .dateAdjustment(dateAdjustment)
    .timeAdjustment(timeAdjustment);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)