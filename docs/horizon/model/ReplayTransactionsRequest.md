# com.finbourne.sdk.services.horizon.model.ReplayTransactionsRequest
classname ReplayTransactionsRequest
Request to replay one or more transactions through a TPF instance. The instance ID is specified in the route path.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionIds** | **List&lt;String&gt;** | List of transaction IDs to replay. | [default to List<String>]
**mode** | **String** | Replay mode - DryRun (preview only) or Committed (real send). | [default to String]
**options** | [**ReplayOptions**](ReplayOptions.md) |  | [optional] [default to ReplayOptions]

```java
import com.finbourne.sdk.services.horizon.model.ReplayTransactionsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> transactionIds = new List<String>();
String mode = "example mode";
ReplayOptions options = new ReplayOptions();


ReplayTransactionsRequest replayTransactionsRequestInstance = new ReplayTransactionsRequest()
    .transactionIds(transactionIds)
    .mode(mode)
    .options(options);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)