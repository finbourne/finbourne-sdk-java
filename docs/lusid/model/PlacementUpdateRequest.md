# com.finbourne.sdk.services.lusid.model.PlacementUpdateRequest
classname PlacementUpdateRequest
A request to create or update a Placement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**quantity** | **java.math.BigDecimal** | The quantity of given instrument ordered. | [optional] [default to java.math.BigDecimal]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this placement. | [optional] [default to Map<String, PerpetualProperty>]
**type** | **String** | The type of this placement (Market, Limit, etc). | [optional] [default to String]
**limitPrice** | **java.math.BigDecimal** | The optional price, as currency and amount, associated with this placement. | [optional] [default to java.math.BigDecimal]
**stopPrice** | **java.math.BigDecimal** | The optional price, as currency and amount, associated with this placement. | [optional] [default to java.math.BigDecimal]
**counterparty** | **String** | Optionally specifies the market entity this placement is placed with. | [optional] [default to String]
**executionSystem** | **String** | Optionally specifies the execution system in use. | [optional] [default to String]
**entryType** | **String** | Optionally specifies the entry type of this placement. Available values: Undecided, Manual, Direct, Ems, External. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PlacementUpdateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
@javax.annotation.Nullable java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable java.math.BigDecimal limitPrice = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal stopPrice = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String counterparty = "example counterparty";
@javax.annotation.Nullable String executionSystem = "example executionSystem";
@javax.annotation.Nullable String entryType = "example entryType";


PlacementUpdateRequest placementUpdateRequestInstance = new PlacementUpdateRequest()
    .id(id)
    .quantity(quantity)
    .properties(properties)
    .type(type)
    .limitPrice(limitPrice)
    .stopPrice(stopPrice)
    .counterparty(counterparty)
    .executionSystem(executionSystem)
    .entryType(entryType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)