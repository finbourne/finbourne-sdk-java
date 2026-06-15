# com.finbourne.sdk.services.workflow.model.TaskInstanceField
classname TaskInstanceField
Defines a Field on a Task

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of this Field | [default to String]
**value** | **Object** | The value of this Field | [optional] [default to Object]

```java
import com.finbourne.sdk.services.workflow.model.TaskInstanceField;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
@javax.annotation.Nullable Object 

TaskInstanceField taskInstanceFieldInstance = new TaskInstanceField()
    .name(name)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)