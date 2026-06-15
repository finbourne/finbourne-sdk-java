# com.finbourne.sdk.services.workflow.model.GetWorkerResultResponse
classname GetWorkerResultResponse
The RunWorker response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**workerStatus** | **String** | The final status of the Worker | [default to String]
**results** | [**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md) | Results | [default to List<Map<String, Object>>]
**statusDetail** | **String** | Detail on the final status | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.GetWorkerResultResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String workerStatus = "example workerStatus";
List<Map<String, Object>> results = new List<Map<String, Object>>();
@javax.annotation.Nullable String statusDetail = "example statusDetail";


GetWorkerResultResponse getWorkerResultResponseInstance = new GetWorkerResultResponse()
    .workerStatus(workerStatus)
    .results(results)
    .statusDetail(statusDetail);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)