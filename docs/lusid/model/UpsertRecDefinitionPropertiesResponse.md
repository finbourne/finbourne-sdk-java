# com.finbourne.sdk.services.lusid.model.UpsertRecDefinitionPropertiesResponse
classname UpsertRecDefinitionPropertiesResponse
The properties upserted onto a rec definition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The rec definition properties that were upserted. These will be from the &#39;RecDefinition&#39; domain. Properties deleted by the request are not included. | [optional] [default to Map<String, PerpetualProperty>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertRecDefinitionPropertiesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


UpsertRecDefinitionPropertiesResponse upsertRecDefinitionPropertiesResponseInstance = new UpsertRecDefinitionPropertiesResponse()
    .href(href)
    .properties(properties)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)