# com.finbourne.sdk.services.lusid.model.ResultDataSchema
classname ResultDataSchema
The shape and type of the returned data. The AddressSchema gives information about the requested keys,  including the return type, links to further documentation, lifecycle status and removal date if they are  deprecated.                Note: the NodeValueSchema and PropertySchema fields have been deprecated. Please use the AddressSchema instead.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodeValueSchema** | [**Map&lt;String, FieldSchema&gt;**](FieldSchema.md) | This has been deprecated. Please use AddressSchema instead. | [optional] [default to Map<String, FieldSchema>]
**propertySchema** | [**Map&lt;String, FieldSchema&gt;**](FieldSchema.md) | This has been deprecated. Please use AddressSchema instead. | [optional] [default to Map<String, FieldSchema>]
**addressSchema** | [**Map&lt;String, AddressDefinition&gt;**](AddressDefinition.md) |  | [optional] [default to Map<String, AddressDefinition>]

```java
import com.finbourne.sdk.services.lusid.model.ResultDataSchema;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Map<String, FieldSchema> nodeValueSchema = new Map<String, FieldSchema>();
@javax.annotation.Nullable Map<String, FieldSchema> propertySchema = new Map<String, FieldSchema>();
@javax.annotation.Nullable Map<String, AddressDefinition> addressSchema = new Map<String, AddressDefinition>();


ResultDataSchema resultDataSchemaInstance = new ResultDataSchema()
    .nodeValueSchema(nodeValueSchema)
    .propertySchema(propertySchema)
    .addressSchema(addressSchema);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)