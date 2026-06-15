# com.finbourne.sdk.services.luminesce.model.AccessControlledResourceIdentifierPartSchemaAttribute
classname AccessControlledResourceIdentifierPartSchemaAttribute

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **Integer** |  | [optional] [default to Integer]
**name** | **String** |  | [optional] [default to String]
**displayName** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**required** | **Boolean** |  | [optional] [default to Boolean]
**valuesPath** | **String** |  | [optional] [default to String]
**typeId** | **Object** |  | [optional] [readonly] [default to Object]

```java
import com.finbourne.sdk.services.luminesce.model.AccessControlledResourceIdentifierPartSchemaAttribute;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer index = new Integer("100.00");
@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
Boolean required = true;
@javax.annotation.Nullable String valuesPath = "example valuesPath";
@javax.annotation.Nullable Object 

AccessControlledResourceIdentifierPartSchemaAttribute accessControlledResourceIdentifierPartSchemaAttributeInstance = new AccessControlledResourceIdentifierPartSchemaAttribute()
    .index(index)
    .name(name)
    .displayName(displayName)
    .description(description)
    .required(required)
    .valuesPath(valuesPath)
    .typeId(typeId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)