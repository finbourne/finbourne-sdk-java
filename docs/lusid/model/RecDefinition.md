# com.finbourne.sdk.services.lusid.model.RecDefinition
classname RecDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the rec definition. | [default to String]
**description** | **String** | A description of the rec definition. | [optional] [default to String]
**sideNames** | [**RecDefSideNames**](RecDefSideNames.md) |  | [optional] [default to RecDefSideNames]
**details** | [**RecDefinitionDetails**](RecDefinitionDetails.md) |  | [default to RecDefinitionDetails]
**reviewConfiguration** | [**RecReviewConfiguration**](RecReviewConfiguration.md) |  | [default to RecReviewConfiguration]
**datePolicy** | [**RecDatePolicy**](RecDatePolicy.md) |  | [default to RecDatePolicy]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Properties in the RecDefinition domain. On update, a property with a null value is deleted and omitted properties are left unchanged. Filterable and sortable. | [optional] [default to Map<String, PerpetualProperty>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.RecDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
RecDefSideNames sideNames = new RecDefSideNames();
RecDefinitionDetails details = new RecDefinitionDetails();
RecReviewConfiguration reviewConfiguration = new RecReviewConfiguration();
RecDatePolicy datePolicy = new RecDatePolicy();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


RecDefinition recDefinitionInstance = new RecDefinition()
    .id(id)
    .displayName(displayName)
    .description(description)
    .sideNames(sideNames)
    .details(details)
    .reviewConfiguration(reviewConfiguration)
    .datePolicy(datePolicy)
    .properties(properties)
    .href(href)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)