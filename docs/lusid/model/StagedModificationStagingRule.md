# com.finbourne.sdk.services.lusid.model.StagedModificationStagingRule
classname StagedModificationStagingRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stagingRuleSetId** | **String** | System generated unique id for the staging rule set. | [optional] [default to String]
**ruleId** | **String** | The ID of the staging rule. | [optional] [default to String]
**requiredApprovals** | **Integer** | The number of approvals required. If left blank, one approval is needed. | [optional] [default to Integer]
**currentUserCanDecide** | **Boolean** | True or False indicating whether the current user can make a decision on the staged modification. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.StagedModificationStagingRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String stagingRuleSetId = "example stagingRuleSetId";
@javax.annotation.Nullable String ruleId = "example ruleId";
Integer requiredApprovals = new Integer("100.00");
Boolean currentUserCanDecide = true;


StagedModificationStagingRule stagedModificationStagingRuleInstance = new StagedModificationStagingRule()
    .stagingRuleSetId(stagingRuleSetId)
    .ruleId(ruleId)
    .requiredApprovals(requiredApprovals)
    .currentUserCanDecide(currentUserCanDecide);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)