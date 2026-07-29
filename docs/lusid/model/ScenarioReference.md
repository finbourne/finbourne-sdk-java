# com.finbourne.sdk.services.lusid.model.ScenarioReference
classname ScenarioReference
A reference to a stored Scenario, identified by scope and code, optionally pinned to an AsAt version.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope of the scenario to apply. | [default to String]
**code** | **String** | The code of the scenario to apply. | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The AsAt of the scenario version to apply. If not supplied, the latest version is used. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.ScenarioReference;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String code = "example code";
@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();


ScenarioReference scenarioReferenceInstance = new ScenarioReference()
    .scope(scope)
    .code(code)
    .asAt(asAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)