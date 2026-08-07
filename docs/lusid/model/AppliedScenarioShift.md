# com.finbourne.sdk.services.lusid.model.AppliedScenarioShift
classname AppliedScenarioShift
One market data target changed by one scenario shift during a valuation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scenario** | **String** | The \&quot;scope/code\&quot; reference of the scenario the shift belongs to. | [optional] [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date of the market data the shift was applied to. | [optional] [default to OffsetDateTime]
**shift** | **String** | Description of the shift, e.g. \&quot;PriceShift on &#39;SCENARIO_EQUITY&#39;\&quot;. | [optional] [default to String]
**target** | **String** | Description of the market data target the shift changed. | [optional] [default to String]
**valueBefore** | **java.math.BigDecimal** | The target&#39;s value before the shift. Null for multi-point targets (e.g. whole curves) where a  single number is not meaningful. | [optional] [default to java.math.BigDecimal]
**valueAfter** | **java.math.BigDecimal** | The target&#39;s value after the shift. Null for multi-point targets. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.AppliedScenarioShift;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String scenario = "example scenario";
OffsetDateTime effectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable String shift = "example shift";
@javax.annotation.Nullable String target = "example target";
@javax.annotation.Nullable java.math.BigDecimal valueBefore = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal valueAfter = new java.math.BigDecimal("100.00");


AppliedScenarioShift appliedScenarioShiftInstance = new AppliedScenarioShift()
    .scenario(scenario)
    .effectiveAt(effectiveAt)
    .shift(shift)
    .target(target)
    .valueBefore(valueBefore)
    .valueAfter(valueAfter);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)