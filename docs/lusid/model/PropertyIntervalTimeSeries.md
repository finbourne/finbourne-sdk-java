# com.finbourne.sdk.services.lusid.model.PropertyIntervalTimeSeries
classname PropertyIntervalTimeSeries

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The property key that this time series belongs to. | [default to String]
**values** | [**List&lt;PropertyInterval&gt;**](PropertyInterval.md) | The complete time series (history) of intervals for the property key. | [default to List<PropertyInterval>]

```java
import com.finbourne.sdk.services.lusid.model.PropertyIntervalTimeSeries;
import java.util.*;
import java.lang.System;
import java.net.URI;

String key = "example key";
List<PropertyInterval> values = new List<PropertyInterval>();


PropertyIntervalTimeSeries propertyIntervalTimeSeriesInstance = new PropertyIntervalTimeSeries()
    .key(key)
    .values(values);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)