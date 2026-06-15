# com.finbourne.sdk.services.lusid.model.Equity
classname Equity
LUSID representation of an Equity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo. | [default to String]
**identifiers** | [**EquityAllOfIdentifiers**](EquityAllOfIdentifiers.md) |  | [optional] [default to EquityAllOfIdentifiers]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**lotSize** | **Integer** | Deprecated: Use TradingConventions field instead  Equity LotSize, the minimum number of shares that can be bought at once.  Optional, if set must be non-negative, if not set defaults to 1.    Note this property does not impact valuation. From a LUSID analytics perspective, it is purely informational. | [optional] [default to Integer]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]

```java
import com.finbourne.sdk.services.lusid.model.Equity;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable EquityAllOfIdentifiers identifiers = new EquityAllOfIdentifiers();
String domCcy = "example domCcy";
Integer lotSize = new Integer("100.00");
TimeZoneConventions timeZoneConventions = new TimeZoneConventions();
TradingConventions tradingConventions = new TradingConventions();


Equity equityInstance = new Equity()
    .identifiers(identifiers)
    .domCcy(domCcy)
    .lotSize(lotSize)
    .timeZoneConventions(timeZoneConventions)
    .tradingConventions(tradingConventions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)