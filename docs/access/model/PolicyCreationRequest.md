# com.finbourne.sdk.services.access.model.PolicyCreationRequest
classname PolicyCreationRequest
Request to create a policy

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Code of the policy being created | [default to String]
**description** | **String** | Description of what the policy will be used for | [optional] [default to String]
**applications** | **List&lt;String&gt;** | Applications this policy is used with | [optional] [default to List<String>]
**grant** | [**Grant**](Grant.md) |  | [default to Grant]
**selectors** | [**List&lt;SelectorDefinition&gt;**](SelectorDefinition.md) | Selectors that identify what resources this policy qualifies for | [default to List<SelectorDefinition>]
**_for** | [**List&lt;ForSpec&gt;**](ForSpec.md) | \&quot;For Specification\&quot; for when the policy is to be applied | [optional] [default to List<ForSpec>]
**_if** | [**List&lt;IfExpression&gt;**](IfExpression.md) | \&quot;If Specification\&quot; for when the policy is to be applied | [optional] [default to List<IfExpression>]
**when** | [**WhenSpec**](WhenSpec.md) |  | [default to WhenSpec]
**how** | [**HowSpec**](HowSpec.md) |  | [optional] [default to HowSpec]
**templateMetadata** | [**TemplateMetadata**](TemplateMetadata.md) |  | [optional] [default to TemplateMetadata]

```java
import com.finbourne.sdk.services.access.model.PolicyCreationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<String> applications = new List<String>();
Grant List<SelectorDefinition> selectors = new List<SelectorDefinition>();
@javax.annotation.Nullable List<ForSpec> for = new List<ForSpec>();
@javax.annotation.Nullable List<IfExpression> if = new List<IfExpression>();
WhenSpec when = new WhenSpec();
HowSpec how = new HowSpec();
TemplateMetadata templateMetadata = new TemplateMetadata();


PolicyCreationRequest policyCreationRequestInstance = new PolicyCreationRequest()
    .code(code)
    .description(description)
    .applications(applications)
    .grant(grant)
    .selectors(selectors)
    .for(for)
    .if(if)
    .when(when)
    .how(how)
    .templateMetadata(templateMetadata);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)