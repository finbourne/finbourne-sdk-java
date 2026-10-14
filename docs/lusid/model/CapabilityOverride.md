# com.finbourne.sdk.services.lusid.model.CapabilityOverride
classname CapabilityOverride

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capability** | **String** | Available values: RecallableDistributions, RecallCalls, ReturnOfExcessContributions, SubsequentCloseEqualisation, PartnerPnlAllocation, DistributionMechanism, DistributionCharacterSource, SecondaryTransfer, ExcuseExclude, DealScopedPnl, NettedCallAndDistribution. | [default to String]
**setting** | **String** | Available values: Allowed, Forbidden. | [default to String]
**reason** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CapabilityOverride;
import java.util.*;
import java.lang.System;
import java.net.URI;

String capability = "example capability";
String setting = "example setting";
@javax.annotation.Nullable String reason = "example reason";


CapabilityOverride capabilityOverrideInstance = new CapabilityOverride()
    .capability(capability)
    .setting(setting)
    .reason(reason);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)