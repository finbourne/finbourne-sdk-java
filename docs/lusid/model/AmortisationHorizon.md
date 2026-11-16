# com.finbourne.sdk.services.lusid.model.AmortisationHorizon
classname AmortisationHorizon
The redemption a bond's cost is amortised towards, chosen per tax lot by whether the lot is held at a premium  (cost per unit above par) or a discount. Each value is one of Maturity, NextCall, NextPut or YieldToWorst and  defaults to Maturity. NextCall strikes a lot to its next call where the call price is below the lot's carrying  value, else to maturity until that call passes, so a discount lot is never struck to a call at or above par.  NextPut strikes to the next put at its price. YieldToWorst strikes to whichever call or the maturity gives the  lowest yield from the lot's cost.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**premium** | **String** | Available values: Maturity, NextCall, NextPut, YieldToWorst. | [optional] [default to String]
**discount** | **String** | Available values: Maturity, NextCall, NextPut, YieldToWorst. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AmortisationHorizon;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String premium = "example premium";
@javax.annotation.Nullable String discount = "example discount";


AmortisationHorizon amortisationHorizonInstance = new AmortisationHorizon()
    .premium(premium)
    .discount(discount);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)