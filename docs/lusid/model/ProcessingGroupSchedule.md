# com.finbourne.sdk.services.lusid.model.ProcessingGroupSchedule
classname ProcessingGroupSchedule
Specification of the dates on which a Processing Group is executed: a date range plus  tenor / roll / business-day conventions and holiday calendars that generate the schedule,  or an explicit override set of dates. Modelled on the valuation schedule shape, without the  bitemporal timeline fields.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveFrom** | **String** | The start of the date range over which the schedule is generated. | [optional] [default to String]
**effectiveAt** | **String** | The end of the date range over which the schedule is generated. | [optional] [default to String]
**tenor** | **String** | Tenor, e.g. \&quot;1D\&quot;, \&quot;1M\&quot;, used to generate the date schedule between EffectiveFrom and EffectiveAt. | [optional] [default to String]
**rollConvention** | **String** | When Tenor is \&quot;1M\&quot; or longer, the rule used to generate the date schedule, e.g. \&quot;EndOfMonth\&quot; or \&quot;1\&quot;. | [optional] [default to String]
**holidayCalendars** | **List&lt;String&gt;** | The holiday calendar(s), by name, used when determining business days for the schedule. | [optional] [default to List<String>]
**scheduleDates** | **List&lt;String&gt;** | If given, the exact set of dates on which to execute. Overrides the generated schedule. | [optional] [default to List<String>]
**businessDayConvention** | **String** | When Tenor is not \&quot;1D\&quot;, the convention (e.g. \&quot;MF\&quot;) used to roll dates that land on non-business days. | [optional] [default to String]
**timeZone** | **String** | The IANA approved time zone (tzdb id, e.g. \&quot;Europe/London\&quot;) the schedule is expressed in.  Informational for consumers of the schedule: the generated schedule dates are calendar dates  and are not adjusted by this time zone. Optional. | [optional] [default to String]
**businessDayOffset** | **Integer** | If given, the number of good business days (per the holiday calendars) added to each generated  date. Can be negative. For example, the 10th business day of each month is a \&quot;1M\&quot; tenor with an  \&quot;EndOfMonth\&quot; roll convention and a business day offset of 10. Cannot be combined with ScheduleDates. | [optional] [default to Integer]
**dateExceptions** | **List&lt;String&gt;** | Dates, in yyyy-MM-dd format, on which the Processing Group does not run. These are removed  from the generated schedule after all other conventions and offsets have been applied. | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.ProcessingGroupSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String effectiveFrom = "example effectiveFrom";
@javax.annotation.Nullable String effectiveAt = "example effectiveAt";
@javax.annotation.Nullable String tenor = "example tenor";
@javax.annotation.Nullable String rollConvention = "example rollConvention";
@javax.annotation.Nullable List<String> holidayCalendars = new List<String>();
@javax.annotation.Nullable List<String> scheduleDates = new List<String>();
@javax.annotation.Nullable String businessDayConvention = "example businessDayConvention";
@javax.annotation.Nullable String timeZone = "example timeZone";
@javax.annotation.Nullable Integer businessDayOffset = new Integer("100.00");
@javax.annotation.Nullable List<String> dateExceptions = new List<String>();


ProcessingGroupSchedule processingGroupScheduleInstance = new ProcessingGroupSchedule()
    .effectiveFrom(effectiveFrom)
    .effectiveAt(effectiveAt)
    .tenor(tenor)
    .rollConvention(rollConvention)
    .holidayCalendars(holidayCalendars)
    .scheduleDates(scheduleDates)
    .businessDayConvention(businessDayConvention)
    .timeZone(timeZone)
    .businessDayOffset(businessDayOffset)
    .dateExceptions(dateExceptions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)