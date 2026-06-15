# com.finbourne.sdk.services.lusid.model.PercentCheckStep
classname PercentCheckStep

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complianceStepType** | **String** | The type of the compliance step. Available values: FilterStep, GroupByStep, GroupFilterStep, BranchStep, RecombineStep, CheckStep, PercentCheckStep. | [default to String]
**label** | **String** | The label of the compliance step | [default to String]
**limitCheckParameters** | [**List&lt;ComplianceTemplateParameter&gt;**](ComplianceTemplateParameter.md) | Parameters required for an absolute limit check | [default to List<ComplianceTemplateParameter>]
**warningCheckParameters** | [**List&lt;ComplianceTemplateParameter&gt;**](ComplianceTemplateParameter.md) | Parameters required for a warning limit check | [default to List<ComplianceTemplateParameter>]

```java
import com.finbourne.sdk.services.lusid.model.PercentCheckStep;
import java.util.*;
import java.lang.System;
import java.net.URI;

String label = "example label";
List<ComplianceTemplateParameter> limitCheckParameters = new List<ComplianceTemplateParameter>();
List<ComplianceTemplateParameter> warningCheckParameters = new List<ComplianceTemplateParameter>();


PercentCheckStep percentCheckStepInstance = new PercentCheckStep()
    .label(label)
    .limitCheckParameters(limitCheckParameters)
    .warningCheckParameters(warningCheckParameters);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)