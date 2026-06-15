# com.finbourne.sdk.services.lusid.model.ComplianceRuleResponse
classname ComplianceRuleResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**name** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**active** | **Boolean** |  | [optional] [default to Boolean]
**templateId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**variation** | **String** |  | [optional] [default to String]
**portfolioGroupId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**parameters** | [**Map&lt;String, ComplianceParameter&gt;**](ComplianceParameter.md) |  | [optional] [default to Map<String, ComplianceParameter>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) |  | [optional] [default to Map<String, PerpetualProperty>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceRuleResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable String description = "example description";
Boolean active = true;
ResourceId templateId = new ResourceId();
@javax.annotation.Nullable String variation = "example variation";
ResourceId portfolioGroupId = new ResourceId();
@javax.annotation.Nullable Map<String, ComplianceParameter> parameters = new Map<String, ComplianceParameter>();
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
Version version = new Version();
@javax.annotation.Nullable List<Link> links = new List<Link>();


ComplianceRuleResponse complianceRuleResponseInstance = new ComplianceRuleResponse()
    .id(id)
    .name(name)
    .description(description)
    .active(active)
    .templateId(templateId)
    .variation(variation)
    .portfolioGroupId(portfolioGroupId)
    .parameters(parameters)
    .properties(properties)
    .version(version)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)