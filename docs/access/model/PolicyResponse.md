# com.finbourne.sdk.services.access.model.PolicyResponse
classname PolicyResponse
Response object from the policy API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**PolicyId**](PolicyId.md) |  | [optional] [default to PolicyId]
**description** | **String** | Description of what the policy is entitling | [optional] [default to String]
**applications** | **List&lt;String&gt;** | Applications to which the policy applies | [optional] [default to List<String>]
**grant** | [**Grant**](Grant.md) |  | [optional] [default to Grant]
**selectors** | [**List&lt;SelectorDefinition&gt;**](SelectorDefinition.md) | Selectors that this policy will be applied to | [optional] [default to List<SelectorDefinition>]
**_for** | [**List&lt;ForSpec&gt;**](ForSpec.md) | \&quot;For Specification\&quot; for when the policy is to be applied | [optional] [default to List<ForSpec>]
**_if** | [**List&lt;IfExpression&gt;**](IfExpression.md) | \&quot;If Specification\&quot; for when the policy is to be applied | [optional] [default to List<IfExpression>]
**when** | [**WhenSpec**](WhenSpec.md) |  | [optional] [default to WhenSpec]
**how** | [**HowSpec**](HowSpec.md) |  | [optional] [default to HowSpec]
**templateMetadata** | [**TemplateMetadata**](TemplateMetadata.md) |  | [optional] [default to TemplateMetadata]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.access.model.PolicyResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

PolicyId id = new PolicyId();
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<String> applications = new List<String>();
Grant @javax.annotation.Nullable List<SelectorDefinition> selectors = new List<SelectorDefinition>();
@javax.annotation.Nullable List<ForSpec> for = new List<ForSpec>();
@javax.annotation.Nullable List<IfExpression> if = new List<IfExpression>();
WhenSpec when = new WhenSpec();
HowSpec how = new HowSpec();
TemplateMetadata templateMetadata = new TemplateMetadata();
@javax.annotation.Nullable List<Link> links = new List<Link>();


PolicyResponse policyResponseInstance = new PolicyResponse()
    .id(id)
    .description(description)
    .applications(applications)
    .grant(grant)
    .selectors(selectors)
    .for(for)
    .if(if)
    .when(when)
    .how(how)
    .templateMetadata(templateMetadata)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)