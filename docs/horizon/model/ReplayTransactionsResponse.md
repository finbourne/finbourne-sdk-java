# com.finbourne.sdk.services.horizon.model.ReplayTransactionsResponse
classname ReplayTransactionsResponse
Response from a replay transactions operation containing the CSV output.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchReferenceId** | **String** |  | [default to String]
**mode** | **String** |  | [default to String]
**transactionCount** | **Integer** |  | [default to Integer]
**csvOutput** | **String** |  | [default to String]
**message** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.horizon.model.ReplayTransactionsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String batchReferenceId = "example batchReferenceId";
String mode = "example mode";
Integer transactionCount = new Integer("100.00");
String csvOutput = "example csvOutput";
String message = "example message";


ReplayTransactionsResponse replayTransactionsResponseInstance = new ReplayTransactionsResponse()
    .batchReferenceId(batchReferenceId)
    .mode(mode)
    .transactionCount(transactionCount)
    .csvOutput(csvOutput)
    .message(message);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)