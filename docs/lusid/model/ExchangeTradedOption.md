# com.finbourne.sdk.services.lusid.model.ExchangeTradedOption
classname ExchangeTradedOption
LUSID representation of an Exchange Traded Option.  Including, but not limited to, Equity Options, Bond Options, Index Options, Future Options, and Interest Rate Options.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo. | [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**contractDetails** | [**ExchangeTradedOptionContractDetails**](ExchangeTradedOptionContractDetails.md) |  | [default to ExchangeTradedOptionContractDetails]
**contracts** | **java.math.BigDecimal** | The number of contracts held. | [default to java.math.BigDecimal]
**refSpotPrice** | **java.math.BigDecimal** | The reference spot price for the option at which the contract was entered into. | [default to java.math.BigDecimal]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.sdk.services.lusid.model.ExchangeTradedOption;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime startDate = OffsetDateTime.now();
ExchangeTradedOptionContractDetails contractDetails = new ExchangeTradedOptionContractDetails();
java.math.BigDecimal contracts = new java.math.BigDecimal("100.00");
java.math.BigDecimal refSpotPrice = new java.math.BigDecimal("100.00");
TradingConventions tradingConventions = new TradingConventions();
TimeZoneConventions timeZoneConventions = new TimeZoneConventions();


ExchangeTradedOption exchangeTradedOptionInstance = new ExchangeTradedOption()
    .startDate(startDate)
    .contractDetails(contractDetails)
    .contracts(contracts)
    .refSpotPrice(refSpotPrice)
    .tradingConventions(tradingConventions)
    .timeZoneConventions(timeZoneConventions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)