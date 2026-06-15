# com.finbourne.sdk.services.lusid.model.ComplianceStepRequest
classname ComplianceStepRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complianceStepTypeRequest** | **String** | The type of the compliance step. Available values: FilterStepRequest, GroupByStepRequest, GroupFilterStepRequest, BranchStepRequest, CheckStepRequest, PercentCheckStepRequest. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ComplianceStepRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String complianceStepTypeRequest = "example complianceStepTypeRequest";


ComplianceStepRequest complianceStepRequestInstance = new ComplianceStepRequest()
    .complianceStepTypeRequest(complianceStepTypeRequest);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)