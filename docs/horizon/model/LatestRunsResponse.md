# com.finbourne.sdk.services.horizon.model.LatestRunsResponse
classname LatestRunsResponse
record containing the 24-hour run summary grouped by external status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **Integer** |  | [default to Integer]
**statusCounts** | [**List&lt;RunStatusCount&gt;**](RunStatusCount.md) |  | [default to List<RunStatusCount>]

```java
import com.finbourne.sdk.services.horizon.model.LatestRunsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer total = new Integer("100.00");
List<RunStatusCount> statusCounts = new List<RunStatusCount>();


LatestRunsResponse latestRunsResponseInstance = new LatestRunsResponse()
    .total(total)
    .statusCounts(statusCounts);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)