# com.finbourne.sdk.services.lusid.model.OrderUpdateRequest
classname OrderUpdateRequest
A request to create or update a Order.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**quantity** | **java.math.BigDecimal** | The quantity of the given instrument ordered. | [optional] [default to java.math.BigDecimal]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this order. | [optional] [default to Map<String, PerpetualProperty>]
**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**limitPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**stopPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the order was made | [optional] [default to OffsetDateTime]
**side** | **String** | The client&#39;s representation of the order&#39;s side (buy, sell, short, etc) | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.OrderUpdateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
@javax.annotation.Nullable java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");
ResourceId portfolioId = new ResourceId();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
CurrencyAndAmount price = new CurrencyAndAmount();
CurrencyAndAmount limitPrice = new CurrencyAndAmount();
CurrencyAndAmount stopPrice = new CurrencyAndAmount();
@javax.annotation.Nullable OffsetDateTime date = OffsetDateTime.now();
@javax.annotation.Nullable String side = "example side";


OrderUpdateRequest orderUpdateRequestInstance = new OrderUpdateRequest()
    .id(id)
    .quantity(quantity)
    .portfolioId(portfolioId)
    .properties(properties)
    .price(price)
    .limitPrice(limitPrice)
    .stopPrice(stopPrice)
    .date(date)
    .side(side);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)