# com.finbourne.sdk.services.lusid.model.FieldSchema
classname FieldSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**displayName** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**type** | **String** | Available values: String, Int, Decimal, DateTime, Boolean, Map, List, PropertyArray, Percentage, Code, Id, Uri, CurrencyAndAmount, TradePrice, Currency, MetricValue, ResourceId, ResultValue, CutLocalTime, DateOrCutLabel, UnindexedText. | [optional] [default to String]
**displayOrder** | **Integer** |  | [optional] [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.FieldSchema;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
String type = "example type";
Integer displayOrder = new Integer("100.00");


FieldSchema fieldSchemaInstance = new FieldSchema()
    .id(id)
    .displayName(displayName)
    .description(description)
    .type(type)
    .displayOrder(displayOrder);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)