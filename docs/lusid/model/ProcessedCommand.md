# com.finbourne.sdk.services.lusid.model.ProcessedCommand
classname ProcessedCommand
The list of commands.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | The description of the command issued. | [default to String]
**path** | **String** | The unique identifier for the command including the request id. | [optional] [default to String]
**userId** | [**User**](User.md) |  | [default to User]
**processedTime** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime that the events published by the processing of this command were committed to LUSID. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.ProcessedCommand;
import java.util.*;
import java.lang.System;
import java.net.URI;

String description = "example description";
@javax.annotation.Nullable String path = "example path";
User userId = new User();
OffsetDateTime processedTime = OffsetDateTime.now();


ProcessedCommand processedCommandInstance = new ProcessedCommand()
    .description(description)
    .path(path)
    .userId(userId)
    .processedTime(processedTime);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)