# com.finbourne.sdk.services.workflow.model.FailResponse
classname FailResponse
Readonly configuration for a Worker that always Fails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.FailResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";


FailResponse failResponseInstance = new FailResponse()
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)