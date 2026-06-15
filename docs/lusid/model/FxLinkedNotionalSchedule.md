# com.finbourne.sdk.services.lusid.model.FxLinkedNotionalSchedule
classname FxLinkedNotionalSchedule
Schedule for notional changes based on the change in FX rate.  Used in the representation of a resettable cross currency interest rate swap.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleType** | **String** | Available values: FixedSchedule, FloatSchedule, OptionalitySchedule, StepSchedule, Exercise, FxRateSchedule, FxLinkedNotionalSchedule, BondConversionSchedule, Invalid. | [default to String]
**fxConventions** | [**FxConventions**](FxConventions.md) |  | [default to FxConventions]
**varyingNotionalCurrency** | **String** | The currency of the varying notional amount. | [default to String]
**varyingNotionalFixingDates** | [**RelativeDateOffset**](RelativeDateOffset.md) |  | [default to RelativeDateOffset]
**varyingNotionalInterimExchangePaymentDates** | [**RelativeDateOffset**](RelativeDateOffset.md) |  | [optional] [default to RelativeDateOffset]

```java
import com.finbourne.sdk.services.lusid.model.FxLinkedNotionalSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

FxConventions fxConventions = new FxConventions();
String varyingNotionalCurrency = "example varyingNotionalCurrency";
RelativeDateOffset varyingNotionalFixingDates = new RelativeDateOffset();
RelativeDateOffset varyingNotionalInterimExchangePaymentDates = new RelativeDateOffset();


FxLinkedNotionalSchedule fxLinkedNotionalScheduleInstance = new FxLinkedNotionalSchedule()
    .fxConventions(fxConventions)
    .varyingNotionalCurrency(varyingNotionalCurrency)
    .varyingNotionalFixingDates(varyingNotionalFixingDates)
    .varyingNotionalInterimExchangePaymentDates(varyingNotionalInterimExchangePaymentDates);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)