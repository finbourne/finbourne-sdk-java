# com.finbourne.sdk.services.lusid.model.SimpleInstrument
classname SimpleInstrument
LUSID representation of a Simple Instrument, used as a basic definition of a generic instrument.  No analytics can be obtained for this.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo. | [default to String]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | [optional] [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency. | [default to String]
**assetClass** | **String** | Available values: InterestRates, FX, Inflation, Equities, Credit, Commodities, Money, Unknown, RealEstate. | [default to String]
**fgnCcys** | **List&lt;String&gt;** | The set of foreign currencies, if any (optional). | [optional] [default to List<String>]
**simpleInstrumentType** | **String** | The Instrument type of the simple instrument. | [default to String]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]

```java
import com.finbourne.sdk.services.lusid.model.SimpleInstrument;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime maturityDate = OffsetDateTime.now();
String domCcy = "example domCcy";
String assetClass = "example assetClass";
@javax.annotation.Nullable List<String> fgnCcys = new List<String>();
String simpleInstrumentType = "example simpleInstrumentType";
TimeZoneConventions timeZoneConventions = new TimeZoneConventions();
TradingConventions tradingConventions = new TradingConventions();


SimpleInstrument simpleInstrumentInstance = new SimpleInstrument()
    .maturityDate(maturityDate)
    .domCcy(domCcy)
    .assetClass(assetClass)
    .fgnCcys(fgnCcys)
    .simpleInstrumentType(simpleInstrumentType)
    .timeZoneConventions(timeZoneConventions)
    .tradingConventions(tradingConventions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)