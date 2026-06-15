# com.finbourne.sdk.services.lusid.model.CorporateActionSource
classname CorporateActionSource
A corporate action source

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**displayName** | **String** | The name of the corporate action source | [optional] [default to String]
**description** | **String** | The description of the corporate action source | [optional] [default to String]
**instrumentScopes** | **List&lt;String&gt;** | The list of instrument scopes used as the scope resolution strategy when resolving instruments of upserted corporate actions. | [optional] [default to List<String>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.CorporateActionSource;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ResourceId id = new ResourceId();
Version version = new Version();
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<String> instrumentScopes = new List<String>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


CorporateActionSource corporateActionSourceInstance = new CorporateActionSource()
    .href(href)
    .id(id)
    .version(version)
    .displayName(displayName)
    .description(description)
    .instrumentScopes(instrumentScopes)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)