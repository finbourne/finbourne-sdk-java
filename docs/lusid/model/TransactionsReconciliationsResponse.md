# com.finbourne.sdk.services.lusid.model.TransactionsReconciliationsResponse
classname TransactionsReconciliationsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mapping** | [**Mapping**](Mapping.md) |  | [optional] [default to Mapping]
**data** | [**List&lt;ReconciledTransaction&gt;**](ReconciledTransaction.md) | The result of this reconciliation | [optional] [default to List<ReconciledTransaction>]

```java
import com.finbourne.sdk.services.lusid.model.TransactionsReconciliationsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Mapping mapping = new Mapping();
@javax.annotation.Nullable List<ReconciledTransaction> data = new List<ReconciledTransaction>();


TransactionsReconciliationsResponse transactionsReconciliationsResponseInstance = new TransactionsReconciliationsResponse()
    .mapping(mapping)
    .data(data);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)