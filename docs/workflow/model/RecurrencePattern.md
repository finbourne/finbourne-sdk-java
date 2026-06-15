# com.finbourne.sdk.services.workflow.model.RecurrencePattern
classname RecurrencePattern
The Recurrence Pattern

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timeConstraints** | [**TimeConstraints**](TimeConstraints.md) |  | [default to TimeConstraints]
**dateRegularity** | [**DateRegularity**](DateRegularity.md) |  | [default to DateRegularity]
**businessDayAdjustment** | **String** | The Business Day Adjustment. One of None, Previous, Following, ModifiedPrevious, ModifiedFollowing, HalfMonthModifiedFollowing, Nearest | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.RecurrencePattern;
import java.util.*;
import java.lang.System;
import java.net.URI;

TimeConstraints timeConstraints = new TimeConstraints();
DateRegularity dateRegularity = new DateRegularity();
String businessDayAdjustment = "example businessDayAdjustment";


RecurrencePattern recurrencePatternInstance = new RecurrencePattern()
    .timeConstraints(timeConstraints)
    .dateRegularity(dateRegularity)
    .businessDayAdjustment(businessDayAdjustment);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)