# com.finbourne.sdk.services.horizon.model.IntegrationInstance
classname IntegrationInstance
Response containing an integration instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifies the instance within the integration. | [default to String]
**integrationType** | **String** | The integration type. | [default to String]
**name** | **String** | Name of the instance. | [default to String]
**description** | **String** | Description of the instance. | [default to String]
**enabled** | **Boolean** | If true the instance will be executed if its trigger is satisfied. | [default to Boolean]
**triggers** | [**List&lt;Trigger&gt;**](Trigger.md) | Defines what triggers execution of the instance. | [default to List<Trigger>]
**details** | **Object** | Base DTO type of an integration configuration specific to the integration type.              N.B. ASP.NET Core model validation is normally applied automatically when [ApiController] is added to a controller, however it doesn&#39;t work here with the polymorphic integration subtypes of this class (see https://github.com/dotnet/aspnetcore/issues/27882). The workaround here is to implement the IValidatableObject interface and each subtype must call Validate() or ValidateContents() on its properties (the validation is not recursive).  Located in Horizon.Integrations.Web so both specific integration projects and Horizon.WebApi can reference it. | [default to Object]

```java
import com.finbourne.sdk.services.horizon.model.IntegrationInstance;
import java.util.*;
import java.lang.System;
import java.net.URI;

String id = "example id";
String integrationType = "example integrationType";
String name = "example name";
String description = "example description";
Boolean enabled = true;
List<Trigger> triggers = new List<Trigger>();
Object 

IntegrationInstance integrationInstanceInstance = new IntegrationInstance()
    .id(id)
    .integrationType(integrationType)
    .name(name)
    .description(description)
    .enabled(enabled)
    .triggers(triggers)
    .details(details);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)