# com.finbourne.sdk.services.insights.model.ServiceEndpointDurations24hDataSet
classname ServiceEndpointDurations24hDataSet
Request duration distribution per service and endpoint over a rolling twenty four hour window.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of this data set. Always &#x60;ServiceEndpointDurations24h&#x60;, matching the corresponding Finbourne.Insights.WebApi.Dtos.Metrics.MetricDataSet value and Finbourne.Insights.WebApi.Dtos.Metrics.MetricsResponse property. | [default to String]
**windowStart** | [**OffsetDateTime**](OffsetDateTime.md) | Inclusive start of the window the data covers, in UTC, floored to a whole minute. | [default to OffsetDateTime]
**windowEnd** | [**OffsetDateTime**](OffsetDateTime.md) | End of the window the data covers, in UTC, floored to a whole minute. | [default to OffsetDateTime]
**truncated** | **Boolean** | True when the query reached the row cap, so some services or endpoints are missing. False when the whole result set was returned. | [default to Boolean]
**values** | [**List&lt;ServiceEndpointDuration&gt;**](ServiceEndpointDuration.md) | The rows, ordered by service then endpoint. | [default to List<ServiceEndpointDuration>]

```java
import com.finbourne.sdk.services.insights.model.ServiceEndpointDurations24hDataSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
OffsetDateTime windowStart = OffsetDateTime.now();
OffsetDateTime windowEnd = OffsetDateTime.now();
Boolean truncated = true;
List<ServiceEndpointDuration> values = new List<ServiceEndpointDuration>();


ServiceEndpointDurations24hDataSet serviceEndpointDurations24hDataSetInstance = new ServiceEndpointDurations24hDataSet()
    .name(name)
    .windowStart(windowStart)
    .windowEnd(windowEnd)
    .truncated(truncated)
    .values(values);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)