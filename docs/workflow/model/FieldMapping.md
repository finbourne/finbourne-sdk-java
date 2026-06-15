# com.finbourne.sdk.services.workflow.model.FieldMapping
classname FieldMapping
Defines a single Field map

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mapFrom** | **String** | The field to map from | [optional] [default to String]
**setTo** | **Object** | The (constant) value to set | [optional] [default to Object]

```java
import com.finbourne.sdk.services.workflow.model.FieldMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String mapFrom = "example mapFrom";
@javax.annotation.Nullable Object 

FieldMapping fieldMappingInstance = new FieldMapping()
    .mapFrom(mapFrom)
    .setTo(setTo);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)