# com.finbourne.sdk.services.workflow.model.PropertyValue
classname PropertyValue
The value of a property. Exactly one of Finbourne.Workflow.WebApi.Common.Dto.Json.Properties.PropertyValue.LabelValue, Finbourne.Workflow.WebApi.Common.Dto.Json.Properties.PropertyValue.MetricValue or Finbourne.Workflow.WebApi.Common.Dto.Json.Properties.PropertyValue.LabelValueSet should be supplied.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**labelValue** | **String** | The value of a text property. | [optional] [default to String]
**metricValue** | [**MetricValue**](MetricValue.md) |  | [optional] [default to MetricValue]
**labelValueSet** | [**LabelValueSet**](LabelValueSet.md) |  | [optional] [default to LabelValueSet]

```java
import com.finbourne.sdk.services.workflow.model.PropertyValue;
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