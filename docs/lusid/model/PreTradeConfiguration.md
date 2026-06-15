# com.finbourne.sdk.services.lusid.model.PreTradeConfiguration
classname PreTradeConfiguration
Specification object for the pre trade configuration parameters of a compliance run

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**includeEntityTypes** | **String** | Controls whether Orders and Allocations orders are included in the Portfolio valuation done for this compliance run.  Valid values are:  None (to account for Transactions only), Allocations (to include Allocations and Transactions) and  OrdersAndAllocations (to include Orders, Allocations and Transactions). Available values: None, Allocations, OrdersAndAllocations. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PreTradeConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

String includeEntityTypes = "example includeEntityTypes";


PreTradeConfiguration preTradeConfigurationInstance = new PreTradeConfiguration()
    .includeEntityTypes(includeEntityTypes);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)