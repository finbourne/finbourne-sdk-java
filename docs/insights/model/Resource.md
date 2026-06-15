# com.finbourne.sdk.services.insights.model.Resource
classname Resource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | [optional] [default to String]
**identifier** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.insights.model.Resource;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";
@javax.annotation.Nullable String identifier = "example identifier";


Resource resourceInstance = new Resource()
    .type(type)
    .identifier(identifier);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)