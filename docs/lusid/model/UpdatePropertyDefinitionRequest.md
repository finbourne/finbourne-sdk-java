# com.finbourne.sdk.services.lusid.model.UpdatePropertyDefinitionRequest
classname UpdatePropertyDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The display name of the property. | [default to String]
**propertyDescription** | **String** | Describes the property | [optional] [default to String]
**customEntityTypes** | **List&lt;String&gt;** | The custom entity types that properties relating to this property definition can be applied to. | [optional] [default to List<String>]
**valueFormat** | **String** | The format in which values for this property definition should be represented. Available values: Text, Html. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.UpdatePropertyDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String propertyDescription = "example propertyDescription";
@javax.annotation.Nullable List<String> customEntityTypes = new List<String>();
@javax.annotation.Nullable String valueFormat = "example valueFormat";


UpdatePropertyDefinitionRequest updatePropertyDefinitionRequestInstance = new UpdatePropertyDefinitionRequest()
    .displayName(displayName)
    .propertyDescription(propertyDescription)
    .customEntityTypes(customEntityTypes)
    .valueFormat(valueFormat);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)