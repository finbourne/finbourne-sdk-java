# com.finbourne.sdk.services.horizon.model.TpfFileDeliveryResponse
classname TpfFileDeliveryResponse
Response model for TPF file delivery search results

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | **String** |  | [optional] [default to String]
**runStartTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**fileName** | **String** |  | [default to String]
**generatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the file was built, or when the attempt failed before a file was built. | [default to OffsetDateTime]
**rowCount** | **Integer** |  | [default to Integer]
**fileHash** | **String** |  | [optional] [default to String]
**destinationType** | **String** |  | [default to String]
**destinationPath** | **String** |  | [optional] [default to String]
**destinationStatus** | **String** |  | [default to String]
**destinationError** | **String** |  | [optional] [default to String]
**destinationName** | **String** |  | [optional] [default to String]
**fileUuid** | [**UUID**](UUID.md) |  | [default to UUID]
**canResend** | **Boolean** | Whether the data the file is rebuilt from is still retained, so a resend can be requested. | [default to Boolean]
**deliveredAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the file reached the destination; null for a Failed or Pending row. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.horizon.model.TpfFileDeliveryResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String runId = "example runId";
@javax.annotation.Nullable OffsetDateTime runStartTime = OffsetDateTime.now();
String fileName = "example fileName";
OffsetDateTime generatedAt = OffsetDateTime.now();
Integer rowCount = new Integer("100.00");
@javax.annotation.Nullable String fileHash = "example fileHash";
String destinationType = "example destinationType";
@javax.annotation.Nullable String destinationPath = "example destinationPath";
String destinationStatus = "example destinationStatus";
@javax.annotation.Nullable String destinationError = "example destinationError";
@javax.annotation.Nullable String destinationName = "example destinationName";
UUID fileUuid = "example fileUuid";
Boolean canResend = true;
@javax.annotation.Nullable OffsetDateTime deliveredAt = OffsetDateTime.now();


TpfFileDeliveryResponse tpfFileDeliveryResponseInstance = new TpfFileDeliveryResponse()
    .runId(runId)
    .runStartTime(runStartTime)
    .fileName(fileName)
    .generatedAt(generatedAt)
    .rowCount(rowCount)
    .fileHash(fileHash)
    .destinationType(destinationType)
    .destinationPath(destinationPath)
    .destinationStatus(destinationStatus)
    .destinationError(destinationError)
    .destinationName(destinationName)
    .fileUuid(fileUuid)
    .canResend(canResend)
    .deliveredAt(deliveredAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)