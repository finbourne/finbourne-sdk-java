# com.finbourne.sdk.services.lusid.model.RecSupersededRun
classname RecSupersededRun
A prior run snapshot, frozen at the point of re-run. Has the same shape as the root-level run  fields on the result set, plus the asAt at which the run was superseded.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runNumber** | **Integer** | The run number within the instance. Increments with each re-run. | [default to Integer]
**runAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the run happened. | [default to OffsetDateTime]
**supersededAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which this run was superseded by a subsequent run. | [default to OffsetDateTime]
**execution** | [**RecExecution**](RecExecution.md) |  | [default to RecExecution]
**datesReconciled** | [**RecDatesReconciled**](RecDatesReconciled.md) |  | [default to RecDatesReconciled]
**resultCounts** | [**RecResultCounts**](RecResultCounts.md) |  | [default to RecResultCounts]
**review** | [**RecReview**](RecReview.md) |  | [default to RecReview]
**approvalStatus** | **String** | The position of this result set in the approval ceremony. Available values: UnderReview, PendingApproval, RevisionsRequested, Approved, NotApplicable. | [default to String]
**requiredApprovals** | [**List&lt;RecRequiredApproval&gt;**](RecRequiredApproval.md) | The approval slots required for this result set, passed through from the rec definition&#39;s review configuration. May be empty. | [default to List<RecRequiredApproval>]
**submissions** | [**List&lt;RecSubmission&gt;**](RecSubmission.md) | An append-only log of review submissions. May be empty. | [default to List<RecSubmission>]
**decisions** | [**List&lt;RecApprovalDecision&gt;**](RecApprovalDecision.md) | An append-only log of approver decisions. May be empty. | [default to List<RecApprovalDecision>]

```java
import com.finbourne.sdk.services.lusid.model.RecSupersededRun;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer runNumber = new Integer("100.00");
OffsetDateTime runAsAt = OffsetDateTime.now();
OffsetDateTime supersededAsAt = OffsetDateTime.now();
RecExecution execution = new RecExecution();
RecDatesReconciled datesReconciled = new RecDatesReconciled();
RecResultCounts resultCounts = new RecResultCounts();
RecReview review = new RecReview();
String approvalStatus = "example approvalStatus";
List<RecRequiredApproval> requiredApprovals = new List<RecRequiredApproval>();
List<RecSubmission> submissions = new List<RecSubmission>();
List<RecApprovalDecision> decisions = new List<RecApprovalDecision>();


RecSupersededRun recSupersededRunInstance = new RecSupersededRun()
    .runNumber(runNumber)
    .runAsAt(runAsAt)
    .supersededAsAt(supersededAsAt)
    .execution(execution)
    .datesReconciled(datesReconciled)
    .resultCounts(resultCounts)
    .review(review)
    .approvalStatus(approvalStatus)
    .requiredApprovals(requiredApprovals)
    .submissions(submissions)
    .decisions(decisions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)