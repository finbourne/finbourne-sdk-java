# com.finbourne.sdk.services.lusid.model.BlockRequest
classname BlockRequest
A request to create or update a Block.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**orderIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The related order ids. | [optional] [default to List<ResourceId>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this block. | [optional] [default to Map<String, PerpetualProperty>]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. | [default to Map<String, String>]
**quantity** | **java.math.BigDecimal** | The total quantity of given instrument ordered. | [default to java.math.BigDecimal]
**side** | **String** | The client&#39;s representation of the block&#39;s side (buy, sell, short, etc) | [default to String]
**type** | **String** | The block order&#39;s type (examples: Limit, Market, ...) | [optional] [default to String]
**timeInForce** | **String** | The block orders&#39; time in force (examples: Day, GoodTilCancel, ...) | [optional] [default to String]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the block was made | [default to OffsetDateTime]
**limitPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**stopPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**isSwept** | **Boolean** | Swept blocks are considered no longer of active interest, and no longer take part in various order management processes | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.BlockRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
@javax.annotation.Nullable List<ResourceId> orderIds = new List<ResourceId>();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
Map<String, String> instrumentIdentifiers = new Map<String, String>();
java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");
String side = "example side";
@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String timeInForce = "example timeInForce";
OffsetDateTime createdDate = OffsetDateTime.now();
CurrencyAndAmount limitPrice = new CurrencyAndAmount();
CurrencyAndAmount stopPrice = new CurrencyAndAmount();
Boolean isSwept = true;


BlockRequest blockRequestInstance = new BlockRequest()
    .id(id)
    .orderIds(orderIds)
    .properties(properties)
    .instrumentIdentifiers(instrumentIdentifiers)
    .quantity(quantity)
    .side(side)
    .type(type)
    .timeInForce(timeInForce)
    .createdDate(createdDate)
    .limitPrice(limitPrice)
    .stopPrice(stopPrice)
    .isSwept(isSwept);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)