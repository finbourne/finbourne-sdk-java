# com.finbourne.sdk.services.access.model.AttachedPolicyDefinitionResponse
classname AttachedPolicyDefinitionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceRole** | [**RoleId**](RoleId.md) |  | [optional] [default to RoleId]
**roleHierarchyIndex** | **Integer** |  | [optional] [default to Integer]
**description** | **String** |  | [optional] [default to String]
**applications** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**policyType** | [**PolicyType**](PolicyType.md) |  | [optional] [default to PolicyType]
**id** | [**PolicyId**](PolicyId.md) |  | [optional] [default to PolicyId]
**grant** | [**Grant**](Grant.md) |  | [optional] [default to Grant]
**selectors** | [**List&lt;SelectorDefinition&gt;**](SelectorDefinition.md) |  | [optional] [default to List<SelectorDefinition>]
**_for** | [**List&lt;ForSpec&gt;**](ForSpec.md) |  | [optional] [default to List<ForSpec>]
**_if** | [**List&lt;IfExpression&gt;**](IfExpression.md) |  | [optional] [default to List<IfExpression>]
**when** | [**WhenSpec**](WhenSpec.md) |  | [optional] [default to WhenSpec]
**how** | [**HowSpec**](HowSpec.md) |  | [optional] [default to HowSpec]

```java
import com.finbourne.sdk.services.access.model.AttachedPolicyDefinitionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

RoleId sourceRole = new RoleId();
Integer roleHierarchyIndex = new Integer("100.00");
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable List<String> applications = new List<String>();
PolicyType PolicyId id = new PolicyId();
Grant @javax.annotation.Nullable List<SelectorDefinition> selectors = new List<SelectorDefinition>();
@javax.annotation.Nullable List<ForSpec> for = new List<ForSpec>();
@javax.annotation.Nullable List<IfExpression> if = new List<IfExpression>();
WhenSpec when = new WhenSpec();
HowSpec how = new HowSpec();


AttachedPolicyDefinitionResponse attachedPolicyDefinitionResponseInstance = new AttachedPolicyDefinitionResponse()
    .sourceRole(sourceRole)
    .roleHierarchyIndex(roleHierarchyIndex)
    .description(description)
    .applications(applications)
    .policyType(policyType)
    .id(id)
    .grant(grant)
    .selectors(selectors)
    .for(for)
    .if(if)
    .when(when)
    .how(how);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)