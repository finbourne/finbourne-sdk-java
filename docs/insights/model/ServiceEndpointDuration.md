# com.finbourne.sdk.services.insights.model.ServiceEndpointDuration
classname ServiceEndpointDuration
The request duration distribution for a single service and endpoint over the window.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**service** | **String** | The name of the service (application) that handled the requests. | [optional] [default to String]
**endpoint** | **String** | The endpoint (API operation) the requests were made to. | [optional] [default to String]
**totalRequests** | **Long** | The number of requests over the window, or null if not reported. | [optional] [default to Long]
**meanDurationMs** | **java.math.BigDecimal** | The mean request duration in milliseconds, or null if not reported. | [optional] [default to java.math.BigDecimal]
**medianDurationMs** | **java.math.BigDecimal** | The median (50th percentile) request duration in milliseconds, or null if not reported. | [optional] [default to java.math.BigDecimal]
**p95DurationMs** | **java.math.BigDecimal** | The 95th percentile request duration in milliseconds, or null if not reported. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.insights.model.ServiceEndpointDuration;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String service = "example service";
@javax.annotation.Nullable String endpoint = "example endpoint";
@javax.annotation.Nullable Long totalRequests = new Long("100.00");
@javax.annotation.Nullable java.math.BigDecimal meanDurationMs = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal medianDurationMs = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal p95DurationMs = new java.math.BigDecimal("100.00");


ServiceEndpointDuration serviceEndpointDurationInstance = new ServiceEndpointDuration()
    .service(service)
    .endpoint(endpoint)
    .totalRequests(totalRequests)
    .meanDurationMs(meanDurationMs)
    .medianDurationMs(medianDurationMs)
    .p95DurationMs(p95DurationMs);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)