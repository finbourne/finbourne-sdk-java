# com.finbourne.sdk.services.access.model.GeneratedPolicyComponents
classname GeneratedPolicyComponents
Response object for policy generated from template

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applications** | **List&lt;String&gt;** | Applications to which the policy applies | [optional] [default to List<String>]
**templateMetadata** | [**TemplateMetadata**](TemplateMetadata.md) |  | [optional] [default to TemplateMetadata]
**selectors** | [**List&lt;SelectorDefinition&gt;**](SelectorDefinition.md) | Selectors that this policy will be applied to | [optional] [default to List<SelectorDefinition>]

```java
import com.finbourne.sdk.services.access.model.GeneratedPolicyComponents;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<String> applications = new List<String>();
TemplateMetadata templateMetadata = new TemplateMetadata();
@javax.annotation.Nullable List<SelectorDefinition> selectors = new List<SelectorDefinition>();


GeneratedPolicyComponents generatedPolicyComponentsInstance = new GeneratedPolicyComponents()
    .applications(applications)
    .templateMetadata(templateMetadata)
    .selectors(selectors);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)