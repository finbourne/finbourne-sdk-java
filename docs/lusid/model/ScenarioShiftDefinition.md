# com.finbourne.sdk.services.lusid.model.ScenarioShiftDefinition
classname ScenarioShiftDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scenarioShiftType** | **String** | Available values: RateCurveShiftDefinition, FxShiftDefinition, EquityShiftDefinition, VolSurfaceShiftDefinition, MdkrGroupShiftDefinition. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ScenarioShiftDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scenarioShiftType = "example scenarioShiftType";


ScenarioShiftDefinition scenarioShiftDefinitionInstance = new ScenarioShiftDefinition()
    .scenarioShiftType(scenarioShiftType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)