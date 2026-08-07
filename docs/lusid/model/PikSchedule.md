# com.finbourne.sdk.services.lusid.model.PikSchedule
classname PikSchedule
A PikSchedule represents Payment-in-Kind features for a ComplexBond.  It works in conjunction with existing FixedSchedules or FloatSchedules to define  how interest is paid during duration of the schedule.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleType** | **String** | Available values: FixedSchedule, FloatSchedule, OptionalitySchedule, StepSchedule, Exercise, FxRateSchedule, FxLinkedNotionalSchedule, BondConversionSchedule, PikSchedule, Invalid. | [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the PIK schedule period. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the PIK schedule period. | [default to OffsetDateTime]
**isPikFractionElectable** | **Boolean** | If true, the PIK fraction is electable at each payment date.  Defaults to false. | [optional] [default to Boolean]
**pikFraction** | **java.math.BigDecimal** | The fraction of the coupon that is paid in kind, where 0 means fully cash and 1 means fully PIK.  Required if IsPikFractionElectable is false or null. Must satisfy 0 &lt;&#x3D; pikFraction &lt;&#x3D; 1. | [optional] [default to java.math.BigDecimal]
**pikPaymentType** | **String** | The type of PIK payment to be used for the duration of this schedule.  InterestCapitalisation adds the paid-in-kind portion to the bond&#39;s current face;  AdditionalSecurities settles it by delivering units of another instrument, named on each  period&#39;s PikBondInterestEvent; Electable leaves the choice to a per-period election.                Supported string (enumeration) values are: [Electable, InterestCapitalisation, AdditionalSecurities]. | [optional] [default to String]
**pikRate** | **java.math.BigDecimal** | The PIK interest rate. Must be greater than or equal to zero.  null indicates no override PIK interest rate. | [optional] [default to java.math.BigDecimal]
**pikSpread** | **java.math.BigDecimal** | The PIK spread to be added to the base rate for the final PIK rate.  null indicates no spread on base rate. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.PikSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime startDate = OffsetDateTime.now();
OffsetDateTime maturityDate = OffsetDateTime.now();
Boolean isPikFractionElectable = true;
@javax.annotation.Nullable java.math.BigDecimal pikFraction = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String pikPaymentType = "example pikPaymentType";
@javax.annotation.Nullable java.math.BigDecimal pikRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal pikSpread = new java.math.BigDecimal("100.00");


PikSchedule pikScheduleInstance = new PikSchedule()
    .startDate(startDate)
    .maturityDate(maturityDate)
    .isPikFractionElectable(isPikFractionElectable)
    .pikFraction(pikFraction)
    .pikPaymentType(pikPaymentType)
    .pikRate(pikRate)
    .pikSpread(pikSpread);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)