# com.finbourne.sdk.services.lusid.model.ReconciliationTransactions
classname ReconciliationTransactions
Specification for the transactions of a scheduled reconciliation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionWindow** | [**DateRange**](DateRange.md) |  | [optional] [default to DateRange]
**mappingId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.ReconciliationTransactions;
import java.util.*;
import java.lang.System;
import java.net.URI;

DateRange transactionWindow = new DateRange();
ResourceId mappingId = new ResourceId();


ReconciliationTransactions reconciliationTransactionsInstance = new ReconciliationTransactions()
    .transactionWindow(transactionWindow)
    .mappingId(mappingId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)