# com.finbourne.sdk.services.lusid.model.ReturnsMetric
classname ReturnsMetric
A metric requested from the aggregated-returns (TWR) endpoint. Supports only the  period `Return` (the grid granularity is set on the request via Period, not per metric);  `Alias` is the key the metric appears under in the response's metricsValue dictionary.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Available values: Return. | [optional] [default to String]
**alias** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ReturnsMetric;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String alias = "example alias";


ReturnsMetric returnsMetricInstance = new ReturnsMetric()
    .type(type)
    .alias(alias);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)