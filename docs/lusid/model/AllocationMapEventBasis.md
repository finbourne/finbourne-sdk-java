# com.finbourne.sdk.services.lusid.model.AllocationMapEventBasis
classname AllocationMapEventBasis
The basis an Allocation Map applies to one kind of allocation event.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventType** | **String** | The kind of allocation event the basis applies to: CapitalCall, Distribution, FeeExpense or ValuationMove. Available values: CapitalCall, Distribution, FeeExpense, ValuationMove. | [default to String]
**basis** | [**AllocationMapBasis**](AllocationMapBasis.md) |  | [default to AllocationMapBasis]

```java
import com.finbourne.sdk.services.lusid.model.AllocationMapEventBasis;
import java.util.*;
import java.lang.System;
import java.net.URI;

String eventType = "example eventType";
AllocationMapBasis basis = new AllocationMapBasis();


AllocationMapEventBasis allocationMapEventBasisInstance = new AllocationMapEventBasis()
    .eventType(eventType)
    .basis(basis);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)