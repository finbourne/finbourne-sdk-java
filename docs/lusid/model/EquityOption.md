# com.finbourne.sdk.services.lusid.model.EquityOption
classname EquityOption
LUSID representation of a plain vanilla OTC Equity Option.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo. | [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**optionMaturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The maturity date of the option. | [default to OffsetDateTime]
**optionSettlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The settlement date of the option. | [optional] [default to OffsetDateTime]
**deliveryType** | **String** | Is the option cash settled or physical delivery of option    Supported string (enumeration) values are: [Cash, Physical]. | [default to String]
**optionType** | **String** | Type of optionality for the option    Supported string (enumeration) values are: [Call, Put]. | [default to String]
**strike** | **java.math.BigDecimal** | The strike of the option. | [default to java.math.BigDecimal]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**underlyingIdentifier** | **String** | The market identifier type of the underlying code, e.g RIC.    Supported string (enumeration) values are: [LusidInstrumentId, Isin, Sedol, Cusip, ClientInternal, Figi, RIC, QuotePermId, REDCode, BBGId, ICECode].  Optional field, should be used in combination with the Code field.  Not compatible with the Underlying field. | [optional] [default to String]
**code** | **String** | The identifying code for the equity underlying, e.g. &#39;IBM.N&#39;.  Optional field, should be used in combination with the UnderlyingIdentifier field.  Not compatible with the Underlying field. | [optional] [default to String]
**equityOptionType** | **String** | Equity option types. E.g. Vanilla (default), RightsIssue, Warrant.    Supported string (enumeration) values are: [Vanilla, RightsIssue, Warrant]. | [optional] [default to String]
**numberOfShares** | **java.math.BigDecimal** | The amount of shares to exchange if the option is exercised. | [optional] [default to java.math.BigDecimal]
**premium** | [**Premium**](Premium.md) |  | [optional] [default to Premium]
**exerciseType** | **String** | Type of optionality that is present; European, American.    Supported string (enumeration) values are: [European, American].  Defaults to \&quot;European\&quot; if not set. | [optional] [default to String]
**underlying** | [**LusidInstrument**](LusidInstrument.md) |  | [optional] [default to LusidInstrument]
**deliveryDays** | **Integer** | Number of business days between exercise date and settlement of the option payoff or underlying.  Defaults to 0 if not set. | [optional] [default to Integer]
**businessDayConvention** | **String** | Business day convention for option exercise date to settlement date calculation.  Default value: F. Available values: NoAdjustment, None, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, HalfMonthModifiedFollowing, Nearest, Invalid. | [optional] [default to String]
**settlementCalendars** | **List&lt;String&gt;** | Holiday calendars for option exercise date to settlement date calculation. | [optional] [default to List<String>]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]

```java
import com.finbourne.sdk.services.lusid.model.EquityOption;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime startDate = OffsetDateTime.now();
OffsetDateTime optionMaturityDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime optionSettlementDate = OffsetDateTime.now();
String deliveryType = "example deliveryType";
String optionType = "example optionType";
java.math.BigDecimal strike = new java.math.BigDecimal("100.00");
String domCcy = "example domCcy";
@javax.annotation.Nullable String underlyingIdentifier = "example underlyingIdentifier";
@javax.annotation.Nullable String code = "example code";
@javax.annotation.Nullable String equityOptionType = "example equityOptionType";
@javax.annotation.Nullable java.math.BigDecimal numberOfShares = new java.math.BigDecimal("100.00");
Premium premium = new Premium();
@javax.annotation.Nullable String exerciseType = "example exerciseType";
LusidInstrument underlying = new LusidInstrument();
Integer deliveryDays = new Integer("100.00");
@javax.annotation.Nullable String businessDayConvention = "example businessDayConvention";
@javax.annotation.Nullable List<String> settlementCalendars = new List<String>();
TimeZoneConventions timeZoneConventions = new TimeZoneConventions();
TradingConventions tradingConventions = new TradingConventions();


EquityOption equityOptionInstance = new EquityOption()
    .startDate(startDate)
    .optionMaturityDate(optionMaturityDate)
    .optionSettlementDate(optionSettlementDate)
    .deliveryType(deliveryType)
    .optionType(optionType)
    .strike(strike)
    .domCcy(domCcy)
    .underlyingIdentifier(underlyingIdentifier)
    .code(code)
    .equityOptionType(equityOptionType)
    .numberOfShares(numberOfShares)
    .premium(premium)
    .exerciseType(exerciseType)
    .underlying(underlying)
    .deliveryDays(deliveryDays)
    .businessDayConvention(businessDayConvention)
    .settlementCalendars(settlementCalendars)
    .timeZoneConventions(timeZoneConventions)
    .tradingConventions(tradingConventions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)