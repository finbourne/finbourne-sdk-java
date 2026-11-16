# com.finbourne.sdk.services.lusid.model.PartnershipAccountingValuationPointData
classname PartnershipAccountingValuationPointData
The partnership accounting view of a valuation point: what is left on the income summary to allocate to the  partners, the configuration pack the allocation books under and, when the period cannot be allocated as it  stands, why.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unallocatedIncomeSummary** | **java.math.BigDecimal** | The profit and loss of the valuation point&#39;s period that has not yet been allocated to the partners: what the period&#39;s profit and loss lines, as the allocation bucket set classifies them, would pool, less what the partner allocation has posted for the period. Lines no bucket claims count as unallocated. Must be zero before the valuation point can be finalised. | [default to java.math.BigDecimal]
**configPackScope** | **String** | The scope of the configuration pack. | [default to String]
**configPackCode** | **String** | The code of the configuration pack. | [default to String]
**allocationProblem** | [**PartnershipAllocationProblem**](PartnershipAllocationProblem.md) |  | [optional] [default to PartnershipAllocationProblem]

```java
import com.finbourne.sdk.services.lusid.model.PartnershipAccountingValuationPointData;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal unallocatedIncomeSummary = new java.math.BigDecimal("100.00");
String configPackScope = "example configPackScope";
String configPackCode = "example configPackCode";
PartnershipAllocationProblem allocationProblem = new PartnershipAllocationProblem();


PartnershipAccountingValuationPointData partnershipAccountingValuationPointDataInstance = new PartnershipAccountingValuationPointData()
    .unallocatedIncomeSummary(unallocatedIncomeSummary)
    .configPackScope(configPackScope)
    .configPackCode(configPackCode)
    .allocationProblem(allocationProblem);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)