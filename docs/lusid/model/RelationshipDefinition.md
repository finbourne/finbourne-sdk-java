# com.finbourne.sdk.services.lusid.model.RelationshipDefinition
classname RelationshipDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**relationshipDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**sourceEntityType** | **String** | The entity type of the source entity object. Available values: Portfolio, PortfolioGroup, Person, LegalEntity, NextBestAction. | [default to String]
**targetEntityType** | **String** | The entity type of the target entity object. Available values: Portfolio, PortfolioGroup, Person, LegalEntity, NextBestAction. | [default to String]
**displayName** | **String** | The display name of the relationship. | [default to String]
**outwardDescription** | **String** | The description to relate source entity object and target entity object | [default to String]
**inwardDescription** | **String** | The description to relate target entity object and source entity object | [default to String]
**lifeTime** | **String** | Describes how the relationships can change over time. Available values: Perpetual, TimeVariant. | [default to String]
**relationshipCardinality** | **String** | Describes the cardinality of the relationship between source entity and target entity. Available values: ManyToOne, ManyToMany. | [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.RelationshipDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version version = new Version();
ResourceId relationshipDefinitionId = new ResourceId();
String sourceEntityType = "example sourceEntityType";
String targetEntityType = "example targetEntityType";
String displayName = "example displayName";
String outwardDescription = "example outwardDescription";
String inwardDescription = "example inwardDescription";
String lifeTime = "example lifeTime";
String relationshipCardinality = "example relationshipCardinality";
@javax.annotation.Nullable List<Link> links = new List<Link>();


RelationshipDefinition relationshipDefinitionInstance = new RelationshipDefinition()
    .version(version)
    .relationshipDefinitionId(relationshipDefinitionId)
    .sourceEntityType(sourceEntityType)
    .targetEntityType(targetEntityType)
    .displayName(displayName)
    .outwardDescription(outwardDescription)
    .inwardDescription(inwardDescription)
    .lifeTime(lifeTime)
    .relationshipCardinality(relationshipCardinality)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)