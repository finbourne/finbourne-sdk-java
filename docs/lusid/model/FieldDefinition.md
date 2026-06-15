# com.finbourne.sdk.services.lusid.model.FieldDefinition
classname FieldDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** |  | [default to String]
**isRequired** | **Boolean** |  | [default to Boolean]
**isUnique** | **Boolean** |  | [default to Boolean]
**valueType** | **String** | Available values: String, Decimal. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.FieldDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String key = "example key";
Boolean isRequired = true;
Boolean isUnique = true;
@javax.annotation.Nullable String valueType = "example valueType";


FieldDefinition fieldDefinitionInstance = new FieldDefinition()
    .key(key)
    .isRequired(isRequired)
    .isUnique(isUnique)
    .valueType(valueType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)