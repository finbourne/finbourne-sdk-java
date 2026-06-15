# com.finbourne.sdk.services.lusid.model.FlowConventions
classname FlowConventions
A flow convention defines the specification for generation of the date schedule for a leg or set of cashflows.  It determines the tenor of these and, how to map the unadjusted set of dates to dates which are 'good business  days'. For example, if an unadjusted date falls on a Saturday or a bank holiday, should it be rolled forward  or backward to obtain the adjusted date.  For more information, see https://support.lusid.com/knowledgebase/article/KA-02055/

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Currency of the flow convention. | [default to String]
**paymentFrequency** | **String** | When generating a multiperiod flow, or when the maturity of the flow is not given but the start date is,  the tenor is the time-step from the anchor-date to the nominal maturity of the flow prior to any adjustment.    For more information on tenors, see [knowledge base article KA-02097](https://support.lusid.com/knowledgebase/article/KA-02097) | [default to String]
**dayCountConvention** | **String** | when calculating the fraction of a year between two dates, what convention is used to represent the number of days in a year  and difference between them.  For more information on day counts, see [knowledge base article KA-01798](https://support.lusid.com/knowledgebase/article/KA-01798)                Supported string (enumeration) values are: [Actual360, Act360, MoneyMarket, Actual365, Act365, Thirty360, ThirtyU360, Bond, ThirtyE360, EuroBond, ActualActual, ActAct, ActActIsda, ActActIsma, ActActIcma, OneOne, Act364, Act365F, Act365L, Act365_25, Act252, Bus252, NL360, NL365, ActActAFB, Act365Cad, ThirtyActIsda, Thirty365Isda, ThirtyEActIsda, ThirtyE360Isda, ThirtyE365Isda, ThirtyU360EOM]. | [default to String]
**rollConvention** | **String** | For backward compatibility, this can either specify a business day convention or a roll convention. If the business  day convention is provided using the BusinessDayConvention property, this must be a valid roll convention.                When used as a roll convention:  The conventions specifying the rule used to generate dates in a schedule.    Supported string (enumeration) values are: [None, EndOfMonth, IMM, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, FirstMonday, FirstTuesday, FirstWednesday, FirstThursday, FirstFriday, SecondMonday, SecondTuesday, SecondWednesday, SecondThursday, SecondFriday, ThirdMonday, ThirdTuesday, ThirdWednesday, ThirdThursday, ThirdFriday, FourthMonday, FourthTuesday, FourthWednesday, FourthThursday, FourthFriday, LastMonday, LastTuesday, LastWednesday, LastThursday, LastFriday].                When in backward compatible mode:  Supported string (enumeration) values are: [NoAdjustment, None, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, HalfMonthModifiedFollowing]. | [default to String]
**paymentCalendars** | **List&lt;String&gt;** | An array of strings denoting holiday calendars that apply to generation of payment schedules. | [default to List<String>]
**resetCalendars** | **List&lt;String&gt;** | An array of strings denoting holiday calendars that apply to generation of reset schedules. | [default to List<String>]
**settleDays** | **Integer** | DEPRECATED  Number of Good Business Days between the trade date and the effective or settlement date of the instrument.  This field is now deprecated and not picked up in schedule generation or adjustment to bond accrual start date. Defaulted to 0 if not set. | [optional] [default to Integer]
**resetDays** | **Integer** | The number of Good Business Days between determination and payment of reset. Defaulted to 0 if not set. | [optional] [default to Integer]
**leapDaysIncluded** | **Boolean** | If this flag is set to true, the 29th of February is included in the date schedule when the business roll convention is applied.  If this flag is set to false, the business roll convention ignores February 29 for date schedules, cash flow payments etc.  This flag defaults to true if not specified, i.e., leap days are included in a date schedule generation. | [optional] [default to Boolean]
**accrualDateAdjustment** | **String** | Indicates if the accrual dates are adjusted using the business day convention. The default value is &#39;Adjusted&#39;.    Supported string (enumeration) values are: [Adjusted, Unadjusted]. | [optional] [default to String]
**businessDayConvention** | **String** | When generating a set of dates, what convention should be used for adjusting dates that coincide with a non-business day.                If not set, defaults to the value of RollConvention. Available values: NoAdjustment, None, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, HalfMonthModifiedFollowing, Nearest, Invalid. | [optional] [default to String]
**accrualDayCountConvention** | **String** | Optional, if not set the main DayCountConvention is used for all accrual calculations.  This only needs to be set when accrual uses a different day count to the coupon calculation. | [optional] [default to String]
**couponPaymentLag** | [**RelativeDateOffset**](RelativeDateOffset.md) |  | [optional] [default to RelativeDateOffset]
**scope** | **String** | The scope used when updating or inserting the convention. | [optional] [default to String]
**code** | **String** | The code of the convention. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.FlowConventions;
import java.util.*;
import java.lang.System;
import java.net.URI;

String currency = "example currency";
String paymentFrequency = "example paymentFrequency";
String dayCountConvention = "example dayCountConvention";
String rollConvention = "example rollConvention";
List<String> paymentCalendars = new List<String>();
List<String> resetCalendars = new List<String>();
Integer settleDays = new Integer("100.00");
Integer resetDays = new Integer("100.00");
@javax.annotation.Nullable Boolean leapDaysIncluded = true;
@javax.annotation.Nullable String accrualDateAdjustment = "example accrualDateAdjustment";
@javax.annotation.Nullable String businessDayConvention = "example businessDayConvention";
@javax.annotation.Nullable String accrualDayCountConvention = "example accrualDayCountConvention";
RelativeDateOffset couponPaymentLag = new RelativeDateOffset();
@javax.annotation.Nullable String scope = "example scope";
@javax.annotation.Nullable String code = "example code";


FlowConventions flowConventionsInstance = new FlowConventions()
    .currency(currency)
    .paymentFrequency(paymentFrequency)
    .dayCountConvention(dayCountConvention)
    .rollConvention(rollConvention)
    .paymentCalendars(paymentCalendars)
    .resetCalendars(resetCalendars)
    .settleDays(settleDays)
    .resetDays(resetDays)
    .leapDaysIncluded(leapDaysIncluded)
    .accrualDateAdjustment(accrualDateAdjustment)
    .businessDayConvention(businessDayConvention)
    .accrualDayCountConvention(accrualDayCountConvention)
    .couponPaymentLag(couponPaymentLag)
    .scope(scope)
    .code(code);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)