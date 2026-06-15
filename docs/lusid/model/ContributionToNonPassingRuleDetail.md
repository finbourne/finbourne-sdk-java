# com.finbourne.sdk.services.lusid.model.ContributionToNonPassingRuleDetail
classname ContributionToNonPassingRuleDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**ruleStatus** | **String** | The status of the non-passing rule. | [optional] [default to String]
**breachTaskIds** | **List&lt;String&gt;** | The task ids associated with the compliance breach for this order&#39;s groups (if failing). | [optional] [default to List<String>]
**likelyResponsibleForStatus** | **Boolean** | Whether this order is deemed as a likely contributor to the non-passing rule for this group. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.ContributionToNonPassingRuleDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId ruleId = new ResourceId();
@javax.annotation.Nullable String ruleStatus = "example ruleStatus";
@javax.annotation.Nullable List<String> breachTaskIds = new List<String>();
Boolean likelyResponsibleForStatus = true;


ContributionToNonPassingRuleDetail contributionToNonPassingRuleDetailInstance = new ContributionToNonPassingRuleDetail()
    .ruleId(ruleId)
    .ruleStatus(ruleStatus)
    .breachTaskIds(breachTaskIds)
    .likelyResponsibleForStatus(likelyResponsibleForStatus);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)