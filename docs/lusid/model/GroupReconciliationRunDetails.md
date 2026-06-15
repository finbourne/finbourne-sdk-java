# com.finbourne.sdk.services.lusid.model.GroupReconciliationRunDetails
classname GroupReconciliationRunDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionStatus** | **String** | Provides the reconciliation completion status \&quot;Completed\&quot; | \&quot;FailedToComplete\&quot; | [default to String]
**errorDetail** | **String** | Error information if the reconciliation failed to complete | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationRunDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String completionStatus = "example completionStatus";
@javax.annotation.Nullable String errorDetail = "example errorDetail";


GroupReconciliationRunDetails groupReconciliationRunDetailsInstance = new GroupReconciliationRunDetails()
    .completionStatus(completionStatus)
    .errorDetail(errorDetail);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)