# com.finbourne.sdk.services.lusid.model.FileResponse
classname FileResponse
Allows a file (represented as a stream) to be returned from an Api call

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileStream** | [**File**](File.md) |  | [optional] [default to File]
**contentType** | **String** |  | [optional] [default to String]
**downloadedFilename** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.FileResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable File @javax.annotation.Nullable String contentType = "example contentType";
@javax.annotation.Nullable String downloadedFilename = "example downloadedFilename";


FileResponse fileResponseInstance = new FileResponse()
    .fileStream(fileStream)
    .contentType(contentType)
    .downloadedFilename(downloadedFilename);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)