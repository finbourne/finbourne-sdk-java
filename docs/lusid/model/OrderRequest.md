# com.finbourne.sdk.services.lusid.model.OrderRequest
classname OrderRequest
A request to create or update an Order.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this order. | [optional] [default to Map<String, PerpetualProperty>]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. | [default to Map<String, String>]
**quantity** | **java.math.BigDecimal** | The quantity of the given instrument ordered. | [optional] [default to java.math.BigDecimal]
**side** | **String** | The client&#39;s representation of the order&#39;s side (buy, sell, short, etc) | [default to String]
**orderBookId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**state** | **String** | The order&#39;s state (examples: New, PartiallyFilled, ...) | [optional] [default to String]
**type** | **String** | The order&#39;s type (examples: Limit, Market, ...) | [optional] [default to String]
**timeInForce** | **String** | The order&#39;s time in force (examples: Day, GoodTilCancel, ...) | [optional] [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the order was made | [optional] [default to OffsetDateTime]
**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**limitPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**stopPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**orderInstruction** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**_package** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**weight** | **java.math.BigDecimal** | The proportion of the total portfolio value ordered for the given instrument ordered. | [optional] [default to java.math.BigDecimal]
**amount** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]

```java
import com.finbourne.sdk.services.lusid.model.OrderRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
Map<String, String> instrumentIdentifiers = new Map<String, String>();
@javax.annotation.Nullable java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");
String side = "example side";
ResourceId orderBookId = new ResourceId();
ResourceId portfolioId = new ResourceId();
ResourceId id = new ResourceId();
@javax.annotation.Nullable String state = "example state";
@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String timeInForce = "example timeInForce";
OffsetDateTime date = OffsetDateTime.now();
CurrencyAndAmount price = new CurrencyAndAmount();
CurrencyAndAmount limitPrice = new CurrencyAndAmount();
CurrencyAndAmount stopPrice = new CurrencyAndAmount();
ResourceId orderInstruction = new ResourceId();
ResourceId package = new ResourceId();
@javax.annotation.Nullable java.math.BigDecimal weight = new java.math.BigDecimal("100.00");
CurrencyAndAmount amount = new CurrencyAndAmount();


OrderRequest orderRequestInstance = new OrderRequest()
    .properties(properties)
    .instrumentIdentifiers(instrumentIdentifiers)
    .quantity(quantity)
    .side(side)
    .orderBookId(orderBookId)
    .portfolioId(portfolioId)
    .id(id)
    .state(state)
    .type(type)
    .timeInForce(timeInForce)
    .date(date)
    .price(price)
    .limitPrice(limitPrice)
    .stopPrice(stopPrice)
    .orderInstruction(orderInstruction)
    .package(package)
    .weight(weight)
    .amount(amount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)