# com.finbourne.sdk.services.lusid.model.Relationship
classname Relationship
Representation of a Relationship between a requested entity with the stated entity as RelatedEntityId

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**relationshipDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**relatedEntity** | [**RelatedEntity**](RelatedEntity.md) |  | [default to RelatedEntity]
**traversalDirection** | **String** | Direction of relationship between the requested entity and related entity. This can be &#39;In&#39; or &#39;Out&#39;. Read more about relationships traversal direction in LUSID Knowledge Base here https://support.lusid.com/knowledgebase/article/KA-01679. | [default to String]
**traversalDescription** | **String** | Description of the relationship based on relationship&#39;s traversal direction. If &#39;TraversalDirection&#39; is &#39;Out&#39;, this description would be &#39;OutwardDescription&#39; from the associated relationship definition. If &#39;TraversalDirection&#39; is &#39;In&#39;, this description would be &#39;InwardDescription&#39; from the associated relationship definition. | [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which the relationship is valid. | [optional] [default to OffsetDateTime]
**effectiveUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime until which the relationship is valid. If no future deletions are present or an effective until has not been set for the relationship, this will be indefinite and represented by the maximum date. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.Relationship;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version version = new Version();
ResourceId relationshipDefinitionId = new ResourceId();
RelatedEntity relatedEntity = new RelatedEntity();
String traversalDirection = "example traversalDirection";
String traversalDescription = "example traversalDescription";
OffsetDateTime effectiveFrom = OffsetDateTime.now();
OffsetDateTime effectiveUntil = OffsetDateTime.now();


Relationship relationshipInstance = new Relationship()
    .version(version)
    .relationshipDefinitionId(relationshipDefinitionId)
    .relatedEntity(relatedEntity)
    .traversalDirection(traversalDirection)
    .traversalDescription(traversalDescription)
    .effectiveFrom(effectiveFrom)
    .effectiveUntil(effectiveUntil);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)