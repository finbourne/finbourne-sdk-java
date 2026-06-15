# com.finbourne.sdk.services.lusid.model.OrderBreachHistory
classname OrderBreachHistory

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**orderId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**runId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**breachesByRule** | [**Map&lt;String, List&lt;OrderRuleBreach&gt;&gt;**](List.md) | Compliance rule breaches associations with the order and run. | [optional] [default to Map<String, List<OrderRuleBreach>>]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the order breach was created in LUSID. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.OrderBreachHistory;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
ResourceId orderId = new ResourceId();
ResourceId runId = new ResourceId();
@javax.annotation.Nullable Map<String, List<OrderRuleBreach>> breachesByRule = new Map<String, List<OrderRuleBreach>>();
OffsetDateTime asAt = OffsetDateTime.now();


OrderBreachHistory orderBreachHistoryInstance = new OrderBreachHistory()
    .id(id)
    .orderId(orderId)
    .runId(runId)
    .breachesByRule(breachesByRule)
    .asAt(asAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)