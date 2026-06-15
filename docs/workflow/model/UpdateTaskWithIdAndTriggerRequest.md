# com.finbourne.sdk.services.workflow.model.UpdateTaskWithIdAndTriggerRequest
classname UpdateTaskWithIdAndTriggerRequest
A request to update multiple Tasks Includes a trigger which is supplied from route in single update request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskInstanceId** | **String** | The ID of the task instance | [optional] [default to String]
**correlationIds** | **List&lt;String&gt;** | A set of guid identifiers that allow correlation across the application tier | [optional] [default to List<String>]
**fields** | [**List&lt;TaskInstanceField&gt;**](TaskInstanceField.md) | Defines the fields associated with the update | [optional] [default to List<TaskInstanceField>]
**stackingKey** | **String** | The key for the Stack that this Task should be added to | [optional] [default to String]
**triggerName** | **String** | The trigger we want to update the task with | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.UpdateTaskWithIdAndTriggerRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String taskInstanceId = "example taskInstanceId";
@javax.annotation.Nullable List<String> correlationIds = new List<String>();
@javax.annotation.Nullable List<TaskInstanceField> fields = new List<TaskInstanceField>();
@javax.annotation.Nullable String stackingKey = "example stackingKey";
@javax.annotation.Nullable String triggerName = "example triggerName";


UpdateTaskWithIdAndTriggerRequest updateTaskWithIdAndTriggerRequestInstance = new UpdateTaskWithIdAndTriggerRequest()
    .taskInstanceId(taskInstanceId)
    .correlationIds(correlationIds)
    .fields(fields)
    .stackingKey(stackingKey)
    .triggerName(triggerName);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)