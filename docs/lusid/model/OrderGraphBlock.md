# com.finbourne.sdk.services.lusid.model.OrderGraphBlock
classname OrderGraphBlock

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**block** | [**Block**](Block.md) |  | [default to Block]
**ordered** | [**OrderGraphBlockOrderSynopsis**](OrderGraphBlockOrderSynopsis.md) |  | [default to OrderGraphBlockOrderSynopsis]
**placed** | [**OrderGraphBlockPlacementSynopsis**](OrderGraphBlockPlacementSynopsis.md) |  | [default to OrderGraphBlockPlacementSynopsis]
**executed** | [**OrderGraphBlockExecutionSynopsis**](OrderGraphBlockExecutionSynopsis.md) |  | [default to OrderGraphBlockExecutionSynopsis]
**allocated** | [**OrderGraphBlockAllocationSynopsis**](OrderGraphBlockAllocationSynopsis.md) |  | [default to OrderGraphBlockAllocationSynopsis]
**booked** | [**OrderGraphBlockTransactionSynopsis**](OrderGraphBlockTransactionSynopsis.md) |  | [default to OrderGraphBlockTransactionSynopsis]
**derivedState** | **String** | A simple description of the overall state of a block. | [default to String]
**derivedComplianceState** | **String** | The overall compliance state of a block, derived from the block&#39;s orders. Available values: Pending, Failed, Passed, ManuallyApproved, PartiallyOverridden, Warning. | [default to String]
**derivedApprovalState** | **String** | The overall approval state of a block, derived from approval of the block&#39;s orders. Available values: Pending, Rejected, Approved, Placed. | [default to String]
**derivedDirection** | **Integer** | The overall direction of a block, derived from its orders&#39; transaction types: 1 the block increases the position (longer), -1 it decreases it (shorter), 0 its orders net flat, null when no direction could be resolved (including unsolicited blocks). | [optional] [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.OrderGraphBlock;
import java.util.*;
import java.lang.System;
import java.net.URI;

Block block = new Block();
OrderGraphBlockOrderSynopsis ordered = new OrderGraphBlockOrderSynopsis();
OrderGraphBlockPlacementSynopsis placed = new OrderGraphBlockPlacementSynopsis();
OrderGraphBlockExecutionSynopsis executed = new OrderGraphBlockExecutionSynopsis();
OrderGraphBlockAllocationSynopsis allocated = new OrderGraphBlockAllocationSynopsis();
OrderGraphBlockTransactionSynopsis booked = new OrderGraphBlockTransactionSynopsis();
String derivedState = "example derivedState";
String derivedComplianceState = "example derivedComplianceState";
String derivedApprovalState = "example derivedApprovalState";
@javax.annotation.Nullable Integer derivedDirection = new Integer("100.00");


OrderGraphBlock orderGraphBlockInstance = new OrderGraphBlock()
    .block(block)
    .ordered(ordered)
    .placed(placed)
    .executed(executed)
    .allocated(allocated)
    .booked(booked)
    .derivedState(derivedState)
    .derivedComplianceState(derivedComplianceState)
    .derivedApprovalState(derivedApprovalState)
    .derivedDirection(derivedDirection);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)