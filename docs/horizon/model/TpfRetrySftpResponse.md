# com.finbourne.sdk.services.horizon.model.TpfRetrySftpResponse
classname TpfRetrySftpResponse
Response from retrying SFTP file delivery

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**success** | **Boolean** | Whether the retry was successful | [default to Boolean]
**message** | **String** | Status message describing the result | [default to String]
**newFileDeliveryId** | **Long** | ID of the new file delivery record created for this retry (if successful) | [optional] [default to Long]
**retriedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the retry was executed | [optional] [default to OffsetDateTime]
**originalFile** | [**TpfFileDeliveryInfo**](TpfFileDeliveryInfo.md) |  | [optional] [default to TpfFileDeliveryInfo]
**duplicateFile** | [**TpfFileDeliveryInfo**](TpfFileDeliveryInfo.md) |  | [optional] [default to TpfFileDeliveryInfo]

```java
import com.finbourne.sdk.services.horizon.model.TpfRetrySftpResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean success = true;
String message = "example message";
@javax.annotation.Nullable Long newFileDeliveryId = new Long("100.00");
@javax.annotation.Nullable OffsetDateTime retriedAt = OffsetDateTime.now();
TpfFileDeliveryInfo originalFile = new TpfFileDeliveryInfo();
TpfFileDeliveryInfo duplicateFile = new TpfFileDeliveryInfo();


TpfRetrySftpResponse tpfRetrySftpResponseInstance = new TpfRetrySftpResponse()
    .success(success)
    .message(message)
    .newFileDeliveryId(newFileDeliveryId)
    .retriedAt(retriedAt)
    .originalFile(originalFile)
    .duplicateFile(duplicateFile);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)