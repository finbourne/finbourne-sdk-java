# com.finbourne.sdk.services.notifications.model.EventFieldDefinition
classname EventFieldDefinition
An EventFieldDefinition object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the field | [optional] [default to String]
**type** | **String** | Type of the field | [optional] [default to String]

```java
import com.finbourne.sdk.services.notifications.model.EventFieldDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable String type = "example type";


EventFieldDefinition eventFieldDefinitionInstance = new EventFieldDefinition()
    .name(name)
    .type(type);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)