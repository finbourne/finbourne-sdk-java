# com.finbourne.sdk.services.workflow.model.GroupReconciliation
classname GroupReconciliation
Configuration for a Worker that calls runs a Group Reconciliation in LUSID

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.GroupReconciliation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";


GroupReconciliation groupReconciliationInstance = new GroupReconciliation()
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)