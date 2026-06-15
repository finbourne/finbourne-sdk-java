# com.finbourne.sdk.services.lusid.model.FxRateSchedule
classname FxRateSchedule
Schedule to define fx conversion of cashflows on complex bonds. If an fx schedule is defined then  on payment schedule generation the coupon and principal payoffs will be wrapped in an fx rate payoff method.  Either the fx rate is predefined (fixed) or relies on fx resets (floating).  Used in representation of dual currency bond.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleType** | **String** | Available values: FixedSchedule, FloatSchedule, OptionalitySchedule, StepSchedule, Exercise, FxRateSchedule, FxLinkedNotionalSchedule, BondConversionSchedule, Invalid. | [default to String]
**flowConventions** | [**FlowConventions**](FlowConventions.md) |  | [optional] [default to FlowConventions]
**fxConversionTypes** | **List&lt;String&gt;** | List of flags to indicate if coupon payments, principal payments or both are converted | [optional] [default to List<String>]
**rate** | **java.math.BigDecimal** | FxRate used to convert payments. Assumed to be in units of the ToCurrency so conversion is paymentAmount x fxRate | [optional] [default to java.math.BigDecimal]
**toCurrency** | **String** | Currency that payments are converted to | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.FxRateSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

FlowConventions flowConventions = new FlowConventions();
@javax.annotation.Nullable List<String> fxConversionTypes = new List<String>();
java.math.BigDecimal rate = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String toCurrency = "example toCurrency";


FxRateSchedule fxRateScheduleInstance = new FxRateSchedule()
    .flowConventions(flowConventions)
    .fxConversionTypes(fxConversionTypes)
    .rate(rate)
    .toCurrency(toCurrency);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)