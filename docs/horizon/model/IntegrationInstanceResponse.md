# com.finbourne.sdk.services.horizon.model.IntegrationInstanceResponse
classname IntegrationInstanceResponse
Response representing an integration instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique identifier of the integration instance. | [default to String]
**integrationType** | **String** | The type of the integration. | [default to String]
**name** | **String** | The name of the integration instance. | [default to String]
**description** | **String** | The description of the integration instance. | [default to String]
**enabled** | **Boolean** | Whether the integration instance is enabled. | [default to Boolean]
**triggers** | [**List&lt;Trigger&gt;**](Trigger.md) | The triggers associated with the integration instance. | [default to List<Trigger>]
**details** | **Object** | Base DTO type of an integration configuration specific to the integration type.              N.B. ASP.NET Core model validation is normally applied automatically when [ApiController] is added to a controller, however it doesn&#39;t work here with the polymorphic integration subtypes of this class (see https://github.com/dotnet/aspnetcore/issues/27882). The workaround here is to implement the IValidatableObject interface and each subtype must call Validate() or ValidateContents() on its properties (the validation is not recursive).  Located in Horizon.Integrations.Web so both specific integration projects and Horizon.WebApi can reference it. | [default to Object]
**postProcessTasks** | [**List&lt;PostProcessTask&gt;**](PostProcessTask.md) | The post process tasks associated with the integration instance. | [default to List<PostProcessTask>]

```java
import com.finbourne.sdk.services.horizon.model.IntegrationInstanceResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String id = "example id";
String integrationType = "example integrationType";
String name = "example name";
String description = "example description";
Boolean enabled = true;
List<Trigger> triggers = new List<Trigger>();
Object List<PostProcessTask> postProcessTasks = new List<PostProcessTask>();


IntegrationInstanceResponse integrationInstanceResponseInstance = new IntegrationInstanceResponse()
    .id(id)
    .integrationType(integrationType)
    .name(name)
    .description(description)
    .enabled(enabled)
    .triggers(triggers)
    .details(details)
    .postProcessTasks(postProcessTasks);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)