# com.finbourne.sdk.services.horizon.model.WorkflowResultFieldsTaskResponse
classname WorkflowResultFieldsTaskResponse
One of the instance's enabled RunWorkflow post-process tasks.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | [default to String]
**triggerOn** | **String** | When this task fires: OnSuccess, OnFailure or Always. | [default to String]
**resultFields** | **List&lt;String&gt;** | Names of the fields this particular task declares. | [default to List<String>]

```java
import com.finbourne.sdk.services.horizon.model.WorkflowResultFieldsTaskResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
String triggerOn = "example triggerOn";
List<String> resultFields = new List<String>();


WorkflowResultFieldsTaskResponse workflowResultFieldsTaskResponseInstance = new WorkflowResultFieldsTaskResponse()
    .name(name)
    .triggerOn(triggerOn)
    .resultFields(resultFields);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)