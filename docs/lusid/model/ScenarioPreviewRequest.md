# com.finbourne.sdk.services.lusid.model.ScenarioPreviewRequest
classname ScenarioPreviewRequest
Request to preview a scenario against a portfolio's market data without running a valuation: the  portfolio's market data dependencies are resolved and the scenario's shifts applied, and the  response reports which targets each shift changed (with values before and after) and which market  data was skipped. Supply either a reference to a stored scenario or inline shift definitions  (for previewing a definition before saving it), not both.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The portfolios whose market data dependencies the scenario is previewed against. | [default to List<PortfolioEntityId>]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date to resolve market data at. | [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at time to resolve at. Defaults to the latest. | [optional] [default to OffsetDateTime]
**scenario** | [**ScenarioReference**](ScenarioReference.md) |  | [optional] [default to ScenarioReference]
**shifts** | [**List&lt;ScenarioShiftDefinition&gt;**](ScenarioShiftDefinition.md) | Inline shift definitions to preview without saving a scenario, e.g. to test what a definition  would match while authoring it. Mutually exclusive with supplying a stored scenario reference. | [optional] [default to List<ScenarioShiftDefinition>]

```java
import com.finbourne.sdk.services.lusid.model.ScenarioPreviewRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId recipeId = new ResourceId();
List<PortfolioEntityId> portfolioEntityIds = new List<PortfolioEntityId>();
OffsetDateTime effectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();
ScenarioReference scenario = new ScenarioReference();
@javax.annotation.Nullable List<ScenarioShiftDefinition> shifts = new List<ScenarioShiftDefinition>();


ScenarioPreviewRequest scenarioPreviewRequestInstance = new ScenarioPreviewRequest()
    .recipeId(recipeId)
    .portfolioEntityIds(portfolioEntityIds)
    .effectiveAt(effectiveAt)
    .asAt(asAt)
    .scenario(scenario)
    .shifts(shifts);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)