# com.finbourne.sdk.services.lusid.model.UpsertScenarioRequest
classname UpsertScenarioRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scenario** | [**ScenarioDefinition**](ScenarioDefinition.md) |  | [default to ScenarioDefinition]

```java
import com.finbourne.sdk.services.lusid.model.UpsertScenarioRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ScenarioDefinition scenario = new ScenarioDefinition();


UpsertScenarioRequest upsertScenarioRequestInstance = new UpsertScenarioRequest()
    .scenario(scenario);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)