# com.finbourne.sdk.services.lusid.model.OrderFlowConfiguration
classname OrderFlowConfiguration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**includeEntityTypes** | **String** | Controls whether Orders and Allocations orders are included in the Portfolio valuation.  Valid values are  None (to account for Transactions only), Allocations (to include Allocations and Transactions) and  OrdersAndAllocations (to include Orders, Allocations and Transactions). Available values: None, Allocations, OrdersAndAllocations. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.OrderFlowConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

String includeEntityTypes = "example includeEntityTypes";


OrderFlowConfiguration orderFlowConfigurationInstance = new OrderFlowConfiguration()
    .includeEntityTypes(includeEntityTypes);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)