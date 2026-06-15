# com.finbourne.sdk.services.lusid.model.BlockedOrderRequest
classname BlockedOrderRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this order. | [optional] [default to Map<String, PerpetualProperty>]
**quantity** | **java.math.BigDecimal** | The quantity of the given instrument ordered. | [default to java.math.BigDecimal]
**orderBookId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**state** | **String** | The order&#39;s state (examples: New, PartiallyFilled, ...) | [optional] [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the order was made | [optional] [default to OffsetDateTime]
**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**orderInstruction** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**_package** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**side** | **String** | The client&#39;s representation of the order&#39;s side (buy, sell, short, etc) | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.BlockedOrderRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");
ResourceId orderBookId = new ResourceId();
ResourceId portfolioId = new ResourceId();
ResourceId id = new ResourceId();
@javax.annotation.Nullable String state = "example state";
OffsetDateTime date = OffsetDateTime.now();
CurrencyAndAmount price = new CurrencyAndAmount();
ResourceId orderInstruction = new ResourceId();
ResourceId package = new ResourceId();
@javax.annotation.Nullable String side = "example side";


BlockedOrderRequest blockedOrderRequestInstance = new BlockedOrderRequest()
    .properties(properties)
    .quantity(quantity)
    .orderBookId(orderBookId)
    .portfolioId(portfolioId)
    .id(id)
    .state(state)
    .date(date)
    .price(price)
    .orderInstruction(orderInstruction)
    .package(package)
    .side(side);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)