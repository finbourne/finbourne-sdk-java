# com.finbourne.sdk.services.lusid.model.OrderGraphPlacement
classname OrderGraphPlacement

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**placement** | [**Placement**](Placement.md) |  | [default to Placement]
**blockId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**ordered** | [**OrderGraphPlacementOrderSynopsis**](OrderGraphPlacementOrderSynopsis.md) |  | [default to OrderGraphPlacementOrderSynopsis]
**placed** | [**OrderGraphPlacementPlacementSynopsis**](OrderGraphPlacementPlacementSynopsis.md) |  | [default to OrderGraphPlacementPlacementSynopsis]
**executed** | [**OrderGraphPlacementExecutionSynopsis**](OrderGraphPlacementExecutionSynopsis.md) |  | [default to OrderGraphPlacementExecutionSynopsis]
**allocated** | [**OrderGraphPlacementAllocationSynopsis**](OrderGraphPlacementAllocationSynopsis.md) |  | [default to OrderGraphPlacementAllocationSynopsis]
**derivedState** | **String** | A simple description of the overall state of a placement. | [default to String]
**calculatedAveragePrice** | **java.math.BigDecimal** | Average price realised on executions for a given placement | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.OrderGraphPlacement;
import java.util.*;
import java.lang.System;
import java.net.URI;

Placement placement = new Placement();
ResourceId blockId = new ResourceId();
OrderGraphPlacementOrderSynopsis ordered = new OrderGraphPlacementOrderSynopsis();
OrderGraphPlacementPlacementSynopsis placed = new OrderGraphPlacementPlacementSynopsis();
OrderGraphPlacementExecutionSynopsis executed = new OrderGraphPlacementExecutionSynopsis();
OrderGraphPlacementAllocationSynopsis allocated = new OrderGraphPlacementAllocationSynopsis();
String derivedState = "example derivedState";
@javax.annotation.Nullable java.math.BigDecimal calculatedAveragePrice = new java.math.BigDecimal("100.00");


OrderGraphPlacement orderGraphPlacementInstance = new OrderGraphPlacement()
    .placement(placement)
    .blockId(blockId)
    .ordered(ordered)
    .placed(placed)
    .executed(executed)
    .allocated(allocated)
    .derivedState(derivedState)
    .calculatedAveragePrice(calculatedAveragePrice);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)