# com.finbourne.sdk.services.lusid.model.RelationalDatasetFieldDefinition
classname RelationalDatasetFieldDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldName** | **String** | The unique identifier for the field within the dataset. | [default to String]
**displayName** | **String** | A user-friendly display name for the field. | [optional] [default to String]
**description** | **String** | A detailed description of the field and its purpose. | [optional] [default to String]
**dataTypeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**required** | **Boolean** | Whether this field is mandatory in the dataset. | [optional] [default to Boolean]
**category** | **String** | The intended category of the field (SeriesIdentifier, Value, or Metadata). Available values: SeriesIdentifier, Value, Metadata. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RelationalDatasetFieldDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String fieldName = "example fieldName";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
ResourceId dataTypeId = new ResourceId();
Boolean required = true;
String category = "example category";


RelationalDatasetFieldDefinition relationalDatasetFieldDefinitionInstance = new RelationalDatasetFieldDefinition()
    .fieldName(fieldName)
    .displayName(displayName)
    .description(description)
    .dataTypeId(dataTypeId)
    .required(required)
    .category(category);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)