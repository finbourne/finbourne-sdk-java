# com.finbourne.sdk.services.scheduler.model.UploadImageInstructions
classname UploadImageInstructions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dockerLoginCommand** | **String** |  | [default to String]
**buildVersionedDockerImageCommand** | **String** |  | [default to String]
**tagVersionedDockerImageCommand** | **String** |  | [default to String]
**pushVersionedDockerImageCommand** | **String** |  | [default to String]
**tagLatestDockerImageCommand** | **String** |  | [optional] [default to String]
**pushLatestDockerImageCommand** | **String** |  | [optional] [default to String]
**expiryTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.scheduler.model.UploadImageInstructions;
import java.util.*;
import java.lang.System;
import java.net.URI;

String dockerLoginCommand = "example dockerLoginCommand";
String buildVersionedDockerImageCommand = "example buildVersionedDockerImageCommand";
String tagVersionedDockerImageCommand = "example tagVersionedDockerImageCommand";
String pushVersionedDockerImageCommand = "example pushVersionedDockerImageCommand";
@javax.annotation.Nullable String tagLatestDockerImageCommand = "example tagLatestDockerImageCommand";
@javax.annotation.Nullable String pushLatestDockerImageCommand = "example pushLatestDockerImageCommand";
@javax.annotation.Nullable OffsetDateTime expiryTime = OffsetDateTime.now();


UploadImageInstructions uploadImageInstructionsInstance = new UploadImageInstructions()
    .dockerLoginCommand(dockerLoginCommand)
    .buildVersionedDockerImageCommand(buildVersionedDockerImageCommand)
    .tagVersionedDockerImageCommand(tagVersionedDockerImageCommand)
    .pushVersionedDockerImageCommand(pushVersionedDockerImageCommand)
    .tagLatestDockerImageCommand(tagLatestDockerImageCommand)
    .pushLatestDockerImageCommand(pushLatestDockerImageCommand)
    .expiryTime(expiryTime);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)