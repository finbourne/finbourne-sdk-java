# com.finbourne.sdk.services.horizon.model.TpfFileDeliveryInfo
classname TpfFileDeliveryInfo
Information about a file delivery

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | File delivery ID | [default to Long]
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

Long id = new Long("100.00");
String fileName = "example fileName";
String fileHash = "example fileHash";
String destinationPath = "example destinationPath";
String status = "example status";
OffsetDateTime generatedAt = OffsetDateTime.now();


TpfFileDeliveryInfo tpfFileDeliveryInfoInstance = new TpfFileDeliveryInfo()
    .id(id)
    .fileName(fileName)
    .fileHash(fileHash)
    .destinationPath(destinationPath)
    .status(status)
    .generatedAt(generatedAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)