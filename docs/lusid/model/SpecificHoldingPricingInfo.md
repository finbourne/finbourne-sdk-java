# com.finbourne.sdk.services.lusid.model.SpecificHoldingPricingInfo
classname SpecificHoldingPricingInfo
Allows a user to specify fallbacks/overrides using Holding fields for sources that match a particular DependencySourceFilter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependencySourceFilter** | [**DependencySourceFilter**](DependencySourceFilter.md) |  | [default to DependencySourceFilter]
**field** | **String** | The Holding field which the fallback/override should use to create a price quote. Available values: None, UnitCost, LastTradedPrice, UnitAmortisedCost, UnitCostClean, UnitCostDirty, UnitAmortisedCostClean, UnitAmortisedCostDirty. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.SpecificHoldingPricingInfo;
import java.util.*;
import java.lang.System;
import java.net.URI;

DependencySourceFilter dependencySourceFilter = new DependencySourceFilter();
String field = "example field";


SpecificHoldingPricingInfo specificHoldingPricingInfoInstance = new SpecificHoldingPricingInfo()
    .dependencySourceFilter(dependencySourceFilter)
    .field(field);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)