# com.finbourne.sdk.services.workflow.model.ScheduleMatchingPatternContext
classname ScheduleMatchingPatternContext
Context for a Schedule Matching Pattern

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timeZone** | **String** | The time zone to use. A TZ Identifier e.g. \&quot;Europe/London\&quot; | [default to String]
**holidayCalendars** | [**List&lt;CalendarReference&gt;**](CalendarReference.md) | References to any Holiday Calendars to use | [optional] [default to List<CalendarReference>]

```java
import com.finbourne.sdk.services.workflow.model.ScheduleMatchingPatternContext;
import java.util.*;
import java.lang.System;
import java.net.URI;

String timeZone = "example timeZone";
@javax.annotation.Nullable List<CalendarReference> holidayCalendars = new List<CalendarReference>();


ScheduleMatchingPatternContext scheduleMatchingPatternContextInstance = new ScheduleMatchingPatternContext()
    .timeZone(timeZone)
    .holidayCalendars(holidayCalendars);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)