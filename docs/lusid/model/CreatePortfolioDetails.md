# com.finbourne.sdk.services.lusid.model.CreatePortfolioDetails
classname CreatePortfolioDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**corporateActionSourceId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**taxLotSelectionCostBasis** | **String** | The cost figure that cost-referencing accounting methods evaluate when selecting tax lots for a disposal. This can be: Cost or AmortisedCost. If not supplied, the portfolio&#39;s current value is left unchanged; supply Default to reset it. A reset or never-configured basis reads back as absent. Available values: Default, Cost, AmortisedCost. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CreatePortfolioDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId corporateActionSourceId = new ResourceId();
@javax.annotation.Nullable String taxLotSelectionCostBasis = "example taxLotSelectionCostBasis";


CreatePortfolioDetails createPortfolioDetailsInstance = new CreatePortfolioDetails()
    .corporateActionSourceId(corporateActionSourceId)
    .taxLotSelectionCostBasis(taxLotSelectionCostBasis);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)