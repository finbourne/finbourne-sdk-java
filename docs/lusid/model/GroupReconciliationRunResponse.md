# com.finbourne.sdk.services.lusid.model.GroupReconciliationRunResponse
classname GroupReconciliationRunResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reconciliationSummaries** | [**List&lt;GroupReconciliationSummary&gt;**](GroupReconciliationSummary.md) | One summary record for each of the \&quot;Holding\&quot; | \&quot;Transaction\&quot; | \&quot;Valuation\&quot; reconciliations performed | [default to List<GroupReconciliationSummary>]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationRunResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<GroupReconciliationSummary> reconciliationSummaries = new List<GroupReconciliationSummary>();


GroupReconciliationRunResponse groupReconciliationRunResponseInstance = new GroupReconciliationRunResponse()
    .reconciliationSummaries(reconciliationSummaries);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)