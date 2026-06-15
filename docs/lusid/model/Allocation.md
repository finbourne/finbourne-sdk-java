# com.finbourne.sdk.services.lusid.model.Allocation
classname Allocation
An Allocation of a certain quantity of a specific instrument against an originating  Order.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**allocatedOrderId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**quantity** | **java.math.BigDecimal** | The quantity of given instrument allocated. | [default to java.math.BigDecimal]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument allocated. | [default to Map<String, String>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this allocation. | [optional] [default to Map<String, PerpetualProperty>]
**instrumentScope** | **String** | The scope in which the instrument lies | [optional] [default to String]
**lusidInstrumentId** | **String** | The LUSID instrument id for the instrument allocated. | [default to String]
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
**dataModelMembership** | [**DataModelMembership**](DataModelMembership.md) |  | [optional] [default to DataModelMembership]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.Allocation;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
ResourceId allocatedOrderId = new ResourceId();
ResourceId portfolioId = new ResourceId();
java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");
Map<String, String> instrumentIdentifiers = new Map<String, String>();
Version version = new Version();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
@javax.annotation.Nullable String instrumentScope = "example instrumentScope";
String lusidInstrumentId = "example lusidInstrumentId";
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
DataModelMembership dataModelMembership = new DataModelMembership();
@javax.annotation.Nullable List<Link> links = new List<Link>();


Allocation allocationInstance = new Allocation()
    .id(id)
    .allocatedOrderId(allocatedOrderId)
    .portfolioId(portfolioId)
    .quantity(quantity)
    .instrumentIdentifiers(instrumentIdentifiers)
    .version(version)
    .properties(properties)
    .instrumentScope(instrumentScope)
    .lusidInstrumentId(lusidInstrumentId)
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
    .executionIds(executionIds)
    .dataModelMembership(dataModelMembership)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)