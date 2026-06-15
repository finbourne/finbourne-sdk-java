# com.finbourne.sdk.services.lusid.model.MetadataFieldDefinition
classname MetadataFieldDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldName** | **String** | The unique identifier for the metadata field. | [default to String]
**displayName** | **String** | A user-friendly display name for the metadata field. | [optional] [default to String]
**description** | **String** | A detailed description of the metadata field and its purpose. | [optional] [default to String]
**dataTypeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.MetadataFieldDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String fieldName = "example fieldName";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
ResourceId dataTypeId = new ResourceId();


MetadataFieldDefinition metadataFieldDefinitionInstance = new MetadataFieldDefinition()
    .fieldName(fieldName)
    .displayName(displayName)
    .description(description)
    .dataTypeId(dataTypeId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)