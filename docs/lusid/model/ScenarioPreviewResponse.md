# com.finbourne.sdk.services.lusid.model.ScenarioPreviewResponse
classname ScenarioPreviewResponse
The result of previewing a scenario: every market data target the scenario's shifts changed, with  values before and after, plus warnings for market data that matched a shift but could not honour it.  An empty applied list means the scenario would touch nothing for this portfolio and recipe.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applied** | [**List&lt;ScenarioPreviewAppliedShift&gt;**](ScenarioPreviewAppliedShift.md) | One entry per market data target changed by a shift. | [optional] [default to List<ScenarioPreviewAppliedShift>]
**skipped** | **List&lt;String&gt;** | Market data that matched a shift but was skipped (e.g. an element type that does not support  transformation), with the reason. | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.ScenarioPreviewResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<ScenarioPreviewAppliedShift> applied = new List<ScenarioPreviewAppliedShift>();
@javax.annotation.Nullable List<String> skipped = new List<String>();


ScenarioPreviewResponse scenarioPreviewResponseInstance = new ScenarioPreviewResponse()
    .applied(applied)
    .skipped(skipped);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)