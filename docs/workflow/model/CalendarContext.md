# com.finbourne.sdk.services.workflow.model.CalendarContext
classname CalendarContext
A named time zone and set of holiday calendars.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name the schedule and the date and time adjustments use to name this context | [default to String]
**timeZone** | **String** | The time zone to use. A TZ identifier, for example \&quot;Europe/London\&quot; | [default to String]
**holidayCalendars** | [**List&lt;CalendarReference&gt;**](CalendarReference.md) | The holiday calendars that decide which dates are business days in this context | [optional] [default to List<CalendarReference>]

```java
import com.finbourne.sdk.services.workflow.model.CalendarContext;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
String timeZone = "example timeZone";
@javax.annotation.Nullable List<CalendarReference> holidayCalendars = new List<CalendarReference>();


CalendarContext calendarContextInstance = new CalendarContext()
    .name(name)
    .timeZone(timeZone)
    .holidayCalendars(holidayCalendars);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)