# com.finbourne.sdk.services.lusid.model.CommodityCalendarSwap
classname CommodityCalendarSwap
LUSID representation of an OTC bilateral commodity calendar swap.  The swap is a strip of periodic commodity forwards struck at a single strike, cash-settled at each  period end against a calendar-average commodity price, with the position amortising as each period  settles. Its present value is Quantity x Price, where the price is supplied externally pre-netted  (the calendar average minus strike) via the quote store. LUSID calculates no analytics for this  instrument, and it can only be priced by lookup pricing. The periodic settlement schedule is  currently stored and validated only; only the maturity lifecycle event is generated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | Available values: QuotedSecurity, InterestRateSwap, FxForward, Future, ExoticInstrument, FxOption, CreditDefaultSwap, InterestRateSwaption, Bond, EquityOption, FixedLeg, FloatingLeg, BespokeCashFlowsLeg, Unknown, TermDeposit, ContractForDifference, EquitySwap, CashPerpetual, CapFloor, CashSettled, CdsIndex, Basket, FundingLeg, FxSwap, ForwardRateAgreement, SimpleInstrument, Repo, Equity, ExchangeTradedOption, ReferenceInstrument, ComplexBond, InflationLinkedBond, InflationSwap, SimpleCashFlowLoan, TotalReturnSwap, InflationLeg, FundShareClass, FlexibleLoan, UnsettledCash, Cash, MasteredInstrument, LoanFacility, FlexibleDeposit, FlexibleRepo, ToBeAnnounced, VolatilitySwap, ToBeAnnouncedOption, CommodityForward, BondOption, CdsOption, CommodityCalendarSwap. | [default to String]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**strike** | **java.math.BigDecimal** | Agreed price per unit at trade inception. Reference only - not used in the market value  calculation, which consumes the pre-netted price from the quote store. | [optional] [default to java.math.BigDecimal]
**commodityCalendarSchedule** | [**CommodityCalendarSchedule**](CommodityCalendarSchedule.md) |  | [default to CommodityCalendarSchedule]
**deliveryType** | **String** | Whether the swap settles in cash or through physical delivery of the underlying.  Only cash settlement is supported.                Supported string (enumeration) values are: [Cash, Physical]. Available values: Cash, Physical. | [default to String]
**quantityPerPeriod** | **java.math.BigDecimal** | The notional commodity quantity referenced by each settlement period. The initial holding is  this quantity multiplied by the number of periods, stepping down by this quantity as each  period settles. | [default to java.math.BigDecimal]
**underlying** | [**LusidInstrument**](LusidInstrument.md) |  | [optional] [default to LusidInstrument]

```java
import com.finbourne.sdk.services.lusid.model.CommodityCalendarSwap;
import java.util.*;
import java.lang.System;
import java.net.URI;

String domCcy = "example domCcy";
@javax.annotation.Nullable java.math.BigDecimal strike = new java.math.BigDecimal("100.00");
CommodityCalendarSchedule commodityCalendarSchedule = new CommodityCalendarSchedule();
String deliveryType = "example deliveryType";
java.math.BigDecimal quantityPerPeriod = new java.math.BigDecimal("100.00");
LusidInstrument underlying = new LusidInstrument();


CommodityCalendarSwap commodityCalendarSwapInstance = new CommodityCalendarSwap()
    .domCcy(domCcy)
    .strike(strike)
    .commodityCalendarSchedule(commodityCalendarSchedule)
    .deliveryType(deliveryType)
    .quantityPerPeriod(quantityPerPeriod)
    .underlying(underlying);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)