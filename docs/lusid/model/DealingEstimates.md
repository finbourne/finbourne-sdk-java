# com.finbourne.sdk.services.lusid.model.DealingEstimates
classname DealingEstimates
How a fund treats estimated dealing when it strikes a valuation point before dealing is final.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sources** | **List&lt;String&gt;** | Where the Fund&#39;s dealing estimates are read from: LusidTA, orders held in LUSID Transfer Agency, or External, orders dealt outside LUSID and reported to it. At least one, each at most once. Naming both sums the two books with no de-duplication between them; each source&#39;s completeness is tracked on its own. Available values: LusidTA, External. | [default to List<String>]
**requireComplete** | **Boolean** | Whether the dealing book must be complete before a swing is proposed. For the LusidTA source the book is complete once each share class&#39;s TA/DealingSchedule cut-off has passed at the strike&#39;s as-at; a class with no cut-off configured is treated as complete and the audit says so. An order written after its class&#39;s cut-off is late: reported on the audit but not counted. When true and the book is incomplete the valuation point is still struck, at the unswung baseline, and no swing is proposed; the audit says why. Defaults to true. | [optional] [default to Boolean]
**countPending** | **Boolean** | Whether a Pending order at the valuation point counts towards the estimated flow. Orders in the New and Priced states always count. When true a Pending order is folded into the flows like them; when false it is left out of the decision and reported on the audit as pending and not counted, with its value where one can be read. Defaults to false. | [optional] [default to Boolean]
**unitValuation** | **String** | The price estimated flows are turned into units at: EstimatePrice, the estimate struck at this valuation point, or LastOfficialPrice, the last official dealing price the Fund published. Available values: EstimatePrice, LastOfficialPrice. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.DealingEstimates;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> sources = new List<String>();
@javax.annotation.Nullable Boolean requireComplete = true;
@javax.annotation.Nullable Boolean countPending = true;
String unitValuation = "example unitValuation";


DealingEstimates dealingEstimatesInstance = new DealingEstimates()
    .sources(sources)
    .requireComplete(requireComplete)
    .countPending(countPending)
    .unitValuation(unitValuation);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)