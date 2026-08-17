# com.finbourne.sdk.services.lusid.model.ToBeAnnounced
classname ToBeAnnounced
LUSID representation of a TBA (To Be Announced) forward contract for generic agency mortgage-backed securities.  Valued as Quantity x Price via EOD quote lookup; carries no coupon cashflows, accrual or factor.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo, ToBeAnnounced, VolatilitySwap, ToBeAnnouncedOption, CommodityForward, BondOption, CdsOption, CommodityCalendarSwap. | [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The trade inception date of the TBA. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The contractual settlement date of the TBA (e.g. the agency&#39;s announced settlement date for the month). | [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency of the TBA. | [default to String]
**agency** | **String** | The issuing agency of the underlying generic collateral, e.g. \&quot;FNMA\&quot;, \&quot;FHLMC\&quot;, \&quot;GNMA\&quot;.  Note this property does not impact valuation. From a LUSID analytics perspective, it is purely informational. | [optional] [default to String]
**coupon** | **java.math.BigDecimal** | The stated coupon rate of the underlying generic collateral, e.g. 3.0, 4.5.  Note this property does not impact valuation - there are no coupon cash flows on the TBA itself.  From a LUSID analytics perspective, it is purely informational. | [optional] [default to java.math.BigDecimal]
**tenor** | **String** | The tenor of the underlying generic collateral, e.g. \&quot;30Y\&quot;, \&quot;15Y\&quot;.  Note this property does not impact valuation. From a LUSID analytics perspective, it is purely informational. | [optional] [default to String]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]

```java
import com.finbourne.sdk.services.lusid.model.ToBeAnnounced;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime startDate = OffsetDateTime.now();
OffsetDateTime maturityDate = OffsetDateTime.now();
String domCcy = "example domCcy";
@javax.annotation.Nullable String agency = "example agency";
@javax.annotation.Nullable java.math.BigDecimal coupon = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String tenor = "example tenor";
TimeZoneConventions timeZoneConventions = new TimeZoneConventions();
TradingConventions tradingConventions = new TradingConventions();


ToBeAnnounced toBeAnnouncedInstance = new ToBeAnnounced()
    .startDate(startDate)
    .maturityDate(maturityDate)
    .domCcy(domCcy)
    .agency(agency)
    .coupon(coupon)
    .tenor(tenor)
    .timeZoneConventions(timeZoneConventions)
    .tradingConventions(tradingConventions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)