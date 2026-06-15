# com.finbourne.sdk.services.lusid.model.GroupReconciliationInstanceId
classname GroupReconciliationInstanceId

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceIdType** | **String** | Type of the reconciliation run, manual or automatic (via the workflow). Available values: WorkflowServiceTaskId, Manual. | [default to String]
**instanceIdValue** | **String** | Reconciliation run identifier: a manually-provided key or taskId. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.GroupReconciliationInstanceId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String instanceIdType = "example instanceIdType";
String instanceIdValue = "example instanceIdValue";


GroupReconciliationInstanceId groupReconciliationInstanceIdInstance = new GroupReconciliationInstanceId()
    .instanceIdType(instanceIdType)
    .instanceIdValue(instanceIdValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)