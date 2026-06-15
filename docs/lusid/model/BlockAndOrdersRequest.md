# com.finbourne.sdk.services.lusid.model.BlockAndOrdersRequest
classname BlockAndOrdersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blockId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**orders** | [**List&lt;BlockedOrderRequest&gt;**](BlockedOrderRequest.md) | An order which belongs to a block. Fields common to both entities (such as instrument) should be derived from the block. | [default to List<BlockedOrderRequest>]
**blockProperties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this block. | [optional] [default to Map<String, PerpetualProperty>]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. | [default to Map<String, String>]
**side** | **String** | The client&#39;s representation of the block&#39;s side (buy, sell, short, etc). BlockedOrders in the request which do not specify a side will have their side populated with this value. | [optional] [default to String]
**type** | **String** | The block order&#39;s type (examples: Limit, Market, ...) | [optional] [default to String]
**timeInForce** | **String** | The block orders&#39; time in force (examples: Day, GoodTilCancel, ...) | [optional] [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the block was made | [optional] [default to OffsetDateTime]
**limitPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**stopPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]

```java
import com.finbourne.sdk.services.lusid.model.BlockAndOrdersRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId blockId = new ResourceId();
List<BlockedOrderRequest> orders = new List<BlockedOrderRequest>();
@javax.annotation.Nullable Map<String, PerpetualProperty> blockProperties = new Map<String, PerpetualProperty>();
Map<String, String> instrumentIdentifiers = new Map<String, String>();
@javax.annotation.Nullable String side = "example side";
@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String timeInForce = "example timeInForce";
OffsetDateTime date = OffsetDateTime.now();
CurrencyAndAmount limitPrice = new CurrencyAndAmount();
CurrencyAndAmount stopPrice = new CurrencyAndAmount();


BlockAndOrdersRequest blockAndOrdersRequestInstance = new BlockAndOrdersRequest()
    .blockId(blockId)
    .orders(orders)
    .blockProperties(blockProperties)
    .instrumentIdentifiers(instrumentIdentifiers)
    .side(side)
    .type(type)
    .timeInForce(timeInForce)
    .date(date)
    .limitPrice(limitPrice)
    .stopPrice(stopPrice);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)