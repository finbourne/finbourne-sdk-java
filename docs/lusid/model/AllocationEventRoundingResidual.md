# com.finbourne.sdk.services.lusid.model.AllocationEventRoundingResidual
classname AllocationEventRoundingResidual
The cents left over when one component of an Allocation Event was rounded to the currency's minor unit, and where they went.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **String** | The component the residual belongs to. | [optional] [default to String]
**cents** | **Integer** | The number of minor units left over after each share was truncated to the currency. | [optional] [default to Integer]
**amount** | **java.math.BigDecimal** | The same, in the event currency. | [optional] [default to java.math.BigDecimal]
**method** | **String** | How the leftover was placed: LargestRemainder spreads it one minor unit at a time over the largest remainders; RoundingPartner gives all of it to the map&#39;s rounding partner line. Available values: LargestRemainder, RoundingPartner. | [optional] [default to String]
**takenBy** | **List&lt;String&gt;** | The investor records that each took a minor unit, in the order they took it. | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.AllocationEventRoundingResidual;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String component = "example component";
Integer cents = new Integer("100.00");
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String method = "example method";
@javax.annotation.Nullable List<String> takenBy = new List<String>();


AllocationEventRoundingResidual allocationEventRoundingResidualInstance = new AllocationEventRoundingResidual()
    .component(component)
    .cents(cents)
    .amount(amount)
    .method(method)
    .takenBy(takenBy);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)