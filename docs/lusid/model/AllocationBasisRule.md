# com.finbourne.sdk.services.lusid.model.AllocationBasisRule
classname AllocationBasisRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**character** | **String** |  | [default to String]
**basis** | **String** | Available values: CommittedCapital, PaidInCapital, DealPaidIn. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationBasisRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String character = "example character";
String basis = "example basis";


AllocationBasisRule allocationBasisRuleInstance = new AllocationBasisRule()
    .character(character)
    .basis(basis);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)