# com.finbourne.sdk.services.luminesce.model.TaskStatus
classname TaskStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TaskStatus** | [**String**](.md) | **** | [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.TaskStatus;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of TaskStatus:
TaskStatus method = TaskStatus.CREATED;
TaskStatus method = TaskStatus.WAITING_FOR_ACTIVATION;
TaskStatus method = TaskStatus.WAITING_TO_RUN;
TaskStatus method = TaskStatus.RUNNING;
TaskStatus method = TaskStatus.WAITING_FOR_CHILDREN_TO_COMPLETE;
TaskStatus method = TaskStatus.RAN_TO_COMPLETION;
TaskStatus method = TaskStatus.CANCELED;
TaskStatus method = TaskStatus.FAULTED;
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)