# com.finbourne.sdk.services.lusid.model.CdsOption
classname CdsOption
LUSID representation of an option on a single-name Credit Default Swap or a CDX/iTraxx index,  discriminated by the MasteredInstrumentType field of the referenced MasteredInstrument, which is derived  from the resolved type of the underlying. Referenced via a MasteredInstrument.  Quote-driven by default: it has no coupon or projected interim cashflow, its only cash movement being  the spot premium.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo, ToBeAnnounced, VolatilitySwap, ToBeAnnouncedOption, CommodityForward, BondOption, CdsOption, CommodityCalendarSwap, BondForward. | [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**strike** | **java.math.BigDecimal** | The strike of the option. | [default to java.math.BigDecimal]
**businessDayConvention** | **String** | Business day convention for the maturity-to-settlement date calculation.  Default value: F.                Supported string (enumeration) values are: [NoAdjustment, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, HalfMonthModifiedFollowing, Nearest]. Default value: F. Available values: NoAdjustment, None, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, HalfMonthModifiedFollowing, Nearest, Invalid. | [optional] [default to String]
**deliveryDays** | **Integer** | Number of business days between the option maturity date and settlement, used to compute  OptionSettlementDate when not explicitly overridden. Defaults to 2 if not set. | [optional] [default to Integer]
**deliveryType** | **String** | Is the option cash settled or physical delivery of the underlying.                Supported string (enumeration) values are: [Cash, Physical]. Available values: Cash, Physical. | [default to String]
**exerciseType** | **String** | Type of optionality that is present; European only in this scope.  Default value: European.                Supported string (enumeration) values are: [European, Bermudan, American]. Default value: European. Available values: None, European, Bermudan, American. | [optional] [default to String]
**notional** | **java.math.BigDecimal** | Fixed per-unit reference multiplier. Aggregate exposure &#x3D; Holding/Units x Notional; not a mutable total. | [default to java.math.BigDecimal]
**optionMaturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last exercise date of the option. | [default to OffsetDateTime]
**optionSettlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Explicit override of the option&#39;s settlement date. If not supplied, it is computed as a  business-day-adjusted delivery of DeliveryDays after OptionMaturityDate. | [optional] [default to OffsetDateTime]
**optionType** | **String** | The direction of the credit option: Payer or Receiver.                Supported string (enumeration) values are: [Payer, Receiver]. Available values: Payer, Receiver. | [default to String]
**premium** | [**Premium**](Premium.md) |  | [optional] [default to Premium]
**settlementCalendars** | **List&lt;String&gt;** | Holiday calendars for the maturity-to-settlement date calculation. | [optional] [default to List<String>]
**underlying** | [**MasteredInstrument**](MasteredInstrument.md) |  | [optional] [default to MasteredInstrument]
**underlyingVersion** | [**OffsetDateTime**](OffsetDateTime.md) | The AsAt timestamp of the underlying&#39;s definition at the time this option was written, pinning  lookups of the underlying&#39;s composition and terms independently of subsequent index rolls or re-upserts. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.CdsOption;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime startDate = OffsetDateTime.now();
String domCcy = "example domCcy";
java.math.BigDecimal strike = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String businessDayConvention = "example businessDayConvention";
Integer deliveryDays = new Integer("100.00");
String deliveryType = "example deliveryType";
@javax.annotation.Nullable String exerciseType = "example exerciseType";
java.math.BigDecimal notional = new java.math.BigDecimal("100.00");
OffsetDateTime optionMaturityDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime optionSettlementDate = OffsetDateTime.now();
String optionType = "example optionType";
Premium premium = new Premium();
@javax.annotation.Nullable List<String> settlementCalendars = new List<String>();
MasteredInstrument underlying = new MasteredInstrument();
OffsetDateTime underlyingVersion = OffsetDateTime.now();


CdsOption cdsOptionInstance = new CdsOption()
    .startDate(startDate)
    .domCcy(domCcy)
    .strike(strike)
    .businessDayConvention(businessDayConvention)
    .deliveryDays(deliveryDays)
    .deliveryType(deliveryType)
    .exerciseType(exerciseType)
    .notional(notional)
    .optionMaturityDate(optionMaturityDate)
    .optionSettlementDate(optionSettlementDate)
    .optionType(optionType)
    .premium(premium)
    .settlementCalendars(settlementCalendars)
    .underlying(underlying)
    .underlyingVersion(underlyingVersion);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)