# com.finbourne.sdk.services.workflow.model.DateAdjustment
classname DateAdjustment
A date adjustment to apply to the scheduled time of an EventHandler with a Finbourne.Workflow.WebApi.Common.Dto.Json.EventHandlers.ScheduleMatchingPattern

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deltaDays** | **Integer** | The delta to apply to the date part of the scheduled time, in days | [default to Integer]
**businessDayAdjustment** | **String** | The Business Day Adjustment | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.DateAdjustment;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer deltaDays = new Integer("100.00");
String businessDayAdjustment = "example businessDayAdjustment";


DateAdjustment dateAdjustmentInstance = new DateAdjustment()
    .deltaDays(deltaDays)
    .businessDayAdjustment(businessDayAdjustment);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)