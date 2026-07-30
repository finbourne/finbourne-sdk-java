# com.finbourne.sdk.services.lusid.model.RecApprovalDecision
classname RecApprovalDecision
An entry in the append-only log of approver decisions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approvalCode** | **String** | The approval slot this decision satisfies. Must match a required approval code. | [default to String]
**decision** | **String** | The decision made. Available values: Approve, RequestRevisions. | [default to String]
**reason** | **String** | Rationale for the decision. | [optional] [default to String]
**userId** | **String** | The approver who made the decision. | [default to String]
**asAtDecided** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the decision was made. | [default to OffsetDateTime]
**asAtSuperseded** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which this entry was superseded. Null when it is the current standing entry. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.RecApprovalDecision;
import java.util.*;
import java.lang.System;
import java.net.URI;

String approvalCode = "example approvalCode";
String decision = "example decision";
@javax.annotation.Nullable String reason = "example reason";
String userId = "example userId";
OffsetDateTime asAtDecided = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime asAtSuperseded = OffsetDateTime.now();


RecApprovalDecision recApprovalDecisionInstance = new RecApprovalDecision()
    .approvalCode(approvalCode)
    .decision(decision)
    .reason(reason)
    .userId(userId)
    .asAtDecided(asAtDecided)
    .asAtSuperseded(asAtSuperseded);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)