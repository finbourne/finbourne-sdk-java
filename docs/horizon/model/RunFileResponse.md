# com.finbourne.sdk.services.horizon.model.RunFileResponse
classname RunFileResponse
One delivery of a file to one destination within a run, keyed by FileUuid. A file sent to two destinations appears as two rows, so Destinations always holds exactly one element.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileName** | **String** |  | [default to String]
**generatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the file was built, or when the attempt failed before a file was built. | [default to OffsetDateTime]
**rowCount** | **Integer** |  | [default to Integer]
**fileHash** | **String** |  | [default to String]
**encrypted** | **Boolean** |  | [default to Boolean]
**destinations** | [**List&lt;FileDestinationResponse&gt;**](FileDestinationResponse.md) |  | [default to List<FileDestinationResponse>]
**transactionIds** | **List&lt;String&gt;** |  | [default to List<String>]
**fileUuid** | [**UUID**](UUID.md) |  | [default to UUID]
**failedTransactionIds** | **List&lt;String&gt;** |  | [default to List<String>]
**canResend** | **Boolean** | Whether the data the file is rebuilt from is still retained, so a resend can be requested. | [default to Boolean]

```java
import com.finbourne.sdk.services.horizon.model.RunFileResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String fileName = "example fileName";
OffsetDateTime generatedAt = OffsetDateTime.now();
Integer rowCount = new Integer("100.00");
String fileHash = "example fileHash";
Boolean encrypted = true;
List<FileDestinationResponse> destinations = new List<FileDestinationResponse>();
List<String> transactionIds = new List<String>();
UUID fileUuid = "example fileUuid";
List<String> failedTransactionIds = new List<String>();
Boolean canResend = true;


RunFileResponse runFileResponseInstance = new RunFileResponse()
    .fileName(fileName)
    .generatedAt(generatedAt)
    .rowCount(rowCount)
    .fileHash(fileHash)
    .encrypted(encrypted)
    .destinations(destinations)
    .transactionIds(transactionIds)
    .fileUuid(fileUuid)
    .failedTransactionIds(failedTransactionIds)
    .canResend(canResend);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)