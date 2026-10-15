# com.finbourne.sdk.services.lusid.model.PartnerAllocation
classname PartnerAllocation
One partner's share of an allocation pool.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the allocation belongs to. | [default to String]
**basisWeight** | **java.math.BigDecimal** | The partner&#39;s weight in the pool&#39;s basis. | [default to java.math.BigDecimal]
**amount** | **java.math.BigDecimal** | The amount allocated to the partner. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.PartnerAllocation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String investorRecordId = "example investorRecordId";
java.math.BigDecimal basisWeight = new java.math.BigDecimal("100.00");
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");


PartnerAllocation partnerAllocationInstance = new PartnerAllocation()
    .investorRecordId(investorRecordId)
    .basisWeight(basisWeight)
    .amount(amount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)