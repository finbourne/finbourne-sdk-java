# com.finbourne.sdk.services.lusid.model.RecResultAssignmentUpdate
classname RecResultAssignmentUpdate
An assignment update (assigned user or role) within a batch review item. Omitting the object leaves  the existing value untouched; a null value nullifies it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | The value to set, or null to nullify. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RecResultAssignmentUpdate;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String value = "example value";


RecResultAssignmentUpdate recResultAssignmentUpdateInstance = new RecResultAssignmentUpdate()
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)