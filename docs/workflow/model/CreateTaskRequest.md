# com.finbourne.sdk.services.workflow.model.CreateTaskRequest
classname CreateTaskRequest
Contains required info to create a new Task

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**correlationIds** | **List&lt;String&gt;** | A set of guid identifiers that allow correlation across the application tier | [optional] [default to List<String>]
**fields** | [**List&lt;TaskInstanceField&gt;**](TaskInstanceField.md) | Fields and their initial values - should correspond with the Task Definition field schema | [optional] [default to List<TaskInstanceField>]
**stackingKey** | **String** | The key for the Stack that this Task should be added to | [optional] [default to String]
**workflowId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.sdk.services.workflow.model.CreateTaskRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId taskDefinitionId = new ResourceId();
@javax.annotation.Nullable List<String> correlationIds = new List<String>();
@javax.annotation.Nullable List<TaskInstanceField> fields = new List<TaskInstanceField>();
@javax.annotation.Nullable String stackingKey = "example stackingKey";
ResourceId workflowId = new ResourceId();


CreateTaskRequest createTaskRequestInstance = new CreateTaskRequest()
    .taskDefinitionId(taskDefinitionId)
    .correlationIds(correlationIds)
    .fields(fields)
    .stackingKey(stackingKey)
    .workflowId(workflowId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)