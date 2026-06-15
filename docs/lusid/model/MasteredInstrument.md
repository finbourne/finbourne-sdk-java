# com.finbourne.sdk.services.lusid.model.MasteredInstrument
classname MasteredInstrument
LUSID representation of a reference to another instrument that has already been upserted (Mastered)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo. | [default to String]
**identifiers** | **Map&lt;String, String&gt;** | Dictionary of identifiers of the mastered instrument | [default to Map<String, String>]
**masteredDomCcy** | **String** | DomCcy of the Instrument that Mastered Instrument points to - read only field | [optional] [readonly] [default to String]
**masteredInstrumentType** | **String** | Type of the Instrument that Mastered Instrument points to - read only field | [optional] [readonly] [default to String]
**masteredLusidInstrumentId** | **String** | Luid of the Instrument that Mastered Instrument points to - read only field | [optional] [readonly] [default to String]
**masteredName** | **String** | Name of the Instrument that Mastered Instrument points to - read only field | [optional] [readonly] [default to String]
**masteredScope** | **String** | Scope of the Instrument that Mastered Instrument points to - read only field | [optional] [readonly] [default to String]
**masteredAssetClass** | **String** | Asset class of the underlying mastered instrument - read only field    Supported string (enumeration) values are: [InterestRates, FX, Inflation, Equities, Credit, Commodities, Money].  Defaults to \&quot;Unknown\&quot; if not set. | [optional] [readonly] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.MasteredInstrument;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> identifiers = new Map<String, String>();
@javax.annotation.Nullable String masteredDomCcy = "example masteredDomCcy";
@javax.annotation.Nullable String masteredInstrumentType = "example masteredInstrumentType";
@javax.annotation.Nullable String masteredLusidInstrumentId = "example masteredLusidInstrumentId";
@javax.annotation.Nullable String masteredName = "example masteredName";
@javax.annotation.Nullable String masteredScope = "example masteredScope";
@javax.annotation.Nullable String masteredAssetClass = "example masteredAssetClass";


MasteredInstrument masteredInstrumentInstance = new MasteredInstrument()
    .identifiers(identifiers)
    .masteredDomCcy(masteredDomCcy)
    .masteredInstrumentType(masteredInstrumentType)
    .masteredLusidInstrumentId(masteredLusidInstrumentId)
    .masteredName(masteredName)
    .masteredScope(masteredScope)
    .masteredAssetClass(masteredAssetClass);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)