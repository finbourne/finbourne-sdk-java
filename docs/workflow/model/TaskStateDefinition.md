# com.finbourne.sdk.services.workflow.model.TaskStateDefinition
classname TaskStateDefinition
A Task Definition/Task has a given set of States

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The Name of this State | [default to String]
**displayName** | **String** | The display name of this State | [optional] [default to String]
**description** | **String** | The description of this State | [optional] [default to String]
**category** | **String** | The category of this State | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.TaskStateDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable String category = "example category";


TaskStateDefinition taskStateDefinitionInstance = new TaskStateDefinition()
    .name(name)
    .displayName(displayName)
    .description(description)
    .category(category);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)