# com.finbourne.sdk.services.lusid.model.AllocationEventBasisDiagnostics
classname AllocationEventBasisDiagnostics
What the basis source found when it read the register for an Allocation Event.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**participantCount** | **Integer** | The number of investor records whose basis values were read. | [optional] [default to Integer]
**excluded** | **List&lt;String&gt;** | The investor records the map&#39;s exceptions kept out of the event. | [optional] [default to List<String>]
**warnings** | [**List&lt;AllocationEventBasisWarning&gt;**](AllocationEventBasisWarning.md) | Anything the source had to work around, for example MissingFeeRate on a line without a management fee rate. | [optional] [default to List<AllocationEventBasisWarning>]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventBasisDiagnostics;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer participantCount = new Integer("100.00");
@javax.annotation.Nullable List<String> excluded = new List<String>();
@javax.annotation.Nullable List<AllocationEventBasisWarning> warnings = new List<AllocationEventBasisWarning>();


AllocationEventBasisDiagnostics allocationEventBasisDiagnosticsInstance = new AllocationEventBasisDiagnostics()
    .participantCount(participantCount)
    .excluded(excluded)
    .warnings(warnings);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)