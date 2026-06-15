# com.finbourne.sdk.services.horizon.model.FileDestinationResponse
classname FileDestinationResponse
record containing details of a single file destination for a run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | [default to String]
**path** | **String** |  | [default to String]
**status** | **String** |  | [default to String]
**error** | **String** |  | [optional] [default to String]
**failureReason** | **String** |  | [optional] [default to String]

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


FileDestinationResponse fileDestinationResponseInstance = new FileDestinationResponse()
    .type(type)
    .path(path)
    .status(status)
    .error(error)
    .failureReason(failureReason);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)