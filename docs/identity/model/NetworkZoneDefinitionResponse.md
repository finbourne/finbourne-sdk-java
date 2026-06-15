# com.finbourne.sdk.services.identity.model.NetworkZoneDefinitionResponse
classname NetworkZoneDefinitionResponse
The Client facing representation of a NetworkZone

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The Network Zone Code | [optional] [default to String]
**hierarchy** | **Integer** | Hierarchy of the Network Zone | [optional] [default to Integer]
**description** | **String** | The Description of the Network Zone | [optional] [default to String]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Network Zone Creation timestamp | [optional] [default to OffsetDateTime]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the last update | [optional] [default to OffsetDateTime]
**networkZoneIPs** | [**List&lt;IpAddressDefinition&gt;**](IpAddressDefinition.md) | Network zone IP information (IPs and CIDR ranges) | [optional] [default to List<IpAddressDefinition>]
**action** | **String** | Kind of action to apply when a request matches this Network Zone (Block/Allow/NoOp) | [optional] [default to String]
**applyRules** | [**NetworkZonesApplyRules**](NetworkZonesApplyRules.md) |  | [optional] [default to NetworkZonesApplyRules]
**createdBy** | **String** | User Id that created the Network Zone | [optional] [default to String]
**updatedBy** | **String** | User Id of the last update on the Network Zone | [optional] [default to String]

```java
import com.finbourne.sdk.services.identity.model.NetworkZoneDefinitionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String code = "example code";
Integer hierarchy = new Integer("100.00");
@javax.annotation.Nullable String description = "example description";
OffsetDateTime createdAt = OffsetDateTime.now();
OffsetDateTime updatedAt = OffsetDateTime.now();
@javax.annotation.Nullable List<IpAddressDefinition> networkZoneIPs = new List<IpAddressDefinition>();
@javax.annotation.Nullable String action = "example action";
NetworkZonesApplyRules applyRules = new NetworkZonesApplyRules();
@javax.annotation.Nullable String createdBy = "example createdBy";
@javax.annotation.Nullable String updatedBy = "example updatedBy";


NetworkZoneDefinitionResponse networkZoneDefinitionResponseInstance = new NetworkZoneDefinitionResponse()
    .code(code)
    .hierarchy(hierarchy)
    .description(description)
    .createdAt(createdAt)
    .updatedAt(updatedAt)
    .networkZoneIPs(networkZoneIPs)
    .action(action)
    .applyRules(applyRules)
    .createdBy(createdBy)
    .updatedBy(updatedBy);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)