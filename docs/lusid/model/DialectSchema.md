# com.finbourne.sdk.services.lusid.model.DialectSchema
classname DialectSchema
A schema that a given document must obey. A representation of the validation of a particular Dialect,  in a given language.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of schema this represents. Available values: None, JsonSchema. | [default to String]
**body** | **String** | The body of the schema | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.DialectSchema;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
@javax.annotation.Nullable String body = "example body";


DialectSchema dialectSchemaInstance = new DialectSchema()
    .type(type)
    .body(body);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)