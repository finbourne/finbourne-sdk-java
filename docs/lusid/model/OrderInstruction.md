# com.finbourne.sdk.services.lusid.model.OrderInstruction
classname OrderInstruction
Record of an order instruction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | The active date of this order instruction. | [default to OffsetDateTime]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this execution. | [optional] [default to Map<String, PerpetualProperty>]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. | [default to Map<String, String>]
**quantity** | **java.math.BigDecimal** | The quantity of given instrument ordered. | [optional] [default to java.math.BigDecimal]
**weight** | **java.math.BigDecimal** | The proportion of the total portfolio value ordered for the given instrument ordered. | [optional] [default to java.math.BigDecimal]
**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**instrumentScope** | **String** | The scope in which the instrument lies | [optional] [default to String]
**lusidInstrumentId** | **String** | The LUSID instrument id for the instrument ordered. | [optional] [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**dataModelMembership** | [**DataModelMembership**](DataModelMembership.md) |  | [optional] [default to DataModelMembership]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.OrderInstruction;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
OffsetDateTime createdDate = OffsetDateTime.now();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
ResourceId portfolioId = new ResourceId();
Map<String, String> instrumentIdentifiers = new Map<String, String>();
@javax.annotation.Nullable java.math.BigDecimal quantity = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal weight = new java.math.BigDecimal("100.00");
CurrencyAndAmount price = new CurrencyAndAmount();
@javax.annotation.Nullable String instrumentScope = "example instrumentScope";
@javax.annotation.Nullable String lusidInstrumentId = "example lusidInstrumentId";
Version version = new Version();
DataModelMembership dataModelMembership = new DataModelMembership();
@javax.annotation.Nullable List<Link> links = new List<Link>();


OrderInstruction orderInstructionInstance = new OrderInstruction()
    .id(id)
    .createdDate(createdDate)
    .properties(properties)
    .portfolioId(portfolioId)
    .instrumentIdentifiers(instrumentIdentifiers)
    .quantity(quantity)
    .weight(weight)
    .price(price)
    .instrumentScope(instrumentScope)
    .lusidInstrumentId(lusidInstrumentId)
    .version(version)
    .dataModelMembership(dataModelMembership)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)