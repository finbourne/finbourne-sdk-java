# com.finbourne.sdk.services.lusid.model.CustomDataModelIdentifierTypeSpecificationWithDisplayName
classname CustomDataModelIdentifierTypeSpecificationWithDisplayName

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The display name of the property definition. | [optional] [default to String]
**identifierKey** | **String** | The identifier type that is required/allowed on the bound entity. | [default to String]
**required** | **Boolean** | Whether identifier type is required or allowed. | [optional] [default to Boolean]
**identifierType** | **String** | The name of the identifier type. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CustomDataModelIdentifierTypeSpecificationWithDisplayName;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String displayName = "example displayName";
String identifierKey = "example identifierKey";
Boolean required = true;
@javax.annotation.Nullable String identifierType = "example identifierType";


CustomDataModelIdentifierTypeSpecificationWithDisplayName customDataModelIdentifierTypeSpecificationWithDisplayNameInstance = new CustomDataModelIdentifierTypeSpecificationWithDisplayName()
    .displayName(displayName)
    .identifierKey(identifierKey)
    .required(required)
    .identifierType(identifierType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)