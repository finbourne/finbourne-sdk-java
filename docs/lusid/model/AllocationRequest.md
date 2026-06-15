# com.finbourne.sdk.services.lusid.model.AllocationRequest
classname AllocationRequest
A request to create or update an Allocation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this allocation. | [optional] [default to Map<String, PerpetualProperty>]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument allocated. | [default to Map<String, String>]
**quantity** | **java.math.BigDecimal** | The quantity of given instrument allocated. | [default to java.math.BigDecimal]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**allocatedOrderId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**placementIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | A placement - also known as an order placed in the market - associated with this allocation. | [optional] [default to List<ResourceId>]
**state** | **String** | The state of this allocation. | [optional] [default to String]
**side** | **String** | The side of this allocation (examples: Buy, Sell, ...). | [optional] [default to String]
**type** | **String** | The type of order associated with this allocation (examples: Limit, Market, ...). | [optional] [default to String]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The settlement date for this allocation. | [optional] [default to OffsetDateTime]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date of this allocation. | [optional] [default to OffsetDateTime]
**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**settlementCurrency** | **String** | The settlement currency of this allocation. | [optional] [default to String]
**settlementCurrencyFxRate** | **java.math.BigDecimal** | The settlement currency to allocation currency FX rate. | [optional] [default to java.math.BigDecimal]
**counterparty** | **String** | The counterparty for this allocation. | [optional] [default to String]
**executionIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The executions associated with this allocation | [optional] [default to List<ResourceId>]

```java
import com.finbourne.sdk.services.lusid.model.AllocationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
Map<String, String> instrumentIdentifiers = new Map<String, String>();
java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");
ResourceId portfolioId = new ResourceId();
ResourceId allocatedOrderId = new ResourceId();
ResourceId id = new ResourceId();
@javax.annotation.Nullable List<ResourceId> placementIds = new List<ResourceId>();
@javax.annotation.Nullable String state = "example state";
@javax.annotation.Nullable String side = "example side";
@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable OffsetDateTime settlementDate = OffsetDateTime.now();
OffsetDateTime date = OffsetDateTime.now();
CurrencyAndAmount price = new CurrencyAndAmount();
@javax.annotation.Nullable String settlementCurrency = "example settlementCurrency";
@javax.annotation.Nullable java.math.BigDecimal settlementCurrencyFxRate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String counterparty = "example counterparty";
@javax.annotation.Nullable List<ResourceId> executionIds = new List<ResourceId>();


AllocationRequest allocationRequestInstance = new AllocationRequest()
    .properties(properties)
    .instrumentIdentifiers(instrumentIdentifiers)
    .quantity(quantity)
    .portfolioId(portfolioId)
    .allocatedOrderId(allocatedOrderId)
    .id(id)
    .placementIds(placementIds)
    .state(state)
    .side(side)
    .type(type)
    .settlementDate(settlementDate)
    .date(date)
    .price(price)
    .settlementCurrency(settlementCurrency)
    .settlementCurrencyFxRate(settlementCurrencyFxRate)
    .counterparty(counterparty)
    .executionIds(executionIds);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)