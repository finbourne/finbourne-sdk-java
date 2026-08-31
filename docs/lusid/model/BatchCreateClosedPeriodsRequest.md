# com.finbourne.sdk.services.lusid.model.BatchCreateClosedPeriodsRequest
classname BatchCreateClosedPeriodsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**closedPeriods** | [**List&lt;CreateClosedPeriodRequest&gt;**](CreateClosedPeriodRequest.md) | The ordered set of Closed Periods to create. Each Closed Period&#39;s EffectiveStart is derived from the previous Closed Period&#39;s EffectiveEnd (or the current chain tail for the first item), so EffectiveEnd must be strictly increasing across the batch. | [default to List<CreateClosedPeriodRequest>]

```java
import com.finbourne.sdk.services.lusid.model.BatchCreateClosedPeriodsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<CreateClosedPeriodRequest> closedPeriods = new List<CreateClosedPeriodRequest>();


BatchCreateClosedPeriodsRequest batchCreateClosedPeriodsRequestInstance = new BatchCreateClosedPeriodsRequest()
    .closedPeriods(closedPeriods);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)