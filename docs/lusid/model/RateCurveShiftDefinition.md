# com.finbourne.sdk.services.lusid.model.RateCurveShiftDefinition
classname RateCurveShiftDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scenarioShiftType** | **String** | Available values: RateCurveShiftDefinition, FxShiftDefinition, PriceShiftDefinition, VolSurfaceShiftDefinition, MdkrGroupShiftDefinition. | [default to String]
**ccy** | **String** |  | [default to String]
**amount** | **java.math.BigDecimal** | The size of the shift, in the units given by Scale: basis points by default (50 means +50bps),  or a percentage of each rate when Scale is Percentage (1 means rates scaled by 1.01). | [optional] [default to java.math.BigDecimal]
**startTenor** | **String** |  | [optional] [default to String]
**endTenor** | **String** |  | [optional] [default to String]
**shiftType** | **String** | Available values: Parallel, Steepen, Flatten, Twist. | [default to String]
**scale** | **String** | Available values: Bps, Percentage. | [optional] [default to String]
**applyTo** | **String** | A LUSID filter expression over the instrument entity scoping which instruments this shift is  for, e.g. \&quot;properties[Instrument/default/CountryOfIssue] eq &#39;Italy&#39;\&quot;. The shifted market data  is used by the whole valuation run, but when the scenario is requested as a result column the  column is only populated for matching instruments. Only usable when the scenario is applied as  a per-metric column. Note that with a scope set, the base and scenario columns cover different  instrument populations: an aggregate (e.g. Sum) of the scenario column totals only the matching  instruments, so it is not directly comparable to the same aggregate of the base column. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RateCurveShiftDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ccy = "example ccy";
@javax.annotation.Nullable java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String startTenor = "example startTenor";
@javax.annotation.Nullable String endTenor = "example endTenor";
String shiftType = "example shiftType";
String scale = "example scale";
@javax.annotation.Nullable String applyTo = "example applyTo";


RateCurveShiftDefinition rateCurveShiftDefinitionInstance = new RateCurveShiftDefinition()
    .ccy(ccy)
    .amount(amount)
    .startTenor(startTenor)
    .endTenor(endTenor)
    .shiftType(shiftType)
    .scale(scale)
    .applyTo(applyTo);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)