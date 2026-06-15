# com.finbourne.sdk.services.lusid.model.ExoticInstrument
classname ExoticInstrument
LUSID representation of a generic OTC Exotic Instrument that is not fully defined within other LUSID models.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo. | [default to String]
**instrumentFormat** | [**InstrumentDefinitionFormat**](InstrumentDefinitionFormat.md) |  | [default to InstrumentDefinitionFormat]
**content** | **String** | The original document received into the system. This format could potentially be anything though is most likely to be either Json or Xml. In the case where no other  interface is supported it is possible to fall back onto this.  For example, a trade from an external client system. This may be recognized internally by Lusid or simply passed through to another vendor system. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ExoticInstrument;
import java.util.*;
import java.lang.System;
import java.net.URI;

InstrumentDefinitionFormat instrumentFormat = new InstrumentDefinitionFormat();
String content = "example content";


ExoticInstrument exoticInstrumentInstance = new ExoticInstrument()
    .instrumentFormat(instrumentFormat)
    .content(content);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)