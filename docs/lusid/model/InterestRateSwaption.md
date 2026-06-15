# com.finbourne.sdk.services.lusid.model.InterestRateSwaption
classname InterestRateSwaption
LUSID representation of an Interest Rate Swaption.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo. | [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**payOrReceiveFixed** | **String** | Pay or Receive the fixed leg of the underlying swap.    Supported string (enumeration) values are: [Pay, Receive]. | [default to String]
**premium** | [**Premium**](Premium.md) |  | [optional] [default to Premium]
**deliveryMethod** | **String** | How does the option settle    Supported string (enumeration) values are: [Cash, Physical]. | [default to String]
**swap** | [**InterestRateSwap**](InterestRateSwap.md) |  | [optional] [default to InterestRateSwap]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]
**underlying** | [**LusidInstrument**](LusidInstrument.md) |  | [optional] [default to LusidInstrument]
**deliveryDays** | **Integer** | Number of business days between exercise date and settlement of the option payoff or underlying.                Defaults to 0. | [optional] [default to Integer]
**businessDayConvention** | **String** | Business day convention for option exercise date to settlement date calculation.  Default value: F. Available values: NoAdjustment, None, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, HalfMonthModifiedFollowing, Nearest, Invalid. | [optional] [default to String]
**settlementCalendars** | **List&lt;String&gt;** | Holiday calendars for option exercise date to settlement date calculation. | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.InterestRateSwaption;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime startDate = OffsetDateTime.now();
String payOrReceiveFixed = "example payOrReceiveFixed";
Premium premium = new Premium();
String deliveryMethod = "example deliveryMethod";
InterestRateSwap swap = new InterestRateSwap();
TimeZoneConventions timeZoneConventions = new TimeZoneConventions();
LusidInstrument underlying = new LusidInstrument();
Integer deliveryDays = new Integer("100.00");
@javax.annotation.Nullable String businessDayConvention = "example businessDayConvention";
@javax.annotation.Nullable List<String> settlementCalendars = new List<String>();


InterestRateSwaption interestRateSwaptionInstance = new InterestRateSwaption()
    .startDate(startDate)
    .payOrReceiveFixed(payOrReceiveFixed)
    .premium(premium)
    .deliveryMethod(deliveryMethod)
    .swap(swap)
    .timeZoneConventions(timeZoneConventions)
    .underlying(underlying)
    .deliveryDays(deliveryDays)
    .businessDayConvention(businessDayConvention)
    .settlementCalendars(settlementCalendars);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)