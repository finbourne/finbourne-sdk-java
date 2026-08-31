# com.finbourne.sdk.services.lusid.model.ScenarioDefinition
classname ScenarioDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** |  | [default to String]
**code** | **String** |  | [default to String]
**displayName** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**shortCode** | **String** | A short, memorable identifier for the scenario, for use in reporting. Optional on upsert:  when omitted, reads return a value inferred from the display name (falling back to the  code) rather than null; the inferred value is computed fresh on every read and is never  persisted. When supplied, the value is stored and returned verbatim. Independent of  scenarioType. | [optional] [default to String]
**scenarioType** | **String** | Classifies the scenario. Required on upsert; supported string (enumeration) values are:  [Historical, Regulatory, Hypothetical]. Independent of shortCode. Available values: Historical, Regulatory, Hypothetical. | [default to String]
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
@javax.annotation.Nullable String shortCode = "example shortCode";
String scenarioType = "example scenarioType";
@javax.annotation.Nullable List<ScenarioShiftDefinition> shifts = new List<ScenarioShiftDefinition>();


ScenarioDefinition scenarioDefinitionInstance = new ScenarioDefinition()
    .scope(scope)
    .code(code)
    .displayName(displayName)
    .description(description)
    .shortCode(shortCode)
    .scenarioType(scenarioType)
    .shifts(shifts);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)