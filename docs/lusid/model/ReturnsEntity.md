# com.finbourne.sdk.services.lusid.model.ReturnsEntity
classname ReturnsEntity
Returns entity, used for configuring the calculation of aggregated returns.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**recipeEntity** | **String** | Entity a recipe is retrieved from for use in the aggregated returns calculation. Either RecipeId or RecipeEntity must be specified. Available values: Portfolio, PortfolioGroup, ABOR. | [optional] [default to String]
**feeHandling** | **String** | Configures how fees are handled in the aggregated returns calculation. Available values: Net, Gross. | [optional] [default to String]
**flowHandling** | **String** | Configures how flows are handled in the aggregated returns calculation. Available values: BeginningOfDay, EndOfDay. | [optional] [default to String]
**businessCalendar** | **String** | Calendar used in the aggregated returns calculation. | [optional] [default to String]
**handleFlowDiscrepancy** | **String** | Configures handling for the case where net flows do not match the sum of tagged flows. Available values: TreatAsFlow, TreatAsGainloss, Error. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.ReturnsEntity;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
ResourceId recipeId = new ResourceId();
@javax.annotation.Nullable String recipeEntity = "example recipeEntity";
@javax.annotation.Nullable String feeHandling = "example feeHandling";
@javax.annotation.Nullable String flowHandling = "example flowHandling";
@javax.annotation.Nullable String businessCalendar = "example businessCalendar";
@javax.annotation.Nullable String handleFlowDiscrepancy = "example handleFlowDiscrepancy";


ReturnsEntity returnsEntityInstance = new ReturnsEntity()
    .id(id)
    .recipeId(recipeId)
    .recipeEntity(recipeEntity)
    .feeHandling(feeHandling)
    .flowHandling(flowHandling)
    .businessCalendar(businessCalendar)
    .handleFlowDiscrepancy(handleFlowDiscrepancy);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)