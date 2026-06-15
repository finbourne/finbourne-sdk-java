# com.finbourne.sdk.services.lusid.model.ComplianceStep
classname ComplianceStep

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complianceStepType** | **String** | The type of the compliance step. Available values: FilterStep, GroupByStep, GroupFilterStep, BranchStep, RecombineStep, CheckStep, PercentCheckStep. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceStep;
import java.util.*;
import java.lang.System;
import java.net.URI;

String complianceStepType = "example complianceStepType";


ComplianceStep complianceStepInstance = new ComplianceStep()
    .complianceStepType(complianceStepType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)