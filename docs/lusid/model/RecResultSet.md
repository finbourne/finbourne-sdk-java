# com.finbourne.sdk.services.lusid.model.RecResultSet
classname RecResultSet
The collection of reconciliation results for a given rec type within a rec instance. Identified by  its rec type and instance. The latest run's data is promoted to the root; prior runs are available  via previousRuns.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recType** | **String** | The type of rec that this result set belongs to (e.g. Holding). Together with the rec instance, this uniquely identifies the result set. Available values: Holding, Transaction, Valuation, CashHolding. | [default to String]
**recInstance** | [**RecInstanceSummary**](RecInstanceSummary.md) |  | [default to RecInstanceSummary]
**runNumber** | **Integer** | The run number within the instance. Increments with each re-run. | [default to Integer]
**runAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the run happened. | [default to OffsetDateTime]
**execution** | [**RecExecution**](RecExecution.md) |  | [default to RecExecution]
**datesReconciled** | [**RecDatesReconciled**](RecDatesReconciled.md) |  | [default to RecDatesReconciled]
**resultCounts** | [**RecResultCounts**](RecResultCounts.md) |  | [default to RecResultCounts]
**review** | [**RecReview**](RecReview.md) |  | [default to RecReview]
**approvalStatus** | **String** | The position of this result set in the approval ceremony. Available values: UnderReview, PendingApproval, RevisionsRequested, Approved, NotApplicable. | [default to String]
**requiredApprovals** | [**List&lt;RecRequiredApproval&gt;**](RecRequiredApproval.md) | The approval slots required for this result set, passed through from the rec definition&#39;s review configuration. May be empty. | [default to List<RecRequiredApproval>]
**submissions** | [**List&lt;RecSubmission&gt;**](RecSubmission.md) | An append-only log of review submissions. May be empty. | [default to List<RecSubmission>]
**decisions** | [**List&lt;RecApprovalDecision&gt;**](RecApprovalDecision.md) | An append-only log of approver decisions. May be empty. | [default to List<RecApprovalDecision>]
**previousRuns** | [**List&lt;RecSupersededRun&gt;**](RecSupersededRun.md) | Prior run snapshots, each frozen at the point of re-run. Populated only when includePreviousRuns is true. | [default to List<RecSupersededRun>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.RecResultSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

String recType = "example recType";
RecInstanceSummary recInstance = new RecInstanceSummary();
Integer runNumber = new Integer("100.00");
OffsetDateTime runAsAt = OffsetDateTime.now();
RecExecution execution = new RecExecution();
RecDatesReconciled datesReconciled = new RecDatesReconciled();
RecResultCounts resultCounts = new RecResultCounts();
RecReview review = new RecReview();
String approvalStatus = "example approvalStatus";
List<RecRequiredApproval> requiredApprovals = new List<RecRequiredApproval>();
List<RecSubmission> submissions = new List<RecSubmission>();
List<RecApprovalDecision> decisions = new List<RecApprovalDecision>();
List<RecSupersededRun> previousRuns = new List<RecSupersededRun>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


RecResultSet recResultSetInstance = new RecResultSet()
    .recType(recType)
    .recInstance(recInstance)
    .runNumber(runNumber)
    .runAsAt(runAsAt)
    .execution(execution)
    .datesReconciled(datesReconciled)
    .resultCounts(resultCounts)
    .review(review)
    .approvalStatus(approvalStatus)
    .requiredApprovals(requiredApprovals)
    .submissions(submissions)
    .decisions(decisions)
    .previousRuns(previousRuns)
    .href(href)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)