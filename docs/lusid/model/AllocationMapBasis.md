# com.finbourne.sdk.services.lusid.model.AllocationMapBasis
classname AllocationMapBasis
How an allocation event is weighted between the participants of an Allocation Map.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kind** | **String** | How the event is weighted between the participants. ValueWeighted apportions pro rata to each participant&#39;s value; PropertyWeighted apportions pro rata to the property named in &#39;property&#39;; FixedPercentage apportions by the factors in fixedFactors. Available values: ValueWeighted, PropertyWeighted, FixedPercentage. | [optional] [default to String]
**property** | [**ApportionmentMethodProperty**](ApportionmentMethodProperty.md) |  | [optional] [default to ApportionmentMethodProperty]
**fixedFactors** | [**List&lt;AllocationMapFixedFactor&gt;**](AllocationMapFixedFactor.md) | For a FixedPercentage basis, the share of the amount each participating investor record takes. At least one is required under that kind, every factor must be positive, and the factors must sum to 1. | [optional] [default to List<AllocationMapFixedFactor>]
**scopedToMember** | **Boolean** | Whether the basis is evaluated only over amounts booked against the structure member rather than fund-wide. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.AllocationMapBasis;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String kind = "example kind";
ApportionmentMethodProperty property = new ApportionmentMethodProperty();
@javax.annotation.Nullable List<AllocationMapFixedFactor> fixedFactors = new List<AllocationMapFixedFactor>();
Boolean scopedToMember = true;


AllocationMapBasis allocationMapBasisInstance = new AllocationMapBasis()
    .kind(kind)
    .property(property)
    .fixedFactors(fixedFactors)
    .scopedToMember(scopedToMember);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)