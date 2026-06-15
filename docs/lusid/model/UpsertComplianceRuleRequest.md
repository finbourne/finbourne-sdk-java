# com.finbourne.sdk.services.lusid.model.UpsertComplianceRuleRequest
classname UpsertComplianceRuleRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**name** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**active** | **Boolean** |  | [default to Boolean]
**templateId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**variation** | **String** |  | [default to String]
**portfolioGroupId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**parameters** | [**Map&lt;String, ComplianceParameter&gt;**](ComplianceParameter.md) |  | [default to Map<String, ComplianceParameter>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) |  | [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertComplianceRuleRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable String description = "example description";
Boolean active = true;
ResourceId templateId = new ResourceId();
String variation = "example variation";
ResourceId portfolioGroupId = new ResourceId();
Map<String, ComplianceParameter> parameters = new Map<String, ComplianceParameter>();
Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();


UpsertComplianceRuleRequest upsertComplianceRuleRequestInstance = new UpsertComplianceRuleRequest()
    .id(id)
    .name(name)
    .description(description)
    .active(active)
    .templateId(templateId)
    .variation(variation)
    .portfolioGroupId(portfolioGroupId)
    .parameters(parameters)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)