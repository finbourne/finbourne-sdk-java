# com.finbourne.sdk.services.workflow.model.GroupReconciliationResponse
classname GroupReconciliationResponse
Readonly configuration for the Group Reconciliation Worker

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.GroupReconciliationResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";


GroupReconciliationResponse groupReconciliationResponseInstance = new GroupReconciliationResponse()
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)