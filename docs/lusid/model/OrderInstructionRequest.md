# com.finbourne.sdk.services.lusid.model.OrderInstructionRequest
classname OrderInstructionRequest
A request to create or update a Order Instruction.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | The active date of this order instruction. | [default to OffsetDateTime]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. | [optional] [default to Map<String, String>]
**quantity** | **java.math.BigDecimal** | The quantity of given instrument ordered. | [optional] [default to java.math.BigDecimal]
**weight** | **java.math.BigDecimal** | The proportion of the total portfolio value ordered for the given instrument ordered. | [optional] [default to java.math.BigDecimal]
**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this execution. | [optional] [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.sdk.services.lusid.model.OrderInstructionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
OffsetDateTime createdDate = OffsetDateTime.now();
ResourceId portfolioId = new ResourceId();
@javax.annotation.Nullable Map<String, String> instrumentIdentifiers = new Map<String, String>();
@javax.annotation.Nullable java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal weight = new java.math.BigDecimal("100.00");
CurrencyAndAmount price = new CurrencyAndAmount();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();


OrderInstructionRequest orderInstructionRequestInstance = new OrderInstructionRequest()
    .id(id)
    .createdDate(createdDate)
    .portfolioId(portfolioId)
    .instrumentIdentifiers(instrumentIdentifiers)
    .quantity(quantity)
    .weight(weight)
    .price(price)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)