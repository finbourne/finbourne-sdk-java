# com.finbourne.sdk.services.access.model.GeneratePolicyFromTemplateRequest
classname GeneratePolicyFromTemplateRequest
Generate policy from template

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**templateSelection** | [**List&lt;TemplateSelection&gt;**](TemplateSelection.md) | List of template selection, identifying policy templates to use for generation | [default to List<TemplateSelection>]
**selectors** | [**List&lt;SelectorDefinition&gt;**](SelectorDefinition.md) | List of additional selectors to be included in the policy | [optional] [default to List<SelectorDefinition>]

```java
import com.finbourne.sdk.services.access.model.GeneratePolicyFromTemplateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<TemplateSelection> templateSelection = new List<TemplateSelection>();
@javax.annotation.Nullable List<SelectorDefinition> selectors = new List<SelectorDefinition>();


GeneratePolicyFromTemplateRequest generatePolicyFromTemplateRequestInstance = new GeneratePolicyFromTemplateRequest()
    .templateSelection(templateSelection)
    .selectors(selectors);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)