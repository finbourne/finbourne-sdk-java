# com.finbourne.sdk.services.lusid.model.StagingRule
classname StagingRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | **String** | The ID of the staging rule. | [default to String]
**description** | **String** | A description for the staging rule. | [optional] [default to String]
**status** | **String** | Status of the rule. Available values: Active, Inactive. | [default to String]
**matchCriteria** | [**StagingRuleMatchCriteria**](StagingRuleMatchCriteria.md) |  | [default to StagingRuleMatchCriteria]
**approvalCriteria** | [**StagingRuleApprovalCriteria**](StagingRuleApprovalCriteria.md) |  | [default to StagingRuleApprovalCriteria]

```java
import com.finbourne.sdk.services.lusid.model.StagingRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ruleId = "example ruleId";
@javax.annotation.Nullable String description = "example description";
String status = "example status";
StagingRuleMatchCriteria matchCriteria = new StagingRuleMatchCriteria();
StagingRuleApprovalCriteria approvalCriteria = new StagingRuleApprovalCriteria();


StagingRule stagingRuleInstance = new StagingRule()
    .ruleId(ruleId)
    .description(description)
    .status(status)
    .matchCriteria(matchCriteria)
    .approvalCriteria(approvalCriteria);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)