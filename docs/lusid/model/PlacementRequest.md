# com.finbourne.sdk.services.lusid.model.PlacementRequest
classname PlacementRequest
A request to create or update a Placement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**parentPlacementId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**blockIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The IDs of the Blocks associated with this placement. | [default to List<ResourceId>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this order. | [optional] [default to Map<String, PerpetualProperty>]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. | [default to Map<String, String>]
**quantity** | **java.math.BigDecimal** | The quantity of given instrument ordered. | [default to java.math.BigDecimal]
**state** | **String** | The state of this placement (typically a FIX state; Open, Filled, etc). | [optional] [default to String]
**side** | **String** | The side (Buy, Sell, ...) of this placement. | [default to String]
**timeInForce** | **String** | The time in force applicable to this placement (GTC, FOK, Day, etc) | [default to String]
**type** | **String** | The type of this placement (Market, Limit, etc). | [default to String]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | The active date of this placement. | [default to OffsetDateTime]
**limitPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**stopPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**counterparty** | **String** | Optionally specifies the market entity this placement is placed with. | [optional] [default to String]
**executionSystem** | **String** | Optionally specifies the execution system in use. | [optional] [default to String]
**entryType** | **String** | Optionally specifies the entry type of this placement. Available values: Undecided, Manual, Direct, Ems, External. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PlacementRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
ResourceId parentPlacementId = new ResourceId();
List<ResourceId> blockIds = new List<ResourceId>();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
Map<String, String> instrumentIdentifiers = new Map<String, String>();
java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String state = "example state";
String side = "example side";
String timeInForce = "example timeInForce";
String type = "example type";
OffsetDateTime createdDate = OffsetDateTime.now();
CurrencyAndAmount limitPrice = new CurrencyAndAmount();
CurrencyAndAmount stopPrice = new CurrencyAndAmount();
@javax.annotation.Nullable String counterparty = "example counterparty";
@javax.annotation.Nullable String executionSystem = "example executionSystem";
@javax.annotation.Nullable String entryType = "example entryType";


PlacementRequest placementRequestInstance = new PlacementRequest()
    .id(id)
    .parentPlacementId(parentPlacementId)
    .blockIds(blockIds)
    .properties(properties)
    .instrumentIdentifiers(instrumentIdentifiers)
    .quantity(quantity)
    .state(state)
    .side(side)
    .timeInForce(timeInForce)
    .type(type)
    .createdDate(createdDate)
    .limitPrice(limitPrice)
    .stopPrice(stopPrice)
    .counterparty(counterparty)
    .executionSystem(executionSystem)
    .entryType(entryType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)