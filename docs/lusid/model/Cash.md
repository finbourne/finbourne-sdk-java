# com.finbourne.sdk.services.lusid.model.Cash
classname Cash
LUSID representation of Cash which is the sum of one or more cashflows from the past.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo. | [default to String]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**amount** | **java.math.BigDecimal** | Cash amount. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.Cash;
import java.util.*;
import java.lang.System;
import java.net.URI;

String domCcy = "example domCcy";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");


Cash cashInstance = new Cash()
    .domCcy(domCcy)
    .amount(amount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)