# com.finbourne.sdk.services.lusid.model.RecReviewConfiguration
classname RecReviewConfiguration
How the results of a rec definition's runs are reviewed and approved: what needs reviewing, when the  reviewer may submit, and who has to approve the submission.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**openExceptions** | [**RecReviewRequirementRule**](RecReviewRequirementRule.md) |  | [optional] [default to RecReviewRequirementRule]
**closedExceptions** | [**RecReviewRequirementRule**](RecReviewRequirementRule.md) |  | [optional] [default to RecReviewRequirementRule]
**matches** | [**RecReviewRequirementRule**](RecReviewRequirementRule.md) |  | [optional] [default to RecReviewRequirementRule]
**reviewSubmission** | [**RecReviewSubmission**](RecReviewSubmission.md) |  | [optional] [default to RecReviewSubmission]
**requiredApprovals** | [**List&lt;RecReviewRequiredApproval&gt;**](RecReviewRequiredApproval.md) | The approvals a submitted review has to collect. All are required and may be given in any order, and no user may give more than one of them. Empty means no approvals are required and the reviewer self-approves on submission. | [optional] [default to List<RecReviewRequiredApproval>]

```java
import com.finbourne.sdk.services.lusid.model.RecReviewConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecReviewRequirementRule openExceptions = new RecReviewRequirementRule();
RecReviewRequirementRule closedExceptions = new RecReviewRequirementRule();
RecReviewRequirementRule matches = new RecReviewRequirementRule();
RecReviewSubmission reviewSubmission = new RecReviewSubmission();
@javax.annotation.Nullable List<RecReviewRequiredApproval> requiredApprovals = new List<RecReviewRequiredApproval>();


RecReviewConfiguration recReviewConfigurationInstance = new RecReviewConfiguration()
    .openExceptions(openExceptions)
    .closedExceptions(closedExceptions)
    .matches(matches)
    .reviewSubmission(reviewSubmission)
    .requiredApprovals(requiredApprovals);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)