# com.finbourne.sdk.services.lusid.model.AllocationEventBasisWarning
classname AllocationEventBasisWarning
One thing the basis source had to work around when it read the register for an Allocation Event.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The warning, for example MissingFeeRate or RoundingPartnerNotParticipant. | [optional] [default to String]
**investorRecordId** | **String** | The investor record the warning concerns, or absent when it concerns the event as a whole. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventBasisWarning;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String code = "example code";
@javax.annotation.Nullable String investorRecordId = "example investorRecordId";


AllocationEventBasisWarning allocationEventBasisWarningInstance = new AllocationEventBasisWarning()
    .code(code)
    .investorRecordId(investorRecordId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)