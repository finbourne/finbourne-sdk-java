# com.finbourne.sdk.services.configuration.model.CreateConfigurationSet
classname CreateConfigurationSet
The information required to create a new configuration set

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**type** | **String** | The type (personal or shared) of the new configuration set | [default to String]
**description** | **String** | The description of the new configuration set | [optional] [default to String]

```java
import com.finbourne.sdk.services.configuration.model.CreateConfigurationSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String type = "example type";
@javax.annotation.Nullable String description = "example description";


CreateConfigurationSet createConfigurationSetInstance = new CreateConfigurationSet()
    .id(id)
    .type(type)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)