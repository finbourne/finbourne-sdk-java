# com.finbourne.sdk.services.lusid.model.ComplianceRunInfo
classname ComplianceRunInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | **String** | The unique identifier of a compliance run | [default to String]
**instigatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time the compliance run was launched (e.g. button pressed). Currently it is also both the as at and effective at time in whichthe rule set and portfolio data (including any pending trades if the run is pretrade) is taken for the caluation, although it may be possible to run compliance for historical effective at and as at dates in the future. | [default to OffsetDateTime]
**completedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time the compliance run calculation was completed | [default to OffsetDateTime]
**schedule** | **String** | Whether the compliance run was pre or post trade. Available values: PreTrade, PostTrade, PreAndPostTrade. | [default to String]
**allRulesPassed** | **Boolean** | True if all rules passed, for all the portfolios they were assigned to | [default to Boolean]
**hasResults** | **Boolean** | False when no results have been returned eg. when no rules exist | [default to Boolean]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | Legacy AsAt time for backwards compatibility | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRunInfo;
import java.util.*;
import java.lang.System;
import java.net.URI;

String runId = "example runId";
OffsetDateTime instigatedAt = OffsetDateTime.now();
OffsetDateTime completedAt = OffsetDateTime.now();
String schedule = "example schedule";
Boolean allRulesPassed = true;
Boolean hasResults = true;
OffsetDateTime asAt = OffsetDateTime.now();


ComplianceRunInfo complianceRunInfoInstance = new ComplianceRunInfo()
    .runId(runId)
    .instigatedAt(instigatedAt)
    .completedAt(completedAt)
    .schedule(schedule)
    .allRulesPassed(allRulesPassed)
    .hasResults(hasResults)
    .asAt(asAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)