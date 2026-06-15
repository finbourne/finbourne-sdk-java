# com.finbourne.sdk.services.lusid.model.Basket
classname Basket
LUSID representation of a basket of instruments.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo. | [default to String]
**basketName** | [**BasketIdentifier**](BasketIdentifier.md) |  | [default to BasketIdentifier]
**basketType** | **String** | What contents does the basket have. The validation will check that the instrument types contained match those expected.    Supported string (enumeration) values are: [Bonds, Credits, Equities, EquitySwap]. | [default to String]
**weightedInstruments** | [**WeightedInstruments**](WeightedInstruments.md) |  | [default to WeightedInstruments]

```java
import com.finbourne.sdk.services.lusid.model.Basket;
import java.util.*;
import java.lang.System;
import java.net.URI;

BasketIdentifier basketName = new BasketIdentifier();
String basketType = "example basketType";
WeightedInstruments weightedInstruments = new WeightedInstruments();


Basket basketInstance = new Basket()
    .basketName(basketName)
    .basketType(basketType)
    .weightedInstruments(weightedInstruments);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)