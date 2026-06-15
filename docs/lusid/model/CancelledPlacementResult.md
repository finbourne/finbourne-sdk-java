# com.finbourne.sdk.services.lusid.model.CancelledPlacementResult
classname CancelledPlacementResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**placementState** | [**Placement**](Placement.md) |  | [optional] [default to Placement]
**cancelledChildPlacements** | [**List&lt;ResourceId&gt;**](ResourceId.md) | Child placements which have also been cancelled following cancellation of the parent | [default to List<ResourceId>]

```java
import com.finbourne.sdk.services.lusid.model.CancelledPlacementResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

Placement placementState = new Placement();
List<ResourceId> cancelledChildPlacements = new List<ResourceId>();


CancelledPlacementResult cancelledPlacementResultInstance = new CancelledPlacementResult()
    .placementState(placementState)
    .cancelledChildPlacements(cancelledChildPlacements);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)