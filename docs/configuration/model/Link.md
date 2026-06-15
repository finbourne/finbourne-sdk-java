# com.finbourne.sdk.services.configuration.model.Link
classname Link

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**relation** | **String** |  | [default to String]
**href** | [**URI**](URI.md) |  | [default to URI]
**description** | **String** |  | [optional] [default to String]
**method** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.configuration.model.Link;
import java.util.*;
import java.lang.System;
import java.net.URI;

String relation = "example relation";
URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable String description = "example description";
String method = "example method";


Link linkInstance = new Link()
    .relation(relation)
    .href(href)
    .description(description)
    .method(method);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)