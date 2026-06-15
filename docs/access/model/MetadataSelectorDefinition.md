# com.finbourne.sdk.services.access.model.MetadataSelectorDefinition
classname MetadataSelectorDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expressions** | [**List&lt;MetadataExpression&gt;**](MetadataExpression.md) |  | [default to List<MetadataExpression>]
**actions** | [**List&lt;ActionId&gt;**](ActionId.md) |  | [default to List<ActionId>]
**name** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.access.model.MetadataSelectorDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<MetadataExpression> expressions = new List<MetadataExpression>();
List<ActionId> actions = new List<ActionId>();
@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable String description = "example description";


MetadataSelectorDefinition metadataSelectorDefinitionInstance = new MetadataSelectorDefinition()
    .expressions(expressions)
    .actions(actions)
    .name(name)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)