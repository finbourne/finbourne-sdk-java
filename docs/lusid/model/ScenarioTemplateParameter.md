# com.finbourne.sdk.services.lusid.model.ScenarioTemplateParameter
classname ScenarioTemplateParameter
One parameter of a scenario template: its name (case-sensitive), whether it must be supplied,  what it means, and - for optional numeric parameters - the default used when omitted and the  unit the value is read in.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The parameter name, as supplied in the create request&#39;s Parameters dictionary. Case-sensitive. | [optional] [default to String]
**required** | **Boolean** | Whether the parameter must be supplied. | [optional] [default to Boolean]
**description** | **String** | What the parameter means to this template. | [optional] [default to String]
**defaultValue** | **String** | The value used when the parameter is omitted. Null for required parameters. | [optional] [default to String]
**unit** | **String** | The unit a numeric value is read in: &#39;BasisPoints&#39;, &#39;PercentagePoints&#39; or &#39;Fraction&#39;  (0.20 meaning +20%). The templates do NOT share one unit - read this per template.  Null for non-numeric parameters. | [optional] [default to String]
**exclusiveGroup** | **String** | Parameters of a template sharing an ExclusiveGroup are alternatives: exactly one of them must  be supplied. Group members are not individually Required and carry no default. Null for  parameters that stand alone. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ScenarioTemplateParameter;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String name = "example name";
Boolean required = true;
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable String defaultValue = "example defaultValue";
@javax.annotation.Nullable String unit = "example unit";
@javax.annotation.Nullable String exclusiveGroup = "example exclusiveGroup";


ScenarioTemplateParameter scenarioTemplateParameterInstance = new ScenarioTemplateParameter()
    .name(name)
    .required(required)
    .description(description)
    .defaultValue(defaultValue)
    .unit(unit)
    .exclusiveGroup(exclusiveGroup);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)