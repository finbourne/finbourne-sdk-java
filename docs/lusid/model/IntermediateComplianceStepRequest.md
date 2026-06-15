# com.finbourne.sdk.services.lusid.model.IntermediateComplianceStepRequest
classname IntermediateComplianceStepRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complianceStepTypeRequest** | **String** | The type of the compliance step. Available values: FilterStepRequest, GroupByStepRequest, GroupFilterStepRequest, BranchStepRequest, CheckStepRequest, PercentCheckStepRequest. | [default to String]
**label** | **String** | The label of the compliance step | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.IntermediateComplianceStepRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String label = "example label";


IntermediateComplianceStepRequest intermediateComplianceStepRequestInstance = new IntermediateComplianceStepRequest()
    .label(label);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)