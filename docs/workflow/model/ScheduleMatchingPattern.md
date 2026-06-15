# com.finbourne.sdk.services.workflow.model.ScheduleMatchingPattern
classname ScheduleMatchingPattern
The Schedule Matching Pattern to trigger on

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | [**ScheduleMatchingPatternContext**](ScheduleMatchingPatternContext.md) |  | [default to ScheduleMatchingPatternContext]
**recurrencePattern** | [**RecurrencePattern**](RecurrencePattern.md) |  | [default to RecurrencePattern]

```java
import com.finbourne.sdk.services.workflow.model.ScheduleMatchingPattern;
import java.util.*;
import java.lang.System;
import java.net.URI;

ScheduleMatchingPatternContext context = new ScheduleMatchingPatternContext();
RecurrencePattern recurrencePattern = new RecurrencePattern();


ScheduleMatchingPattern scheduleMatchingPatternInstance = new ScheduleMatchingPattern()
    .context(context)
    .recurrencePattern(recurrencePattern);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)