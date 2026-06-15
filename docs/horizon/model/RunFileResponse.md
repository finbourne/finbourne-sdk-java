# com.finbourne.sdk.services.horizon.model.RunFileResponse
classname RunFileResponse
record containing details of a single file for a run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileName** | **String** |  | [default to String]
**generatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**rowCount** | **Integer** |  | [default to Integer]
**fileHash** | **String** |  | [default to String]
**encrypted** | **Boolean** |  | [default to Boolean]
**destinations** | [**List&lt;FileDestinationResponse&gt;**](FileDestinationResponse.md) |  | [default to List<FileDestinationResponse>]
**transactionIds** | [**List&lt;UUID&gt;**](UUID.md) |  | [default to List<UUID>]

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
List<UUID> transactionIds = new List<UUID>();


RunFileResponse runFileResponseInstance = new RunFileResponse()
    .fileName(fileName)
    .generatedAt(generatedAt)
    .rowCount(rowCount)
    .fileHash(fileHash)
    .encrypted(encrypted)
    .destinations(destinations)
    .transactionIds(transactionIds);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)