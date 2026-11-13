# com.finbourne.sdk.services.lusid.model.TaxReturnWorkflowStep
classname TaxReturnWorkflowStep

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | The workflow status of the return. Available values: Draft, Prepared, Reviewed, SignedOff, Final. Available values: Draft, Prepared, Reviewed, SignedOff, Final. | [optional] [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time the workflow step was recorded. | [optional] [default to OffsetDateTime]
**reason** | **String** | The reason given when the return was advanced or sent back. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TaxReturnWorkflowStep;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String status = "example status";
OffsetDateTime asAt = OffsetDateTime.now();
@javax.annotation.Nullable String reason = "example reason";


TaxReturnWorkflowStep taxReturnWorkflowStepInstance = new TaxReturnWorkflowStep()
    .status(status)
    .asAt(asAt)
    .reason(reason);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)