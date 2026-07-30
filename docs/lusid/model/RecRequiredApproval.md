# com.finbourne.sdk.services.lusid.model.RecRequiredApproval
classname RecRequiredApproval
An approval slot required for a result set, passed through from the rec definition's review configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approvalCode** | **String** | Client-defined identifier for the approval slot (e.g. &#39;Desk&#39;, &#39;Risk&#39;). | [default to String]
**description** | **String** | Human-readable label for the approval slot. | [optional] [default to String]
**currentUserCanDecide** | **Boolean** | Whether the calling user may decide this approval slot, pre-evaluated at request time. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.RecRequiredApproval;
import java.util.*;
import java.lang.System;
import java.net.URI;

String approvalCode = "example approvalCode";
@javax.annotation.Nullable String description = "example description";
Boolean currentUserCanDecide = true;


RecRequiredApproval recRequiredApprovalInstance = new RecRequiredApproval()
    .approvalCode(approvalCode)
    .description(description)
    .currentUserCanDecide(currentUserCanDecide);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)