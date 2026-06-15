# com.finbourne.sdk.services.workflow.model.RunWorkerResponse
classname RunWorkerResponse
The RunWorker response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | [**UUID**](UUID.md) | Identifies a Worker run | [default to UUID]
**statusDetail** | **String** | Detail on the final status | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.RunWorkerResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

UUID runId = "example runId";
@javax.annotation.Nullable String statusDetail = "example statusDetail";


RunWorkerResponse runWorkerResponseInstance = new RunWorkerResponse()
    .runId(runId)
    .statusDetail(statusDetail);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)