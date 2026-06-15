# com.finbourne.sdk.services.lusid.model.UpsertComplianceRunSummaryResult
classname UpsertComplianceRunSummaryResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**instigatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**completedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**schedule** | **String** | Available values: None, PreTrade, PostTrade, PreAndPostTrade. | [default to String]
**results** | [**List&lt;ComplianceSummaryRuleResult&gt;**](ComplianceSummaryRuleResult.md) |  | [default to List<ComplianceSummaryRuleResult>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertComplianceRunSummaryResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId runId = new ResourceId();
OffsetDateTime instigatedAt = OffsetDateTime.now();
OffsetDateTime completedAt = OffsetDateTime.now();
String schedule = "example schedule";
List<ComplianceSummaryRuleResult> results = new List<ComplianceSummaryRuleResult>();


UpsertComplianceRunSummaryResult upsertComplianceRunSummaryResultInstance = new UpsertComplianceRunSummaryResult()
    .runId(runId)
    .instigatedAt(instigatedAt)
    .completedAt(completedAt)
    .schedule(schedule)
    .results(results);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)