# com.finbourne.sdk.services.lusid.model.QualifierDefinition
classname QualifierDefinition
A qualifier as returned on read: the request shape plus the value type resolved from its data type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key by which the qualifier is addressed, for example &#39;direction&#39;. Addressed in filters, sort orders and derivation formulae as Properties[{propertyKey}].Qualifiers[{qualifierKey}]. Validated under the same rules as a property code. | [optional] [default to String]
**displayName** | **String** | The display name of the qualifier. | [optional] [default to String]
**description** | **String** | Describes the qualifier. Optional; null where not supplied. | [optional] [default to String]
**dataTypeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**valueType** | **String** | The type of value this qualifier carries, resolved from its data type. Available values: String, Int, Decimal, DateTime, Boolean, Map, List, PropertyArray, Percentage, Code, Id, Uri, CurrencyAndAmount, TradePrice, Currency, MetricValue, ResourceId, ResultValue, CutLocalTime, DateOrCutLabel, UnindexedText. | [optional] [default to String]
**isRequired** | **Boolean** | Whether a value for this qualifier must be supplied when a value of the property is written. Defaults to false, and is returned as a boolean rather than as null. Validated on write only, so setting it true does not retroactively invalidate values stored before the change. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.QualifierDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String key = "example key";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
ResourceId dataTypeId = new ResourceId();
@javax.annotation.Nullable String valueType = "example valueType";
Boolean isRequired = true;


QualifierDefinition qualifierDefinitionInstance = new QualifierDefinition()
    .key(key)
    .displayName(displayName)
    .description(description)
    .dataTypeId(dataTypeId)
    .valueType(valueType)
    .isRequired(isRequired);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)