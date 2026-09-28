# com.finbourne.sdk.services.workflow.model.ScheduleTaskFieldMapping
classname ScheduleTaskFieldMapping
How a Schedule Launcher fills one field of the root task from the instant the schedule fired

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mapFrom** | **String** | The value the field is taken from. One of - ScheduledTime | [default to String]
**dateTimeAdjustment** | [**DateTimeAdjustment**](DateTimeAdjustment.md) |  | [optional] [default to DateTimeAdjustment]

```java
import com.finbourne.sdk.services.workflow.model.ScheduleTaskFieldMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

String mapFrom = "example mapFrom";
DateTimeAdjustment dateTimeAdjustment = new DateTimeAdjustment();


ScheduleTaskFieldMapping scheduleTaskFieldMappingInstance = new ScheduleTaskFieldMapping()
    .mapFrom(mapFrom)
    .dateTimeAdjustment(dateTimeAdjustment);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)