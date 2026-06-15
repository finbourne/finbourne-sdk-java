# com.finbourne.sdk.services.workflow.model.TaskFieldDefinition
classname TaskFieldDefinition
Defines a Task Definition Field

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of this Field | [default to String]
**type** | **String** | The value type for the field. Available values are: \&quot;String\&quot;, \&quot;Decimal\&quot;, \&quot;DateTime\&quot;, \&quot;Boolean\&quot;) | [default to String]
**readOnlyStates** | [**ReadOnlyStates**](ReadOnlyStates.md) |  | [optional] [default to ReadOnlyStates]
**valueConstraints** | [**ValueConstraints**](ValueConstraints.md) |  | [optional] [default to ValueConstraints]
**displayName** | **String** | Display name for field definition | [optional] [default to String]
**description** | **String** | Description for field definition | [optional] [default to String]
**category** | **String** | Category for field definition | [optional] [default to String]
**containsUrl** | **Boolean** | Field contains url | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.workflow.model.TaskFieldDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
String type = "example type";
ReadOnlyStates readOnlyStates = new ReadOnlyStates();
ValueConstraints valueConstraints = new ValueConstraints();
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable String category = "example category";
@javax.annotation.Nullable Boolean containsUrl = true;


TaskFieldDefinition taskFieldDefinitionInstance = new TaskFieldDefinition()
    .name(name)
    .type(type)
    .readOnlyStates(readOnlyStates)
    .valueConstraints(valueConstraints)
    .displayName(displayName)
    .description(description)
    .category(category)
    .containsUrl(containsUrl);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)