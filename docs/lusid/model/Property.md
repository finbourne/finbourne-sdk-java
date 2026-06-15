# com.finbourne.sdk.services.lusid.model.Property
classname Property

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key of the property. This takes the format {domain}/{scope}/{code} e.g. &#39;Instrument/system/Name&#39; or &#39;Transaction/strategy/quantsignal&#39;. | [default to String]
**value** | [**PropertyValue**](PropertyValue.md) |  | [optional] [default to PropertyValue]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which the property is valid. | [optional] [default to OffsetDateTime]
**effectiveUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime until which the property is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveFrom&#39; datetime of the property. | [optional] [default to OffsetDateTime]
**referenceData** | [**Map&lt;String, PropertyReferenceDataValue&gt;**](PropertyReferenceDataValue.md) | The ReferenceData linked to the value of the property. The ReferenceData is taken from the DataType on the PropertyDefinition that defines the property. | [optional] [readonly] [default to Map<String, PropertyReferenceDataValue>]

```java
import com.finbourne.sdk.services.lusid.model.Property;
import java.util.*;
import java.lang.System;
import java.net.URI;

String key = "example key";
PropertyValue value = new PropertyValue();
@javax.annotation.Nullable OffsetDateTime effectiveFrom = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime effectiveUntil = OffsetDateTime.now();
@javax.annotation.Nullable Map<String, PropertyReferenceDataValue> referenceData = new Map<String, PropertyReferenceDataValue>();


Property propertyInstance = new Property()
    .key(key)
    .value(value)
    .effectiveFrom(effectiveFrom)
    .effectiveUntil(effectiveUntil)
    .referenceData(referenceData);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)