# com.finbourne.sdk.services.lusid.model.RecResultSetApprovalDecisionRequest
classname RecResultSetApprovalDecisionRequest
The request for an approver to approve a submitted review or request revisions. Each call satisfies  (or rejects) one approval slot from the result set's required approvals.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approvalCode** | **String** | The approval slot being decided. Must match a required approval code. | [default to String]
**decision** | **String** | The decision made. Available values: Approve, RequestRevisions. | [default to String]
**reason** | **String** | Rationale for the decision. | [optional] [default to String]
**requestedResultRevisions** | [**List&lt;RecRequestedResultRevision&gt;**](RecRequestedResultRevision.md) | The results flagged for re-review. Only applicable when the decision is Request Revisions. | [optional] [default to List<RecRequestedResultRevision>]

```java
import com.finbourne.sdk.services.lusid.model.RecResultSetApprovalDecisionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String approvalCode = "example approvalCode";
String decision = "example decision";
@javax.annotation.Nullable String reason = "example reason";
@javax.annotation.Nullable List<RecRequestedResultRevision> requestedResultRevisions = new List<RecRequestedResultRevision>();


RecResultSetApprovalDecisionRequest recResultSetApprovalDecisionRequestInstance = new RecResultSetApprovalDecisionRequest()
    .approvalCode(approvalCode)
    .decision(decision)
    .reason(reason)
    .requestedResultRevisions(requestedResultRevisions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)