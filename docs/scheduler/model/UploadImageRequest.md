# com.finbourne.sdk.services.scheduler.model.UploadImageRequest
classname UploadImageRequest
Request to upload image for Scheduler use

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**imageName** | **String** | Name of the image to be uploaded | [default to String]

```java
import com.finbourne.sdk.services.scheduler.model.UploadImageRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String imageName = "example imageName";


UploadImageRequest uploadImageRequestInstance = new UploadImageRequest()
    .imageName(imageName);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)