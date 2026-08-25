# com.finbourne.sdk.services.insights.model.MetricDataSetFailure
classname MetricDataSetFailure
Names a metric data set that was requested but could not be returned, with a caller-safe explanation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The data set that could not be returned. One of the Finbourne.Insights.WebApi.Dtos.Metrics.MetricDataSet values, and identical to the name of the Finbourne.Insights.WebApi.Dtos.Metrics.MetricsResponse property that would have carried it. | [default to String]
**reason** | **String** | A generic, caller-safe explanation of why the data set is missing. Never contains provider names, query text, internal service names or exception detail. | [default to String]

```java
import com.finbourne.sdk.services.insights.model.MetricDataSetFailure;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
String reason = "example reason";


MetricDataSetFailure metricDataSetFailureInstance = new MetricDataSetFailure()
    .name(name)
    .reason(reason);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)