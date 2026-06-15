# com.finbourne.sdk.services.workflow.model.TimeAdjustment
classname TimeAdjustment
A time adjustment to apply to the scheduled time of an EventHandler with a Finbourne.Workflow.WebApi.Common.Dto.Json.EventHandlers.ScheduleMatchingPattern

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**setTo** | [**SpecifiedTime**](SpecifiedTime.md) |  | [default to SpecifiedTime]

```java
import com.finbourne.sdk.services.workflow.model.TimeAdjustment;
import java.util.*;
import java.lang.System;
import java.net.URI;

SpecifiedTime setTo = new SpecifiedTime();


TimeAdjustment timeAdjustmentInstance = new TimeAdjustment()
    .setTo(setTo);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)