# com.finbourne.sdk.services.lusid.model.IntermediateComplianceStep
classname IntermediateComplianceStep

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complianceStepType** | **String** | The type of the compliance step. Available values: FilterStep, GroupByStep, GroupFilterStep, BranchStep, RecombineStep, CheckStep, PercentCheckStep. | [default to String]
**label** | **String** | The label of the compliance step | [default to String]
**groupedParameters** | [**Map&lt;String, List&lt;ComplianceTemplateParameter&gt;&gt;**](List.md) | Parameters required for the step | [default to Map<String, List<ComplianceTemplateParameter>>]

```java
import com.finbourne.sdk.services.lusid.model.IntermediateComplianceStep;
import java.util.*;
import java.lang.System;
import java.net.URI;

String label = "example label";
Map<String, List<ComplianceTemplateParameter>> groupedParameters = new Map<String, List<ComplianceTemplateParameter>>();


IntermediateComplianceStep intermediateComplianceStepInstance = new IntermediateComplianceStep()
    .label(label)
    .groupedParameters(groupedParameters);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)