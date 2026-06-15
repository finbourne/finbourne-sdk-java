# com.finbourne.sdk.services.lusid.model.CustomDataModelIdentifierTypeSpecification
classname CustomDataModelIdentifierTypeSpecification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifierKey** | **String** | The identifier type that is required/allowed on the bound entity. | [default to String]
**required** | **Boolean** | Whether identifier type is required or allowed. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.CustomDataModelIdentifierTypeSpecification;
import java.util.*;
import java.lang.System;
import java.net.URI;

String identifierKey = "example identifierKey";
Boolean required = true;


CustomDataModelIdentifierTypeSpecification customDataModelIdentifierTypeSpecificationInstance = new CustomDataModelIdentifierTypeSpecification()
    .identifierKey(identifierKey)
    .required(required);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)