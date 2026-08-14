# com.finbourne.sdk.services.lusid.model.CancelSchedule
classname CancelSchedule
Cancel schedule represents the embedded option on a cancellable swap, allowing one party to  terminate the swap on one or more predefined dates.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleType** | **String** | Available values: FixedSchedule, FloatSchedule, OptionalitySchedule, StepSchedule, Exercise, FxRateSchedule, FxLinkedNotionalSchedule, BondConversionSchedule, PikSchedule, Invalid, CancelSchedule. | [default to String]
**cancelDates** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md) | The dates on which cancellation may be elected. | [default to List<OffsetDateTime>]
**cancelType** | **String** | The type of cancellation option: European (single cancel date) or Bermudan (two or more).                Supported string (enumeration) values are: [European, Bermudan]. Available values: European, Bermudan. | [default to String]
**noticeConvention** | [**NoticeConvention**](NoticeConvention.md) |  | [default to NoticeConvention]

```java
import com.finbourne.sdk.services.lusid.model.CancelSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<OffsetDateTime> cancelDates = new List<OffsetDateTime>();
String cancelType = "example cancelType";
NoticeConvention noticeConvention = new NoticeConvention();


CancelSchedule cancelScheduleInstance = new CancelSchedule()
    .cancelDates(cancelDates)
    .cancelType(cancelType)
    .noticeConvention(noticeConvention);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)