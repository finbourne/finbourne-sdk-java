# com.finbourne.sdk.services.insights.model.RequestsPerMinuteBucket
classname RequestsPerMinuteBucket
One minute of request activity for a single service and endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minuteBucket** | [**OffsetDateTime**](OffsetDateTime.md) | Start of the whole minute this row covers, in UTC. | [default to OffsetDateTime]
**service** | **String** | The name of the service (application) that handled the requests. | [optional] [default to String]
**endpoint** | **String** | The endpoint (API operation) the requests were made to. | [optional] [default to String]
**totalRequests** | **Long** | The number of requests in this minute, or null if not reported. | [optional] [default to Long]
**requests5xx** | **Long** | The number of requests in this minute that returned a 5xx status code, or null if not reported. | [optional] [default to Long]
**durationSumMs** | **java.math.BigDecimal** | The sum of the request durations in this minute, in milliseconds, or null if not reported. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.insights.model.RequestsPerMinuteBucket;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime minuteBucket = OffsetDateTime.now();
@javax.annotation.Nullable String service = "example service";
@javax.annotation.Nullable String endpoint = "example endpoint";
@javax.annotation.Nullable Long totalRequests = new Long("100.00");
@javax.annotation.Nullable Long requests5xx = new Long("100.00");
@javax.annotation.Nullable java.math.BigDecimal durationSumMs = new java.math.BigDecimal("100.00");


RequestsPerMinuteBucket requestsPerMinuteBucketInstance = new RequestsPerMinuteBucket()
    .minuteBucket(minuteBucket)
    .service(service)
    .endpoint(endpoint)
    .totalRequests(totalRequests)
    .requests5xx(requests5xx)
    .durationSumMs(durationSumMs);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)