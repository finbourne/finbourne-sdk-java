# com.finbourne.sdk.services.lusid.model.CompleteRelationship
classname CompleteRelationship
Representation of a relationship containing details of source and target entities, and both outward and inward descriptions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**relationshipDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**sourceEntity** | [**RelatedEntity**](RelatedEntity.md) |  | [default to RelatedEntity]
**targetEntity** | [**RelatedEntity**](RelatedEntity.md) |  | [default to RelatedEntity]
**outwardDescription** | **String** | Description of the relationship based on relationship definition&#39;s outward description. | [default to String]
**inwardDescription** | **String** | Description of the relationship based on relationship definition&#39;s inward description. | [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which the relationship is valid. | [optional] [default to OffsetDateTime]
**effectiveUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime to which the relationship is valid until. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.CompleteRelationship;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
Version version = new Version();
ResourceId relationshipDefinitionId = new ResourceId();
RelatedEntity sourceEntity = new RelatedEntity();
RelatedEntity targetEntity = new RelatedEntity();
String outwardDescription = "example outwardDescription";
String inwardDescription = "example inwardDescription";
OffsetDateTime effectiveFrom = OffsetDateTime.now();
OffsetDateTime effectiveUntil = OffsetDateTime.now();


CompleteRelationship completeRelationshipInstance = new CompleteRelationship()
    .href(href)
    .version(version)
    .relationshipDefinitionId(relationshipDefinitionId)
    .sourceEntity(sourceEntity)
    .targetEntity(targetEntity)
    .outwardDescription(outwardDescription)
    .inwardDescription(inwardDescription)
    .effectiveFrom(effectiveFrom)
    .effectiveUntil(effectiveUntil);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)