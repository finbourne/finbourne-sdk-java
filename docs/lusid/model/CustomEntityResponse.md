# com.finbourne.sdk.services.lusid.model.CustomEntityResponse
classname CustomEntityResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**entityType** | **String** | The type of custom entity this is. | [default to String]
**version** | [**Version**](Version.md) |  | [default to Version]
**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  | [optional] [default to StagedModificationsInfo]
**displayName** | **String** | A display label for the custom entity. | [default to String]
**description** | **String** | A description of the custom entity. | [optional] [default to String]
**identifiers** | [**List&lt;CustomEntityId&gt;**](CustomEntityId.md) | The identifiers the custom entity will be upserted with. | [default to List<CustomEntityId>]
**fields** | [**List&lt;CustomEntityField&gt;**](CustomEntityField.md) | The fields that decorate the custom entity. | [default to List<CustomEntityField>]
**relationships** | [**List&lt;Relationship&gt;**](Relationship.md) | A set of relationships associated to the custom entity. | [default to List<Relationship>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties that decorate the custom entity. | [optional] [default to Map<String, Property>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.CustomEntityResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
String entityType = "example entityType";
Version version = new Version();
StagedModificationsInfo stagedModifications = new StagedModificationsInfo();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
List<CustomEntityId> identifiers = new List<CustomEntityId>();
List<CustomEntityField> fields = new List<CustomEntityField>();
List<Relationship> relationships = new List<Relationship>();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


CustomEntityResponse customEntityResponseInstance = new CustomEntityResponse()
    .href(href)
    .entityType(entityType)
    .version(version)
    .stagedModifications(stagedModifications)
    .displayName(displayName)
    .description(description)
    .identifiers(identifiers)
    .fields(fields)
    .relationships(relationships)
    .properties(properties)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)