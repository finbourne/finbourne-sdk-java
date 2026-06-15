# com.finbourne.sdk.services.lusid.model.CustomDataModelPropertySpecificationWithDisplayName
classname CustomDataModelPropertySpecificationWithDisplayName

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The display name of the property definition. | [optional] [default to String]
**propertyKey** | **String** | The property key that is required/allowed on the bound entity. | [default to String]
**required** | **Boolean** | Whether property is required or allowed. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.CustomDataModelPropertySpecificationWithDisplayName;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String displayName = "example displayName";
String propertyKey = "example propertyKey";
Boolean required = true;


CustomDataModelPropertySpecificationWithDisplayName customDataModelPropertySpecificationWithDisplayNameInstance = new CustomDataModelPropertySpecificationWithDisplayName()
    .displayName(displayName)
    .propertyKey(propertyKey)
    .required(required);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)