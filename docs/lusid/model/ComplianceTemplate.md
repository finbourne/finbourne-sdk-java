# com.finbourne.sdk.services.lusid.model.ComplianceTemplate
classname ComplianceTemplate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**description** | **String** | The description of the Compliance Template | [default to String]
**tags** | **List&lt;String&gt;** | Tags for a Compliance Template | [optional] [default to List<String>]
**variations** | [**List&lt;ComplianceTemplateVariation&gt;**](ComplianceTemplateVariation.md) | Variation details of a Compliance Template | [default to List<ComplianceTemplateVariation>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceTemplate;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String description = "example description";
@javax.annotation.Nullable List<String> tags = new List<String>();
List<ComplianceTemplateVariation> variations = new List<ComplianceTemplateVariation>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


ComplianceTemplate complianceTemplateInstance = new ComplianceTemplate()
    .id(id)
    .description(description)
    .tags(tags)
    .variations(variations)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)