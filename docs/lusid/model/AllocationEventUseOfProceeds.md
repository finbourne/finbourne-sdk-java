# com.finbourne.sdk.services.lusid.model.AllocationEventUseOfProceeds
classname AllocationEventUseOfProceeds
One row of a CapitalCall Allocation Event's use of proceeds: what part of the call pays for what.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**purpose** | **String** | What the row pays for: Investment, FacilityRepayment, FacilityInterest, ManagementFee or Expenses. Available values: Investment, FacilityRepayment, FacilityInterest, ManagementFee, Expenses. | [default to String]
**dealId** | **String** | The deal the row funds, or whose facility draw it repays. Required for an Investment row. | [optional] [default to String]
**amount** | **java.math.BigDecimal** | The part of the call the row takes, in the event currency. Greater than zero. | [default to java.math.BigDecimal]
**facilityId** | **String** | The facility the row repays. Required for a FacilityRepayment row; on an Investment row it is filled in from the deal&#39;s funding when the call is computed. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventUseOfProceeds;
import java.util.*;
import java.lang.System;
import java.net.URI;

String purpose = "example purpose";
@javax.annotation.Nullable String dealId = "example dealId";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String facilityId = "example facilityId";


AllocationEventUseOfProceeds allocationEventUseOfProceedsInstance = new AllocationEventUseOfProceeds()
    .purpose(purpose)
    .dealId(dealId)
    .amount(amount)
    .facilityId(facilityId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)