# com.finbourne.sdk.services.lusid.model.ToBeAnnouncedOption
classname ToBeAnnouncedOption
LUSID representation of an OTC option on a ToBeAnnounced (TBA) forward contract.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo, ToBeAnnounced, VolatilitySwap, ToBeAnnouncedOption, CommodityForward, BondOption. | [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the option expires, i.e. the last exercise date of the option. | [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**optionType** | **String** | Type of optionality for the option.                Supported string (enumeration) values are: [Call, Put]. | [default to String]
**strike** | **java.math.BigDecimal** | The strike of the option. | [default to java.math.BigDecimal]
**deliveryType** | **String** | Is the option cash settled or physical delivery of the underlying TBA.                Supported string (enumeration) values are: [Cash, Physical]. | [default to String]
**underlying** | [**MasteredInstrument**](MasteredInstrument.md) |  | [default to MasteredInstrument]
**exerciseType** | **String** | Type of optionality that is present; European only in this scope.                Supported string (enumeration) values are: [European]. | [default to String]
**premium** | [**Premium**](Premium.md) |  | [default to Premium]
**deliveryDays** | **Integer** | Number of business days between exercise date and settlement of the option payoff or underlying.  Defaults to 0 if not set. | [optional] [default to Integer]
**businessDayConvention** | **String** | Business day convention for option exercise date to settlement date calculation.  Default value: F. Available values: NoAdjustment, None, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, HalfMonthModifiedFollowing, Nearest, Invalid. | [optional] [default to String]
**settlementCalendars** | **List&lt;String&gt;** | Holiday calendar for option exercise date to settlement date calculation. | [optional] [default to List<String>]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]

```java
import com.finbourne.sdk.services.lusid.model.ToBeAnnouncedOption;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime startDate = OffsetDateTime.now();
OffsetDateTime expiryDate = OffsetDateTime.now();
String domCcy = "example domCcy";
String optionType = "example optionType";
java.math.BigDecimal strike = new java.math.BigDecimal("100.00");
String deliveryType = "example deliveryType";
MasteredInstrument underlying = new MasteredInstrument();
String exerciseType = "example exerciseType";
Premium premium = new Premium();
Integer deliveryDays = new Integer("100.00");
@javax.annotation.Nullable String businessDayConvention = "example businessDayConvention";
@javax.annotation.Nullable List<String> settlementCalendars = new List<String>();
TimeZoneConventions timeZoneConventions = new TimeZoneConventions();
TradingConventions tradingConventions = new TradingConventions();


ToBeAnnouncedOption toBeAnnouncedOptionInstance = new ToBeAnnouncedOption()
    .startDate(startDate)
    .expiryDate(expiryDate)
    .domCcy(domCcy)
    .optionType(optionType)
    .strike(strike)
    .deliveryType(deliveryType)
    .underlying(underlying)
    .exerciseType(exerciseType)
    .premium(premium)
    .deliveryDays(deliveryDays)
    .businessDayConvention(businessDayConvention)
    .settlementCalendars(settlementCalendars)
    .timeZoneConventions(timeZoneConventions)
    .tradingConventions(tradingConventions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)