# com.finbourne.sdk.services.insights.model.MetricsResponse
classname MetricsResponse
The aggregated platform metrics for a domain: one nullable, strongly-typed property per data set.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | When this response was assembled, in UTC. Every data set in the response was resolved against this instant. | [default to OffsetDateTime]
**domain** | **String** | The domain the metrics are for, resolved from the authenticated request rather than from any parameter. | [default to String]
**requestsPerMinute** | [**RequestsPerMinuteDataSet**](RequestsPerMinuteDataSet.md) |  | [optional] [default to RequestsPerMinuteDataSet]
**serviceEndpointDurations24h** | [**ServiceEndpointDurations24hDataSet**](ServiceEndpointDurations24hDataSet.md) |  | [optional] [default to ServiceEndpointDurations24hDataSet]
**serviceRequests24h** | [**ServiceRequests24hDataSet**](ServiceRequests24hDataSet.md) |  | [optional] [default to ServiceRequests24hDataSet]
**identityMetrics** | [**IdentityMetricsDataSet**](IdentityMetricsDataSet.md) |  | [optional] [default to IdentityMetricsDataSet]
**notIncluded** | **List&lt;String&gt;** | The data sets the caller excluded via the &#x60;include&#x60; parameter, and which were therefore never queried. Each value is one of the Finbourne.Insights.WebApi.Dtos.Metrics.MetricDataSet values. | [default to List<String>]
**failed** | [**List&lt;MetricDataSetFailure&gt;**](MetricDataSetFailure.md) | The data sets that were requested but could not be returned, each with a caller-safe reason. | [default to List<MetricDataSetFailure>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.insights.model.MetricsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime asAt = OffsetDateTime.now();
String domain = "example domain";
RequestsPerMinuteDataSet requestsPerMinute = new RequestsPerMinuteDataSet();
ServiceEndpointDurations24hDataSet serviceEndpointDurations24h = new ServiceEndpointDurations24hDataSet();
ServiceRequests24hDataSet serviceRequests24h = new ServiceRequests24hDataSet();
IdentityMetricsDataSet identityMetrics = new IdentityMetricsDataSet();
List<String> notIncluded = new List<String>();
List<MetricDataSetFailure> failed = new List<MetricDataSetFailure>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


MetricsResponse metricsResponseInstance = new MetricsResponse()
    .asAt(asAt)
    .domain(domain)
    .requestsPerMinute(requestsPerMinute)
    .serviceEndpointDurations24h(serviceEndpointDurations24h)
    .serviceRequests24h(serviceRequests24h)
    .identityMetrics(identityMetrics)
    .notIncluded(notIncluded)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)