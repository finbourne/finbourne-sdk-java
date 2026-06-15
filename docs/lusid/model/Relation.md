# com.finbourne.sdk.services.lusid.model.Relation
classname Relation
Representation of a Relation between a requested entity with the stated entity as RelationedEntityId

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**relationDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**relatedEntityId** | **Map&lt;String, String&gt;** |  | [default to Map<String, String>]
**traversalDirection** | **String** |  | [default to String]
**traversalDescription** | **String** |  | [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.Relation;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version version = new Version();
ResourceId relationDefinitionId = new ResourceId();
Map<String, String> relatedEntityId = new Map<String, String>();
String traversalDirection = "example traversalDirection";
String traversalDescription = "example traversalDescription";
OffsetDateTime effectiveFrom = OffsetDateTime.now();


Relation relationInstance = new Relation()
    .version(version)
    .relationDefinitionId(relationDefinitionId)
    .relatedEntityId(relatedEntityId)
    .traversalDirection(traversalDirection)
    .traversalDescription(traversalDescription)
    .effectiveFrom(effectiveFrom);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)