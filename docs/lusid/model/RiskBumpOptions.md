# com.finbourne.sdk.services.lusid.model.RiskBumpOptions
classname RiskBumpOptions
Per-recipe configuration of the bump sizes used by the finite-difference Risk/_* measures.  Results are always reported per ResultSensitivity regardless of the shift used to compute  them: the calculators divide by shift/resultSensitivity, so choosing a wider shift (e.g.  10bp for a market element with coarse quote precision) changes the estimator, not the unit.  Every member is optional and an absent member keeps the historical default.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deltaShift** | **java.math.BigDecimal** | The shift applied for delta/gamma bumps on any asset type without an explicit override.  Must be strictly positive. Defaults to 0.0001 (1bp) when not supplied. | [optional] [default to java.math.BigDecimal]
**resultSensitivity** | **java.math.BigDecimal** | The move the reported sensitivity is normalised to. Must be strictly positive.  Defaults to 0.0001 (results per 1bp move) when not supplied. | [optional] [default to java.math.BigDecimal]
**deltaShiftOverrides** | **Map&lt;String, java.math.BigDecimal&gt;** | Per-asset-type overrides of the delta shift, keyed by asset type (e.g. \&quot;Rates\&quot;, \&quot;Credit\&quot;,  \&quot;Fx\&quot;). Values must be strictly positive. Asset types without an override use DeltaShift. | [optional] [default to Map<String, java.math.BigDecimal>]
**ladderShiftOverrides** | [**Map&lt;String, List&lt;java.math.BigDecimal&gt;&gt;**](List.md) | Per-asset-type overrides of the shift grid used by ladder measures, keyed by asset type  (e.g. \&quot;Rates\&quot;, \&quot;Fx\&quot;). Each grid must be non-empty and strictly increasing; zero is a  legitimate rung, as the default grids include the base scenario. Asset types without an  override use the standard grids. | [optional] [default to Map<String, List<java.math.BigDecimal>>]
**parityRelativeTolerance** | **java.math.BigDecimal** | The relative tolerance for RiskEngine \&quot;Parity\&quot; checks, applied as  |bump - adjoint| &lt;&#x3D; max(absolute floor, |bump| * tolerance). Defaults to 0.001. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.RiskBumpOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable java.math.BigDecimal deltaShift = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal resultSensitivity = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable Map<String, java.math.BigDecimal> deltaShiftOverrides = new Map<String, java.math.BigDecimal>();
@javax.annotation.Nullable Map<String, List<java.math.BigDecimal>> ladderShiftOverrides = new Map<String, List<java.math.BigDecimal>>();
@javax.annotation.Nullable java.math.BigDecimal parityRelativeTolerance = new java.math.BigDecimal("100.00");


RiskBumpOptions riskBumpOptionsInstance = new RiskBumpOptions()
    .deltaShift(deltaShift)
    .resultSensitivity(resultSensitivity)
    .deltaShiftOverrides(deltaShiftOverrides)
    .ladderShiftOverrides(ladderShiftOverrides)
    .parityRelativeTolerance(parityRelativeTolerance);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)