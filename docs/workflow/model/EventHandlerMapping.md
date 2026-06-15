# com.finbourne.sdk.services.workflow.model.EventHandlerMapping
classname EventHandlerMapping
Defines a mapping for event handler properties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mapFrom** | **String** | The field to map from | [optional] [default to String]
**setTo** | **String** | The (constant) value to set | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.EventHandlerMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String mapFrom = "example mapFrom";
@javax.annotation.Nullable String setTo = "example setTo";


EventHandlerMapping eventHandlerMappingInstance = new EventHandlerMapping()
    .mapFrom(mapFrom)
    .setTo(setTo);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)