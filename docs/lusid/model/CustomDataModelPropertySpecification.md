# com.finbourne.sdk.services.lusid.model.CustomDataModelPropertySpecification
classname CustomDataModelPropertySpecification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyKey** | **String** | The property key that is required/allowed on the bound entity. | [default to String]
**required** | **Boolean** | Whether property is required or allowed. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.CustomDataModelPropertySpecification;
import java.util.*;
import java.lang.System;
import java.net.URI;

String propertyKey = "example propertyKey";
Boolean required = true;


CustomDataModelPropertySpecification customDataModelPropertySpecificationInstance = new CustomDataModelPropertySpecification()
    .propertyKey(propertyKey)
    .required(required);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)