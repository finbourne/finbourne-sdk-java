# com.finbourne.sdk.services.lusid.model.CustomEntityDefinition
classname CustomEntityDefinition
Representation of Custom Entity Definition on LUSID API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**entityTypeName** | **String** | The name provided when the custom entity type was created. This has been prefixed with “~” and returned as “entityType”, which is the identifier for the custom entity type. | [default to String]
**displayName** | **String** | A display label for the custom entity type. | [default to String]
**description** | **String** | A description for the custom entity type. | [optional] [default to String]
**entityType** | **String** | The identifier for the custom entity type, derived from the “entityTypeName” provided on creation. | [default to String]
**fieldSchema** | [**List&lt;CustomEntityFieldDefinition&gt;**](CustomEntityFieldDefinition.md) | The description of the fields on the custom entity type. | [default to List<CustomEntityFieldDefinition>]
**version** | [**Version**](Version.md) |  | [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.CustomEntityDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
String entityTypeName = "example entityTypeName";
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
String entityType = "example entityType";
List<CustomEntityFieldDefinition> fieldSchema = new List<CustomEntityFieldDefinition>();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


CustomEntityDefinition customEntityDefinitionInstance = new CustomEntityDefinition()
    .href(href)
    .entityTypeName(entityTypeName)
    .displayName(displayName)
    .description(description)
    .entityType(entityType)
    .fieldSchema(fieldSchema)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)