# com.finbourne.sdk.services.lusid.model.Order
classname Order
An Order for a certain quantity of a specific instrument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this order. | [optional] [default to Map<String, PerpetualProperty>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. | [default to Map<String, String>]
**quantity** | **java.math.BigDecimal** | The quantity of the given instrument ordered. | [optional] [default to java.math.BigDecimal]
**side** | **String** | The client&#39;s representation of the order&#39;s side (buy, sell, short, etc) | [default to String]
**orderBookId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**instrumentScope** | **String** | The scope in which the instrument lies | [optional] [default to String]
**lusidInstrumentId** | **String** | The LUSID instrument id for the instrument ordered. | [default to String]
**state** | **String** | The order&#39;s state (examples: New, PartiallyFilled, ...) | [optional] [default to String]
**type** | **String** | The order&#39;s type (examples: Limit, Market, ...) | [optional] [default to String]
**timeInForce** | **String** | The order&#39;s time in force (examples: Day, GoodTilCancel, ...) | [optional] [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the order was made | [optional] [default to OffsetDateTime]
**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**limitPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**stopPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**orderInstructionId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**packageId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**weight** | **java.math.BigDecimal** | The proportion of the total portfolio value ordered for the given instrument ordered. | [optional] [default to java.math.BigDecimal]
**amount** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**dataModelMembership** | [**DataModelMembership**](DataModelMembership.md) |  | [optional] [default to DataModelMembership]
**derivedComplianceState** | **String** | The compliance state of the order, derived from pre-trade compliance runs. | [optional] [default to String]
**derivedApprovalState** | **String** | The approval state of the order. | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.Order;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
Version version = new Version();
Map<String, String> instrumentIdentifiers = new Map<String, String>();
@javax.annotation.Nullable java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");
String side = "example side";
ResourceId orderBookId = new ResourceId();
ResourceId portfolioId = new ResourceId();
ResourceId id = new ResourceId();
@javax.annotation.Nullable String instrumentScope = "example instrumentScope";
String lusidInstrumentId = "example lusidInstrumentId";
@javax.annotation.Nullable String state = "example state";
@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String timeInForce = "example timeInForce";
OffsetDateTime date = OffsetDateTime.now();
CurrencyAndAmount price = new CurrencyAndAmount();
CurrencyAndAmount limitPrice = new CurrencyAndAmount();
CurrencyAndAmount stopPrice = new CurrencyAndAmount();
ResourceId orderInstructionId = new ResourceId();
ResourceId packageId = new ResourceId();
@javax.annotation.Nullable java.math.BigDecimal weight = new java.math.BigDecimal("100.00");
CurrencyAndAmount amount = new CurrencyAndAmount();
DataModelMembership dataModelMembership = new DataModelMembership();
@javax.annotation.Nullable String derivedComplianceState = "example derivedComplianceState";
@javax.annotation.Nullable String derivedApprovalState = "example derivedApprovalState";
@javax.annotation.Nullable List<Link> links = new List<Link>();


Order orderInstance = new Order()
    .properties(properties)
    .version(version)
    .instrumentIdentifiers(instrumentIdentifiers)
    .quantity(quantity)
    .side(side)
    .orderBookId(orderBookId)
    .portfolioId(portfolioId)
    .id(id)
    .instrumentScope(instrumentScope)
    .lusidInstrumentId(lusidInstrumentId)
    .state(state)
    .type(type)
    .timeInForce(timeInForce)
    .date(date)
    .price(price)
    .limitPrice(limitPrice)
    .stopPrice(stopPrice)
    .orderInstructionId(orderInstructionId)
    .packageId(packageId)
    .weight(weight)
    .amount(amount)
    .dataModelMembership(dataModelMembership)
    .derivedComplianceState(derivedComplianceState)
    .derivedApprovalState(derivedApprovalState)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)