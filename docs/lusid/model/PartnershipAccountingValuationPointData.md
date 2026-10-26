# com.finbourne.sdk.services.lusid.model.PartnershipAccountingValuationPointData
classname PartnershipAccountingValuationPointData
The partnership accounting view of a valuation point: what is left on the income summary to allocate to the  partners, and the configuration pack the allocation books under.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unallocatedIncomeSummary** | **java.math.BigDecimal** | The profit and loss of the valuation point&#39;s period that has not yet been allocated to the partners: what the period&#39;s income, gain and expense lines would pool, less what the partner allocation has posted for the period. Must be zero before the valuation point can be finalised. | [default to java.math.BigDecimal]
**configPackScope** | **String** | The scope of the configuration pack. | [default to String]
**configPackCode** | **String** | The code of the configuration pack. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PartnershipAccountingValuationPointData;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal unallocatedIncomeSummary = new java.math.BigDecimal("100.00");
String configPackScope = "example configPackScope";
String configPackCode = "example configPackCode";


PartnershipAccountingValuationPointData partnershipAccountingValuationPointDataInstance = new PartnershipAccountingValuationPointData()
    .unallocatedIncomeSummary(unallocatedIncomeSummary)
    .configPackScope(configPackScope)
    .configPackCode(configPackCode);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)