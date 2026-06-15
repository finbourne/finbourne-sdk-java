# com.finbourne.sdk.services.access.model.IdentifierPartSchema
classname IdentifierPartSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **Integer** |  | [default to Integer]
**name** | **String** |  | [default to String]
**displayName** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**required** | **Boolean** |  | [default to Boolean]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.access.model.IdentifierPartSchema;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer index = new Integer("100.00");
String name = "example name";
String displayName = "example displayName";
String description = "example description";
Boolean required = true;
@javax.annotation.Nullable List<Link> links = new List<Link>();


IdentifierPartSchema identifierPartSchemaInstance = new IdentifierPartSchema()
    .index(index)
    .name(name)
    .displayName(displayName)
    .description(description)
    .required(required)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)