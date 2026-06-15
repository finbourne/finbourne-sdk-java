# com.finbourne.sdk.services.horizon.model.UpdateInstanceRequest
classname UpdateInstanceRequest
A request to update an existing integration instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Instance identifier | [default to String]
**integrationType** | **String** |  | [default to String]
**name** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**enabled** | **Boolean** |  | [default to Boolean]
**triggers** | [**List&lt;Trigger&gt;**](Trigger.md) |  | [default to List<Trigger>]
**details** | **Object** | Base DTO type of an integration configuration specific to the integration type.              N.B. ASP.NET Core model validation is normally applied automatically when [ApiController] is added to a controller, however it doesn&#39;t work here with the polymorphic integration subtypes of this class (see https://github.com/dotnet/aspnetcore/issues/27882). The workaround here is to implement the IValidatableObject interface and each subtype must call Validate() or ValidateContents() on its properties (the validation is not recursive).  Located in Horizon.Integrations.Web so both specific integration projects and Horizon.WebApi can reference it. | [default to Object]
**postProcessTasks** | [**List&lt;PostProcessTask&gt;**](PostProcessTask.md) |  | [default to List<PostProcessTask>]

```java
import com.finbourne.sdk.services.horizon.model.UpdateInstanceRequest;
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


UpdateInstanceRequest updateInstanceRequestInstance = new UpdateInstanceRequest()
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