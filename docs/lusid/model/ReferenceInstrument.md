# com.finbourne.sdk.services.lusid.model.ReferenceInstrument
classname ReferenceInstrument
LUSID representation of a reference to another instrument that has already been loaded (e.g. a lookthrough to a portfolio).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo. | [default to String]
**instrumentId** | **String** | The Identifier code | [default to String]
**instrumentIdType** | **String** | The type of the instrument id e.g. LusidInstrument Id | [default to String]
**scope** | **String** | Scope for the instrument (optional) | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ReferenceInstrument;
import java.util.*;
import java.lang.System;
import java.net.URI;

String instrumentId = "example instrumentId";
String instrumentIdType = "example instrumentIdType";
String scope = "example scope";


ReferenceInstrument referenceInstrumentInstance = new ReferenceInstrument()
    .instrumentId(instrumentId)
    .instrumentIdType(instrumentIdType)
    .scope(scope);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)