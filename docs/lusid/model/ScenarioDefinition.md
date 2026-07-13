# com.finbourne.sdk.services.lusid.model.ScenarioDefinition
classname ScenarioDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** |  | [default to String]
**code** | **String** |  | [default to String]
**displayName** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**shifts** | [**List&lt;ScenarioShiftDefinition&gt;**](ScenarioShiftDefinition.md) |  | [optional] [default to List<ScenarioShiftDefinition>]

```java
import com.finbourne.sdk.services.lusid.model.ScenarioDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String code = "example code";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<ScenarioShiftDefinition> shifts = new List<ScenarioShiftDefinition>();


ScenarioDefinition scenarioDefinitionInstance = new ScenarioDefinition()
    .scope(scope)
    .code(code)
    .displayName(displayName)
    .description(description)
    .shifts(shifts);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)