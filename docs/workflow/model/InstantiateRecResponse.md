# com.finbourne.sdk.services.workflow.model.InstantiateRecResponse
classname InstantiateRecResponse
Readonly configuration for the Instantiate Rec Worker

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.InstantiateRecResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String type = "example type";


InstantiateRecResponse instantiateRecResponseInstance = new InstantiateRecResponse()
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)