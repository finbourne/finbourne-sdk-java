# com.finbourne.sdk.services.workflow.model.BatchUpdateTasksResponse
classname BatchUpdateTasksResponse
Defines a representation of tasks that have been updated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;Task&gt;**](Task.md) | Successful tasks brought back from the BatchUpdate call | [optional] [readonly] [default to List<Task>]
**failed** | [**List&lt;ErrorDetail&gt;**](ErrorDetail.md) | Individual failures for each task returned from the BatchUpdate call | [optional] [readonly] [default to List<ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.workflow.model.BatchUpdateTasksResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<Task> values = new List<Task>();
@javax.annotation.Nullable List<ErrorDetail> failed = new List<ErrorDetail>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


BatchUpdateTasksResponse batchUpdateTasksResponseInstance = new BatchUpdateTasksResponse()
    .values(values)
    .failed(failed)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)