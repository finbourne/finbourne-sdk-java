# com.finbourne.sdk.services.horizon.model.WorkflowExecuteStageResponse
classname WorkflowExecuteStageResponse
One stage of a staged integration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | [default to String]
**steps** | **List&lt;String&gt;** | The steps that run for this stage. | [default to List<String>]
**parameters** | **List&lt;String&gt;** | Names of every parameter this stage accepts. | [default to List<String>]
**rules** | **List&lt;String&gt;** | Cross-field rules the stage enforces, in plain text. | [default to List<String>]

```java
import com.finbourne.sdk.services.horizon.model.WorkflowExecuteStageResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
List<String> steps = new List<String>();
List<String> parameters = new List<String>();
List<String> rules = new List<String>();


WorkflowExecuteStageResponse workflowExecuteStageResponseInstance = new WorkflowExecuteStageResponse()
    .name(name)
    .steps(steps)
    .parameters(parameters)
    .rules(rules);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)