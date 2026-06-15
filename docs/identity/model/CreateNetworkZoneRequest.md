# com.finbourne.sdk.services.identity.model.CreateNetworkZoneRequest
classname CreateNetworkZoneRequest
The Create Network Zone Request information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | [default to String]
**description** | **String** |  | [optional] [default to String]
**networkZoneIPs** | [**List&lt;IpAddressDefinition&gt;**](IpAddressDefinition.md) |  | [default to List<IpAddressDefinition>]
**action** | **String** |  | [optional] [default to String]
**applyRules** | [**NetworkZonesApplyRules**](NetworkZonesApplyRules.md) |  | [default to NetworkZonesApplyRules]

```java
import com.finbourne.sdk.services.identity.model.CreateNetworkZoneRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
@javax.annotation.Nullable String description = "example description";
List<IpAddressDefinition> networkZoneIPs = new List<IpAddressDefinition>();
@javax.annotation.Nullable String action = "example action";
NetworkZonesApplyRules applyRules = new NetworkZonesApplyRules();


CreateNetworkZoneRequest createNetworkZoneRequestInstance = new CreateNetworkZoneRequest()
    .code(code)
    .description(description)
    .networkZoneIPs(networkZoneIPs)
    .action(action)
    .applyRules(applyRules);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)