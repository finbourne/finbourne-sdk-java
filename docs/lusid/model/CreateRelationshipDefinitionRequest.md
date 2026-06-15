# com.finbourne.sdk.services.lusid.model.CreateRelationshipDefinitionRequest
classname CreateRelationshipDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope that the relationship definition exists in. | [default to String]
**code** | **String** | The code of the relationship definition. Together with the scope this uniquely defines the relationship definition. | [default to String]
**sourceEntityType** | **String** | The entity type of the source entity object. Allowed values are &#39;Portfolio&#39;, &#39;PortfolioGroup&#39;, &#39;Person&#39;, &#39;LegalEntity&#39;, &#39;Instrument&#39; or a custom entity type prefixed with &#39;~&#39;. | [default to String]
**targetEntityType** | **String** | The entity type of the target entity object. Allowed values are &#39;Portfolio&#39;, &#39;PortfolioGroup&#39;, &#39;Person&#39;, &#39;LegalEntity&#39;, &#39;Instrument&#39; or a custom entity type prefixed with &#39;~&#39;. | [default to String]
**displayName** | **String** | The display name of the relationship definition. | [default to String]
**outwardDescription** | **String** | The description to relate source entity object and target entity object. | [default to String]
**inwardDescription** | **String** | The description to relate target entity object and source entity object. | [default to String]
**lifeTime** | **String** | Describes how the relationships can change over time. Default value: Perpetual. Available values: Perpetual, TimeVariant. | [optional] [default to String]
**relationshipCardinality** | **String** | Describes the cardinality of the relationship with a specific source entity object and relationships under this definition. Default value: ManyToMany. Available values: ManyToOne, ManyToMany. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CreateRelationshipDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String scope = "example scope";
String code = "example code";
String sourceEntityType = "example sourceEntityType";
String targetEntityType = "example targetEntityType";
String displayName = "example displayName";
String outwardDescription = "example outwardDescription";
String inwardDescription = "example inwardDescription";
@javax.annotation.Nullable String lifeTime = "example lifeTime";
@javax.annotation.Nullable String relationshipCardinality = "example relationshipCardinality";


CreateRelationshipDefinitionRequest createRelationshipDefinitionRequestInstance = new CreateRelationshipDefinitionRequest()
    .scope(scope)
    .code(code)
    .sourceEntityType(sourceEntityType)
    .targetEntityType(targetEntityType)
    .displayName(displayName)
    .outwardDescription(outwardDescription)
    .inwardDescription(inwardDescription)
    .lifeTime(lifeTime)
    .relationshipCardinality(relationshipCardinality);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)