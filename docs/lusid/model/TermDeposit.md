# com.finbourne.sdk.services.lusid.model.TermDeposit
classname TermDeposit
LUSID representation of a Term Deposit.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo. | [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. For term deposits this is the start date of the interest calculation period. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The maturity date of the instrument. For term deposits this is the last date of the interest calculation period. | [default to OffsetDateTime]
**contractSize** | **java.math.BigDecimal** | The principal amount of the term deposit. | [default to java.math.BigDecimal]
**flowConvention** | [**FlowConventions**](FlowConventions.md) |  | [default to FlowConventions]
**rate** | **java.math.BigDecimal** | The fixed rate for the term deposit. Specified as a decimal, e.g 0.03 is meant to be 3% interest | [default to java.math.BigDecimal]
**domCcy** | **String** | The domestic currency of the instrument. This should be the same as the Currency set on the FlowConventions.  You do not need to populate this field for Term Deposits in LUSID as all functionality is driven by the Currency set on the FlowConventions.  LUSID will not store values saved on this field. | [optional] [default to String]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.sdk.services.lusid.model.TermDeposit;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime startDate = OffsetDateTime.now();
OffsetDateTime maturityDate = OffsetDateTime.now();
java.math.BigDecimal contractSize = new java.math.BigDecimal("100.00");
FlowConventions flowConvention = new FlowConventions();
java.math.BigDecimal rate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String domCcy = "example domCcy";
TradingConventions tradingConventions = new TradingConventions();
TimeZoneConventions timeZoneConventions = new TimeZoneConventions();


TermDeposit termDepositInstance = new TermDeposit()
    .startDate(startDate)
    .maturityDate(maturityDate)
    .contractSize(contractSize)
    .flowConvention(flowConvention)
    .rate(rate)
    .domCcy(domCcy)
    .tradingConventions(tradingConventions)
    .timeZoneConventions(timeZoneConventions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)