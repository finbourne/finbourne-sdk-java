# com.finbourne.sdk.services.lusid.model.PropertyValue
classname PropertyValue
The value of the property.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**labelValue** | **String** | The text value of a property defined as having the &#39;Label&#39; type. | [optional] [default to String]
**metricValue** | [**MetricValue**](MetricValue.md) |  | [optional] [default to MetricValue]
**labelValueSet** | [**LabelValueSet**](LabelValueSet.md) |  | [optional] [default to LabelValueSet]

```java
import com.finbourne.sdk.services.lusid.model.PropertyValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String labelValue = "example labelValue";
MetricValue metricValue = new MetricValue();
LabelValueSet labelValueSet = new LabelValueSet();


PropertyValue propertyValueInstance = new PropertyValue()
    .labelValue(labelValue)
    .metricValue(metricValue)
    .labelValueSet(labelValueSet);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)