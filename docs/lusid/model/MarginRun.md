# com.finbourne.sdk.services.lusid.model.MarginRun
classname MarginRun
A margin run: the valuation of the collateral agreements for a business date, planned as shards that report  their progress, and the margin calls and lines it has published so far.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The URI of this margin run. | [optional] [default to URI]
**id** | **String** | The identifier of the run: the effective date and the asAt it was valued at, with a suffix naming the scenario for a stress run. Filterable. | [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The business date the run values collateral agreements for. Filterable. | [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime the run reads agreements, portfolios and market data at. Filterable. | [default to OffsetDateTime]
**status** | **String** | The status of the run. One of Pending, Running, Completed or CompletedWithIssues. Filterable. | [default to String]
**agreements** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The collateral agreements the run covers. | [default to List<ResourceId>]
**callCount** | **Integer** | The number of margin calls the run has published so far. | [default to Integer]
**lineCount** | **Integer** | The number of margin lines the run has published so far. | [default to Integer]
**shardCount** | **Integer** | The number of valuation shards the run was planned as. | [default to Integer]
**completedShards** | **Integer** | The number of shards that have completed. | [default to Integer]
**failedShards** | **Integer** | The number of shards that failed to value. | [default to Integer]
**issues** | [**List&lt;MarginRunIssue&gt;**](MarginRunIssue.md) | Agreements the run could not value or roll up into a call, or the caller may not calculate margin for, with the reason. | [default to List<MarginRunIssue>]
**shards** | [**List&lt;MarginRunShard&gt;**](MarginRunShard.md) | The valuation shards the run is planned as, with their progress. | [default to List<MarginRunShard>]
**scenarios** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The stored scenarios the run values the agreements under, each beside the base market the run always values. Empty if only the base market was valued. | [default to List<ResourceId>]
**captureDiagnostics** | **Boolean** | Whether the run stored the working behind its figures, so that they can be explained. Null for a run made before runs could store it, which did not. | [optional] [default to Boolean]
**optimisation** | [**MarginRunOptimisation**](MarginRunOptimisation.md) |  | [optional] [default to MarginRunOptimisation]
**allocation** | [**MarginRunAllocation**](MarginRunAllocation.md) |  | [optional] [default to MarginRunAllocation]

```java
import com.finbourne.sdk.services.lusid.model.MarginRun;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
String id = "example id";
OffsetDateTime effectiveAt = OffsetDateTime.now();
OffsetDateTime asAt = OffsetDateTime.now();
String status = "example status";
List<ResourceId> agreements = new List<ResourceId>();
Integer callCount = new Integer("100.00");
Integer lineCount = new Integer("100.00");
Integer shardCount = new Integer("100.00");
Integer completedShards = new Integer("100.00");
Integer failedShards = new Integer("100.00");
List<MarginRunIssue> issues = new List<MarginRunIssue>();
List<MarginRunShard> shards = new List<MarginRunShard>();
List<ResourceId> scenarios = new List<ResourceId>();
@javax.annotation.Nullable Boolean captureDiagnostics = true;
MarginRunOptimisation optimisation = new MarginRunOptimisation();
MarginRunAllocation allocation = new MarginRunAllocation();


MarginRun marginRunInstance = new MarginRun()
    .href(href)
    .id(id)
    .effectiveAt(effectiveAt)
    .asAt(asAt)
    .status(status)
    .agreements(agreements)
    .callCount(callCount)
    .lineCount(lineCount)
    .shardCount(shardCount)
    .completedShards(completedShards)
    .failedShards(failedShards)
    .issues(issues)
    .shards(shards)
    .scenarios(scenarios)
    .captureDiagnostics(captureDiagnostics)
    .optimisation(optimisation)
    .allocation(allocation);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)