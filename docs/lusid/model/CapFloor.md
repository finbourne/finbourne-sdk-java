# com.finbourne.sdk.services.lusid.model.CapFloor
classname CapFloor
LUSID representation of Cap, Floor, or Collar.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo. | [default to String]
**capFloorType** | **String** | Determine if it&#39;s CAP, FLOOR, or COLLAR.    Supported string (enumeration) values are: [Cap, Floor, Collar]. | [default to String]
**capStrike** | **java.math.BigDecimal** | Strike rate of the Cap. | [optional] [default to java.math.BigDecimal]
**floorStrike** | **java.math.BigDecimal** | Strike rate of the Floor. | [optional] [default to java.math.BigDecimal]
**includeFirstCaplet** | **Boolean** | Include first caplet flag. | [default to Boolean]
**underlyingFloatingLeg** | [**FloatingLeg**](FloatingLeg.md) |  | [default to FloatingLeg]
**additionalPayments** | [**List&lt;AdditionalPayment&gt;**](AdditionalPayment.md) | Optional additional payments at a given date e.g. to level off an uneven equity swap.  The dates must be distinct and either all payments are Pay or all payments are Receive. | [optional] [default to List<AdditionalPayment>]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.sdk.services.lusid.model.CapFloor;
import java.util.*;
import java.lang.System;
import java.net.URI;

String capFloorType = "example capFloorType";
@javax.annotation.Nullable java.math.BigDecimal capStrike = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal floorStrike = new java.math.BigDecimal("100.00");
Boolean includeFirstCaplet = true;
FloatingLeg underlyingFloatingLeg = new FloatingLeg();
@javax.annotation.Nullable List<AdditionalPayment> additionalPayments = new List<AdditionalPayment>();
TimeZoneConventions timeZoneConventions = new TimeZoneConventions();


CapFloor capFloorInstance = new CapFloor()
    .capFloorType(capFloorType)
    .capStrike(capStrike)
    .floorStrike(floorStrike)
    .includeFirstCaplet(includeFirstCaplet)
    .underlyingFloatingLeg(underlyingFloatingLeg)
    .additionalPayments(additionalPayments)
    .timeZoneConventions(timeZoneConventions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)