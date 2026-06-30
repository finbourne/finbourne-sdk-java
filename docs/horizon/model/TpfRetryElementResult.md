# com.finbourne.sdk.services.horizon.model.TpfRetryElementResult
classname TpfRetryElementResult
Result for a single batch element retry attempt

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchElementReferenceId** | **String** | Batch element reference identifier | [default to String]
**status** | **String** | Status of the retry attempt (e.g., \&quot;Retrying\&quot;, \&quot;NotFound\&quot;) | [default to String]

```java
import com.finbourne.sdk.services.horizon.model.TpfRetryElementResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

String batchElementReferenceId = "example batchElementReferenceId";
String status = "example status";


TpfRetryElementResult tpfRetryElementResultInstance = new TpfRetryElementResult()
    .batchElementReferenceId(batchElementReferenceId)
    .status(status);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)