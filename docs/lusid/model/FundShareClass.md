# com.finbourne.sdk.services.lusid.model.FundShareClass
classname FundShareClass
LUSID representation of a FundShareClass.  A ShareClass represents a pool of shares, held by investors, within a fund.   A ShareClass can represent a differing investment approach by either Fees,   Income, Currency Risk and Investor type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo. | [default to String]
**shortCode** | **String** | A short identifier, unique across a single fund, usually made up of the ShareClass components. Eg \&quot;A Accumulation Euro Hedged Class\&quot; could become \&quot;A Acc H EUR\&quot;. | [default to String]
**fundShareClassType** | **String** | The type of distribution that the ShareClass will calculate. Can be either &#39;Income&#39; or &#39;Accumulation&#39; - Income classes will pay out and Accumulation classes will retain their ShareClass attributable income. Available values: Income, Accumulation. | [default to String]
**distributionPaymentType** | **String** | The tax treatment applied to any distributions calculated within the ShareClass. Can be either &#39;Net&#39; (Distribution Calculated net of tax) or &#39;Gross&#39; (Distribution calculated gross of tax). Available values: Invalid, Gross, Net. | [default to String]
**hedging** | **String** | A flag to indicate the ShareClass is operating currency hedging as a means to limit currency risk as part of its investment strategy. Available values: Invalid, None, ApplyHedging. | [default to String]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**roundingConventions** | [**List&lt;SimpleRoundingConvention&gt;**](SimpleRoundingConvention.md) | Rounding Convention used for the FundShareClass quotes | [optional] [default to List<SimpleRoundingConvention>]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.sdk.services.lusid.model.FundShareClass;
import java.util.*;
import java.lang.System;
import java.net.URI;

String shortCode = "example shortCode";
String fundShareClassType = "example fundShareClassType";
String distributionPaymentType = "example distributionPaymentType";
String hedging = "example hedging";
String domCcy = "example domCcy";
@javax.annotation.Nullable List<SimpleRoundingConvention> roundingConventions = new List<SimpleRoundingConvention>();
TradingConventions tradingConventions = new TradingConventions();
TimeZoneConventions timeZoneConventions = new TimeZoneConventions();


FundShareClass fundShareClassInstance = new FundShareClass()
    .shortCode(shortCode)
    .fundShareClassType(fundShareClassType)
    .distributionPaymentType(distributionPaymentType)
    .hedging(hedging)
    .domCcy(domCcy)
    .roundingConventions(roundingConventions)
    .tradingConventions(tradingConventions)
    .timeZoneConventions(timeZoneConventions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)