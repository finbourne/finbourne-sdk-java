# com.finbourne.sdk.services.lusid.model.StepSchedule
classname StepSchedule
Schedule that steps at known dated points in time.  Used in representation of a sinking bond, also called amortisation, steps in coupons for fixed bonds and spreads for floating bonds.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleType** | **String** | Available values: FixedSchedule, FloatSchedule, OptionalitySchedule, StepSchedule, Exercise, FxRateSchedule, FxLinkedNotionalSchedule, BondConversionSchedule, Invalid. | [default to String]
**levelType** | **String** | The type of shift or adjustment that the quantity represents.    Supported string (enumeration) values are: [Absolute, AbsoluteShift, Percentage, AbsolutePercentage]. | [default to String]
**stepScheduleType** | **String** | The type of step that this schedule is for.  Supported string (enumeration) values are: [Coupon, Notional, Spread]. | [default to String]
**steps** | [**List&lt;LevelStep&gt;**](LevelStep.md) | The level steps which are applied. | [default to List<LevelStep>]

```java
import com.finbourne.sdk.services.lusid.model.StepSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String levelType = "example levelType";
String stepScheduleType = "example stepScheduleType";
List<LevelStep> steps = new List<LevelStep>();


StepSchedule stepScheduleInstance = new StepSchedule()
    .levelType(levelType)
    .stepScheduleType(stepScheduleType)
    .steps(steps);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)