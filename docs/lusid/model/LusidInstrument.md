# com.finbourne.sdk.services.lusid.model.LusidInstrument
classname LusidInstrument
Base class in the hierarchy for representing the full economic definition of instruments in LUSID.  These definitions are used to provide instrument analytics such as PV, accrual, cash flows, and risk.  This base class should not be directly instantiated; each supported InstrumentType has a corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.LusidInstrument;
import java.util.*;
import java.lang.System;
import java.net.URI;

String instrumentType = "example instrumentType";


LusidInstrument lusidInstrumentInstance = new LusidInstrument()
    .instrumentType(instrumentType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)