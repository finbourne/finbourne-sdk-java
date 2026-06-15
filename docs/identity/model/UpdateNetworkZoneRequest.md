# com.finbourne.sdk.services.identity.model.UpdateNetworkZoneRequest
classname UpdateNetworkZoneRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** |  | [optional] [default to String]
**networkZoneIPs** | [**List&lt;IpAddressDefinition&gt;**](IpAddressDefinition.md) |  | [default to List<IpAddressDefinition>]
**action** | **String** |  | [optional] [default to String]
**applyRules** | [**NetworkZonesApplyRules**](NetworkZonesApplyRules.md) |  | [default to NetworkZonesApplyRules]
**hierarchy** | **Integer** |  | [default to Integer]

```java
import com.finbourne.sdk.services.identity.model.UpdateNetworkZoneRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String description = "example description";
List<IpAddressDefinition> networkZoneIPs = new List<IpAddressDefinition>();
@javax.annotation.Nullable String action = "example action";
NetworkZonesApplyRules applyRules = new NetworkZonesApplyRules();
Integer hierarchy = new Integer("100.00");


UpdateNetworkZoneRequest updateNetworkZoneRequestInstance = new UpdateNetworkZoneRequest()
    .description(description)
    .networkZoneIPs(networkZoneIPs)
    .action(action)
    .applyRules(applyRules)
    .hierarchy(hierarchy);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)