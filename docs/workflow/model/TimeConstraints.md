# com.finbourne.sdk.services.workflow.model.TimeConstraints
classname TimeConstraints
Time constraints for a Recurrence Pattern

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **String** | Start date of the Recurrence Pattern e.g. 2025-12-25 | [default to String]
**endDate** | **String** | Optional end date of the Recurrence Pattern e.g. 2025-12-31 | [optional] [default to String]
**timesOfDay** | [**List&lt;TimeOfDay&gt;**](TimeOfDay.md) | Times of the day to run the Recurrence Pattern | [default to List<TimeOfDay>]

```java
import com.finbourne.sdk.services.workflow.model.TimeConstraints;
import java.util.*;
import java.lang.System;
import java.net.URI;

String startDate = "example startDate";
@javax.annotation.Nullable String endDate = "example endDate";
List<TimeOfDay> timesOfDay = new List<TimeOfDay>();


TimeConstraints timeConstraintsInstance = new TimeConstraints()
    .startDate(startDate)
    .endDate(endDate)
    .timesOfDay(timesOfDay);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)