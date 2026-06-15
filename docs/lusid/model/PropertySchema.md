# com.finbourne.sdk.services.lusid.model.PropertySchema
classname PropertySchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**values** | [**Map&lt;String, FieldSchema&gt;**](FieldSchema.md) |  | [optional] [default to Map<String, FieldSchema>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.PropertySchema;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable Map<String, FieldSchema> values = new Map<String, FieldSchema>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


PropertySchema propertySchemaInstance = new PropertySchema()
    .href(href)
    .values(values)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)