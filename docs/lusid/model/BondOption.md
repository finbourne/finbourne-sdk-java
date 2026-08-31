# com.finbourne.sdk.services.lusid.model.BondOption
classname BondOption
LUSID representation of an OTC bilateral option (call or put) on a single mastered cash bond  (Bond, ComplexBond or InflationLinkedBond). Quote-driven valuation with an upfront premium;  European exercise only, cash-settled in the current scope (physical settlement is future work).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo, ToBeAnnounced, VolatilitySwap, ToBeAnnouncedOption, CommodityForward, BondOption, CdsOption, CommodityCalendarSwap, BondForward. | [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**strike** | **java.math.BigDecimal** | The strike as a clean price, percent of par (real/unindexed for a linker). | [default to java.math.BigDecimal]
**contractSize** | **java.math.BigDecimal** | The face amount per contract (e.g. 1,000,000). Together with the per-100 clean-price strike this  turns the strike and payoff into money: strikePerUnit &#x3D; strike / 100 * contractSize. | [default to java.math.BigDecimal]
**deliveryType** | **String** | How does the option settle. Only Cash is supported for a BondOption.                Supported string (enumeration) values are: [Cash, Physical]. | [default to String]
**exerciseDates** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md) | The exercise dates; exactly one entry, equal to the expiry date (European only in scope). | [default to List<OffsetDateTime>]
**exerciseType** | **String** | Type of optionality that is present. Only European is supported for a BondOption.                Supported string (enumeration) values are: [European, Bermudan, American]. | [optional] [default to String]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | This is the date when the option expires, i.e. the LAST exercise date of the option.  The property is internal, we may change it in the future (think about Bermuda options). | [default to OffsetDateTime]
**optionType** | **String** | Type of optionality for the option.                Supported string (enumeration) values are: [Call, Put]. | [default to String]
**premium** | [**Premium**](Premium.md) |  | [optional] [default to Premium]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]
**underlying** | [**LusidInstrument**](LusidInstrument.md) |  | [default to LusidInstrument]

```java
import com.finbourne.sdk.services.lusid.model.BondOption;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime startDate = OffsetDateTime.now();
String domCcy = "example domCcy";
java.math.BigDecimal strike = new java.math.BigDecimal("100.00");
java.math.BigDecimal contractSize = new java.math.BigDecimal("100.00");
String deliveryType = "example deliveryType";
List<OffsetDateTime> exerciseDates = new List<OffsetDateTime>();
@javax.annotation.Nullable String exerciseType = "example exerciseType";
OffsetDateTime expiryDate = OffsetDateTime.now();
String optionType = "example optionType";
Premium premium = new Premium();
TimeZoneConventions timeZoneConventions = new TimeZoneConventions();
TradingConventions tradingConventions = new TradingConventions();
LusidInstrument underlying = new LusidInstrument();


BondOption bondOptionInstance = new BondOption()
    .startDate(startDate)
    .domCcy(domCcy)
    .strike(strike)
    .contractSize(contractSize)
    .deliveryType(deliveryType)
    .exerciseDates(exerciseDates)
    .exerciseType(exerciseType)
    .expiryDate(expiryDate)
    .optionType(optionType)
    .premium(premium)
    .timeZoneConventions(timeZoneConventions)
    .tradingConventions(tradingConventions)
    .underlying(underlying);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)