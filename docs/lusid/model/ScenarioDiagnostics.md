# com.finbourne.sdk.services.lusid.model.ScenarioDiagnostics
classname ScenarioDiagnostics
Diagnostics for the scenario shifts a valuation applied: every market data target changed by a  shift, with values before and after, plus warnings for market data that matched a shift but could  not honour it. Populated whenever the valuation ran with a request-level scenario or  scenario-decorated metrics; null otherwise. The same material is written to the market data  manifest.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applied** | [**List&lt;AppliedScenarioShift&gt;**](AppliedScenarioShift.md) | One entry per market data target changed by a shift. | [optional] [default to List<AppliedScenarioShift>]
**skipped** | **List&lt;String&gt;** | Market data that matched a shift but was skipped (e.g. an element type that does not support  transformation), with the reason. Prefixed with the scenario&#39;s \&quot;scope/code\&quot; reference. | [optional] [default to List<String>]
**omittedApplied** | **Integer** | The number of further applied records omitted from this section, when the valuation changed  more targets than the section carries (large portfolios over long schedules). Null when  nothing was omitted. The market data manifest always carries the complete set. | [optional] [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.ScenarioDiagnostics;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<AppliedScenarioShift> applied = new List<AppliedScenarioShift>();
@javax.annotation.Nullable List<String> skipped = new List<String>();
@javax.annotation.Nullable Integer omittedApplied = new Integer("100.00");


ScenarioDiagnostics scenarioDiagnosticsInstance = new ScenarioDiagnostics()
    .applied(applied)
    .skipped(skipped)
    .omittedApplied(omittedApplied);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)