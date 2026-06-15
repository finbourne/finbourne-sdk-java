# com.finbourne.sdk.services.lusid.model.InstrumentLeg
classname InstrumentLeg
Base class for representing instrument legs in LUSID.  An instrument leg describes a set of cashflows that are paid at a set of points in time according to some set of conventions.  This base class should not be directly instantiated; only its inheritors should be used.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.InstrumentLeg;
import java.util.*;
import java.lang.System;
import java.net.URI;



InstrumentLeg instrumentLegInstance = new InstrumentLeg()
    ;
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)