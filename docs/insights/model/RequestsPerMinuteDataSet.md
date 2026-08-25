# com.finbourne.sdk.services.insights.model.RequestsPerMinuteDataSet
classname RequestsPerMinuteDataSet
Request volume, error count and total duration per minute, broken down by service and endpoint, over a rolling three hour window.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of this data set. Always &#x60;RequestsPerMinute&#x60;, matching the corresponding Finbourne.Insights.WebApi.Dtos.Metrics.MetricDataSet value and Finbourne.Insights.WebApi.Dtos.Metrics.MetricsResponse property. | [default to String]
**windowStart** | [**OffsetDateTime**](OffsetDateTime.md) | Inclusive start of the window the data covers, in UTC, floored to a whole minute. | [default to OffsetDateTime]
**windowEnd** | [**OffsetDateTime**](OffsetDateTime.md) | End of the window the data covers, in UTC, floored to a whole minute. | [default to OffsetDateTime]
**truncated** | **Boolean** | True when the query reached the row cap, so the data covers only part of the window and totals are understated. False when the whole window was returned. | [default to Boolean]
**values** | [**List&lt;RequestsPerMinuteBucket&gt;**](RequestsPerMinuteBucket.md) | The per-minute rows, ordered by minute, then service, then endpoint. | [default to List<RequestsPerMinuteBucket>]

```java
import com.finbourne.sdk.services.insights.model.RequestsPerMinuteDataSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
OffsetDateTime windowStart = OffsetDateTime.now();
OffsetDateTime windowEnd = OffsetDateTime.now();
Boolean truncated = true;
List<RequestsPerMinuteBucket> values = new List<RequestsPerMinuteBucket>();


RequestsPerMinuteDataSet requestsPerMinuteDataSetInstance = new RequestsPerMinuteDataSet()
    .name(name)
    .windowStart(windowStart)
    .windowEnd(windowEnd)
    .truncated(truncated)
    .values(values);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)