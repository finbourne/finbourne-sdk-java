# com.finbourne.sdk.services.horizon.model.FileDetails
classname FileDetails
Information associated with files

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileName** | **String** |  | [default to String]
**fileType** | **String** |  | [optional] [default to String]
**id** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.horizon.model.FileDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String fileName = "example fileName";
@javax.annotation.Nullable String fileType = "example fileType";
String id = "example id";


FileDetails fileDetailsInstance = new FileDetails()
    .fileName(fileName)
    .fileType(fileType)
    .id(id);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)