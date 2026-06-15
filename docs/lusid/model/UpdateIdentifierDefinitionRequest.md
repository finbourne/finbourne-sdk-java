# com.finbourne.sdk.services.lusid.model.UpdateIdentifierDefinitionRequest
classname UpdateIdentifierDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hierarchyLevel** | **String** | Optional metadata associated with the identifier definition. | [optional] [default to String]
**displayName** | **String** | A display name for the identifier. E.g. Figi. | [optional] [default to String]
**description** | **String** | An optional description for the identifier. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the identifier definition. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.sdk.services.lusid.model.UpdateIdentifierDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String hierarchyLevel = "example hierarchyLevel";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();


UpdateIdentifierDefinitionRequest updateIdentifierDefinitionRequestInstance = new UpdateIdentifierDefinitionRequest()
    .hierarchyLevel(hierarchyLevel)
    .displayName(displayName)
    .description(description)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)