# com.finbourne.sdk.services.lusid.model.ExecutionSetRequest
classname ExecutionSetRequest
A request to create or update multiple Executions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requests** | [**List&lt;ExecutionRequest&gt;**](ExecutionRequest.md) | A collection of ExecutionRequests. | [optional] [default to List<ExecutionRequest>]

```java
import com.finbourne.sdk.services.lusid.model.ExecutionSetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<ExecutionRequest> requests = new List<ExecutionRequest>();


ExecutionSetRequest executionSetRequestInstance = new ExecutionSetRequest()
    .requests(requests);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)