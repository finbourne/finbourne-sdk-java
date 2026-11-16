# com.finbourne.sdk.services.lusid.model.InflationSwap
classname InflationSwap
LUSID representation of an Inflation Swap.  The implementation supports the following swap types:  * Zero Coupon inflation swap, with a single payment at maturity.  * LPI Swap (capped and floored)  * Year on Year inflation swap                This instrument has multiple legs, to see how legs are used in LUSID see [How does LUSID handle instrument legs?](https://support.lusid.com/docs/how-does-lusid-handle-instrument-legs).                | Leg Index | Leg Identifier | Description |  | --------- | -------------- | ----------- |  | 1 | InflationLeg | Cash flows with a rate relating to an underlying inflation index. |  | 2 | FixedLeg | Cash flows with a fixed rate. |  | 3 | AdditionalPayments | Cash flows relating to any additional payments (optional). |                With `legs`, the legs are in the order given and identified as InflationLeg, FixedLeg or FloatingLeg, so a  linker asset swap, a year-on-year or LPI swap against a floating leg, an income swap or a cross-currency  proceeds asset swap books as one instrument. The `inflationLeg` and `fixedLeg` fields remain for the original  shape and cannot be combined with `legs`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo, ToBeAnnounced, VolatilitySwap, ToBeAnnouncedOption, CommodityForward, BondOption, CdsOption, CommodityCalendarSwap, BondForward, PreferredShare, CapitalInterest, WholeLoanFacility, StripBond. | [default to String]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | [default to OffsetDateTime]
**inflationLeg** | [**InflationLeg**](InflationLeg.md) |  | [optional] [default to InflationLeg]
**fixedLeg** | [**FixedLeg**](FixedLeg.md) |  | [optional] [default to FixedLeg]
**additionalPayments** | [**List&lt;AdditionalPayment&gt;**](AdditionalPayment.md) | Optional additional payments at a given date e.g. to level off an uneven inflation swap.  The dates must be distinct and either all payments are Pay or all payments are Receive. | [optional] [default to List<AdditionalPayment>]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]
**legs** | [**List&lt;LusidInstrument&gt;**](LusidInstrument.md) | The legs of the swap: exactly two, exactly one of them an InflationLeg and the other a FixedLeg or a  FloatingLeg, one paid and one received, each starting on or after the swap and maturing on or before it.  The legs may be in different currencies; the first leg&#39;s currency is the swap&#39;s domestic currency.  Not set together with InflationLeg and FixedLeg. In this shape capRate and floorRate are accepted only on  a YearOnYear inflation leg. | [optional] [default to List<LusidInstrument>]

```java
import com.finbourne.sdk.services.lusid.model.InflationSwap;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime startDate = OffsetDateTime.now();
OffsetDateTime maturityDate = OffsetDateTime.now();
InflationLeg inflationLeg = new InflationLeg();
FixedLeg fixedLeg = new FixedLeg();
@javax.annotation.Nullable List<AdditionalPayment> additionalPayments = new List<AdditionalPayment>();
TimeZoneConventions timeZoneConventions = new TimeZoneConventions();
@javax.annotation.Nullable List<LusidInstrument> legs = new List<LusidInstrument>();


InflationSwap inflationSwapInstance = new InflationSwap()
    .startDate(startDate)
    .maturityDate(maturityDate)
    .inflationLeg(inflationLeg)
    .fixedLeg(fixedLeg)
    .additionalPayments(additionalPayments)
    .timeZoneConventions(timeZoneConventions)
    .legs(legs);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)