# com.finbourne.sdk.services.lusid.model.CreateCustomEntityTypeRequest
classname CreateCustomEntityTypeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityTypeName** | **String** | A name for the custom entity type. This will be prefixed with “~” and returned as “entityType”, which is the identifier for the custom entity type. | [default to String]
**displayName** | **String** | A display label for the custom entity type. | [default to String]
**description** | **String** | A description for the custom entity type. | [default to String]
**fieldSchema** | [**List&lt;CustomEntityFieldDefinition&gt;**](CustomEntityFieldDefinition.md) | The description of the fields on the custom entity type. | [default to List<CustomEntityFieldDefinition>]

```java
import com.finbourne.sdk.services.lusid.model.CreateCustomEntityTypeRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String entityTypeName = "example entityTypeName";
String displayName = "example displayName";
String description = "example description";
List<CustomEntityFieldDefinition> fieldSchema = new List<CustomEntityFieldDefinition>();


CreateCustomEntityTypeRequest createCustomEntityTypeRequestInstance = new CreateCustomEntityTypeRequest()
    .entityTypeName(entityTypeName)
    .displayName(displayName)
    .description(description)
    .fieldSchema(fieldSchema);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)