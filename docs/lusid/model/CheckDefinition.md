# com.finbourne.sdk.services.lusid.model.CheckDefinition
classname CheckDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the Check Definition. | [optional] [default to String]
**description** | **String** | A description for the Check Definition. | [optional] [default to String]
**datasetSchema** | [**CheckDefinitionDatasetSchema**](CheckDefinitionDatasetSchema.md) |  | [optional] [default to CheckDefinitionDatasetSchema]
**ruleSets** | [**List&lt;CheckDefinitionRuleSet&gt;**](CheckDefinitionRuleSet.md) | A collection of rule sets for the Check Definition. | [optional] [default to List<CheckDefinitionRuleSet>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Check Definition. | [optional] [default to Map<String, Property>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.CheckDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
CheckDefinitionDatasetSchema datasetSchema = new CheckDefinitionDatasetSchema();
@javax.annotation.Nullable List<CheckDefinitionRuleSet> ruleSets = new List<CheckDefinitionRuleSet>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
Version version = new Version();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


CheckDefinition checkDefinitionInstance = new CheckDefinition()
    .id(id)
    .displayName(displayName)
    .description(description)
    .datasetSchema(datasetSchema)
    .ruleSets(ruleSets)
    .href(href)
    .version(version)
    .properties(properties)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)