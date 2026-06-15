# com.finbourne.sdk.services.lusid.model.Schedule
classname Schedule
Base class for representing schedules in LUSID.  This base class should not be directly instantiated; each supported ScheduleType has a corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleType** | **String** | Available values: FixedSchedule, FloatSchedule, OptionalitySchedule, StepSchedule, Exercise, FxRateSchedule, FxLinkedNotionalSchedule, BondConversionSchedule, Invalid. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.Schedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scheduleType = "example scheduleType";


Schedule scheduleInstance = new Schedule()
    .scheduleType(scheduleType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)