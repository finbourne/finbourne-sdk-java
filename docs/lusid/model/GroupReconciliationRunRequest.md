# com.finbourne.sdk.services.lusid.model.GroupReconciliationRunRequest
classname GroupReconciliationRunRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceId** | **String** | Reconciliation run Id. Consists of run type (manual or workflow) and identifier. | [default to String]
**datesToReconcile** | [**GroupReconciliationDates**](GroupReconciliationDates.md) |  | [optional] [default to GroupReconciliationDates]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationRunRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String instanceId = "example instanceId";
GroupReconciliationDates datesToReconcile = new GroupReconciliationDates();


GroupReconciliationRunRequest groupReconciliationRunRequestInstance = new GroupReconciliationRunRequest()
    .instanceId(instanceId)
    .datesToReconcile(datesToReconcile);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)