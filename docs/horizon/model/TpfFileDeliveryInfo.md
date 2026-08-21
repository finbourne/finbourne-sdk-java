# com.finbourne.sdk.services.horizon.model.TpfFileDeliveryInfo
classname TpfFileDeliveryInfo
Information about a file delivery

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileUuid** | [**UUID**](UUID.md) | File delivery UUID — the identifier the retry endpoint accepts | [default to UUID]
**fileName** | **String** | File name | [default to String]
**fileHash** | **String** | SHA-256 hash of the file content | [default to String]
**destinationPath** | **String** | SFTP destination path | [default to String]
**status** | **String** | Delivery status | [default to String]
**generatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the file was originally generated | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.horizon.model.TpfFileDeliveryInfo;
import java.util.*;
import java.lang.System;
import java.net.URI;

UUID fileUuid = "example fileUuid";
String fileName = "example fileName";
String fileHash = "example fileHash";
String destinationPath = "example destinationPath";
String status = "example status";
OffsetDateTime generatedAt = OffsetDateTime.now();


TpfFileDeliveryInfo tpfFileDeliveryInfoInstance = new TpfFileDeliveryInfo()
    .fileUuid(fileUuid)
    .fileName(fileName)
    .fileHash(fileHash)
    .destinationPath(destinationPath)
    .status(status)
    .generatedAt(generatedAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)