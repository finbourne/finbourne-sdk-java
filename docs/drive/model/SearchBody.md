# com.finbourne.sdk.services.drive.model.SearchBody
classname SearchBody
DTO representing the search query

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**withPath** | **String** | Optional path field to limit the search to result with a matching (case insensitive) path | [optional] [default to String]
**name** | **String** | Name of the file or folder to be searched | [default to String]

```java
import com.finbourne.sdk.services.drive.model.SearchBody;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String withPath = "example withPath";
String name = "example name";


SearchBody searchBodyInstance = new SearchBody()
    .withPath(withPath)
    .name(name);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)