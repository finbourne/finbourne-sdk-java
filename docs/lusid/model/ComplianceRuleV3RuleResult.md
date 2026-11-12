# com.finbourne.sdk.services.lusid.model.ComplianceRuleV3RuleResult
classname ComplianceRuleV3RuleResult
The aggregate result of one rule across every group it was evaluated over: the rule's overall status  (its worst group outcome) and the per-group results partitioned by outcome.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**status** | **String** | Available values: Passed, Failed, Warning, MissingData. | [optional] [default to String]
**results** | [**List&lt;ComplianceRuleV3GroupResult&gt;**](ComplianceRuleV3GroupResult.md) |  | [optional] [default to List<ComplianceRuleV3GroupResult>]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRuleV3RuleResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId ruleId = new ResourceId();
@javax.annotation.Nullable String status = "example status";
@javax.annotation.Nullable List<ComplianceRuleV3GroupResult> results = new List<ComplianceRuleV3GroupResult>();


ComplianceRuleV3RuleResult complianceRuleV3RuleResultInstance = new ComplianceRuleV3RuleResult()
    .ruleId(ruleId)
    .status(status)
    .results(results);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)