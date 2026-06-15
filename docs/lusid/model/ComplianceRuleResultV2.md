# com.finbourne.sdk.services.lusid.model.ComplianceRuleResultV2
classname ComplianceRuleResultV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**instigatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**completedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**schedule** | **String** | Available values: PreTrade, PostTrade, PreAndPostTrade. | [default to String]
**ruleResult** | [**ComplianceSummaryRuleResult**](ComplianceSummaryRuleResult.md) |  | [default to ComplianceSummaryRuleResult]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRuleResultV2;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId runId = new ResourceId();
OffsetDateTime instigatedAt = OffsetDateTime.now();
OffsetDateTime completedAt = OffsetDateTime.now();
String schedule = "example schedule";
ComplianceSummaryRuleResult ruleResult = new ComplianceSummaryRuleResult();


ComplianceRuleResultV2 complianceRuleResultV2Instance = new ComplianceRuleResultV2()
    .runId(runId)
    .instigatedAt(instigatedAt)
    .completedAt(completedAt)
    .schedule(schedule)
    .ruleResult(ruleResult);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)