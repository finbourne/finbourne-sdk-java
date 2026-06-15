# com.finbourne.sdk.services.lusid.model.ComplianceRuleTemplate
classname ComplianceRuleTemplate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**description** | **String** | The description of the Compliance Template | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Properties associated with the Compliance Template Variation | [optional] [default to Map<String, Property>]
**variations** | [**List&lt;ComplianceTemplateVariationDto&gt;**](ComplianceTemplateVariationDto.md) | Variation details of a Compliance Template | [optional] [default to List<ComplianceTemplateVariationDto>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRuleTemplate;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable List<ComplianceTemplateVariationDto> variations = new List<ComplianceTemplateVariationDto>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


ComplianceRuleTemplate complianceRuleTemplateInstance = new ComplianceRuleTemplate()
    .id(id)
    .description(description)
    .properties(properties)
    .variations(variations)
    .href(href)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)