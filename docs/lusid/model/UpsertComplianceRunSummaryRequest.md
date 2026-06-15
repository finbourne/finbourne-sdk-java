# com.finbourne.sdk.services.lusid.model.UpsertComplianceRunSummaryRequest
classname UpsertComplianceRunSummaryRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**instigatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**completedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**schedule** | **String** | Available values: None, PreTrade, PostTrade, PreAndPostTrade. | [default to String]
**results** | [**List&lt;ComplianceSummaryRuleResultRequest&gt;**](ComplianceSummaryRuleResultRequest.md) |  | [default to List<ComplianceSummaryRuleResultRequest>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertComplianceRunSummaryRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId runId = new ResourceId();
OffsetDateTime instigatedAt = OffsetDateTime.now();
OffsetDateTime completedAt = OffsetDateTime.now();
String schedule = "example schedule";
List<ComplianceSummaryRuleResultRequest> results = new List<ComplianceSummaryRuleResultRequest>();


UpsertComplianceRunSummaryRequest upsertComplianceRunSummaryRequestInstance = new UpsertComplianceRunSummaryRequest()
    .runId(runId)
    .instigatedAt(instigatedAt)
    .completedAt(completedAt)
    .schedule(schedule)
    .results(results);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)