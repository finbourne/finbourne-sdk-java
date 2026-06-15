# com.finbourne.sdk.services.lusid.model.RelatedEntity
classname RelatedEntity
Information about the other related entity in the relationship

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The type of the entity. | [default to String]
**entityId** | **Map&lt;String, String&gt;** | The identifier of the other related entity in the relationship. It contains &#39;scope&#39; and &#39;code&#39; as keys for identifiers of a Portfolio or Portfolio Group, or &#39;idTypeScope&#39;, &#39;idTypeCode&#39;, &#39;code&#39; as keys for identifiers of a Person or Legal entity, or &#39;scope&#39;, &#39;identifierType&#39;, &#39;identifierValue&#39; as keys for identifiers of an Instrument | [default to Map<String, String>]
**displayName** | **String** | The display name of the entity. | [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties of the entity. This field is empty until further notice. | [optional] [default to Map<String, Property>]
**scope** | **String** | The scope of the identifier | [optional] [default to String]
**lusidUniqueId** | [**LusidUniqueId**](LusidUniqueId.md) |  | [optional] [default to LusidUniqueId]
**identifiers** | [**List&lt;EntityIdentifier&gt;**](EntityIdentifier.md) | The identifiers of the related entity in the relationship. | [default to List<EntityIdentifier>]
**href** | [**URI**](URI.md) | The link to the entity. | [optional] [default to URI]

```java
import com.finbourne.sdk.services.lusid.model.RelatedEntity;
import java.util.*;
import java.lang.System;
import java.net.URI;

String entityType = "example entityType";
Map<String, String> entityId = new Map<String, String>();
String displayName = "example displayName";
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable String scope = "example scope";
LusidUniqueId lusidUniqueId = new LusidUniqueId();
List<EntityIdentifier> identifiers = new List<EntityIdentifier>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");


RelatedEntity relatedEntityInstance = new RelatedEntity()
    .entityType(entityType)
    .entityId(entityId)
    .displayName(displayName)
    .properties(properties)
    .scope(scope)
    .lusidUniqueId(lusidUniqueId)
    .identifiers(identifiers)
    .href(href);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)