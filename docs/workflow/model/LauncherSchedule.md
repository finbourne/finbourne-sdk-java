# com.finbourne.sdk.services.workflow.model.LauncherSchedule
classname LauncherSchedule
When a Schedule Launcher starts a run of its Workflow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calendarContext** | **String** | The name of the calendar context the schedule is read in, which must be one the Launcher declares | [default to String]
**recurrencePattern** | [**RecurrencePattern**](RecurrencePattern.md) |  | [default to RecurrencePattern]

```java
import com.finbourne.sdk.services.workflow.model.LauncherSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String calendarContext = "example calendarContext";
RecurrencePattern recurrencePattern = new RecurrencePattern();


LauncherSchedule launcherScheduleInstance = new LauncherSchedule()
    .calendarContext(calendarContext)
    .recurrencePattern(recurrencePattern);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)