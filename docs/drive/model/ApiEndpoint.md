# com.finbourne.sdk.services.drive.model.ApiEndpoint
classname ApiEndpoint

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **String** |  | [optional] [default to String]
**httpMethod** | **String** |  | [default to String]
**path** | **String** |  | [default to String]
**status** | **String** |  | [optional] [default to String]
**summary** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.drive.model.ApiEndpoint;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String operation = "example operation";
String httpMethod = "example httpMethod";
String path = "example path";
@javax.annotation.Nullable String status = "example status";
@javax.annotation.Nullable String summary = "example summary";
@javax.annotation.Nullable String description = "example description";


ApiEndpoint apiEndpointInstance = new ApiEndpoint()
    .operation(operation)
    .httpMethod(httpMethod)
    .path(path)
    .status(status)
    .summary(summary)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)