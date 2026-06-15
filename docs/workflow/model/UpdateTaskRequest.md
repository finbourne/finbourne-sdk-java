# com.finbourne.sdk.services.workflow.model.UpdateTaskRequest
classname UpdateTaskRequest
A request to update a Task

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**correlationIds** | **List&lt;String&gt;** | A set of guid identifiers that allow correlation across the application tier | [optional] [default to List<String>]
**fields** | [**List&lt;TaskInstanceField&gt;**](TaskInstanceField.md) | Defines the fields associated with the update | [optional] [default to List<TaskInstanceField>]
**stackingKey** | **String** | The key for the Stack that this Task should be added to | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.UpdateTaskRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<String> correlationIds = new List<String>();
@javax.annotation.Nullable List<TaskInstanceField> fields = new List<TaskInstanceField>();
@javax.annotation.Nullable String stackingKey = "example stackingKey";


UpdateTaskRequest updateTaskRequestInstance = new UpdateTaskRequest()
    .correlationIds(correlationIds)
    .fields(fields)
    .stackingKey(stackingKey);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)