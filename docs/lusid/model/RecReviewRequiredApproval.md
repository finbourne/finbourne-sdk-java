# com.finbourne.sdk.services.lusid.model.RecReviewRequiredApproval
classname RecReviewRequiredApproval
One approval a submitted review has to collect, and who may give it. All of a configuration's approvals are  required, they may be given in any order, and no user may give more than one of them.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approvalCode** | **String** | The client-defined identifier for the approval, e.g. \&quot;Desk\&quot; or \&quot;Risk\&quot;. Each may appear at most once. | [default to String]
**description** | **String** | A human-readable label for the approval. | [optional] [default to String]
**decidingUser** | **String** | A boolean expression over the user attempting the approval, which has to hold for them to give it. They must also hold the entitlement for the decide action. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RecReviewRequiredApproval;
import java.util.*;
import java.lang.System;
import java.net.URI;

String approvalCode = "example approvalCode";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable String decidingUser = "example decidingUser";


RecReviewRequiredApproval recReviewRequiredApprovalInstance = new RecReviewRequiredApproval()
    .approvalCode(approvalCode)
    .description(description)
    .decidingUser(decidingUser);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)