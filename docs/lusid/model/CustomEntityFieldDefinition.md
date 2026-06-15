# com.finbourne.sdk.services.lusid.model.CustomEntityFieldDefinition
classname CustomEntityFieldDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the field. | [default to String]
**lifetime** | **String** | Describes how the field’s values can change over time. The available values are: “Perpetual”, “TimeVariant”. | [default to String]
**type** | **String** | The value type for the field. Available values are: “String”, “Boolean”, “DateTime”, “Decimal”. | [default to String]
**collectionType** | **String** | The collection type for the field. Available values are: “Single”, “Array”. Null value defaults to “Single” | [optional] [default to String]
**required** | **Boolean** | Whether the field is required or not. | [default to Boolean]
**description** | **String** | An optional description for the field. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CustomEntityFieldDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
String lifetime = "example lifetime";
String type = "example type";
@javax.annotation.Nullable String collectionType = "example collectionType";
Boolean required = true;
@javax.annotation.Nullable String description = "example description";


CustomEntityFieldDefinition customEntityFieldDefinitionInstance = new CustomEntityFieldDefinition()
    .name(name)
    .lifetime(lifetime)
    .type(type)
    .collectionType(collectionType)
    .required(required)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)