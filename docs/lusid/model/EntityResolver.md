# com.finbourne.sdk.services.lusid.model.EntityResolver
classname EntityResolver

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**entityType** | **String** | The entity type that a specific resolution configuration is applicable to (e.g. Instrument). | [default to String]
**description** | **String** | Describes what this specific identifier order is used for. | [optional] [default to String]
**identifierMatchingOrder** | [**List&lt;IdentifierForResolution&gt;**](IdentifierForResolution.md) | Ordered collection of related identifier keys that are used to define which identifier takes priority in resolving an entity. | [default to List<IdentifierForResolution>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.EntityResolver;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String entityType = "example entityType";
@javax.annotation.Nullable String description = "example description";
List<IdentifierForResolution> identifierMatchingOrder = new List<IdentifierForResolution>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


EntityResolver entityResolverInstance = new EntityResolver()
    .id(id)
    .entityType(entityType)
    .description(description)
    .identifierMatchingOrder(identifierMatchingOrder)
    .href(href)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)