# com.finbourne.sdk.services.lusid.model.AllocationEventEqualisation
classname AllocationEventEqualisation
The terms of a subsequent close an Equalisation Allocation Event applies: the booked prior calls to equalise, the  partners admitted, and how interest, excess and profit and loss are treated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**priorCallIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The booked capital calls to equalise, and any earlier equalisation on the same map whose catch-up the admitted partners must also be brought level with. Each must be booked, on the same allocation map and in the same currency. | [default to List<ResourceId>]
**newInvestorRecordIds** | **List&lt;String&gt;** | The investor records admitted at this close. Each must be on the register with its commitment at the event date. | [default to List<String>]
**interestRate** | **java.math.BigDecimal** | The simple annual rate of equalisation interest the admitted partners pay on each catch-up from the prior call&#39;s due date to the event date. Defaults to 0.08. | [optional] [default to java.math.BigDecimal]
**dayCountConvention** | **String** | The day count of the equalisation interest: ACT/365 or ACT/360. Defaults to ACT/365. | [optional] [default to String]
**interestOnFees** | **Boolean** | Whether equalisation interest is also charged on the management fee catch-ups, from each fee&#39;s due date. Defaults to false. | [optional] [default to Boolean]
**treatment** | **String** | How the existing partners&#39; excess is returned: ReturnOfExcess restores it to their uncalled commitment; RecallableDistribution distributes it as recallable capital. Defaults to ReturnOfExcess. Available values: ReturnOfExcess, RecallableDistribution. | [optional] [default to String]
**pnl** | **String** | Whether profit and loss already allocated is re-trued between partners with no cash so each holds its post-close share (ReTrue), or the equalisation is kept to capital (CapitalOnly). Defaults to ReTrue. Available values: ReTrue, CapitalOnly. | [optional] [default to String]
**feeCatchUps** | [**List&lt;AllocationEventEqualisationFeeCatchUp&gt;**](AllocationEventEqualisationFeeCatchUp.md) | The management fees each admitted partner owes from the first fee date to the close, including any stub period, as explicit amounts. Paid to the manager and allocated to that partner only. | [optional] [default to List<AllocationEventEqualisationFeeCatchUp>]
**marks** | [**List&lt;AllocationEventEqualisationMark&gt;**](AllocationEventEqualisationMark.md) | The valuation moves already allocated to the existing partners, by the member of the structure they belong to, to re-true to the admitted partners. Ignored when the profit and loss treatment is CapitalOnly. | [optional] [default to List<AllocationEventEqualisationMark>]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventEqualisation;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ResourceId> priorCallIds = new List<ResourceId>();
List<String> newInvestorRecordIds = new List<String>();
@javax.annotation.Nullable java.math.BigDecimal interestRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String dayCountConvention = "example dayCountConvention";
@javax.annotation.Nullable Boolean interestOnFees = true;
@javax.annotation.Nullable String treatment = "example treatment";
@javax.annotation.Nullable String pnl = "example pnl";
@javax.annotation.Nullable List<AllocationEventEqualisationFeeCatchUp> feeCatchUps = new List<AllocationEventEqualisationFeeCatchUp>();
@javax.annotation.Nullable List<AllocationEventEqualisationMark> marks = new List<AllocationEventEqualisationMark>();


AllocationEventEqualisation allocationEventEqualisationInstance = new AllocationEventEqualisation()
    .priorCallIds(priorCallIds)
    .newInvestorRecordIds(newInvestorRecordIds)
    .interestRate(interestRate)
    .dayCountConvention(dayCountConvention)
    .interestOnFees(interestOnFees)
    .treatment(treatment)
    .pnl(pnl)
    .feeCatchUps(feeCatchUps)
    .marks(marks);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)