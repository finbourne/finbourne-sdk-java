# com.finbourne.sdk.services.workflow.model.DateTimeAdjustment
classname DateTimeAdjustment
A change applied to the date and the time of a source value, in a named calendar context.              At least one of Finbourne.Workflow.WebApi.Common.Dto.Json.Launchers.DateTimeAdjustment.DateAdjustment or Finbourne.Workflow.WebApi.Common.Dto.Json.Launchers.DateTimeAdjustment.TimeAdjustment must be given

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calendarContext** | **String** | The name of the calendar context this change happens in, which must be one the Launcher declares. When it is left out a Schedule Launcher uses the context of its schedule | [optional] [default to String]
**dateAdjustment** | [**DateAdjustment**](DateAdjustment.md) |  | [optional] [default to DateAdjustment]
**timeAdjustment** | [**TimeAdjustment**](TimeAdjustment.md) |  | [optional] [default to TimeAdjustment]

```java
import com.finbourne.sdk.services.workflow.model.DateTimeAdjustment;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String calendarContext = "example calendarContext";
DateAdjustment dateAdjustment = new DateAdjustment();
TimeAdjustment timeAdjustment = new TimeAdjustment();


DateTimeAdjustment dateTimeAdjustmentInstance = new DateTimeAdjustment()
    .calendarContext(calendarContext)
    .dateAdjustment(dateAdjustment)
    .timeAdjustment(timeAdjustment);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)