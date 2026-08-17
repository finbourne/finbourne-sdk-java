# com.finbourne.sdk.services.lusid.model.CommodityCalendarSchedule
classname CommodityCalendarSchedule
Schedule describing the periodic calendar-average settlement periods of a commodity calendar swap.  Each period settles in cash against the average of the observed commodity price over the period.  The schedule is currently stored and validated only; period expansion is not yet implemented.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleType** | **String** | Available values: FixedSchedule, FloatSchedule, OptionalitySchedule, StepSchedule, Exercise, FxRateSchedule, FxLinkedNotionalSchedule, BondConversionSchedule, PikSchedule, CommodityCalendarSchedule, Invalid, CancelSchedule. | [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date from which the first settlement period accrues. | [optional] [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the final settlement period ends. | [optional] [default to OffsetDateTime]
**flowConventions** | [**FlowConventions**](FlowConventions.md) |  | [optional] [default to FlowConventions]
**paymentCurrency** | **String** | The currency in which each periodic cash settlement is paid. | [optional] [default to String]
**stubType** | **String** | How any non-integral first or last period is handled when generating the settlement periods.  If not specified, this defaults to None.                Supported string (enumeration) values are: [ShortFront, ShortBack, LongBack, LongFront, Both]. Available values: None, ShortFront, ShortBack, LongBack, LongFront, Both, Invalid. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CommodityCalendarSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime startDate = OffsetDateTime.now();
OffsetDateTime maturityDate = OffsetDateTime.now();
FlowConventions flowConventions = new FlowConventions();
@javax.annotation.Nullable String paymentCurrency = "example paymentCurrency";
@javax.annotation.Nullable String stubType = "example stubType";


CommodityCalendarSchedule commodityCalendarScheduleInstance = new CommodityCalendarSchedule()
    .startDate(startDate)
    .maturityDate(maturityDate)
    .flowConventions(flowConventions)
    .paymentCurrency(paymentCurrency)
    .stubType(stubType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)