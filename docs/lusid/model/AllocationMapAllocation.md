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


AllocationMapAllocation allocationMapAllocationInstance = new AllocationMapAllocation()
    .investorRecordId(investorRecordId)
    .basisValue(basisValue)
    .weight(weight)
    .amount(amount)
    .treatment(treatment);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)