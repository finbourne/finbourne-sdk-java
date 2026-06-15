# com.finbourne.sdk.services.drive.model.UpdateFile
classname UpdateFile
DTO representing the update of the name or path of a file

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**path** | **String** | Path of the updated file | [default to String]
**name** | **String** | Name of the updated file | [default to String]

```java
import com.finbourne.sdk.services.drive.model.UpdateFile;
import java.util.*;
import java.lang.System;
import java.net.URI;

String path = "example path";
String name = "example name";


UpdateFile updateFileInstance = new UpdateFile()
    .path(path)
    .name(name);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)