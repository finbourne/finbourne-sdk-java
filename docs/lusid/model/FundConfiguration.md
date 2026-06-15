# com.finbourne.sdk.services.lusid.model.FundConfiguration
classname FundConfiguration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the FundConfiguration. | [optional] [default to String]
**description** | **String** | A description for the FundConfiguration. | [optional] [default to String]
**dealingFilters** | [**List&lt;ComponentFilter&gt;**](ComponentFilter.md) | The set of filters used to decide which JE lines are included in the dealing. | [optional] [default to List<ComponentFilter>]
**pnlFilters** | [**List&lt;ComponentFilter&gt;**](ComponentFilter.md) | The set of filters used to decide which JE lines are included in the PnL. | [optional] [default to List<ComponentFilter>]
**backOutFilters** | [**List&lt;ComponentFilter&gt;**](ComponentFilter.md) | The set of filters used to decide which JE lines are included in the back outs. | [optional] [default to List<ComponentFilter>]
**externalFeeFilters** | [**List&lt;ExternalFeeComponentFilter&gt;**](ExternalFeeComponentFilter.md) | The set of filters used to decide which JE lines are used for inputting fees from an external source. | [optional] [default to List<ExternalFeeComponentFilter>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Fund Configuration. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.FundConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
ResourceId id = new ResourceId();
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<ComponentFilter> dealingFilters = new List<ComponentFilter>();
@javax.annotation.Nullable List<ComponentFilter> pnlFilters = new List<ComponentFilter>();
@javax.annotation.Nullable List<ComponentFilter> backOutFilters = new List<ComponentFilter>();
@javax.annotation.Nullable List<ExternalFeeComponentFilter> externalFeeFilters = new List<ExternalFeeComponentFilter>();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


FundConfiguration fundConfigurationInstance = new FundConfiguration()
    .href(href)
    .id(id)
    .displayName(displayName)
    .description(description)
    .dealingFilters(dealingFilters)
    .pnlFilters(pnlFilters)
    .backOutFilters(backOutFilters)
    .externalFeeFilters(externalFeeFilters)
    .properties(properties)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)