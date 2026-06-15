# com.finbourne.sdk.services.workflow.model.DeleteTasksRequest
classname DeleteTasksRequest
Contains required info to delete Tasks

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskIds** | **List&lt;String&gt;** | The Ids of the Tasks to delete | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.workflow.model.DeleteTasksRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<String> taskIds = new List<String>();


DeleteTasksRequest deleteTasksRequestInstance = new DeleteTasksRequest()
    .taskIds(taskIds);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)