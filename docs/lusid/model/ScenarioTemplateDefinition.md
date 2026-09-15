# com.finbourne.sdk.services.lusid.model.ScenarioTemplateDefinition
classname ScenarioTemplateDefinition
One pre-built scenario template: the name to pass to CreateScenarioFromTemplate, what the  template does, and the parameters it accepts. A parameter not listed here is rejected by  the create call, not ignored.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The template name, as accepted by CreateScenarioFromTemplate. | [optional] [default to String]
**description** | **String** | What the template&#39;s scenario does. | [optional] [default to String]
**parameters** | [**List&lt;ScenarioTemplateParameter&gt;**](ScenarioTemplateParameter.md) | The parameters the template accepts, in the order they are documented. Parameter names are  case-sensitive; supplying one not in this list fails the create call. | [optional] [default to List<ScenarioTemplateParameter>]

```java
import com.finbourne.sdk.services.lusid.model.ScenarioTemplateDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<ScenarioTemplateParameter> parameters = new List<ScenarioTemplateParameter>();


ScenarioTemplateDefinition scenarioTemplateDefinitionInstance = new ScenarioTemplateDefinition()
    .name(name)
    .description(description)
    .parameters(parameters);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)