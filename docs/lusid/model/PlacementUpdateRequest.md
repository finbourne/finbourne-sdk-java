# com.finbourne.sdk.services.lusid.model.PlacementUpdateRequest
classname PlacementUpdateRequest
A request to update a Placement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**quantity** | **java.math.BigDecimal** | The quantity of given instrument ordered. | [optional] [default to java.math.BigDecimal]
**amount** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this placement. | [optional] [default to Map<String, PerpetualProperty>]
**type** | **String** | Optionally changes the type of this placement (Market, Limit, Stop, StopLimit, etc). A type change is permitted only when the associated block is of type &#39;Market&#39;. Setting the type to &#39;Market&#39; clears the placement&#39;s stop and limit prices; any other type change leaves them as they are. | [optional] [default to String]
**limitPrice** | **java.math.BigDecimal** | Optionally updates the limit price of this placement, in the placement&#39;s limit price currency unless a currency is also specified. A price on a placement with no limit price currency is stored but not returned until a currency is supplied. | [optional] [default to java.math.BigDecimal]
**stopPrice** | **java.math.BigDecimal** | Optionally updates the stop price of this placement, in the placement&#39;s stop price currency unless a currency is also specified. A price on a placement with no stop price currency is stored but not returned until a currency is supplied. | [optional] [default to java.math.BigDecimal]
**counterparty** | **String** | Optionally specifies the market entity this placement is placed with. | [optional] [default to String]
**executionSystem** | **String** | Optionally specifies the execution system in use. | [optional] [default to String]
**entryType** | **String** | Optionally specifies the entry type of this placement. Available values: Undecided, Manual, Direct, Ems, External. | [optional] [default to String]
**currency** | **String** | Optionally sets the ISO currency code of the placement&#39;s stop and/or limit price. Not permitted for a Market placement. For a value placement it must match the currency of the amount exactly, whether that amount is on the placement or in the update. When omitted, no currency checks are applied. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PlacementUpdateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
@javax.annotation.Nullable java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");
CurrencyAndAmount amount = new CurrencyAndAmount();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable java.math.BigDecimal limitPrice = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal stopPrice = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String counterparty = "example counterparty";
@javax.annotation.Nullable String executionSystem = "example executionSystem";
@javax.annotation.Nullable String entryType = "example entryType";
@javax.annotation.Nullable String currency = "example currency";


PlacementUpdateRequest placementUpdateRequestInstance = new PlacementUpdateRequest()
    .id(id)
    .quantity(quantity)
    .amount(amount)
    .properties(properties)
    .type(type)
    .limitPrice(limitPrice)
    .stopPrice(stopPrice)
    .counterparty(counterparty)
    .executionSystem(executionSystem)
    .entryType(entryType)
    .currency(currency);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)