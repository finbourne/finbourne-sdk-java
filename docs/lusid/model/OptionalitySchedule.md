# com.finbourne.sdk.services.lusid.model.OptionalitySchedule
classname OptionalitySchedule
Optionality Schedule represents a class for creation of schedules for optionality (call, put)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleType** | **String** | Available values: FixedSchedule, FloatSchedule, OptionalitySchedule, StepSchedule, Exercise, FxRateSchedule, FxLinkedNotionalSchedule, BondConversionSchedule, Invalid. | [default to String]
**exerciseType** | **String** | The exercise type of the optionality schedule (American or European).  For American type, the bond is perpetually callable from a given exercise date until it matures, or the next date in the schedule.  For European type, the bond is only callable on a given exercise date.    Supported string (enumeration) values are: [European, American].  Defaults to \&quot;European\&quot; if not set. | [optional] [default to String]
**optionEntries** | [**List&lt;OptionEntry&gt;**](OptionEntry.md) | The dates at which the bond call/put may be actioned, and associated strikes. | [optional] [default to List<OptionEntry>]
**optionType** | **String** | Type of optionality for the schedule.    Supported string (enumeration) values are: [Call, Put].  Defaults to \&quot;Call\&quot; if not set. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.OptionalitySchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String exerciseType = "example exerciseType";
@javax.annotation.Nullable List<OptionEntry> optionEntries = new List<OptionEntry>();
@javax.annotation.Nullable String optionType = "example optionType";


OptionalitySchedule optionalityScheduleInstance = new OptionalitySchedule()
    .exerciseType(exerciseType)
    .optionEntries(optionEntries)
    .optionType(optionType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)