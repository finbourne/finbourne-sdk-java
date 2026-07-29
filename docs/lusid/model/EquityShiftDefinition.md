# com.finbourne.sdk.services.lusid.model.EquityShiftDefinition
classname EquityShiftDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scenarioShiftType** | **String** | Available values: RateCurveShiftDefinition, FxShiftDefinition, EquityShiftDefinition, VolSurfaceShiftDefinition. | [default to String]
**instrument** | **String** |  | [default to String]
**amount** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**shiftType** | **String** | Available values: Absolute, Relative, Percentage. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.EquityShiftDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String instrument = "example instrument";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
String shiftType = "example shiftType";


EquityShiftDefinition equityShiftDefinitionInstance = new EquityShiftDefinition()
    .instrument(instrument)
    .amount(amount)
    .shiftType(shiftType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)