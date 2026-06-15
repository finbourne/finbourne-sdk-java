# com.finbourne.sdk.services.lusid.model.ChartOfAccounts
classname ChartOfAccounts
A chart of account.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the Chart of Account. | [optional] [default to String]
**description** | **String** | A description of the Chart of Accounts. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Chart of Accounts. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.ChartOfAccounts;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ResourceId id = new ResourceId();
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


ChartOfAccounts chartOfAccountsInstance = new ChartOfAccounts()
    .href(href)
    .id(id)
    .displayName(displayName)
    .description(description)
    .properties(properties)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)