# com.finbourne.sdk.services.lusid.model.TransactionDiagnostics
classname TransactionDiagnostics
Represents a set of diagnostics per transaction, where applicable.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionDisplayName** | **String** |  | [default to String]
**errorDetails** | **List&lt;String&gt;** |  | [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.TransactionDiagnostics;
import java.util.*;
import java.lang.System;
import java.net.URI;

String transactionDisplayName = "example transactionDisplayName";
List<String> errorDetails = new List<String>();


TransactionDiagnostics transactionDiagnosticsInstance = new TransactionDiagnostics()
    .transactionDisplayName(transactionDisplayName)
    .errorDetails(errorDetails);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)