# com.finbourne.sdk.services.lusid.model.ComplianceRuleResultV2WithContributions
classname ComplianceRuleResultV2WithContributions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**instigatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**completedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**schedule** | **String** | Available values: PreTrade, PostTrade, PreAndPostTrade. | [default to String]
**ruleResult** | [**ComplianceSummaryRuleResultWithContributions**](ComplianceSummaryRuleResultWithContributions.md) |  | [default to ComplianceSummaryRuleResultWithContributions]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRuleResultV2WithContributions;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId runId = new ResourceId();
OffsetDateTime instigatedAt = OffsetDateTime.now();
OffsetDateTime completedAt = OffsetDateTime.now();
String schedule = "example schedule";
ComplianceSummaryRuleResultWithContributions ruleResult = new ComplianceSummaryRuleResultWithContributions();


ComplianceRuleResultV2WithContributions complianceRuleResultV2WithContributionsInstance = new ComplianceRuleResultV2WithContributions()
    .runId(runId)
    .instigatedAt(instigatedAt)
    .completedAt(completedAt)
    .schedule(schedule)
    .ruleResult(ruleResult);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)