# com.finbourne.sdk.services.lusid.model.ApportionmentBreakdown
classname ApportionmentBreakdown
The apportionment result for one level - the fund (apportioning the non-class-specific P&L across all  share classes) or a single allocation group (apportioning its tagged P&L across its members) - with the  per-member base values and factors the method produced.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apportionmentLevel** | **String** | Whether this result is the fund-level apportionment (across all share classes) or an allocation group&#39;s (across its share classes). Available values: Fund, AllocationGroup. | [default to String]
**allocationGroupCode** | **String** | The ShareClassShortCode identifying the allocation group this result is for, or null for the fund-level result. | [optional] [default to String]
**apportionmentMethodPropertyKey** | **String** | The apportionment method property key that produced the factors. | [default to String]
**factors** | [**List&lt;ApportionmentMemberFactor&gt;**](ApportionmentMemberFactor.md) | The per-member base values and apportionment factors produced by the method. | [default to List<ApportionmentMemberFactor>]

```java
import com.finbourne.sdk.services.lusid.model.ApportionmentBreakdown;
import java.util.*;
import java.lang.System;
import java.net.URI;

String apportionmentLevel = "example apportionmentLevel";
@javax.annotation.Nullable String allocationGroupCode = "example allocationGroupCode";
String apportionmentMethodPropertyKey = "example apportionmentMethodPropertyKey";
List<ApportionmentMemberFactor> factors = new List<ApportionmentMemberFactor>();


ApportionmentBreakdown apportionmentBreakdownInstance = new ApportionmentBreakdown()
    .apportionmentLevel(apportionmentLevel)
    .allocationGroupCode(allocationGroupCode)
    .apportionmentMethodPropertyKey(apportionmentMethodPropertyKey)
    .factors(factors);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)