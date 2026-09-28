# com.finbourne.sdk.services.lusid.model.FundStructureAllocationBasis
classname FundStructureAllocationBasis
The default apportionment basis of a Fund Structure member.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kind** | **String** | How the apportionment is weighted. ValueWeighted apportions pro rata to each investing member&#39;s value; PropertyWeighted apportions pro rata to the property named in &#39;property&#39;; FixedPercentage defers to factors held on an allocation map. A ValueWeighted basis is rejected where a holder of this member also holds an unrelated member, because the member could not be finalised before that sibling is valued. Available values: ValueWeighted, PropertyWeighted, FixedPercentage. | [optional] [default to String]
**property** | [**ApportionmentMethodProperty**](ApportionmentMethodProperty.md) |  | [optional] [default to ApportionmentMethodProperty]
**scopedToMember** | **Boolean** | Whether the basis is evaluated only over amounts booked against this member rather than fund-wide. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.FundStructureAllocationBasis;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String kind = "example kind";
ApportionmentMethodProperty property = new ApportionmentMethodProperty();
Boolean scopedToMember = true;


FundStructureAllocationBasis fundStructureAllocationBasisInstance = new FundStructureAllocationBasis()
    .kind(kind)
    .property(property)
    .scopedToMember(scopedToMember);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)