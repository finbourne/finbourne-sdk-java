# com.finbourne.sdk.services.lusid.model.AllocationEventComponent
classname AllocationEventComponent
One component of an Allocation Event: a part of the amount shared on its own basis and booked to its own slot.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **String** | The component. For a CapitalCall one of Investment, MgmtFee, OtherFee, PartnershipExpense, OrgCost, Recall, EqualisationInterest or LatePaymentInterest; for a Distribution one of ROC, RealisedGain, Dividend, Interest, OtherIncome, CarryPaid, Withholding or ReturnOfExcess. | [default to String]
**amount** | **java.math.BigDecimal** | The part of the event amount this component carries, in the event currency. May be zero, in which case the component allocates nothing. | [default to java.math.BigDecimal]
**originMemberShortCode** | **String** | The member of the structure the component originates from, for a basis measured per deal such as PaidInForDeal. Absent means the map&#39;s own member. | [optional] [default to String]
**waterfallTier** | **String** | For a distribution component, the tier of the waterfall it was paid under: ReturnOfContributions, PreferredReturn, CatchUp, CarriedInterest or Residual. | [optional] [default to String]
**taxCharacter** | **String** | For a distribution component, the tax character of the amount: ROC, Gain, Income or Deemed. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventComponent;
import java.util.*;
import java.lang.System;
import java.net.URI;

String component = "example component";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String originMemberShortCode = "example originMemberShortCode";
@javax.annotation.Nullable String waterfallTier = "example waterfallTier";
@javax.annotation.Nullable String taxCharacter = "example taxCharacter";


AllocationEventComponent allocationEventComponentInstance = new AllocationEventComponent()
    .component(component)
    .amount(amount)
    .originMemberShortCode(originMemberShortCode)
    .waterfallTier(waterfallTier)
    .taxCharacter(taxCharacter);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)