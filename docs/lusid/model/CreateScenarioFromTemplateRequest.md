# com.finbourne.sdk.services.lusid.model.CreateScenarioFromTemplateRequest
classname CreateScenarioFromTemplateRequest
Request to create a scenario from a pre-built parameterised template. The template determines the  shape of the scenario's shifts; the parameters supply the targets (e.g. currency, instrument) and  optionally override the template's default shift size.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**template** | **String** | The template to build the scenario from. Use ListScenarioTemplates to discover the available  templates and the parameters each accepts. | [default to String]
**code** | **String** | The code of the scenario to create. | [default to String]
**displayName** | **String** | The display name of the created scenario. Defaults to a name derived from the template. | [optional] [default to String]
**description** | **String** | The description of the created scenario. Defaults to a description derived from the template. | [optional] [default to String]
**parameters** | **Map&lt;String, String&gt;** | Template parameters. Which parameters each template requires and accepts - with defaults and  units for the numeric ones - is listed by ListScenarioTemplates. A parameter the template does  not read is rejected rather than ignored, and parameter names are case-sensitive. | [optional] [default to Map<String, String>]

```java
import com.finbourne.sdk.services.lusid.model.CreateScenarioFromTemplateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String template = "example template";
String code = "example code";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable Map<String, String> parameters = new Map<String, String>();


CreateScenarioFromTemplateRequest createScenarioFromTemplateRequestInstance = new CreateScenarioFromTemplateRequest()
    .template(template)
    .code(code)
    .displayName(displayName)
    .description(description)
    .parameters(parameters);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)