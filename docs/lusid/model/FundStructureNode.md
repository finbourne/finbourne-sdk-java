# com.finbourne.sdk.services.lusid.model.FundStructureNode
classname FundStructureNode
A node in a Fund Structure, representing a Fund and its role within the structure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodeCode** | **String** | A unique identifier for this node within the Fund Structure. | [default to String]
**fundScope** | **String** | The scope of the Fund referenced by this node. | [default to String]
**fundCode** | **String** | The code of the Fund referenced by this node. | [default to String]
**role** | **String** | The role of this node within the structure. Must be one of the acceptable values of the structure&#39;s role data type. | [default to String]
**allocationBasis** | [**FundStructureAllocationBasis**](FundStructureAllocationBasis.md) |  | [optional] [default to FundStructureAllocationBasis]
**pnlFlowMode** | **String** | How this member&#39;s profit and loss reaches the member that holds it. Set on the held member, not on the holder: it has no effect on a member no edge holds. EquityPickup (the default) leaves the holder revaluing its position in this member; BucketFlowThrough passes the holder one line per economic bucket, tagged with its origin; TransactionFlowThrough passes the holder every line, tagged with its origin and path. Available values: EquityPickup, BucketFlowThrough, TransactionFlowThrough. | [optional] [default to String]
**allocationMapId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**driftMateriality** | [**FundStructureDriftMateriality**](FundStructureDriftMateriality.md) |  | [optional] [default to FundStructureDriftMateriality]

```java
import com.finbourne.sdk.services.lusid.model.FundStructureNode;
import java.util.*;
import java.lang.System;
import java.net.URI;

String nodeCode = "example nodeCode";
String fundScope = "example fundScope";
String fundCode = "example fundCode";
String role = "example role";
FundStructureAllocationBasis allocationBasis = new FundStructureAllocationBasis();
@javax.annotation.Nullable String pnlFlowMode = "example pnlFlowMode";
ResourceId allocationMapId = new ResourceId();
FundStructureDriftMateriality driftMateriality = new FundStructureDriftMateriality();


FundStructureNode fundStructureNodeInstance = new FundStructureNode()
    .nodeCode(nodeCode)
    .fundScope(fundScope)
    .fundCode(fundCode)
    .role(role)
    .allocationBasis(allocationBasis)
    .pnlFlowMode(pnlFlowMode)
    .allocationMapId(allocationMapId)
    .driftMateriality(driftMateriality);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)