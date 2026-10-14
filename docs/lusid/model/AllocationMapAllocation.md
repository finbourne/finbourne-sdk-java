# com.finbourne.sdk.services.lusid.model.AllocationMapAllocation
classname AllocationMapAllocation
One investor record's share of a resolved allocation event.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record that receives the share. | [optional] [default to String]
**basisValue** | **java.math.BigDecimal** | The basis value the pro rata share was weighted by. Absent for a fixed or excluded investor record. | [optional] [default to java.math.BigDecimal]
**weight** | **java.math.BigDecimal** | The fraction of the remainder the investor record receives, or the fixed fraction of the whole amount for a FixedPercentage exception. | [optional] [default to java.math.BigDecimal]
**amount** | **java.math.BigDecimal** | The amount allocated to the investor record. | [optional] [default to java.math.BigDecimal]
**treatment** | **String** | How the share was found. Derived means pro rata from the basis; FixedPercentage means off the top from an exception; Excluded means an exception removed the investor record and it receives nothing. Available values: Derived, FixedPercentage, Excluded. | [optional] [default to String]
**commitmentLineId** | **String** | For a Commitment event, the commitment line the share is recorded against. Absent for other event types. | [optional] [default to String]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**component** | **String** | The component of the event the share belongs to. Absent when the event was resolved whole. | [optional] [default to String]
**originMemberShortCode** | **String** | The deal the share is for, when a capital call&#39;s use of proceeds split one component across deals. Absent when the component&#39;s own origin applies. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationMapAllocation;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String investorRecordId = "example investorRecordId";
@javax.annotation.Nullable java.math.BigDecimal basisValue = new java.math.BigDecimal("100.00");
java.math.BigDecimal weight = new java.math.BigDecimal("100.00");
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String treatment = "example treatment";
@javax.annotation.Nullable String commitmentLineId = "example commitmentLineId";
ResourceId portfolioId = new ResourceId();
@javax.annotation.Nullable String component = "example component";
@javax.annotation.Nullable String originMemberShortCode = "example originMemberShortCode";


AllocationMapAllocation allocationMapAllocationInstance = new AllocationMapAllocation()
    .investorRecordId(investorRecordId)
    .basisValue(basisValue)
    .weight(weight)
    .amount(amount)
    .treatment(treatment)
    .commitmentLineId(commitmentLineId)
    .portfolioId(portfolioId)
    .component(component)
    .originMemberShortCode(originMemberShortCode);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)