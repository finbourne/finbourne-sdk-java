# com.finbourne.sdk.services.lusid.model.Execution
classname Execution
The record of a number of executions against a single Placement (directly analogous to  a partial or full fill against a street order).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**placementId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this execution. | [optional] [default to Map<String, PerpetualProperty>]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. | [default to Map<String, String>]
**lusidInstrumentId** | **String** | The LUSID instrument id for the instrument execution. | [default to String]
**quantity** | **java.math.BigDecimal** | The quantity of given instrument ordered. | [default to java.math.BigDecimal]
**state** | **String** | The state of this execution (typically a FIX state; Open, Filled, etc). | [default to String]
**side** | **String** | The side (Buy, Sell, ...) of this execution. | [default to String]
**type** | **String** | The type of this execution (Market, Limit, etc). | [default to String]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | The active date of this execution. | [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The (optional) settlement date for this execution | [optional] [default to OffsetDateTime]
**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**settlementCurrency** | **String** | The execution&#39;s settlement currency. | [default to String]
**settlementCurrencyFxRate** | **java.math.BigDecimal** | The exectuion&#39;s settlement currency rate. | [default to java.math.BigDecimal]
**counterparty** | **String** | The market entity this placement is placed with. | [default to String]
**averagePrice** | **java.math.BigDecimal** | The average price of all executions for a given placement at the time of upsert | [optional] [default to java.math.BigDecimal]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**dataModelMembership** | [**DataModelMembership**](DataModelMembership.md) |  | [optional] [default to DataModelMembership]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.Execution;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
ResourceId placementId = new ResourceId();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
Map<String, String> instrumentIdentifiers = new Map<String, String>();
String lusidInstrumentId = "example lusidInstrumentId";
java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");
String state = "example state";
String side = "example side";
String type = "example type";
OffsetDateTime createdDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime settlementDate = OffsetDateTime.now();
CurrencyAndAmount price = new CurrencyAndAmount();
String settlementCurrency = "example settlementCurrency";
java.math.BigDecimal settlementCurrencyFxRate = new java.math.BigDecimal("100.00");
String counterparty = "example counterparty";
@javax.annotation.Nullable java.math.BigDecimal averagePrice = new java.math.BigDecimal("100.00");
Version version = new Version();
DataModelMembership dataModelMembership = new DataModelMembership();
@javax.annotation.Nullable List<Link> links = new List<Link>();


Execution executionInstance = new Execution()
    .id(id)
    .placementId(placementId)
    .properties(properties)
    .instrumentIdentifiers(instrumentIdentifiers)
    .lusidInstrumentId(lusidInstrumentId)
    .quantity(quantity)
    .state(state)
    .side(side)
    .type(type)
    .createdDate(createdDate)
    .settlementDate(settlementDate)
    .price(price)
    .settlementCurrency(settlementCurrency)
    .settlementCurrencyFxRate(settlementCurrencyFxRate)
    .counterparty(counterparty)
    .averagePrice(averagePrice)
    .version(version)
    .dataModelMembership(dataModelMembership)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)