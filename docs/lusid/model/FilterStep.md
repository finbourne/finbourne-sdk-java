# com.finbourne.sdk.services.lusid.model.FilterStep
classname FilterStep

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complianceStepType** | **String** | The type of the compliance step. Available values: FilterStep, GroupByStep, GroupFilterStep, BranchStep, RecombineStep, CheckStep, PercentCheckStep. | [default to String]
**label** | **String** | The label of the compliance step | [default to String]
**parameters** | [**List&lt;ComplianceTemplateParameter&gt;**](ComplianceTemplateParameter.md) | Parameters required for the step | [default to List<ComplianceTemplateParameter>]

```java
import com.finbourne.sdk.services.lusid.model.FilterStep;
import java.util.*;
import java.lang.System;
import java.net.URI;

String label = "example label";
List<ComplianceTemplateParameter> parameters = new List<ComplianceTemplateParameter>();


FilterStep filterStepInstance = new FilterStep()
    .label(label)
    .parameters(parameters);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)