# com.finbourne.sdk.services.lusid.model.BondConversionSchedule
classname BondConversionSchedule
A BondConversionSchedule object represents a class containing the  information required for the creation of convertible features in a ComplexBond

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleType** | **String** | Available values: FixedSchedule, FloatSchedule, OptionalitySchedule, StepSchedule, Exercise, FxRateSchedule, FxLinkedNotionalSchedule, BondConversionSchedule, Invalid. | [default to String]
**identifiers** | **Map&lt;String, String&gt;** | The market identifier(s) of the share that the bond converts to. The instrument  will not fail validation if no identifier is supplied. | [optional] [default to Map<String, String>]
**bondConversionEntries** | [**List&lt;BondConversionEntry&gt;**](BondConversionEntry.md) | The dates at which the bond may be converted and associated information required about the conversion. | [optional] [default to List<BondConversionEntry>]
**conversionTrigger** | **String** | Corporate event that triggers a conversion    Supported string (enumeration) values are: [NextEquityFinancing, IpoConversion, KnownDates, SoftCall]. | [default to String]
**deliveryType** | **String** | Is a conversion made into cash or into shares?  Defaults to \&quot;Physical\&quot; if not set.    Supported string (enumeration) values are: [Cash, Physical]. | [optional] [default to String]
**exerciseType** | **String** | The exercise type of the conversion schedule (American or European).  For American type, the bond is convertible from a given exercise date until the next date in the schedule, or until it matures.  For European type, the bond is only convertible on the given exercise date.    Supported string (enumeration) values are: [European, Bermudan, American]. | [default to String]
**includesAccrued** | **Boolean** | Set this to true if a accrued interest is included in the conversion. Defaults to true. | [optional] [default to Boolean]
**mandatoryConversion** | **Boolean** | Set this to true if a conversion is mandatory if the trigger occurs. Defaults to false. | [optional] [default to Boolean]
**notificationPeriodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The last day in the notification period for the conversion of the bond | [optional] [default to OffsetDateTime]
**notificationPeriodStart** | [**OffsetDateTime**](OffsetDateTime.md) | The first day in the notification period for the conversion of the bond | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.BondConversionSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, String> identifiers = new Map<String, String>();
@javax.annotation.Nullable List<BondConversionEntry> bondConversionEntries = new List<BondConversionEntry>();
String conversionTrigger = "example conversionTrigger";
@javax.annotation.Nullable String deliveryType = "example deliveryType";
String exerciseType = "example exerciseType";
Boolean includesAccrued = true;
Boolean mandatoryConversion = true;
OffsetDateTime notificationPeriodEnd = OffsetDateTime.now();
OffsetDateTime notificationPeriodStart = OffsetDateTime.now();


BondConversionSchedule bondConversionScheduleInstance = new BondConversionSchedule()
    .identifiers(identifiers)
    .bondConversionEntries(bondConversionEntries)
    .conversionTrigger(conversionTrigger)
    .deliveryType(deliveryType)
    .exerciseType(exerciseType)
    .includesAccrued(includesAccrued)
    .mandatoryConversion(mandatoryConversion)
    .notificationPeriodEnd(notificationPeriodEnd)
    .notificationPeriodStart(notificationPeriodStart);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)