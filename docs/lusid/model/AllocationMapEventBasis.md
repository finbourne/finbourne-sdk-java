# com.finbourne.sdk.services.lusid.model.AllocationMapEventBasis
classname AllocationMapEventBasis
The basis an Allocation Map applies to one kind of allocation event.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventType** | **String** | The kind of allocation event the basis applies to: CapitalCall, Distribution, FeeExpense, ValuationMove, Equalisation, RecallExpiry, Transfer, Default, Commitment or DealFunding. Available values: CapitalCall, Distribution, FeeExpense, ValuationMove, Commitment, Equalisation, RecallExpiry, Transfer, Default, DealFunding. | [default to String]
**basis** | [**AllocationMapBasis**](AllocationMapBasis.md) |  | [default to AllocationMapBasis]
**component** | **String** | The component of the event the basis applies to, for example MgmtFee or OrgCost. Absent means the entry is the default for every component of the event type without an entry of its own. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationMapEventBasis;
import java.util.*;
import java.lang.System;
import java.net.URI;

String eventType = "example eventType";
AllocationMapBasis basis = new AllocationMapBasis();
@javax.annotation.Nullable String component = "example component";


AllocationMapEventBasis allocationMapEventBasisInstance = new AllocationMapEventBasis()
    .eventType(eventType)
    .basis(basis)
    .component(component);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)