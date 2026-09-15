# com.finbourne.sdk.services.lusid.model.RateCurveShiftDefinition
classname RateCurveShiftDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scenarioShiftType** | **String** | Available values: RateCurveShiftDefinition, FxShiftDefinition, PriceShiftDefinition, VolSurfaceShiftDefinition, MdkrGroupShiftDefinition, InflationCurveShiftDefinition, CreditSpreadShiftDefinition, ModelOptionShiftDefinition. | [default to String]
**ccy** | **String** |  | [default to String]
**amount** | **java.math.BigDecimal** | The size of the shift, in the units given by Scale: basis points by default (50 means +50bps),  or a percentage of each rate when Scale is Percentage (1 means rates scaled by 1.01). | [optional] [default to java.math.BigDecimal]
**startTenor** | **String** | The near end of the tenor window the shift applies over, resolved against the valuation  date. A whole number of units, in any case: BD (business day), D, W, M, Q or Qtr, SA  (semi-annual), Y or A - for example \&quot;1BD\&quot;, \&quot;3m\&quot;, \&quot;6M\&quot;, \&quot;1Qtr\&quot;, \&quot;5y\&quot;. Omitted, the window  is open at this end and every point up to EndTenor is in it. | [optional] [default to String]
**endTenor** | **String** | The far end of the tenor window, in the same units as StartTenor. Omitted, the window is  open at this end. | [optional] [default to String]
**shiftType** | **String** | Available values: Parallel, Steepen, Flatten, Twist, Tent. | [default to String]
**scale** | **String** | Available values: Bps, Percentage. | [optional] [default to String]
**applyTo** | **String** | A LUSID filter expression over the instrument entity scoping which instruments this shift is  for, e.g. \&quot;properties[Instrument/default/CountryOfIssue] eq &#39;Italy&#39;\&quot;. The shifted market data  is used by the whole valuation run, but when the scenario is requested as a result column the  column is only populated for matching instruments. Only usable when the scenario is applied as  a per-metric column. Note that with a scope set, the base and scenario columns cover different  instrument populations: an aggregate (e.g. Sum) of the scenario column totals only the matching  instruments, so it is not directly comparable to the same aggregate of the base column. | [optional] [default to String]
**pivotTenor** | **String** | The tenor the Tent shift peaks at. The shift applies with the full Amount at this tenor,  falling linearly to zero at StartTenor and EndTenor - the key-rate triangle shape, whose  asymmetry matters because key-rate buckets are rarely evenly spaced. Only valid with  ShiftType Tent; omitted, a Tent peaks at the midpoint of the window. In the same units as  StartTenor. Declared last on purpose: generated SDKs emit their positional constructor in  property-declaration order, and this property must not shift the parameters of the ones  before it.  Over a window containing a single curve point, that point takes the full Amount regardless  of where the pivot lands: a one-point window has no slope to express, and every shift  shape degenerates the same way there. | [optional] [default to String]
**windowBounds** | **String** | Available values: Inclusive, StartExclusive, EndExclusive, Exclusive. | [optional] [default to String]
**curveName** | **String** | The funding identifier of the one curve in the currency this shift targets, letting a  scenario shock a named curve (say, an issuer discounting curve) without also moving the  risk-free curve mastered in the same currency. Omitted - as on every scenario stored  before this field existed - the shift matches every rate curve in the currency, exactly  as before. Declared last on purpose: generated SDKs emit their positional constructor in  property-declaration order, and this property must not shift the parameters of the ones  before it. | [optional] [default to String]
**minimumAmountBps** | **java.math.BigDecimal** | The smallest magnitude, in basis points, of the shift finally applied at each curve point.  Evaluated per point AFTER the shape weight, in the direction the shift acts there (the sign  of Amount times the shape weight): the applied move becomes at least the minimum in that  direction, even where a Percentage shift on a negative rate would have pointed the other  way - the Solvency II up-shock&#39;s \&quot;at least one percentage point at any maturity\&quot; is  MinimumAmountBps &#x3D; 100 on the relative shift the regulation states. A point whose shape  weight is exactly zero stays unshifted: the floor strengthens a shock where the shape  applies one, it does not extend the shock to points the shape excludes (a Tent&#39;s window  ends remain unmoved). Deliberately in basis points rather than in Scale units, because the  floor and the shift are in different units by construction: the regulation states a  relative shock with an absolute floor. Omitted, no floor applies - today&#39;s behaviour.  Declared after PivotTenor on purpose, for the constructor-ordering reason given there. | [optional] [default to java.math.BigDecimal]
**applyWhenValue** | **String** | Available values: Any, Positive, Negative. | [optional] [default to String]

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
@javax.annotation.Nullable String pivotTenor = "example pivotTenor";
String windowBounds = "example windowBounds";
@javax.annotation.Nullable String curveName = "example curveName";
@javax.annotation.Nullable java.math.BigDecimal minimumAmountBps = new java.math.BigDecimal("100.00");
String applyWhenValue = "example applyWhenValue";


RateCurveShiftDefinition rateCurveShiftDefinitionInstance = new RateCurveShiftDefinition()
    .ccy(ccy)
    .amount(amount)
    .startTenor(startTenor)
    .endTenor(endTenor)
    .shiftType(shiftType)
    .scale(scale)
    .applyTo(applyTo)
    .pivotTenor(pivotTenor)
    .windowBounds(windowBounds)
    .curveName(curveName)
    .minimumAmountBps(minimumAmountBps)
    .applyWhenValue(applyWhenValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)