# com.finbourne.sdk.services.insights.model.ServiceRequests
classname ServiceRequests
The request volume and server-error rate for a single service over the window.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**service** | **String** | The name of the service (application) that handled the requests. | [optional] [default to String]
**totalRequests** | **Long** | The number of requests over the window, or null if not reported. | [optional] [default to Long]
**requests5xx** | **Long** | The number of requests over the window that returned a 5xx status code, or null if not reported. | [optional] [default to Long]
**pct5xx** | **java.math.BigDecimal** | The percentage of requests that returned a 5xx status code, or null if not reported. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.insights.model.ServiceRequests;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String service = "example service";
@javax.annotation.Nullable Long totalRequests = new Long("100.00");
@javax.annotation.Nullable Long requests5xx = new Long("100.00");
@javax.annotation.Nullable java.math.BigDecimal pct5xx = new java.math.BigDecimal("100.00");


ServiceRequests serviceRequestsInstance = new ServiceRequests()
    .service(service)
    .totalRequests(totalRequests)
    .requests5xx(requests5xx)
    .pct5xx(pct5xx);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)