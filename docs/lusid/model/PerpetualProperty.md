# com.finbourne.sdk.services.lusid.model.PerpetualProperty
classname PerpetualProperty

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key of the property. This takes the format {domain}/{scope}/{code} e.g. &#39;Instrument/system/Name&#39; or &#39;Transaction/strategy/quantsignal&#39;. | [default to String]
**value** | [**PropertyValue**](PropertyValue.md) |  | [optional] [default to PropertyValue]
**referenceData** | [**Map&lt;String, PropertyReferenceDataValue&gt;**](PropertyReferenceDataValue.md) | The ReferenceData linked to the value of the property. The ReferenceData is taken from the DataType on the PropertyDefinition that defines the property. | [optional] [readonly] [default to Map<String, PropertyReferenceDataValue>]

```java
import com.finbourne.sdk.services.lusid.model.PerpetualProperty;
import java.util.*;
import java.lang.System;
import java.net.URI;

String key = "example key";
PropertyValue value = new PropertyValue();
@javax.annotation.Nullable Map<String, PropertyReferenceDataValue> referenceData = new Map<String, PropertyReferenceDataValue>();


PerpetualProperty perpetualPropertyInstance = new PerpetualProperty()
    .key(key)
    .value(value)
    .referenceData(referenceData);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)