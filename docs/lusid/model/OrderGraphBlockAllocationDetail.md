# com.finbourne.sdk.services.lusid.model.OrderGraphBlockAllocationDetail
classname OrderGraphBlockAllocationDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**allocatedOrderId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**quantity** | **java.math.BigDecimal** | The quantity of this allocation, with direction relative to the containing block. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.OrderGraphBlockAllocationDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
ResourceId allocatedOrderId = new ResourceId();
java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");


OrderGraphBlockAllocationDetail orderGraphBlockAllocationDetailInstance = new OrderGraphBlockAllocationDetail()
    .id(id)
    .allocatedOrderId(allocatedOrderId)
    .quantity(quantity);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)