# com.finbourne.sdk.services.horizon.model.WorkflowExecuteParametersResponse
classname WorkflowExecuteParametersResponse
The execute parameters a Workflow-driven integration instance accepts on executewithparams.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceId** | **String** | The instance these parameters belong to. | [default to String]
**integrationType** | **String** | The integration type of the instance, e.g. ta-tax-processes. | [default to String]
**parameters** | [**List&lt;WorkflowExecuteParameterResponse&gt;**](WorkflowExecuteParameterResponse.md) | Every parameter the integration accepts, each listed once. | [default to List<WorkflowExecuteParameterResponse>]
**stages** | [**List&lt;WorkflowExecuteStageResponse&gt;**](WorkflowExecuteStageResponse.md) | Per-stage breakdown of the steps that run and the parameters accepted. | [default to List<WorkflowExecuteStageResponse>]

```java
import com.finbourne.sdk.services.horizon.model.WorkflowExecuteParametersResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String instanceId = "example instanceId";
String integrationType = "example integrationType";
List<WorkflowExecuteParameterResponse> parameters = new List<WorkflowExecuteParameterResponse>();
List<WorkflowExecuteStageResponse> stages = new List<WorkflowExecuteStageResponse>();


WorkflowExecuteParametersResponse workflowExecuteParametersResponseInstance = new WorkflowExecuteParametersResponse()
    .instanceId(instanceId)
    .integrationType(integrationType)
    .parameters(parameters)
    .stages(stages);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)