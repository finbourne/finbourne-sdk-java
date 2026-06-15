# com.finbourne.sdk.services.lusid.model.CompleteRelation
classname CompleteRelation
Representation of a relation containing details of source and target entities, and both outward and inward descriptions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**relationDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**sourceEntityId** | **Map&lt;String, String&gt;** |  | [default to Map<String, String>]
**targetEntityId** | **Map&lt;String, String&gt;** |  | [default to Map<String, String>]
**outwardDescription** | **String** |  | [default to String]
**inwardDescription** | **String** |  | [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.CompleteRelation;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
Version version = new Version();
ResourceId relationDefinitionId = new ResourceId();
Map<String, String> sourceEntityId = new Map<String, String>();
Map<String, String> targetEntityId = new Map<String, String>();
String outwardDescription = "example outwardDescription";
String inwardDescription = "example inwardDescription";
OffsetDateTime effectiveFrom = OffsetDateTime.now();


CompleteRelation completeRelationInstance = new CompleteRelation()
    .href(href)
    .version(version)
    .relationDefinitionId(relationDefinitionId)
    .sourceEntityId(sourceEntityId)
    .targetEntityId(targetEntityId)
    .outwardDescription(outwardDescription)
    .inwardDescription(inwardDescription)
    .effectiveFrom(effectiveFrom);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)