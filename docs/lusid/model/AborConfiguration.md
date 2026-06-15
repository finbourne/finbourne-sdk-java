# com.finbourne.sdk.services.lusid.model.AborConfiguration
classname AborConfiguration
An AborConfiguration entity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the Abor Configuration. | [optional] [default to String]
**description** | **String** | A description for the Abor Configuration. | [optional] [default to String]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**chartOfAccountsId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**postingModuleCodes** | **List&lt;String&gt;** | The Posting Module Codes from which the rules to be applied are retrieved. | [optional] [default to List<String>]
**cleardownModuleCodes** | **List&lt;String&gt;** | The Cleardown Module Codes from which the rules to be applied are retrieved. | [optional] [default to List<String>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Abor Configuration. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.AborConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ResourceId id = new ResourceId();
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
ResourceId recipeId = new ResourceId();
ResourceId chartOfAccountsId = new ResourceId();
@javax.annotation.Nullable List<String> postingModuleCodes = new List<String>();
@javax.annotation.Nullable List<String> cleardownModuleCodes = new List<String>();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


AborConfiguration aborConfigurationInstance = new AborConfiguration()
    .href(href)
    .id(id)
    .displayName(displayName)
    .description(description)
    .recipeId(recipeId)
    .chartOfAccountsId(chartOfAccountsId)
    .postingModuleCodes(postingModuleCodes)
    .cleardownModuleCodes(cleardownModuleCodes)
    .properties(properties)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)