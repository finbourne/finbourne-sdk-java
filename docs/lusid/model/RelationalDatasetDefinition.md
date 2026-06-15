# com.finbourne.sdk.services.lusid.model.RelationalDatasetDefinition
classname RelationalDatasetDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | A user-friendly display name for the relational dataset definition. | [default to String]
**description** | **String** | A detailed description of the relational dataset definition and its purpose. | [optional] [default to String]
**applicableEntityTypes** | **List&lt;String&gt;** | The types of entities this relational dataset definition can be applied to (e.g. Instrument, Portfolio, etc.). | [default to List<String>]
**fieldSchema** | [**List&lt;RelationalDatasetFieldDefinition&gt;**](RelationalDatasetFieldDefinition.md) | The schema defining the structure and data types of the relational dataset. | [default to List<RelationalDatasetFieldDefinition>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.RelationalDatasetDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
List<String> applicableEntityTypes = new List<String>();
List<RelationalDatasetFieldDefinition> fieldSchema = new List<RelationalDatasetFieldDefinition>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


RelationalDatasetDefinition relationalDatasetDefinitionInstance = new RelationalDatasetDefinition()
    .id(id)
    .displayName(displayName)
    .description(description)
    .applicableEntityTypes(applicableEntityTypes)
    .fieldSchema(fieldSchema)
    .href(href)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)