# com.finbourne.sdk.services.lusid.model.DependencySourceFilter
classname DependencySourceFilter
Encapsulates parts of a market data rule relating not to the nature of the market data requested, but rather the nature of the thing (instrument/model) that is requesting it.  In the first instance, this includes the instrument type, asset class, and the currency of the underlying instrument.  This can be used to differentiate requests for market data according to the source of the request. See MarketDataSpecificRule.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Specify that a rule should only apply if the market data is requested by an instrument of a given instrument type.  If null, then no filtering on instrument type is applied. Available values: Bond, CashPerpetual, CapFloor, CashSettled, CreditDefaultSwap, ForwardRateAgreement, Future, FxForward, FxOption, Index, InterestRateSwap, QuotedSecurity, Repo, ExoticInstrument, Equity, InterestRateSwaption, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, StructuredInstrument, TermDeposit, ContractForDifference, EquitySwap, CdsIndex, Basket, FundingLeg, FxSwap, SimpleInstrument, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, Cash, UnsettledCash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo, Unknown. | [optional] [default to String]
**assetClass** | **String** | Specify that a rule should only apply if the market data is requested by an instrument of a given asset class.  If null, then no filtering on asset class is applied. Available values: InterestRates, FX, Inflation, Equities, Credit, Commodities, Money, Unknown. | [optional] [default to String]
**domCcy** | **String** | Specify that a rule should only apply if the market data is requested by an instrument with a given domestic currency.  If null, then no filtering on currency is applied. | [optional] [default to String]
**longOrShortIndicator** | **String** | Specify that a rule should apply if the market data is requested by a model with a given Long or Short indicator.  If none, then no filtering on LongOrShortIndicator is applied. Available values: NA, Long, Short. | [optional] [default to String]
**addressKeyFilters** | [**List&lt;AddressKeyFilter&gt;**](AddressKeyFilter.md) | Specify that a rule should apply if the market data is requested by an instrument with features or properties  satisfying all the given address key filters. If an empty list is given, no additional filtering is done. | [optional] [default to List<AddressKeyFilter>]

```java
import com.finbourne.sdk.services.lusid.model.DependencySourceFilter;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String instrumentType = "example instrumentType";
@javax.annotation.Nullable String assetClass = "example assetClass";
@javax.annotation.Nullable String domCcy = "example domCcy";
@javax.annotation.Nullable String longOrShortIndicator = "example longOrShortIndicator";
@javax.annotation.Nullable List<AddressKeyFilter> addressKeyFilters = new List<AddressKeyFilter>();


DependencySourceFilter dependencySourceFilterInstance = new DependencySourceFilter()
    .instrumentType(instrumentType)
    .assetClass(assetClass)
    .domCcy(domCcy)
    .longOrShortIndicator(longOrShortIndicator)
    .addressKeyFilters(addressKeyFilters);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)