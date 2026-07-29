# com.finbourne.sdk.services.lusid.model.FxShiftDefinition
classname FxShiftDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scenarioShiftType** | **String** | Available values: RateCurveShiftDefinition, FxShiftDefinition, EquityShiftDefinition, VolSurfaceShiftDefinition. | [default to String]
**currencyPair** | **String** |  | [default to String]
**amount** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**shiftType** | **String** | Available values: Absolute, Relative, Percentage. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.FxShiftDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String currencyPair = "example currencyPair";
java.math.BigDecimal amount = new java.math.BigDecimal("100.00");
String shiftType = "example shiftType";


FxShiftDefinition fxShiftDefinitionInstance = new FxShiftDefinition()
    .currencyPair(currencyPair)
    .amount(amount)
    .shiftType(shiftType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)