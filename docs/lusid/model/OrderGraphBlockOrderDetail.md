# com.finbourne.sdk.services.lusid.model.OrderGraphBlockOrderDetail
classname OrderGraphBlockOrderDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**complianceState** | **String** | The compliance state of this order. Available values: Pending, Failed, Passed, ManuallyApproved, PartiallyOverridden, Warning. | [default to String]
**approvalState** | **String** | The approval state of this order. Available values: Pending, Rejected, Approved. | [default to String]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**portfolioName** | **String** | The name of the order&#39;s referenced Portfolio. | [optional] [default to String]
**orderApprovalTaskId** | **String** | The task id associated with the approval state of the order. | [optional] [default to String]
**orderApprovalTaskDefinitionId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**nonPassingComplianceRuleResults** | [**List&lt;ContributionToNonPassingRuleDetail&gt;**](ContributionToNonPassingRuleDetail.md) | The details of compliance rules in non-passing states. | [optional] [default to List<ContributionToNonPassingRuleDetail>]

```java
import com.finbourne.sdk.services.lusid.model.OrderGraphBlockOrderDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String complianceState = "example complianceState";
String approvalState = "example approvalState";
ResourceId portfolioId = new ResourceId();
@javax.annotation.Nullable String portfolioName = "example portfolioName";
@javax.annotation.Nullable String orderApprovalTaskId = "example orderApprovalTaskId";
ResourceId orderApprovalTaskDefinitionId = new ResourceId();
@javax.annotation.Nullable List<ContributionToNonPassingRuleDetail> nonPassingComplianceRuleResults = new List<ContributionToNonPassingRuleDetail>();


OrderGraphBlockOrderDetail orderGraphBlockOrderDetailInstance = new OrderGraphBlockOrderDetail()
    .id(id)
    .complianceState(complianceState)
    .approvalState(approvalState)
    .portfolioId(portfolioId)
    .portfolioName(portfolioName)
    .orderApprovalTaskId(orderApprovalTaskId)
    .orderApprovalTaskDefinitionId(orderApprovalTaskDefinitionId)
    .nonPassingComplianceRuleResults(nonPassingComplianceRuleResults);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)