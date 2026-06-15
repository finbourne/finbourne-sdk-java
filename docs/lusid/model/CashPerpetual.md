# com.finbourne.sdk.services.lusid.model.CashPerpetual
classname CashPerpetual
LUSID representation of a Perpetual Cash Flow.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo. | [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**principal** | **java.math.BigDecimal** | The face-value or principal for the cash at outset. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.CashPerpetual;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime startDate = OffsetDateTime.now();
String domCcy = "example domCcy";
java.math.BigDecimal principal = new java.math.BigDecimal("100.00");


CashPerpetual cashPerpetualInstance = new CashPerpetual()
    .startDate(startDate)
    .domCcy(domCcy)
    .principal(principal);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)