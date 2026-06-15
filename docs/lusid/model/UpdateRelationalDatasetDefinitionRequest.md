# com.finbourne.sdk.services.lusid.model.UpdateRelationalDatasetDefinitionRequest
classname UpdateRelationalDatasetDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | A user-friendly display name for the relational dataset definition. | [default to String]
**description** | **String** | A detailed description of the relational dataset definition and its purpose. | [optional] [default to String]
**applicableEntityTypes** | **List&lt;String&gt;** | The types of entities this relational dataset definition can be applied to (e.g. Instrument, Portfolio, etc.). | [default to List<String>]
**fieldSchema** | [**List&lt;RelationalDatasetFieldDefinition&gt;**](RelationalDatasetFieldDefinition.md) | The schema defining the structure and data types of the relational dataset. | [default to List<RelationalDatasetFieldDefinition>]

```java
import com.finbourne.sdk.services.lusid.model.UpdateRelationalDatasetDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
List<String> applicableEntityTypes = new List<String>();
List<RelationalDatasetFieldDefinition> fieldSchema = new List<RelationalDatasetFieldDefinition>();


UpdateRelationalDatasetDefinitionRequest updateRelationalDatasetDefinitionRequestInstance = new UpdateRelationalDatasetDefinitionRequest()
    .displayName(displayName)
    .description(description)
    .applicableEntityTypes(applicableEntityTypes)
    .fieldSchema(fieldSchema);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)