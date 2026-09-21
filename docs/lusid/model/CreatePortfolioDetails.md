# com.finbourne.sdk.services.lusid.model.CreatePortfolioDetails
classname CreatePortfolioDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**corporateActionSourceId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**taxLotSelectionCostBasis** | **String** | The cost figure that cost-referencing accounting methods evaluate when selecting tax lots for a disposal. This can be: Cost or AmortisedCost. If not supplied, the portfolio&#39;s current value is left unchanged; supply Default to reset it. A reset or never-configured basis reads back as absent. Available values: Default, Cost, AmortisedCost. | [optional] [default to String]
**fractionalUnitsTrueUpConfiguration** | [**FractionalUnitsTrueUpConfiguration**](FractionalUnitsTrueUpConfiguration.md) |  | [optional] [default to FractionalUnitsTrueUpConfiguration]
**holdingsFungibility** | **String** | Whether the portfolio&#39;s holdings are fungible across the currencies of a currency group. This can be: Default or Enabled. If not supplied, the portfolio&#39;s current value is left unchanged; supply Default to reset it. A reset or never-configured flag reads back as absent. Available values: Default, Enabled. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CreatePortfolioDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId corporateActionSourceId = new ResourceId();
@javax.annotation.Nullable String taxLotSelectionCostBasis = "example taxLotSelectionCostBasis";
FractionalUnitsTrueUpConfiguration fractionalUnitsTrueUpConfiguration = new FractionalUnitsTrueUpConfiguration();
@javax.annotation.Nullable String holdingsFungibility = "example holdingsFungibility";


CreatePortfolioDetails createPortfolioDetailsInstance = new CreatePortfolioDetails()
    .corporateActionSourceId(corporateActionSourceId)
    .taxLotSelectionCostBasis(taxLotSelectionCostBasis)
    .fractionalUnitsTrueUpConfiguration(fractionalUnitsTrueUpConfiguration)
    .holdingsFungibility(holdingsFungibility);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)