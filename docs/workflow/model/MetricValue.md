# com.finbourne.sdk.services.workflow.model.MetricValue
classname MetricValue
The numeric value of a metric property, with an optional unit.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **java.math.BigDecimal** | The numerical value of the property. | [optional] [default to java.math.BigDecimal]
**unit** | **String** | The unit identifier for the value. | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.MetricValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal value = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String unit = "example unit";


MetricValue metricValueInstance = new MetricValue()
    .value(value)
    .unit(unit);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)