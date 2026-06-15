# com.finbourne.sdk.services.drive.model.CreateFolder
classname CreateFolder
DTO representing the creation of a folder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**path** | **String** | Path of the created folder | [default to String]
**name** | **String** | Name of the created folder | [default to String]

```java
import com.finbourne.sdk.services.drive.model.CreateFolder;
import java.util.*;
import java.lang.System;
import java.net.URI;

String path = "example path";
String name = "example name";


CreateFolder createFolderInstance = new CreateFolder()
    .path(path)
    .name(name);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)