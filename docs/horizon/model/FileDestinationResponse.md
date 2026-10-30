# com.finbourne.sdk.services.horizon.model.FileDestinationResponse
classname FileDestinationResponse
The destination a file delivery row describes. A Failed row carries the per-transaction FailureReason when one was recorded, falling back to the raw Error text.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | [default to String]
**path** | **String** |  | [default to String]
**status** | **String** |  | [default to String]
**error** | **String** |  | [optional] [default to String]
**failureReason** | **String** |  | [optional] [default to String]
**name** | **String** | The configured destination name, such as the SFTP host, when one was recorded. | [optional] [default to String]
**deliveredAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the file reached the destination; null for a Failed or Pending row. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.horizon.model.FileDestinationResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
String path = "example path";
String status = "example status";
@javax.annotation.Nullable String error = "example error";
@javax.annotation.Nullable String failureReason = "example failureReason";
@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable OffsetDateTime deliveredAt = OffsetDateTime.now();


FileDestinationResponse fileDestinationResponseInstance = new FileDestinationResponse()
    .type(type)
    .path(path)
    .status(status)
    .error(error)
    .failureReason(failureReason)
    .name(name)
    .deliveredAt(deliveredAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)