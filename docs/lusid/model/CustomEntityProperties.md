# com.finbourne.sdk.services.lusid.model.CustomEntityProperties
classname CustomEntityProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [default to URI]
**entityType** | **String** | The type of custom entity this is. | [default to String]
**identifiers** | [**List&lt;CustomEntityId&gt;**](CustomEntityId.md) | The identifiers the custom entity will be upserted with. | [default to List<CustomEntityId>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties that decorate the custom entity. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.CustomEntityProperties;
import java.util.*;
import java.lang.System;
import java.net.URI;

URI href = URI.create("http://example.com/href");
String entityType = "example entityType";
List<CustomEntityId> identifiers = new List<CustomEntityId>();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


CustomEntityProperties customEntityPropertiesInstance = new CustomEntityProperties()
    .href(href)
    .entityType(entityType)
    .identifiers(identifiers)
    .properties(properties)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)